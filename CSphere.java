package Java08;
public class CSphere 
{
    private int x;	//圓心的x座標
    private int y;	//圓心的y座標
    private int z;	//圓心的z座標
    private int radius;	//圓心的半徑
    void setLocation(int a,int b,int c)	//(a)
    {
        x=a;y=b;z=c;	//(a)
    }
    void setRadius(int d)	//(b)
    {
        radius = d;	//(b)
    }
    public int setfaceArea()	//(c)
    {
        return 4*radius*radius;	//(c)
    }
    public int volume()	//(d)
    {
        return 4/3*(radius*radius*radius);	//(d) 
    }
    public void showCenter()	//(e)
    {
        System.out.println("圓心座標=("+x+","+y+","+z+")");	//(e)
    }
}