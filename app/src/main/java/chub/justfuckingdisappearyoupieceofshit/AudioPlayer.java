package chub.justfuckingdisappearyoupieceofshit;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by chub on 11/29/2015.
 * kabbe
 */
public class AudioPlayer
{
	private MediaPlayer _mediaPlayer;

	public void stop()
	{
		if (_mediaPlayer != null)
		{
			_mediaPlayer.release();
			_mediaPlayer = null;
		}
	}

	public void play (Context c)
	{
		_mediaPlayer = MediaPlayer.create(c, R.raw.antonidas_battlecry);
		_mediaPlayer.start();
	}
}
