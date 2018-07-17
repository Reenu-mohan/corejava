
public class testBand {

	public static void main(String[] args) {
		band b1=new band();
		band b2=new band();
		
		String singers[]= {"gokul","ram"};
		String gutarist[]= {"krashma","krishna"};
		b1.setBandDetails("thaikudam", singers, gutarist, "akash");
		b1.printBandDeatils();
		System.out.println(b1.countMembers());
		
		
		String singes[]= {"goor","real","rashi"};
		String gutarit[]= {"karan","seth"};
		b2.setBandDetails("rockers", singes, gutarit, "avni");
		b2.printBandDeatils();
		System.out.println(b2.countMembers());
		
	}

}
 