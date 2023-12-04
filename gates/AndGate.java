package gates;

public class AndGate {
	private boolean[] in;
	private int size;
	private static final int D_CAPACITY=10;
	
	public AndGate() {
		this.size=0;
		this.in=new boolean[D_CAPACITY];
	}
	
	public boolean calculate() {
		boolean val=true;

		for(int i = 0; i <size; i++){
			if(this.in[i]==false) {
				val=false;
			}
		}
		return val;
	}
	
	public void addInput(boolean input) {
		this.in[size]=input;
		this.size++;
	}
	
	
	
}