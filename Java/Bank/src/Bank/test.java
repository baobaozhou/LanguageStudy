package Bank;
import java.util.*;
public class test {
	public static void main(String[] args) {
		int money;
		System.out.print("���������Ľ������");
		Scanner cin =new Scanner(System.in);
		money=cin.nextInt();
		oNget on=new oNget(money);
		on.show();
		oRget or=new oRget(money);
		or.show();
		iRget ir=new iRget(money); 
		ir.show();

	}


}
//OK