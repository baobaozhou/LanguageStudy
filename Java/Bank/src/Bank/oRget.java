package Bank;
public class oRget extends Bank{
	private double saving;
	private double sum;
	oRget(double m){
		saving=m;
		count();
	}
	public void count() {
		sum=saving+(saving*Bank.oR);
	}
	public void show() {
		System.out.print("���ڴ����Ϊ��"+sum);
	}



}
