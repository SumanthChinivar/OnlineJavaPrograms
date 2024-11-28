package PrinciplesOfOOPs;

public class Whatsapp {
	long pno;
	
	//no argument constructor
	Whatsapp(){
		super();
	}
	
	public Whatsapp(long pno) {
		super();
		this.pno = pno;
	}
	
	public void display() {
		System.out.println(pno);
	}
}


class Whatsapp1 extends Whatsapp
{
	long pno;
	
	public Whatsapp1(long pno1,long pno2) {
		super(pno1);
		this.pno=pno2;
//		super();//pass arguments
//		this.pno=pno1;
//		super.pno=pno2;
	}
	
	public void display()
	{
		super.display();
		System.out.println(this.pno);
	}
}