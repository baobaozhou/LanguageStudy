package xiancheng;
public class Thread1 extends Thread{
	Data data;
	public Thread1(Data d){
		data=d;
	}
	
	public void run(){
		synchronized (data) {
			for(int i=0;i<20;i++)
			{
			      this.data.sum++;
				try{Thread1.sleep(1);}catch(Exception e){}
			}	
		}
		
		System.out.println(this.data.sum);
		}
}
