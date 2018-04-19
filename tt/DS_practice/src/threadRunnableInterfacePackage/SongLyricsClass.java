package threadRunnableInterfacePackage;
/***
 * sing lyrics class having two method
 *
 */
public class SongLyricsClass {
	//lyrics string holding the lyrics of song
	public String songLyrics[][]=new String[2][1];
	/***
	 * this is synchronized method and will return 
	 * the song lyrics as per line no requested
	 * @param l
	 * @return the song line
	 */
	public synchronized String getSongLyrics(int l)
	{
			songLyrics[0][0] = "First line of Song lyrics";
			songLyrics[1][0]="Second line of Song lyrics";
			return songLyrics[l][0];
	}
	/***
	 * method will return the total line of song
	 * @return lyric length
	 */
	public  int getNoOfSongLyrics(){
		return songLyrics.length;
	}

}
