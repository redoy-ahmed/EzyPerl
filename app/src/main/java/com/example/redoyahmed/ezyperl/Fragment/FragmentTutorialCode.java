package com.example.redoyahmed.ezyperl.Fragment;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.redoyahmed.ezyperl.Database.DbHelper;
import com.example.redoyahmed.ezyperl.Model.Category;
import com.example.redoyahmed.ezyperl.R;

import java.util.List;

import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;
import butterknife.BindView;
import butterknife.ButterKnife;

@SuppressLint("ValidFragment")
public class FragmentTutorialCode extends Fragment implements CodeView.OnHighlightListener {

    @BindView(R.id.codeView)
    public CodeView codeView;

    @BindView(R.id.empty)
    public TextView empty;

    private View rootView;
    private String category;
    private List<Category> tutorialItems;
    private ProgressDialog mProgressDialog;

    public FragmentTutorialCode(String category) {
        this.category = category;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tutorial_code, container, false);
        ButterKnife.bind(this, rootView);

        loadData(category);
        loadDataIntoWidgets();

        return rootView;
    }

    private void loadData(String category) {
        DbHelper db = new DbHelper(rootView.getContext());
        tutorialItems = db.getTutorialDetailsByCategory(category);
    }

    private void loadDataIntoWidgets() {

        if (tutorialItems.get(0).getCode().length() == 0) {
            codeView.setVisibility(View.INVISIBLE);
            empty.setVisibility(View.VISIBLE);
        } else {
            codeView.setOnHighlightListener(this)
                    .setOnHighlightListener(this)
                    .setTheme(Theme.ARDUINO_LIGHT)
                    .setCode(tutorialItems.get(0).getCode())
                    .setLanguage(Language.PERL)
                    .setWrapLine(true)
                    .setFontSize(14)
                    .setZoomEnabled(true)
                    .setShowLineNumber(true)
                    .setStartLineNumber(1)
                    .apply();
        }
    }

    @Override
    public void onStartCodeHighlight() {
        mProgressDialog = ProgressDialog.show(rootView.getContext(), null, "Carregando...", true);
    }

    @Override
    public void onFinishCodeHighlight() {
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void onLanguageDetected(Language language, int relevance) {
        Toast.makeText(rootView.getContext(), "language: " + language + " relevance: " + relevance, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFontSizeChanged(int sizeInPx) {
        Log.d("TAG", "font-size: " + sizeInPx + "px");
    }

    @Override
    public void onLineClicked(int lineNumber, String content) {
        Toast.makeText(rootView.getContext(), "line: " + lineNumber + " html: " + content, Toast.LENGTH_SHORT).show();
    }
}
