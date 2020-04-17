package banking;
public class Customer {
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

