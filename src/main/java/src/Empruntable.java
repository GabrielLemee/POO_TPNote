package src;

public class Empruntable {
	private boolean limitationPretAuxAgence;
	private boolean defectueux = false;
	
	public void declarerDefectueux()
	{
		defectueux = true;
	}
	
	public boolean isDefectueux()
	{
		return defectueux;
	}
	
	public boolean isLimitationPretAuxAgences()
	{
		return limitationPretAuxAgence;
	}
	
	public void setLimitationPretAuxAgences(boolean limitationPretAuxAgence)
	{
		this.limitationPretAuxAgence = limitationPretAuxAgence;
	}

}
