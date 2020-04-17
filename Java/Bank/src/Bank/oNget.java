package Bank;
public class oNget extends Bank {
	private double saving;
	private double sum;
	oNget(double m){
		saving=m;
		count();
	}
	public void count() {
		sum=saving+(saving*Bank.oN);
	}
	public void show() {
		System.out.print("国债存款金额为："+sum);
	}


}
