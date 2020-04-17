package test;
import java.util.Scanner;
class test {
	public static void main(String[] args){
		
	
		/*System.out.println("hello test");
		int z=100;
		System.out.println(z==100);
		System.out.println(z++!=100);
		 
		Scanner cin=new Scanner(System.in);
		int num1=cin.nextInt();
		int num2=cin.nextInt();
		int num3=cin.nextInt();
		int a[]= {num1,num2,num3};
		for(int i=1;i<3;i++)
		{
			int j;
			int x=a[i];
			 for( j=i;  j>0 && x<a[j-1];j--)
			 {
                 a[j]=a[j-1];    
             }    
             a[j]=x;
		}
		for(int i=0;i<3;i++)
		{
		  System.out.print(a[i]+" ");
		}
		
	}*/
		Scanner cin=new Scanner(System.in);
		int score=cin.nextInt();
		switch(score) {
		case 1:
			if(score>=90) {
				System.out.println("A");
			}	
		case 2:
			if(score>=70&&score<90) {
				System.out.println("B");
			}		
		case 3:
			if(score>=60&&score<70) {
				System.out.println("C");
			}
		default:
			if(score<60) {
			System.out.println("D ");
			}
			
		}
		
	}
}
		
		

