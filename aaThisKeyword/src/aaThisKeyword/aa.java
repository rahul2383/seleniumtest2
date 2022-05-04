package aaThisKeyword;

public class aa {
	int a;
	public aa(){		//constructor
		this(5);
		System.out.println("boss");	
	}
	aa(int a){ 		//constructor
		System.out.println("paremetrize cons");
		this.a=a;
		}
	public void sonu() { 	
		this.pinu(4.5);
		System.out.println("boss");
		System.out.println(a);
	}
	void monu (int dd,int ss) {  			//method
		this.sonu();
		System.out.println("monu method");
	}
	void sinu(int a) { 				//method
		System.out.println("sinu");	
	}
	void pinu(double g) { 				//method
		this.sinu(4);
		System.out.println("pinu method");	
	}
	public static void main(String args []) {
		aa v1 = new aa();
		v1.sonu();
		v1.monu(33, 5);	
	}	
}