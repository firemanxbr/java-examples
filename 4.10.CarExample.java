class Car {
	String color;
	String model;
	double actualSpeed;
	double maxSpeed;

	// start my car
	void on() {
		System.out.println("Car is on!");
	}

	// run a some
	void run(double value) {
		double newSpeed = this.actualSpeed + value;
		this.actualSpeed = newSpeed;
	}

	// return gear
	int getGear() {
		if (this.actualSpeed < 0) {
			return -1;
		}
		if (this.actualSpeed >= 0 && this.actualSpeed < 40) {
			return 1;
		}
		if (this.actualSpeed >= 40 && this.actualSpeed < 80) {
			return 2;
		}
		return 3;
	}
}

class TestCar {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "Green";
		myCar.model = "Renegate";
		myCar.actualSpeed = 0;
		myCar.maxSpeed = 80;

		// start this car
		myCar.on();

		// run this car
		myCar.run(20);
		System.out.println(myCar.actualSpeed);
	}
}
