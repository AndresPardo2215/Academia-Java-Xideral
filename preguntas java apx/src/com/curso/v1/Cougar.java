package com.curso.v1;

class Feline {
	
	public String type = "f ";
	public Feline() {
		System.out.println("feline ");
	}

}

public class Cougar extends Feline {
	public Cougar() {
		System.out.println("cougar ");
	}
	void go() {
		type = "c";
		System.out.println(this.type + super.type);
	}
	public static void main(String[] args) {
		new Cougar().go();
	}
}
