package employee;

public class Cubiod extends Rectangle{
	double length;
	
	public Cubiod(double height, double weight ,double lenght) {
		super(height, weight);
		this.length=lenght;
	}

	

	public double volume() {
		return length*height*weight;

	}
}
