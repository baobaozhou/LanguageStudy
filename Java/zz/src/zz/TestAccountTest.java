package zz;

public class TestAccountTest {
	public static void main(String []args) {
		AccountTest account =new AccountTest(1122,20000.0,0.045);
		account.withdraw(30000.0);
		System.out.println("余额为："+account.getBalance());
		account.withdraw(2500.0);
		account.deposit(3000.0);
		System.out.println("余额为："+account.getBalance());
		System.out.println("月利率为："+account.getMonthlyInterest());
		
		System.out.println();
		CheckAccount checkaccount=new CheckAccount(1122, 20000.0, 0.045, 5000.0);
		System.out.println("余额为："+checkaccount.getBalance());
		System.out.println("可透支余额为："+checkaccount.getOverdraft());
		System.out.println();
		
		checkaccount.withdraw(5000);

		checkaccount.withdraw(18000);

		checkaccount.withdraw(3000);

	}
	
}
