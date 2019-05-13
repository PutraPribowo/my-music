
package com.naman14.timber.lastfmapi.callbacks;

import com.naman14.timber.lastfmapi.models.LastfmArtist;

public interface ArtistInfoListener {

    void artistInfoSucess(LastfmArtist artist);

    void artistInfoFailed();

}
