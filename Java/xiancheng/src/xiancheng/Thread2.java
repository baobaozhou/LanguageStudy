package xiancheng;


public class Thread2 extends Thread{
	Data data;
	public Thread2(Data d){
		data=d;
	}
	public void run(){
		int t;
		synchronized (data) {
			for(int i=0;i<20;i++)
			{
				t=this.data.sum;
				t++;
				try{Thread2.sleep(1);}catch(Exception e){}
				this.data.sum=t;
				
			}	
		}
		
		System.out.println(this.data.sum);
		}

}
