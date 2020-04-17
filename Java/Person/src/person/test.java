package person;

public class test {
	public static void main(String[]args)
	{
		student s = new student();
		s.age=20;
		s.introduceself("Zhou Huiquan");
		employee e = new employee();
		e.age=35;
		e.introduceself("Liang Xin");
		retired r = new retired();
		r.age=70;
		r.introduceself("Liu Mengcheng");
		
	}

}
//OK