package com.naman14.timber.listeners;

public interface MusicStateListener {

    /**
     * Called when {@link com.naman14.timber.MusicService#REFRESH} is invoked
     */
    void restartLoader();

    /**
     * Called when {@link com.naman14.timber.MusicService#PLAYLIST_CHANGED} is invoked
     */
    void onPlaylistChanged();

    /**
     * Called when {@link com.naman14.timber.MusicService#META_CHANGED} is invoked
     */
    void onMetaChanged();

}
