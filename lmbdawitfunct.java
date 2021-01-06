package learnigstart;
interface Employee{
	abstract double raiseSal(double pr);
}
public class lmbdawitfunct {
	//Note:
	//with the help of lambda expression there is no need to always create class to implements
	 // interface with the help of interface references we can easily access methods
	public static void main(String[] args)
	{double sal=7000.0;
	//lambda expression to define functional interface
		Employee ee=(double pr)-> sal +(sal*pr);
		display(0.4,ee);
		double res1=ee.raiseSal(0.5);
		System.out.println(res1);
		
	}
	//function to print required output
	public static void display(double d,Employee e)
	{
		double res=e.raiseSal(d);
		System.out.println(res);
	}

}
