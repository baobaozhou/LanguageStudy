package Bank;

public class iRget extends Bank {
	private double saving;
	private double sum;
	iRget(double m){
		saving=m;
		count();
	}
	 public void count() {
		sum=saving+(saving*Bank.iR);
	}
	 public void show() {
		System.out.print("���ڴ����Ϊ��"+sum);
	}

}
