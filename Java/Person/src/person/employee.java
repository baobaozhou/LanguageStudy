package person;

public class employee extends person {
		int age;
		void introduceself(String name)
		{
			super.introduceSelf(name);
			System.out.println("my age is:"+age);
		}
		

}
