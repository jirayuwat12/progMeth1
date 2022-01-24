package myPackage;

public class SimpleDice {
	final static int MAX = 6;
	private int faceValue;
	/*
	 private package protected puclic
	 */
	public SimpleDice(int faceValue) {
		this.faceValue = faceValue;
	}
	public SimpleDice() {
		this.faceValue = (int)(Math.random()*MAX) +1;
	}
	
	public int roll() {
		this.faceValue = (int)(Math.random() * MAX) +1;
		return this.faceValue;
	}
	//getter
	public int getFace() {
		return this.faceValue;
	}
	//setter
	public void setFace(int faceValue) {
		if(faceValue <1) this.faceValue = 1;
		else if(faceValue > MAX) this.faceValue = MAX;
		else this.faceValue = faceValue;
	}
	//to string
	public String toString() {
		return "The face is "+this.faceValue;
	}
	
	public boolean equals( Object o ) {
		SimpleDice otherDice = (SimpleDice)(o);
		if(otherDice.faceValue == this.faceValue) {
			return true;
		}
		return false;
	}
}
