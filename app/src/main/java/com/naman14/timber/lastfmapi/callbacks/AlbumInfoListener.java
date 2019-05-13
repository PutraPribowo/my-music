

package com.naman14.timber.lastfmapi.callbacks;

import com.naman14.timber.lastfmapi.models.LastfmAlbum;

public interface AlbumInfoListener {

    void albumInfoSuccess(LastfmAlbum album);

    void albumInfoFailed();

}
