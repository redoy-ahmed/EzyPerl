package com.example.redoyahmed.ezyperl.Utils;

import android.content.Context;
import android.media.MediaPlayer;

public class PlaySound {
    private Context context;
    private MediaPlayer mediaPlayer;

    public PlaySound(Context context) {
        this.context = context;
    }

    public void playSound(boolean isMusic, int soundId) {
        this.mediaPlayer = MediaPlayer.create(this.context, soundId);
        if (isMusic) {
            this.mediaPlayer.setLooping(true);
        }
        this.mediaPlayer.start();
    }

    public void stopSound() {
        if (this.mediaPlayer.isPlaying() || this.mediaPlayer != null) {
            this.mediaPlayer.pause();
            this.mediaPlayer.stop();
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }
}
