package fr.eni.dal;

import fr.eni.papeterie.dal.JdbcImpl.ArticlesDaoJdbcImpl;

public class DAOFactory {
	

	public static ArticleDAO getArticleDAO() {
		ArticleDAO aDAO = new ArticlesDaoJdbcImpl();		
		return aDAO;
	}

}
