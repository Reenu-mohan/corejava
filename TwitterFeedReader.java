
public class TwitterFeedReader implements SocialFeedReader{
	public message pollForNewMessge()
	{
		message m1=new message();
		m1.setMessageId(1);
		m1.setMessage("hello all am twittering..");
		m1.setMessageSource("twitter");
		m1.setMessageType("string");
//		System.out.println(m1.getMessageId()); 
//		System.out.println(m1.getMessageType());
//		System.out.println(m1.getMessageSource()); 
//		System.out.println(m1.getMessage());  
	return m1;
	}
}
