package com.example.redoyahmed.ezyperl.Utils;

import android.content.Context;
import android.media.MediaPlayer;

public class PlayAudio {
    private Context context;
    private MediaPlayer player;

    public PlayAudio(Context context) {
        this.context = context;
    }

    public void playSound(int soundId) {
        this.player = MediaPlayer.create(this.context, soundId);
        this.player.setLooping(true);
        this.player.start();
    }

    public void stopSound() {
        if (this.player != null && this.player.isPlaying()) {
            this.player.pause();
            this.player.stop();
            this.player.release();
            this.player = null;
        }
    }
}
