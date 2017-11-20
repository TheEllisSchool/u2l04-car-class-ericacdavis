
public class Car {
	//------attributes----//
	private int yearModel;
	private String make;
	private int speed=0;
	
	//------methods------//
	//constructor
	public Car (int ym, String m, int s) {
		yearModel = ym;
		make= m;
		speed= s;
	}
	
	//setters
	public void setSpeed(int s) {
			if (s>=-150 && s<=150) {
				speed = s;
				return;
			}
			else {
				System.out.println("Speed not possible");
			}
	}
	//getters
	public int getyearModel() {
		return yearModel;
	}
	public String make() {
		return make;
	}
	public int speed() {
		return speed;
	}
	//string
	public String toString() {
		String Car = "Year Model " + yearModel + "\n" + "Make: " + make + "\n" + "Speed: "+ speed;
		return Car;
	}
	//accelerate
	public int accelerate () {
		if (speed<=145){
		speed+=5;
		}
		return speed;
		}
	
	//brake
	public int breaks () {
		if(speed>=-150){
			speed-=5;
		}
		return speed;
	
	}
}
