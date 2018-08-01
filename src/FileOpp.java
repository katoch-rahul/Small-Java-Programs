import java.io.*;
 
class FileOpp
{	
	public void readwrite(FileInputStream x,FileOutputStream y)
	{	int c;
		
		try{do
		{
			 c=x.read();
			if(c!=-1) 
			{System.out.print(" "+ c);
			y.write(c);
			}
		}while(c!=-1);	
	}catch(Exception e)
	{
		System.out.println("File not read/write "+e);
	}
}
	public static void main(String args[])
	{	
		try{
		FileInputStream x=new FileInputStream("readthis.txt");
		FileOutputStream y=new FileOutputStream("writethis.txt");
		FileOpp obj=new FileOpp();
		
		obj.readwrite(x,y);
		x.close();
	}catch(Exception e)
	{System.out.println("File not opened"+e);}
}
}