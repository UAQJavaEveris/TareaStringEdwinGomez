package mx.com.everis.tallerjava.strings;

public class Strings {
	
	public static void main( String [] args){
		String nombre = "Edwin Gómez Ledezma";
		String nombreFinal ="";
		//nombre=nombre.replace(' ', '1');
		//System.out.println(nombre);
		for(int i = 0; i < nombre.length(); i++){
			if(nombre.charAt(i) == ' ')	{
				nombreFinal += "1";
			}else{
				nombreFinal += nombre.charAt(i);
			}
			
		}
		
		System.out.println(nombreFinal);
	}
}
