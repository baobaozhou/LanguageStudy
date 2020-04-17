package zz;

public class Circle {
	private double radius;
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double findArea() {
		return 3.14*radius*radius;
	}
}
class PassObject {
public void printAreas(Circle c,int time) {
	for(int i=0;i<=time;i++) {
		c.setRadius(i);
		System.out.println(c.getRadius()+" "+c.findArea());
	}
	
	}

}

