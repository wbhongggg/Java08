package Java08;
public class CSphere 
{
    private int x;	//��ߪ�x�y��
    private int y;	//��ߪ�y�y��
    private int z;	//��ߪ�z�y��
    private int radius;	//��ߪ��b�|
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
        System.out.println("��߮y��=("+x+","+y+","+z+")");	//(e)
    }
}