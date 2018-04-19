package cheggoct;
public class Clock {

	//private int hours, minutes, seconds;

	private int totalSeconds;

	private static int numClocks = 0;

	public final int ID;

	//for 12 hours make it as true
	public static boolean use24HourFormat = true;

	public Clock(int hours, int minutes, int seconds) {

		setHours(hours);

		setMinutes(minutes);

		setSeconds(seconds);

		numClocks++;

		ID = numClocks;

	}



	public Clock(int hours, int minutes) {

		this(hours, minutes, 0);



	}



	public Clock(int hours) {

		this(hours, 0);



	}



	public Clock() {

		this(0);

	}

	int getHours() {

		return totalSeconds/3600;

	}

	int getMinutes() {

		return (totalSeconds/60)%60;

	}

	int getSeconds() {

		return totalSeconds%60;

	}



	void setHours(int h) {

		if (h > 23)

			h = 23; // or hours %= 24;

		if (h < 0)

			h = 0;

		totalSeconds = h*3600+getMinutes()*60+getSeconds();

	}



	void setMinutes(int m) {

		if (m> 59)

			m = 59;

		if (m < 0)

			m = 0;



		totalSeconds =getHours()*3600+m*60+getSeconds() ;//fixed here

		//previously you not considering the hours and minutes

	}



	void setSeconds(int s) {

		if (s > 59)

			s = 59;

		if (s < 0)

			s = 0;

		//this.seconds =seconds;

		totalSeconds = getHours()*3600+getMinutes()*60+s;//fixed here

		//previously you not considering the hours and minutes

	}



	void incrementHours() {

		if (getHours() == 23)

			setHours(0);

		else setHours(getHours()+1);

	}

	void incrementMinutes() {

		if (getMinutes() == 59) {

			setMinutes(0);

			incrementHours();

		}

		else setMinutes(getMinutes()+1);



	}



	void incrementSeconds() {

		if (getSeconds() == 59) {

			setSeconds(0);

			incrementMinutes();

		}

		else setSeconds(getSeconds()+1);//fixed here previously

		//you adding getMinutes instead of getSeconds



	}

	public String toString() {
		boolean am = false;
		String minuteString = "" + getMinutes();
		if (getMinutes() < 10)
			minuteString = "0" + minuteString;
		String secondString = "" + getSeconds();
		if (getSeconds() < 10)
			secondString = "0" + secondString;
		String hoursString = null;
		if (use24HourFormat) {
			if (getHours() <= 11) {
				hoursString = "" + getHours();
				am = true;
			}
			else if (getHours() == 12) {
				hoursString = "" + getHours();
			}
			else {
				//setHours(getHours()- 12);//not required
				hoursString = "" + (getHours()-12);
			}
			return getHours() + ":" +minuteString + ":"+ secondString +(am ? " AM" : " PM");
		}
		return getHours() + ":" + minuteString + ":"+ secondString;
	}

	public void setToCurrentTime() {

		totalSeconds = (int)System.currentTimeMillis()/(1000 % (24*3600) );

	}

	public static void main(String [] args) {
		//System.out.println(System.currentTimeMillis()/1000);
		Clock m = new Clock(19,59,57);
		for (int i = 0; i < 5000; i++) {
			try {
				System.out.println(m);
				Thread.sleep(1000);
				m.incrementSeconds();
			}
			catch (Exception e) {
			}
		}
		m.setHours(10);
		System.out.println(m.getHours());
		System.out.println(m.getMinutes());
		System.out.println(m.getSeconds());

	}   

}   