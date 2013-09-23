public class Gender extends HelloWorld
{

	protected boolean sexe;
	
			
//constructeur de la classe Gender herite de HelloWorld
	public Gender(String name, boolean sexe ) 
	{
		super(name);
		this.sexe=sexe;
		
	}
	public String print()
	{
	if (sexe)
 // je peux reutiliser nom util parce que protected
		{return "Bonjour Mr "+nomutil;}
	else    {return "Bonjour Mme "+nomutil;}
	}

}
		                                                                                                                                                                                                                                                                                                                              
