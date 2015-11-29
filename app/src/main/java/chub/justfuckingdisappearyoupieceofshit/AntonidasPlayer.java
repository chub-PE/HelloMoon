package chub.justfuckingdisappearyoupieceofshit;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by chub on 11/29/2015.
 * kabbe
 */
public class AntonidasPlayer
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
		stop();
		_mediaPlayer = MediaPlayer.create(c, R.raw.antonidas_battlecry);

		_mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
			@Override
			public void onCompletion(MediaPlayer mp)
			{
				stop();
			}
		});

		_mediaPlayer.start();

	}
}
