package cheggmarch;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Radio {
	
	private boolean powerState;
	private int selectedVolume;
	private double selectedStation;
	private int selectedTreble;
	private int selectedBass;
	private int selectedBalance;
	private String selectedBand;
	private double amPresets[];
	private double fmPresets[];
	private Date firstTimeOn;
	private Date lastTimeOn;
	private String SerialNumber;
	
	public Radio(){
		final long prefix= 45553245455344l;
		int max=545385859;
		int min=100000000;
		Random random=new Random();
		int randomNo=random.nextInt(max-min+1)+min;
		
		SerialNumber = ""+prefix+":"+randomNo;
			powerState = false;
			selectedVolume = 0;
			selectedStation=0.0;
			selectedBand=null;
			amPresets = null;
			fmPresets = null;
			firstTimeOn=null;
			lastTimeOn=null;
			selectedBalance=0;
			selectedBass=0;
			selectedTreble=0;
			System.out.println(toString());
	}
	public void on(){
		powerState=true;
		selectedVolume=5;
		selectedStation=77.0;
		selectedBand="AM";
		amPresets=new double[]{563.0,1080.0,773.0,1192.0,584.0,608.0,843.0};
		fmPresets=new double[]{99.0,92.0,101.0,99.0,88.0,103.0,92.0,92.0,92.0,105.0,99.0,93.0};
		firstTimeOn=new Date();
		lastTimeOn=firstTimeOn;
		selectedBalance=0;
		selectedBass=2;
		selectedTreble=3;
		System.out.println(toString());
	}
	public void off(){
		powerState=false;
		System.out.println(toString());
	}
	public boolean isOn(){
		return powerState;
	}
	public void getFirstTimeOn(){
		System.out.println(firstTimeOn);
	}
	public void getSelectedBand(){
		System.out.println(selectedBand);
	}
	public void setSelectedBand(){
		if(selectedBand=="AM"){
			selectedBand="FM";
		}
		else if(selectedBand=="FM"){
			selectedBand="AM";
		}
	}
	public void increaseVolume(){
		selectedVolume++;
	}
	public void decreaseVolume(){
		selectedVolume--;
	}
	public void getSelectedStation(){
		System.out.println("Selected station "+selectedStation);
	}
	public void setSelectedStation(){
		System.out.println("Enter the new station");
		Scanner sc = new Scanner(System.in);
		selectedStation = sc.nextDouble();
	}
	public void assignToPreset(){
		int i=0;
		if(selectedBand=="AM"){
			selectedStation=amPresets[i++];
		}
		if(selectedBand=="FM"){
			selectedStation=fmPresets[i++];
		}
	}
	public void selectFromPreset(){
		Scanner sc = new Scanner(System.in);
		
		if(selectedBand=="AM"){
			System.out.println("please chhose new AM preset \n"
					+ "563.0,1080.0,773.0,1192.0,584.0,608.0,843.0");
			selectedStation=sc.nextDouble();
			return;
		}
		if(selectedBand=="FM"){
			System.out.println("please chhose new FM preset \n"
					+ "99.0,92.0,101.0,99.0,88.0,103.0,92.0,92.0,92.0,105.0,99.0,93.0");
			selectedStation=sc.nextDouble();
			return;
		}
	}
	private String readAMPresets(){
		String data="[";
		if(amPresets==null){
			return null;
		}
		else{
			
			for(int i=0;i<amPresets.length;i++){
				data=data+amPresets[i]+",";
			}
			data = data+"]";
		}
		return data;
	}
	private String readFMPresets(){
		String data="[";
		if(fmPresets==null){
			return null;
		}
		else{
			for(int i=0;i<fmPresets.length;i++){
				data=data+fmPresets[i]+",";
			}
			data = data+"]";
		}
		return data;
	}
	@Override
	public String toString(){
		return "\nRadio Instance : [Serial Number= "+SerialNumber+",Power state = "+powerState+" \n,Selected Volume= "+selectedVolume+
				",selected station= "+selectedStation+",selected Band= "+selectedBand+",\namPresets = " + readAMPresets() +
				",\nfmPresets= "+readAMPresets()+",\nfirstTimeOn = "+firstTimeOn+",lastTimeOn="+lastTimeOn+",selectedBalance="
						+selectedBalance+ ",selectedBassLevel="+selectedBass+",selectedTrebleLevel = "+selectedTreble+"]";
	}
	public static void main(String[] args) {
		Radio radio = new Radio();
		radio.on();
		radio.off();
		
	}
}
