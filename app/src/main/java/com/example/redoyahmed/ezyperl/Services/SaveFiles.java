package com.example.redoyahmed.ezyperl.Services;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.redoyahmed.ezyperl.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SaveFiles {
    private Context context;

    public SaveFiles(Context context) {
        this.context = context;
    }

    public void exportToSD(String name, String code) {

        String error = null;
        try {
            File save = new File(name + ".txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(String.valueOf(save), Context.MODE_PRIVATE));
            outputStreamWriter.write(code);
            outputStreamWriter.close();
        } catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
            error = "Error Saving File!";
        }
        onBackupListener.onFinishExport(error);
    }

    public void showDialogListFile(final EditText codeEditText) {

        final File[][] listFile = {context.getFilesDir().listFiles()};

        final String[] listFileName = new String[listFile[0].length];
        for (int i = 0, j = listFile[0].length - 1; i < listFile[0].length; i++, j--) {
            listFileName[j] = listFile[0][i].getName();
        }

        if (listFileName.length > 0) {

            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            View convertView = inflater.inflate(R.layout.list_backup_file, null);
            final AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.AppCompatAlertDialogStyle);
            builder.setView(convertView);
            builder.setTitle("Select File").setIcon(R.mipmap.app_logo);
            final AlertDialog alert = builder.create();

            ListView lv = convertView.findViewById(R.id.lv_backup);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, listFileName);
            lv.setAdapter(adapter);
            lv.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    try {
                        InputStream inputStream = context.openFileInput(listFileName[position]);
                        if (inputStream != null) {
                            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                            String receiveString;
                            StringBuilder stringBuilder = new StringBuilder();

                            while ((receiveString = bufferedReader.readLine()) != null) {
                                stringBuilder.append(receiveString).append("\n");
                            }
                            inputStream.close();
                            alert.dismiss();
                            codeEditText.setText(stringBuilder.toString());
                        }
                    } catch (FileNotFoundException e) {
                        Log.e("login activity", "File not found: " + e.toString());
                    } catch (IOException e) {
                        Log.e("login activity", "Can not read file: " + e.toString());
                    }


                }
            });
            alert.show();
        } else {
            final AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("Delete").setIcon(R.mipmap.app_logo)
                    .setMessage("Empty");
            builder.show();
        }
    }

    private OnBackupListener onBackupListener;

    public void setOnBackupListener(OnBackupListener onBackupListener) {
        this.onBackupListener = onBackupListener;
    }

    public interface OnBackupListener {
        void onFinishExport(String error);

        void onFinishImport(String error);
    }
}
