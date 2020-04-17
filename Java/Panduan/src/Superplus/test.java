package Superplus;
import java.util.*;
public class test {
	public static void main(String[] args){
		int sum=0;
		boolean t=true;
		System.out.print("输入一组整数序列");
		Scanner cin=new Scanner(System.in);
		int []number=new int[10];
		for(int i=0;i<10;i++){
			int n=cin.nextInt();
			number[i]=n;
			if(n==-999) {
				break;
			}
			if(i!=0) {
				sum+=number[i-1];
			}
			if(number[i]<=sum) {
				t=false;
			}
			
		}
			if(t==true){
				System.out.println("该组整数是一个超级递增数列");
			}
			else{
				System.out.println("该组整数不是一个超级递增数列");
			}
		}
	}

//OK
