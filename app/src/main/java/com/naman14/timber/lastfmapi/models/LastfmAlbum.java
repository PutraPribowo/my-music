

package com.naman14.timber.lastfmapi.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LastfmAlbum {
    private static final String IMAGE = "image";

    @SerializedName(IMAGE)
    public List<Artwork> mArtwork;


}
