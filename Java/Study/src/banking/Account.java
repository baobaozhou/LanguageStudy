package banking;
public class Account {
	protected double balance;

	public Account(double balance) {
		super();
		this.balance=balance;
		// TODO Auto-generated constructor stub
	}

	public double getBalance() {
		return balance;
	}
   /*
    * ��Ǯ
    */
	public boolean deposit(double amt) {
		
		balance+=amt;
	    return true;
}
	/*
	 * ȡǮ
	 */
	public void withdraw(double amt) {
		if(amt>balance) {
	      System.out.println("����");
		}else
			balance-=amt;
	}
}



