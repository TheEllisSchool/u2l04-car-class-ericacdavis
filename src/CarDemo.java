
public class CarDemo {

	public static void main(String[] args) {
		// create a car object
		Car convertable = new Car (2001, "porsche", 140);
		System.out.println(convertable);
		//call accelerate 5 times (use a loop)
		for (int i=0; i<=5; i++) {
			convertable.accelerate();
			System.out.println("speed after acceleration is: " + convertable.speed());
		}
		//call brake 5 times (use a loop)
		for (int i=0; i<=5; i++) {
			convertable.breaks();
			System.out.println("speed after breaking is: " + convertable.speed());
		}
	}

}
