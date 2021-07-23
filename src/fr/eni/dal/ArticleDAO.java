package fr.eni.dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import fr.eni.papeterie.bll.BLLException;
import fr.eni.papeterie.bo.Article;

public interface ArticleDAO {
	
	public void insert(Article a) throws DALException ;
	
	public Article selectById (int index) throws DALException;  
	
	public List<Article> selectAll() 	throws DALException;
	
	public Connection getConnection() throws DALException;
	
	void update(Article a) throws DALException;
	
	public void delete(int index) throws DALException;
	
	public List<Article> selectByMarque(String marque) throws DALException;
	
	 public List<Article> selectByMotCle(String motCle) throws DALException;
}
