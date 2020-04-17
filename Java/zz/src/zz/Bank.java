package zz;

public class Bank {
		private Customer []customers;
		private int numberOfCustomers;
		public Bank() {
			customers=new Customer[2];
		}
		public void addCustomer(String firstName,String lastName) {
			Customer customer=new Customer(firstName,lastName);
			customers[numberOfCustomers]=customer;
			numberOfCustomers++;
		}
		public int getNumberOfCustomers() {
			return numberOfCustomers;
		}
		public Customer getCustomer(int i) {
			return customers[i];
		}
		
}
