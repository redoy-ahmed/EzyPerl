package com.example.redoyahmed.ezyperl.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.Activity.MainActivity;
import com.example.redoyahmed.ezyperl.Adapters.AutoFitGridLayoutManager;
import com.example.redoyahmed.ezyperl.Adapters.RecyclerViewAdapterVideoTutorial;
import com.example.redoyahmed.ezyperl.Model.Items;
import com.example.redoyahmed.ezyperl.Model.PlaylistResponse;
import com.example.redoyahmed.ezyperl.Model.Snippet;
import com.example.redoyahmed.ezyperl.Model.VideoTutorialItem;
import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Services.ApiClient;
import com.example.redoyahmed.ezyperl.Services.ApiInterface;
import com.example.redoyahmed.ezyperl.Utils.CustomSweetAlertDialog;
import com.example.redoyahmed.ezyperl.Utils.StatusCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.pedant.SweetAlert.SweetAlertDialog;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;
import static com.example.redoyahmed.ezyperl.Utils.Colors.colors;

/**
 * Created by redoy.ahmed on 19-Feb-2018.
 */

public class FragmentTutorialVideo extends Fragment {

    View rootView;
    @BindView(R.id.recycler_view_tutorial_video)
    public RecyclerView tutorialVideoTextRecyclerView;
    public AutoFitGridLayoutManager layoutManager;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_tutorial_video, container, false);

        ButterKnife.bind(this, rootView);

        initializeWidgets();
        initializeData();

        return rootView;
    }

    private void initializeWidgets() {
        ((MainActivity) getActivity()).showFloatingActionButton();
    }

    private void initializeData() {
        loadData();
    }

    private void loadData() {

        final ArrayList<VideoTutorialItem> allItems = new ArrayList<>();

        CustomSweetAlertDialog customSweetAlertDialog = new CustomSweetAlertDialog();
        final SweetAlertDialog dialog = customSweetAlertDialog.getProgressDialog(rootView.getContext(), "Loading...");
        dialog.show();

        ApiInterface apiService = ApiClient.getYoutubeClient().create(ApiInterface.class);

        Call<PlaylistResponse> call = apiService.getPlaylist();
        call.enqueue(new Callback<PlaylistResponse>() {
            @Override
            public void onResponse(Call<PlaylistResponse> call, final Response<PlaylistResponse> response) {
                if (response.code() == StatusCodes.OK) {
                    final PlaylistResponse playlistResponse = response.body();

                    ArrayList<Items> items = new ArrayList<>(Arrays.asList(playlistResponse.getItems()));
                    ArrayList<Snippet> snippets = new ArrayList<>();

                    for (int i = 0; i < items.size(); i++) {
                        snippets.add(items.get(i).getSnippet());
                        allItems.add(new VideoTutorialItem(snippets.get(i).getTitle(), "https://i.ytimg.com/vi/OVP-CqefrZY/default.jpg", colors[new Random().nextInt(colors.length)]));
                    }

                    RecyclerViewAdapterVideoTutorial adapterTutorial = new RecyclerViewAdapterVideoTutorial(rootView.getContext(), allItems, getFragmentManager());
                    tutorialVideoTextRecyclerView.setAdapter(adapterTutorial);
                    layoutManager = new AutoFitGridLayoutManager(rootView.getContext(), 500);
                    tutorialVideoTextRecyclerView.setLayoutManager(layoutManager);

                    final Handler handler = new Handler();
                    Runnable runnable = new Runnable() {
                        @Override
                        public void run() {
                            if (response.code() == StatusCodes.OK) {
                                dialog.dismiss();
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
            public void onFailure(Call<PlaylistResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
