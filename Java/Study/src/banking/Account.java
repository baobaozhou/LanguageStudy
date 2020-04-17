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
    * ´æÇ®
    */
	public boolean deposit(double amt) {
		
		balance+=amt;
	    return true;
}
	/*
	 * È¡Ç®
	 */
	public void withdraw(double amt) {
		if(amt>balance) {
	      System.out.println("Óà¶î²»×ã");
		}else
			balance-=amt;
	}
}



