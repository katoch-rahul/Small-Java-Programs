
public class BoxWeight extends Box {
	
	  int weight;

	public BoxWeight(int w, int l, int h,int wt) {
		super(w, l, h);
		weight=wt;
	}

	public BoxWeight(int w,int wt) {
		super(w);
		weight=wt; 
	}

	public BoxWeight() {
		super();weight=-1;
	}

	public BoxWeight(BoxWeight ob) {
		super(ob);
		weight=ob.weight;
	}
	
	double Density() {
		return this.weight/this.Volume();
	}

}
