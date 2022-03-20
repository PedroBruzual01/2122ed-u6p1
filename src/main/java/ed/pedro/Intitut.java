package ed.pedro;

public class Intitut {

	private static final int ANY = 2021;
	private static final String CICLE_FORMATIU = "1º DAM/DAW";
	private static final String COGNOMS_ALUMNE = "Bruzual";
	private static final String NOM_ALUMNE = "Pedro";

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = NOM_ALUMNE;
		p.cognom = COGNOMS_ALUMNE;
		p.cicleFormatiu = CICLE_FORMATIU;
		p.any = ANY;
		
		System.out.println(p.toString());

	}

}
