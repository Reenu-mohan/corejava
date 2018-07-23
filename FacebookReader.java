
public class FacebookReader implements SocialFeedReader  {
	public message pollForNewMessge()
	{
		message m1=new message();
		m1.setMessageId(2);
		m1.setMessage("hello all am posting on facebook..");
		m1.setMessageSource("Facebook");
		m1.setMessageType("string");
		m1.setSender("mark sukergurg");
	return m1;
	}
		
		
	
}
