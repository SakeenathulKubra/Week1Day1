package week1.day1;


public class Imobile {

	public void makeCall() {
	
System.out.println("call ringing");
	}
	
 public void sendMsg() {
	System.out.println("send a message");

}
	public static void main(String[] args) {
		Imobile myMobile = new Imobile();
		myMobile.makeCall();
		myMobile.sendMsg();
	}
}
