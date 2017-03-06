package bc_om.AeA_TP2.recherche;

import bc_om.AeA_TP2.structure.RNA;

public class FastaGenerator {

	public void generateFasta() {
		
	}
	
	public String buildBoucleTerminale() {
		int taille = (int) (Math.random() * (Rules.LONGUEUR_MAX_BOUCLE_TERMINALE - Rules.LONGUEUR_MAX_BOUCLE_INTERNE) + Rules.LONGUEUR_MAX_BOUCLE_INTERNE + 1);
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < taille; i++)
			builder.append(RNA.randomLetter().name());
		
		return builder.toString();
	}
	
	// genere UN des possible ARN, on ne prete pas attention à la boucle terminale lors de la génération
	
	// lors de la recherche, on trouvera alors plusieurs micro ARN différents avec des boucles différentes
	
}
