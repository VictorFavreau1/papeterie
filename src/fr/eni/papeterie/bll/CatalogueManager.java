package fr.eni.papeterie.bll;

import java.util.List;

import fr.eni.dal.ArticleDAO;
import fr.eni.dal.DALException;
import fr.eni.dal.DAOFactory;
import fr.eni.papeterie.bo.Article;
import fr.eni.papeterie.bo.Ramette;
import fr.eni.papeterie.bo.Stylo;

public class CatalogueManager extends DAOFactory {
	
	private static CatalogueManager instance;
	private  ArticleDAO daoArticle;
	
	private CatalogueManager() {
		this.daoArticle = DAOFactory.getArticleDAO();
	}
	
	public static  CatalogueManager getInstance() {
		if (instance == null) {
			instance = new CatalogueManager();
		}
		return instance;
	}

	
	public List<Article> getCatalogue() throws BLLException {
		List<Article> catalogue = null;
		try {
		 catalogue = daoArticle.selectAll();
		} catch (DALException e) {
			
			throw new BLLException("Erreur dans la requete getCatalogue");
		}
		return catalogue;
		
	}
	
	public void addArticle(Article a) throws BLLException {
		
		try {
			this.validerArticle(a);
			daoArticle.insert(a);
			
		}catch(DALException e) {
			throw new BLLException("Erreur dans la requete addArticle");

		}
		
	}
	
	
	public void updateArticle(Article a) throws BLLException{
		

		try {
			this.validerArticle(a);
			 daoArticle.update(a);
		}catch(DALException e) {
			throw new BLLException("Erreur dans la requete updateArticle");

		}
		
			
	}
	
	public void removeArticle(int index) throws BLLException{
		try {
			daoArticle.delete(index);
		}catch(DALException e) {
			
			throw new BLLException("Erreur dans la requete removeArticle");

		}
	}
		public Article getArticle(int index) throws BLLException{
			Article article;
		
			try {
				article = daoArticle.selectById(index);
			}catch(DALException e) {
				
				throw new BLLException("Erreur dans la requete getArticle");

			}
			return article;
	}
	public void validerArticle(Article a) throws BLLException{
		if (a.getDesignation()== null || a.getDesignation().equalsIgnoreCase("")) {
			throw new BLLException("Erreur de designation") ;
		}
		if (a.getMarque()== null || a.getMarque().equalsIgnoreCase("")) {
			throw new BLLException("Erreur de marque") ;
		}
		if (a.getReference()== null || a.getReference().equalsIgnoreCase("")) {
			throw new BLLException("Erreur de Reference") ;
		}
		if (a.getQteStock() <0 ) {
			throw new BLLException("Erreur de stock") ;
		}
		if (a.getPrixUnitaire() <0f ) {
			throw new BLLException("Erreur de prix unitaire") ;
		}
		if (a instanceof Ramette) {
			if(((Ramette) a).getGrammage() <=0 ) {
				throw new BLLException("Erreur de grammage") ;
			}
			
		}else {
			if (((Stylo) a).getCouleur() == null ) {
				throw new BLLException("Erreur de couleur") ;

			}
		}
	}	
}
