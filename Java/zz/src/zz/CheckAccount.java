package zz;
public class CheckAccount extends AccountTest {
	private double overdraft;
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft ) {
		super(id, balance, annualInterestRate);
		this.overdraft=overdraft;
	}
	public double getOverdraft() {
		return overdraft;
	}
	@Override
	public void withdraw(double amount) {
			if(balance>=amount) {
				balance-=amount;	
			System.out.println("���Ϊ��"+balance);
			System.out.println("��͸֧���Ϊ��"+overdraft);
			}else if((amount-balance)<=overdraft) 
			{
				overdraft-=(amount-balance);
				balance=0;
				System.out.println("���Ϊ��"+balance);
				System.out.println("��͸֧���Ϊ��"+overdraft);
			}else {
					System.out.println("�����޶�");
				}
	}
	}
	

	
    
