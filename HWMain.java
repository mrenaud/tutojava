public class HWMain
{
//# main methode qui est statique : on peut appeller la methode de la classe sans passer par une instance de la classe
	public static void main(String[] args)
			{
			HelloWorld monHelloWorld = new HelloWorld("Toto");
			System.out.println(monHelloWorld.print());
			}	
}

