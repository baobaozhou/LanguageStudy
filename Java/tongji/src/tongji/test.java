package tongji;
import java.util.Scanner;
import java.util.HashMap;
public class test {
		public static void test(String s){
			HashMap<String, Integer> map = new HashMap<String, Integer>();//map中允许相同元素出现，自动判定；运用map将一个string对应成一个int
			String arr[]=s.split(" ");//调用字符串函数将字符串分隔成单词
			for(int i=0;i<arr.length;++i) map.put(arr[i], 1);//将出现数组字符串放入map中，每次加1，用来统计字符数
			System.out.println(map.size());
		}
		public static void main(String[] args) {
			Scanner ss=new Scanner(System.in);
			String s=new String();
			s=ss.nextLine();//nextline整行返回
			test(s);
		}
	}

//OK