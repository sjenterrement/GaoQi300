package employee;

public class Rectangle {
	double height;
	double weight;
	
	public double area(){
		return height*weight;
	}

	public Rectangle(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
}
