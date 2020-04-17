package banking;

public class TestEqusl {
	public static void main(String []args) {
		equsl eq1=new equsl("ss","zhongwen");
		equsl eq2=new equsl("ss", "zhongwen");
		if(eq1==eq2) {
			System.out.println(true);
		}else
			System.out.println(false);
		System.out.println(eq1.equals(eq2));
		
	}

}
