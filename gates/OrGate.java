package gates;

public class OrGate {
	private boolean[] in;
	private int size;
	private static final int D_CAPACITY=10;
	
	public OrGate() {
		this.in=new boolean[D_CAPACITY];
		this.size=0;
	}

	public boolean process() {
		boolean val=false;
		for(boolean bool : this.in) {
			if(bool==true) {
				val=true;
			}
		}
		return val;
	}
	
	public void addInput(boolean input) {
		this.in[size]=input;
		this.size++;
	}
}
