import java.util.*;
import java.io.*;
import java.lang.*;
class standard
{
public int constructioncost(int area)
{
return area*1200;
}
}
class abovestandard extends standard
{
public int constructioncost(int area)
{
return area*1500;
}
}
class highstandard extends standard
{
public int constructioncost(int area)
{
return area*1800;
}
}
class fullyautomated extends highstandard
{
public int constructioncost(int area)
{
return area*2500;
}
}
class conccost
{
public static void main(String args[])
{
	int area,ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the area of house");
	area=sc.nextInt();
	System.out.println("1.standard");
	System.out.println("2.abovestandard");
	System.out.println("3.highstandard");
	System.out.println("4.fullyautomated");
	System.out.println("enter your choice");
	ch=sc.nextInt();
	
		switch(ch)
		{
			case 1:
				standard obj1=new standard();
				System.out.println("construction cost="+obj1.constructioncost(area));
				break;
			case 2:
				abovestandard obj2=new abovestandard();
				System.out.println("construction cost="+obj2.constructioncost(area));
				break;
			case 3:
				highstandard obj3=new highstandard();
				System.out.println("construction cost="+obj3.constructioncost(area));
				break;
			case 4:
				fullyautomated obj4=new fullyautomated();
				System.out.println("construction cost="+obj4.constructioncost(area));
				break;
		}
		
	
	
	
}
}