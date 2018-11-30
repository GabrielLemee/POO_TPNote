package src;

import java.util.List;

public class Entreprise extends Emprunteur {
	private List<Agence> agences;
	private List<Employe> employes;
	private String nomEntreprise;
	
	public Entreprise(String nomEntreprise)
	{
		this.nomEntreprise = nomEntreprise;
	}
}
