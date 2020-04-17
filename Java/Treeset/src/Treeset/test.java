package Treeset;
import java.util.*;
public class test {
	 public static void main(String[] args) {
		 int [] arr =  new int[80]; //构建一个空的一维数组
		  Set<String> set=new TreeSet<String>();
	        for(int i=0;i<arr.length;i++){
	            int temp =  (int)(Math.random()*100)+1;//随机产生一个 1~10 的整数
	            arr[i] = temp;//将产生的数添加到数组
	            set.add(String.valueOf(arr[i]));
	        }
	            for (String string : set){
	                System.out.print(string+" ");
	            }
	            
	        }
	           
	 }


