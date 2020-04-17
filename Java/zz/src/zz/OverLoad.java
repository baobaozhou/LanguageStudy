package zz;

public class OverLoad {
	public int add(int i,int j) {
		return (i+j)*(i+j);
	}
    public int add(int m) {
    	return m*m;
    }
    public String add(String str){
    	return str;
    }
    public int max(int i,int j) {
    	/*if(i>j) {
    		return i;
    	}else
    		return j;*/
    	return i>j?i:j;
    }
    public double max(double i,double j) {
    	/*if(i>j) {
    		return i;
    	}else
    		return j;*/
    	return i>j?i:j;
    }
    public double max(double i,double j,double m) {
    	/*if(i>j) {
    		if(i>m) {
    			return i;
    		}else
    			return m;
    	}else {
    		if(j>m) {
    			return j;
    		}else 
    			return m;
    	}*/
    	return max(max(i,j),m);
    	
    }
    public static void main(String []args) {
    	OverLoad over =new OverLoad();
    	OverLoad over1 =new OverLoad();
    	System.out.println(over.add(2));
    	System.out.println(over.add(2, 4));
        System.out.println(over.add("zhouhuiquan"));
        System.out.println(over1.max(2, 4));
        System.out.println(over1.max(3.0, 5.0));
        System.out.println(over1.max(3.0, 5.0,6.0));
    }
}
