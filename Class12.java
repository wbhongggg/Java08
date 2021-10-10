package Java08;
class CWin
{
	int width,heigh;
	String name;
	void setW(int w)	//(a)
	{
		width=w;	//(a)
	}
	void setH(int h)	//(a)
	{
		heigh=h;	//(a)
	}
	void setName(String s)
	{
		name=s;
	}
	void show()
	{
		System.out.println("Name="+this.name);
		System.out.println("W="+this.width+","+"H="+this.heigh);
	}
	void setWindows(int w,int h)	//(b)
	{
		this.width=w;	//(b)
		this.heigh=h;	//(b)
	}
	void setWindows(int w,int h,String s)	//(c)
	{
		this.width=w;	//(c)
		this.heigh=h;	//(c)
		this.name=s;	//(c)
	}
}
public class Class12
{
	public static void main(String[] args)
	{
		CWin cw=new CWin();
		cw.setName("lst Windows");
		cw.setW(5);
		cw.setH(3);
		cw.show();
	}
}