package zz;

public class Circle1 extends GeometricObject {
	private double radius;

	public Circle1(String color, double weight,double radius) {
		super(color, weight);
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return Math.PI*radius*radius;
	}
	
}
