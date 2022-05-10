package assignment4;

public interface TollBoth {

	public void calculateToll(Truck truck);

	public void displayData();

	public void display(Truck truck);

	public void reset();

}

class AlleghenyTollBooth implements TollBoth {

	private int totalTruck;
	private float totalCollection;
	Truck truck;

	@Override
	public void calculateToll(Truck truck) {
		System.out.println(truck);
	}

	@Override
	public void display(Truck truck) {
		this.totalCollection = this.totalCollection + truck.dueToll();
		this.totalTruck = this.totalTruck + 1;

	}

	@Override
	public void displayData() {

		System.out.println(
				"Totals since last collection - Receipts: $" + this.totalCollection + " Trucks: " + this.totalTruck);
		System.out.println();
	}

	@Override
	public void reset() {
		this.totalCollection = 0;
		this.totalTruck = 0;

		System.out.println("Total collection and truck number are resetting");
		System.out.println("Collection after reset :" + this.totalCollection);
		System.out.println("Truck number after reset :" + this.totalTruck);

	}

}