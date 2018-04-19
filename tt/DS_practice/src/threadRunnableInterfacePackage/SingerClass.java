package threadRunnableInterfacePackage;
/***
 * Singer class implementing the Runnable interface
 * and implemented the run method
 *
 */
public class SingerClass implements Runnable {
	
//overiden run method
	@Override
	public void run() {
		//created the object of lyrics class
		SongLyricsClass lyrics = new SongLyricsClass();
		synchronized (lyrics) {
			//looping through the lyrics
			//and requesting the single line at a time
			for(int line=0;line<lyrics.getNoOfSongLyrics();line++){
				System.out.println(lyrics.getSongLyrics(line));
			}
		}
		//when current singer done with singing 
		//printing the information
			System.out.printf("%s done with singing\n\n",Thread.currentThread().getName());
	}

}
