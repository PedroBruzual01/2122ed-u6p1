package ed.pedro;

public class Alumne {
	
	
	public String nom;
	public String cognom;
	public int any;
	public String cicleFormatiu;
	
	@Override
	public String toString() {
		
		return  "n = " + nom + System.lineSeparator() +
				"c = " + cognom + System.lineSeparator() +
				"a = " + any + System.lineSeparator() +
				"cl = " + cicleFormatiu;
				
		
	}

}
