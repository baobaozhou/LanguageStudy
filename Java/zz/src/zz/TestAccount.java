package zz;
import java.util.Scanner;
public class TestAccount {
	public static void main(String []args) {
		Account account=new Account(500.00);
		Customer customer=new Customer("zhou","hui");
		System.out.println("�˿�����Ϊ��"+customer.getFirstName()+customer.getLastName());
		customer.setAccount(account);
		Scanner cin=new Scanner(System.in);
		System.out.println("����Ľ�");
		double count=cin.nextDouble();
		customer.getAccount().deposit(count);
		System.out.println("ȡ���Ľ�");
		double ount=cin.nextDouble();
		customer.getAccount().withdraw(ount);
		System.out.println("��ǰ���Ϊ��"+customer.getAccount().getBalance());
		
	
	}

}
