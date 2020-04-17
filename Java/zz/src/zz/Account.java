package zz;

public class Account {
	private double balance;
    //boolean true;
    public double getBalance() {
		return balance;
	}
    public Account(double int_balance) {
    	balance=int_balance;
    }
	public void deposit(double sum) {
		
			balance+=sum;
		    //return true;
	}
	public void withdraw(double sum) {
		if(balance<sum) {
			//System.out.println("false");
		}
		balance-=sum;
	
	}	

}
class Customer{
	private String lastName;
	private String firstName;
	private Account account;
	public Customer(String f,String l) {
		lastName=l;
		firstName=f;
		
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}

