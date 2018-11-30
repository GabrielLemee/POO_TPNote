package src;

import java.util.List;

public class Emprunteur {
	private List<Empruntable> stock;
	
	
	public void ajouterAuStock(Empruntable materiel)
	{
		stock.add(materiel);
	}
	
	public List<Empruntable> listeMateriel()
	{
		return stock;
	}
	
	public boolean perdreMateriel(Empruntable materiel)
	{
		//TODO
		return true;
	}
}
