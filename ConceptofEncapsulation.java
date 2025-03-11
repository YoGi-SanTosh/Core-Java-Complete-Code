package TypeCastingAndPolymorphism07March2025;


class Encapsulation1
{
	private String Emialid="contact@growtechminds.com";
	public String getemail()//get fetch mailid
	{
		return Emialid;
	}
	public void setemailid(String emialid)
	{
		this.Emialid=emialid;
	}
}


public class ConceptofEncapsulation 
{

	public static void main(String[] args) 
	{
		Encapsulation1 el= new Encapsulation1();
		el.setemailid("mkt@gmail.com");
		System.out.println(el.getemail());

	}

}
