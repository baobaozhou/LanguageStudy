package zz;

public class TestBank {
	public static void main(String []args) {
	Bank bank =new Bank();
	bank.addCustomer("zh", "hu");
	bank.addCustomer("zh", "hu");
	bank.addCustomer("zh", "hu");
	for(int i =0;i<bank.getNumberOfCustomers();i++) {
	Customer customer=bank.getCustomer(i);
	System.out.println(customer.getFirstName()+customer.getLastName());
	}
}
}
