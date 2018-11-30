package src;

import java.util.ArrayList;
import java.util.List;

public class Emprunteur {
	public List<Empruntable> stock;
	
	public Emprunteur()
	{
		stock = new ArrayList<Empruntable>();
	}
	
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
		return stock.remove(materiel);
	}
}
