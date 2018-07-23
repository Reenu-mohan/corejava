
public class testmessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwitterFeedReader t=new TwitterFeedReader();
		message m1=t.pollForNewMessge();
		System.out.println(m1.getMessageId()); 
		System.out.println(m1.getMessageType());
		System.out.println(m1.getMessageSource()); 
		System.out.println(m1.getMessage());  
		
	}

}
