class Person
{
	String name; //成员变量，实例变量
	static String country = "CN";
	public static void show()
	{
		System.out.println(name+" " +country);
	}
	
}

class StaticDemo
{
	public static void main(String[] args)
	{
		/*
		Person p = new Person();
		p.name = "zhangsan";
		p.show();
		System.out.println(p.country);
		*/
		System.out.println(Person.country);//类名调用
		
	}
}