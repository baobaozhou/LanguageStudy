package xiancheng;
public class test {
	public static void main(String[] args)
	{
		Data d=new Data();
		Thread1 t1=new Thread1(d);
		t1.start();
		Thread2 t2=new Thread2(d);
		t2.start();
	}

}
