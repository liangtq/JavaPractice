/*
this看上去是用于区分局部变量和成员变量同名的情况。
this为什么可以解决这个问题？
this到底代表的是什么？
this的特点：
this代表本类对象，到底代表哪一个呢？
	this代表它所在函数所属对象的引用
	this在哪个函数里，就代表哪个函数所属的对象
	简单说：哪个对象在调用this所在函数，this就代表哪个对象，this可能是p或者p1。
	变量有同名情况时候，必须加this
	类（class）里成员被使用，全是由对象来完成，本类里的对象是this，this是运行的对象
*/

class Person
{
	private String name;
	private int age;
	
	Person(String name)
	{
		this.name = name;
		//System.out.println("B: name= "+name+",,age is "+age);
	}
	
	Person(String name,int age)
	{
		name = name;
		this.age = age;
		//System.out.println("C: name= "+name+",,age is "+age);
	}
	
	public void speak()
	{
		System.out.println("name= "+this.name+",,age is "+this.age);
		this.show();//也可以是show()
	}
	
	public void show()
	{
		System.out.println(this.name);
	}
	
}

class PersonDemo1
{
	public static void main(String[] args)
	{
		Person p = new Person("lisi");
		Person p1 = new Person("zhangsan");
		p.speak();
		p1.speak();
		
	}
}