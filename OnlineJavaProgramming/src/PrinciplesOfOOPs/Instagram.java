package PrinciplesOfOOPs;

public class Instagram {

	public void status()
	{
		System.out.println("You can post a status of 30 seconds");
	}
}

class Instagram1 extends Instagram
{
	public void status()
	{
		System.out.println("Post a status of 60 seconds");
	}
}
