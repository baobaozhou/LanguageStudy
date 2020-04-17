package zz;

public class Test {
	
	public boolean equlsArea(GeometricObject o1,GeometricObject o2) {
		if(o1.findArea()==o2.findArea()) {
			return true;
		}else
			return false;
		 }
	public void displayGeometricObject(GeometricObject o) {
		System.out.println("area:"+o.findArea());
	}
	public static void main(String []args) {
		Test test=new Test();
		Circle1 circle1 = new Circle1("ºìÉ«",0,2);
		MyRectangle myRectangle = new MyRectangle("»ÆÉ«",0,2,6.28);
		boolean result =test.equlsArea(circle1, myRectangle);
		System.out.println(result);
		test.displayGeometricObject(circle1);
	}

}
