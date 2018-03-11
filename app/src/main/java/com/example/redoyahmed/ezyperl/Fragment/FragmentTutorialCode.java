package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.kbiakov.codeview.CodeView;

public class FragmentTutorialCode extends Fragment {

    @BindView(R.id.code_view)
    public CodeView codeView;

    View rootView;

    public FragmentTutorialCode() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tutorial_code, container, false);
        ButterKnife.bind(this, rootView);

        loadDataIntoWidgets();

        return rootView;
    }

    private void loadDataIntoWidgets() {

        codeView.setCode("use strict;\n" +
                "\n" +
                "my $a = 5;\n" +
                "while($a > 0) {\n" +
                "    print \"$a \";\n" +
                "    $a--;\n" +
                "}\n" +
                "print \"\\n\";",
                "pl");

    }
}
