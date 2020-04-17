package banking;

public class CheckingAccount extends Account {
	private double overdraftProtection;
	public CheckingAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	public CheckingAccount(double balance,double overdraftProtection) {
		super(balance);
		this.overdraftProtection=overdraftProtection;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		super.withdraw(amt);
		if(balance>=amt) {
			balance-=amt;	
		System.out.println("余额为："+balance);
		System.out.println("可透支余额为："+overdraftProtection);
		}else if((amt-balance)<=overdraftProtection) 
		{
			overdraftProtection-=(amt-balance);
			balance=0;
			System.out.println("余额为："+balance);
			System.out.println("可透支余额为："+overdraftProtection);
		}else {
				System.out.println("超出限额");
	}
	
	
}
	

}
