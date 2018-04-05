
public class Box {

	  int width;
	  int length;
	  int height;
	
	Box(int w,int l,int h)//simple box
	{
		width=w;
		length=l;
		height=h;
	}
	Box(int w)//in case of cube
	{
		width=length=height=w;
	}
	Box()//in case nothing specified
	{
		width=height=length=-1;
	}
	Box(Box ob)//constructor to create clone object
	{
		width=ob.width;
		length=ob.length;
		height=ob.height;
	}
	
	double Volume()
	{
		return width*length*height;
	}
	 
}
