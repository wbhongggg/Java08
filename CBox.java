package Java08;
public class CBox
{
	int length;
	int width;
	int height;
	public int volume()	//(b)
	{
		return length*width*height;	//(b)
	}
	public int surfaceArea()	//(c)
	{
		return length*width*6;	//(c)
	}
	public void showData()	//(d)
	{
		System.out.println("length:"+length);	//(d)
		System.out.println("width:"+width);	//(d)
		System.out.println("height:"+height);	//(d)
	}
	public void showAll()	//(e)
	{
		System.out.println("length:"+length);	//(e)
		System.out.println("width:"+width);	//(e)
		System.out.println("height:"+height);	//(e)
		System.out.println("Åé¿n="+volume());	//(e)
		System.out.println("ªí­±¿n="+surfaceArea());	//(e)
	}
}