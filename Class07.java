package Java08;
class CTest
{
	public void test(int x)
	{
		if(x%2==0 & x!=0)
		{
			System.out.println("攫案计");
		}
		else if(x==0)
		{
			System.out.println("计0");
		}
		else
		{
			System.out.println("攫计");
		}
	}
}
public class Class07
{

	public static void main(String[] args)
	{
		CTest ct=new CTest();
		ct.test(3);
		ct.test(8);
		ct.test(0);
	}
}