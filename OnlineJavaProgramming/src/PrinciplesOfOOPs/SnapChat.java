package PrinciplesOfOOPs;

public abstract class SnapChat {
	abstract void send();
}

class SnapChatImplementation extends SnapChat{
	void send() {
		System.out.println("Message Sent");
	}
}