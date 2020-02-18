import java.util.*;
import java.io.*;
import java.lang.*;
abstract class interest
{
abstract double calculateinterest(double p,double t,double r);

}
class simpleinterest extends interest
{
public double calculateinterest(double p,double t,double r)
{
	return (p*t*r)/100;
}
}
class compoundinterest extends interest
{
public double calculateinterest(double p,double t,double r)
{
	return Math.pow(1.0+r/100.0,t)*p-p;
}
}
class sici
{
	public static void main (String args[ ])
	{
		double pr, rate, t;
    Scanner sc=new Scanner (System. in);
    System.out.println("Enter the amount:");
    pr=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    t=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    rate=sc.nextDouble();
    
    simpleinterest obj1= new simpleinterest();
	compoundinterest obj2= new compoundinterest();
    System.out.println("Simple Interest="+obj1.calculateinterest(pr,t,rate));
    System.out. println("Compound Interest="+obj2.calculateinterest(pr,t,rate));
	}
}