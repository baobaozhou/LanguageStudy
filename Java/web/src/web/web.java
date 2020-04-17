package web;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
public class web {
	static ArrayList<String> ss = new ArrayList<String>(); 
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
    public static void main(String args[]) {  
        String a = null;  
        try {  
            String url = "http://poj.org/problem?id=1417";  
            BufferedReader in = new BufferedReader(new InputStreamReader(  
                    new URL(url).openConnection().getInputStream(), "GB2312")); 
            while ((a = in.readLine()) != null) {  
            	if(a.equals("<br>")) continue;
            	if(a.startsWith("<br>")){
            		a=a.replaceAll("<br>", "");
            		String arr[]=a.split(" ");
            		for(int i=0;i<arr.length;++i) {
            			if(map.containsKey(arr[i])){
            				int x=map.get(arr[i]);
            				map.put(arr[i],x+1);
            			}
            			else map.put(arr[i], 1);
            		}
            	}
            }  
        } catch (MalformedURLException e) {  
        } catch (IOException e) {  
        }  
        System.out.println(map);
        }

}
