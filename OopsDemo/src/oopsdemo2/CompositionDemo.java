package oopsdemo2;

class Honda extends Car {
	public void hondaCar() {
		Engine heng = new Engine();
		heng.startEngine();
	}
}

public class CompositionDemo {
	public static void main(String[] args) {
		Honda hondacity = new Honda();
		hondacity.setColor("Silver");
		hondacity.setMax_speed(180);

		System.out.println("___________Honda car detail_______");
		System.out.println(hondacity.getColor() + " Color");
		System.out.println(hondacity.getMax_speed() + " Speed");

		hondacity.hondaCar();
	}
}
