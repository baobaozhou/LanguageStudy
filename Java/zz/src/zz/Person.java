package zz;

class Person {
	private String name;
	private int age;
	private int sex;
	public Person() {
		age=18;
		name="zz";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		if(a>0&&a<130) {
		this.age = a;
		}
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public void study() {
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println(age);
	}
	public void addAge(int i) {
		age+=i;
		System.out.println(age);
		
	}
}
	