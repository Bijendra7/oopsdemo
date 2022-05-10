package assignment4;

public interface Truck {

	@Override
	public String toString();

	public float dueToll();

}

class FordTruck extends AlleghenyTollBooth implements Truck {
	private int axels;
	private int weight;
	private float tollDue;

	public FordTruck(int axels, int weight) {
		this.axels = axels;
		this.weight = weight;
	}

	@Override
	public String toString() {

		System.out.println("Truck is arriving");
		System.out.println("Truck's Company is Ford");
		this.tollDue = (this.axels * 5) + ((float) this.weight / 1000) * 10;
		return "Truck arrival - Axels: " + this.axels + " Total weight: " + this.weight + " Total due: $" + tollDue;
	}

	@Override
	public float dueToll() {
		return this.tollDue;
	}
}

class NissanTruck implements Truck {
	private int axels;
	private int weight;
	private float tollDue;

	public NissanTruck(int axels, int weight) {
		this.axels = axels;
		this.weight = weight;
	}

	@Override
	public String toString() {

		System.out.println("Truck is arriving");
		System.out.println("Truck's Company is Nissan");
		this.tollDue = (this.axels * 5) + ((float) this.weight / 1000) * 10;
		return "Truck arrival - Axels: " + this.axels + " Total weight: " + this.weight + " Total due: $" + tollDue;
	}

	@Override
	public float dueToll() {
		return this.tollDue;
	}
}

class DaewooTruck implements Truck {
	private int axels;
	private int weight;
	private float tollDue;

	public DaewooTruck(int axels, int weight) {
		this.axels = axels;
		this.weight = weight;
	}

	@Override
	public String toString() {

		System.out.println("Truck is arriving");
		System.out.println("Truck's Company is Daewoo");
		this.tollDue = (this.axels * 5) + ((float) this.weight / 1000) * 10;
		return "Truck arrival - Axels: " + this.axels + " Total weight: " + this.weight + " Total due: $" + tollDue;
	}

	@Override
	public float dueToll() {
		return this.tollDue;
	}
}