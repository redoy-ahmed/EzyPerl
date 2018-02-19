package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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
import com.example.redoyahmed.ezyperl.Utils.StatusCodes;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class FragmentPractise extends Fragment {

    View rootView;

    @BindView(R.id.codeEditText)
    public EditText codeEditText;

    @BindView(R.id.outputTextView)
    public TextView outputTextView;

    public String codeString;

    private static final String TAG = FragmentPractise.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_practise, container, false);

        ButterKnife.bind(this, rootView);

        codeEditText.setText("$x = 10;\n" +
                "$y = 25;\n" +
                "$z = $x+$y;\n" +
                "\n" +
                "print \"Sum of $x + $y = $z\";\n");

        initializeWidgets();

        return rootView;
    }

    private void initializeWidgets() {
        ((MainActivity) getActivity()).hideFloatingActionButton();

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Practise");
        MainActivity.navigationView.getMenu().getItem(2).setChecked(true);

        setHasOptionsMenu(true);
    }

    private void runCode() {

        codeString = codeEditText.getText().toString();

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

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
                    OutputResponse outputResponse = response.body();
                    outputTextView.setText(outputResponse.getOutput());
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
                runCode();
                return true;
            case R.id.action_save:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
