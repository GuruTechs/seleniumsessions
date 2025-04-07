package bashademo;

public class Methoddemo {

	public static void main(String[] args) 
	{
		Methoddemo d  = new Methoddemo();
		String name=d.getdata();
		System.out.println(name);

	}
	
	public String getdata()
	{
		System.out.println("hello world");
		return "Shamsheer";
	}

}
