
public class mainly {

	public static void main(String[] args) {
		 
		Box b1=new Box(10,20,10);
		Box b2=new Box(15);
		
		BoxWeight bw1=new BoxWeight(10,20,10,5000);
		BoxWeight bw2=new BoxWeight(15,6000);
		
		System.out.println("Volume of Box 1 is "+b1.Volume());
		System.out.println("Volume of Box 2 is "+b2.Volume());
		
		System.out.println("Density of Box 1 is "+bw1.Density());
		System.out.println("Density of Box 2 is "+bw2.Density());
	}

}
