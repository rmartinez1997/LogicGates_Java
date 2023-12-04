package gates;

public class XorGate {
	private boolean[] in;
	private int size;
	private static final int D_CAPACITY=10;
	
	public XorGate() {
		this.in=new boolean[D_CAPACITY];
		this.size=0;
	}
	
	public boolean process() {
		boolean val=true;
		for(boolean bool : this.in) {
			if(bool==false)
				val=false;
		}
		if(val==true)
			return true;
		else{
			int count=0;
			for(boolean bool : this.in) {
				if(bool==true)
					count++;
			}
			if(count==1)
				return true;
			else
				return false;
		}
	}

	public void addInput(boolean input) {
		this.in[size]=input;
		this.size++;
	}
	
}

