/*
this语句用于构造函数直接的互相调用
this语句只能定义在构造函数的第一行，this(name)
初始化中，还有初始化要先执行 this(name);为初始化中的初始化，先执行

*/

class Person
{
	private String name;
	private int age;
	
	Person()
	{
		//this("haha");
	}
	
	Person(String name)
	{
		//this();
		this.name = name;
		//System.out.println("B: name= "+name+",,age is "+age);
	}
	
	Person(String name,int age)
	{
		//this.name = name;
		//Person(name);构造函数间不可以这样调用
		this(name);//代表p这个对象，相当于p.name
		this.age = age;
		//System.out.println("C: name= "+name+",,age is "+age);
	}
	
	
}

class PersonDemo2
{
	public static void main(String[] args)
	{
		//Person p = new Person("lisi", 30);
		new Person();
	}
}