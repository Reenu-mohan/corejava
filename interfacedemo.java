interface tvremote
{public void switchoff();
public void swithchon();
public void changechannel();
public void changevolume();

	
	}
class sonytv implements tvremote
{

	public void switchoff()
	{ System.out.println("sony tv switching off");
		}
	public void swithchon()
	{System.out.println("sony tv switching on");
		}
	public void changevolume()
	{System.out.println("sony tv change channel");
		}
	public void changechannel()
	{System.out.println("sony tv change volume");
		}
}
class panasonic implements tvremote
{

	public void switchoff()
	{ System.out.println("panasonic tv switching off");
		}
	public void swithchon()
	{System.out.println("panasonic tv switching on");
		}
	public void changevolume()
	{System.out.println("panansonic tv change channel   ");    
		}
	public void changechannel()
	{System.out.println("panasonic tv change volume");
		}
}
public class interfacedemo {

	
	
	public static void main(String[] args) {
		 sonytv st=new sonytv();
		 st.switchoff();
		 st.swithchon();
		
		 st.changechannel();
		 st.changevolume();
		 
		 
		 panasonic pt=new panasonic();
		 pt.switchoff();
		 pt.swithchon();
		
		 pt.changechannel();
		 pt.changevolume();
	}

}
