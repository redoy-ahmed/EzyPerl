package com.example.redoyahmed.ezyperl.Fragment;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.redoyahmed.ezyperl.Activity.MainActivity;
import com.example.redoyahmed.ezyperl.Model.Data;
import com.example.redoyahmed.ezyperl.Model.OutputResponse;
import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Services.ApiClient;
import com.example.redoyahmed.ezyperl.Services.ApiInterface;
import com.example.redoyahmed.ezyperl.Services.SaveFiles;
import com.example.redoyahmed.ezyperl.Utils.ConnectionStatus;
import com.example.redoyahmed.ezyperl.Utils.CustomSweetAlertDialog;
import com.example.redoyahmed.ezyperl.Utils.StatusCodes;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.pedant.SweetAlert.SweetAlertDialog;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class FragmentPractise extends Fragment implements SaveFiles.OnBackupListener {

    View rootView;

    @BindView(R.id.codeEditText)
    public EditText codeEditText;

    @BindView(R.id.outputTextView)
    public TextView outputTextView;

    public String codeString;

    private static final String TAG = FragmentPractise.class.getSimpleName();

    private static final int PERMISSION_CALLBACK_CONSTANT = 101;
    private static final int REQUEST_PERMISSION_SETTING = 102;

    private SharedPreferences permissionStatus;
    private boolean sentToSettings = false;
    private SaveFiles saveFiles;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_practise, container, false);
        ButterKnife.bind(this, rootView);

        initializeWidgets();

        return rootView;
    }

    private void initializeWidgets() {
        ((MainActivity) getActivity()).hideFloatingActionButton();

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Practise");
        MainActivity.navigationView.getMenu().getItem(2).setChecked(true);

        codeEditText.setText("$x = 10;\n" +
                "$y = 25;\n" +
                "$z = $x+$y;\n" +
                "\n" +
                "print \"Sum of $x + $y = $z\";\n");

        saveFiles = new SaveFiles(rootView.getContext());
        saveFiles.setOnBackupListener(this);

        setHasOptionsMenu(true);
    }

    private void runCode() {

        CustomSweetAlertDialog customSweetAlertDialog = new CustomSweetAlertDialog();
        final SweetAlertDialog dialog = customSweetAlertDialog.getProgressDialog(rootView.getContext(), "Running...");
        dialog.show();

        codeString = codeEditText.getText().toString();

        ApiInterface apiService = ApiClient.getPractiseClient().create(ApiInterface.class);

        Data data = new Data();
        data.setScript(codeString);
        data.setLanguage("perl");
        data.setVersionIndex("1");
        data.setClientId(ApiClient.CLIENT_ID);
        data.setClientSecret(ApiClient.CLIENT_SECRET);

        Call<OutputResponse> call = apiService.requestOutput(data);
        call.enqueue(new Callback<OutputResponse>() {
            @Override
            public void onResponse(Call<OutputResponse> call, Response<OutputResponse> response) {
                int statusCode = response.code();
                if (statusCode == StatusCodes.OK) {
                    final OutputResponse outputResponse = response.body();

                    final Handler handler = new Handler();
                    Runnable runnable = new Runnable() {
                        @Override
                        public void run() {
                            if (outputResponse.getStatusCode().equals(String.valueOf(StatusCodes.OK))) {
                                dialog.dismiss();
                                outputTextView.setText(outputResponse.getOutput());
                                handler.removeCallbacksAndMessages(true);
                            } else {
                                handler.postDelayed(this, 100);
                            }
                        }
                    };
                    handler.postDelayed(runnable, 100);
                }
            }

            @Override
            public void onFailure(Call<OutputResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });


    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.menu_practise, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_run:

                if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_NETWORK_STATE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), Manifest.permission.ACCESS_NETWORK_STATE)) {
                        //Show Information about why you need the permission
                        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                        builder.setTitle("Need Storage Permission");
                        builder.setMessage("This app needs phone permission.");
                        builder.setPositiveButton("Grant", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                requestPermissions(new String[]{Manifest.permission.ACCESS_NETWORK_STATE}, PERMISSION_CALLBACK_CONSTANT);
                            }
                        });
                        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                        builder.show();
                    } else if (permissionStatus.getBoolean(Manifest.permission.ACCESS_NETWORK_STATE, false)) {
                        //Previously Permission Request was cancelled with 'Dont Ask Again',
                        // Redirect to Settings after showing Information about why you need the permission
                        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                        builder.setTitle("Need Storage Permission");
                        builder.setMessage("This app needs storage permission.");
                        builder.setPositiveButton("Grant", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                sentToSettings = true;
                                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                                Uri uri = Uri.fromParts("package", getActivity().getPackageName(), null);
                                intent.setData(uri);
                                startActivityForResult(intent, REQUEST_PERMISSION_SETTING);
                                Toast.makeText(getActivity(), "Go to Permissions to Grant Phone", Toast.LENGTH_LONG).show();
                            }
                        });
                        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                        builder.show();
                    } else {
                        //just request the permission
                        requestPermissions(new String[]{Manifest.permission.ACCESS_NETWORK_STATE}, PERMISSION_CALLBACK_CONSTANT);
                    }

                    SharedPreferences.Editor editor = permissionStatus.edit();
                    editor.putBoolean(Manifest.permission.ACCESS_NETWORK_STATE, true);
                    editor.commit();
                } else {
                    //You already have the permission, just go ahead.
                    proceedAfterPermission();
                }

                return true;

            case R.id.action_save:
                saveFileDialog();
                return true;

            case R.id.action_open:
                if (codeEditText.getText().toString().length() > 0)
                    saveFileDialogBeforeOpen();
                else
                    saveFiles.showDialogListFile(codeEditText);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void saveFileDialogBeforeOpen() {

        LayoutInflater li = LayoutInflater.from(rootView.getContext());
        View promptsView = li.inflate(R.layout.save_dialog, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(rootView.getContext());
        alertDialogBuilder.setView(promptsView);

        final EditText userInput = promptsView.findViewById(R.id.editTextDialogFileName);
        final String fileName = userInput.getText().toString();

        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                if (fileName.length() > 0)
                                    saveFiles.exportToSD(fileName, codeEditText.getText().toString());
                                else
                                    saveFiles.exportToSD("EzyPerl Practise", codeEditText.getText().toString());
                            }
                        })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                saveFiles.showDialogListFile(codeEditText);
                                dialog.cancel();
                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void saveFileDialog() {
        LayoutInflater li = LayoutInflater.from(rootView.getContext());
        View promptsView = li.inflate(R.layout.save_dialog, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(rootView.getContext());
        alertDialogBuilder.setView(promptsView);

        final EditText userInput = promptsView.findViewById(R.id.editTextDialogFileName);

        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                saveFiles.exportToSD(userInput.getText().toString(), codeEditText.getText().toString());
                            }
                        })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_CALLBACK_CONSTANT) {
            //check if all permissions are granted
            boolean allgranted = false;
            for (int i = 0; i < grantResults.length; i++) {
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    allgranted = true;
                } else {
                    allgranted = false;
                    break;
                }
            }

            if (allgranted) {
                proceedAfterPermission();
            } else if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(), Manifest.permission.ACCESS_NETWORK_STATE)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Need Storage Permission");
                builder.setMessage("This app needs phone permission.");
                builder.setPositiveButton("Grant", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        requestPermissions(new String[]{Manifest.permission.ACCESS_NETWORK_STATE}, PERMISSION_CALLBACK_CONSTANT);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            } else {
                Toast.makeText(getActivity(), "Unable to get Permission", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_PERMISSION_SETTING) {
            if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_NETWORK_STATE) == PackageManager.PERMISSION_GRANTED) {
                //Got Permission
                proceedAfterPermission();
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if (sentToSettings) {
            if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_NETWORK_STATE) == PackageManager.PERMISSION_GRANTED) {
                //Got Permission
                proceedAfterPermission();
            }
        }
    }

    private void proceedAfterPermission() {
        if (ConnectionStatus.getInstance(rootView.getContext()).isOnline()) {
            runCode();
        } else {
            Toast.makeText(rootView.getContext(), "There is no Internet Connection", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onFinishExport(String error) {
        String notify = error;
        if (error == null) {
            notify = "Save Success";
        }
        Toast.makeText(rootView.getContext(), notify, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFinishImport(String error) {
        String notify = error;
        if (error == null) {
            notify = "Open Success";
        }
        Toast.makeText(rootView.getContext(), notify, Toast.LENGTH_SHORT).show();
    }
}

