package Treeset;
import java.util.*;
public class test {
	 public static void main(String[] args) {
		 int [] arr =  new int[80]; //����һ���յ�һά����
		  Set<String> set=new TreeSet<String>();
	        for(int i=0;i<arr.length;i++){
	            int temp =  (int)(Math.random()*100)+1;//�������һ�� 1~10 ������
	            arr[i] = temp;//������������ӵ�����
	            set.add(String.valueOf(arr[i]));
	        }
	            for (String string : set){
	                System.out.print(string+" ");
	            }
	            
	        }
	           
	 }


