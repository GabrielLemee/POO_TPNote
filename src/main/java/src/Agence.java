package src;

import java.util.ArrayList;
import java.util.List;

public class Agence extends Emprunteur {
	private List<Employe> employes;
	private String nom;
	
	public Agence(String nom)
	{
		this.nom = nom;
		employes = new ArrayList<Employe>();
	}
	
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
