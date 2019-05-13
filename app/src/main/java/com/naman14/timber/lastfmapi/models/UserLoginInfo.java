package com.naman14.timber.lastfmapi.models;

import com.google.gson.annotations.SerializedName;
import com.naman14.timber.lastfmapi.LastFmClient;


public class UserLoginInfo {
    private static final String SESSION = "session";

    @SerializedName(SESSION)
    public LastfmUserSession mSession;


}
