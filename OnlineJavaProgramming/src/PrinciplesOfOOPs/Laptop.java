package PrinciplesOfOOPs;

public class Laptop {
	int ram;
	int rom;
	double ps;

	Laptop(){
	System.out.println("Laptop constructor");	
	}
	
	Laptop(int ram, int rom, double ps) {
		this();
		this.ram = ram;
		this.rom = rom;
		this.ps = ps;
	}
}
//this 1st statement
//this within of the constructor of same class
//recursive
//n->n-1