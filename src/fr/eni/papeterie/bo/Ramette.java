package fr.eni.papeterie.bo;

public class Ramette extends Article{
	
	private int grammage;
	
	

	
	
	public Ramette(String marque, String ref,  String designation, float pu, int qte, int grammage) {
		super(marque, ref, designation, pu, qte);
		this.grammage = grammage;
	}



	public Ramette(Integer idArticle, String marque, String ref,  String designation, float pu, int qte, int grammage2) {
		super(idArticle, marque, ref, designation, pu, qte);
		this.setGrammage(grammage);	}



	public int getGrammage() {
		return grammage;
	}

	public void setGrammage(int grammage) {
		this.grammage = grammage;
	}

	
	@Override
	public String toString() {
		return "Ramette{" +
				"grammage=" +grammage+
				'}';
	}
	

}
