package fr.eni.papeterie.bo;

public class Stylo extends Article{
	
	private String couleur;
	
	public Stylo(int idArticle, String marque, String ref,  String designation, float pu, int qte, String couleur) {
		super(idArticle, ref, marque, designation, pu, qte);
		this.setCouleur(couleur);
	}
	
	
	public Stylo(String marque, String ref,  String designation, float pu, int qte, String couleur) {
		super(ref, marque, designation, pu, qte);
		this.couleur = couleur;
	}

	


	

	public Stylo() {
		super();
	}


	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	@Override
	public String toString() {
		return "Stylo{" +
                "couleur='" + couleur + '\'' +
                '}';  
	}
	
	
	
	}
	
	

