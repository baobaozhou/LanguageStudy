package Bank;
import java.util.*;
public class test {
	public static void main(String[] args) {
		int money;
		System.out.print("请输入存入的金额数：");
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