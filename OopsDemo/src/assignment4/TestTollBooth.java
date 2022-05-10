package assignment4;

public class TestTollBooth {
	public static void main(String[] args) {
		TollBoth booth = new AlleghenyTollBooth();

		Truck ford = new FordTruck(5, 12000);

		Truck nissan = new NissanTruck(2, 5000);

		Truck daewoo = new DaewooTruck(6, 17000);

		booth.calculateToll(ford);
		booth.display(ford);
		booth.displayData();
		booth.calculateToll(nissan);
		booth.display(nissan);
		booth.displayData();
		booth.calculateToll(daewoo);
		booth.display(daewoo);
		booth.displayData();
		booth.reset();
	}
}
