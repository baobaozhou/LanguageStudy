package zz;
import java.util.Scanner;
public class TestAccount {
	public static void main(String []args) {
		Account account=new Account(500.00);
		Customer customer=new Customer("zhou","hui");
		System.out.println("顾客名字为："+customer.getFirstName()+customer.getLastName());
		customer.setAccount(account);
		Scanner cin=new Scanner(System.in);
		System.out.println("存入的金额：");
		double count=cin.nextDouble();
		customer.getAccount().deposit(count);
		System.out.println("取出的金额：");
		double ount=cin.nextDouble();
		customer.getAccount().withdraw(ount);
		System.out.println("当前余额为："+customer.getAccount().getBalance());
		
	
	}

}
