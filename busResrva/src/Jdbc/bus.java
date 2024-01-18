package Jdbc;

public class bus {
	private int busNo;
	private boolean AC;
	private int capacity;//get and set methods needed
	
	bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.AC=ac;
		this.capacity=cap;
	}
	public int getbusNo() {//accesor method
		return busNo;	
	}
	public boolean isAc() {//mutator method
		return AC;
	}
	public void setAc(boolean val) {//mutator method
		AC=val;
	}
	public int getCapacity() {//accesor method
		return capacity;
	}
	public void setCapacity(int cap) {//mutator method
		capacity=cap;
	}
//	public void displayBusInfo(){
//		System.out.println("Bus no ; "+busNo+" "+"AC ; "+AC+"Total Capacity ; "+capacity);
//	}
}

