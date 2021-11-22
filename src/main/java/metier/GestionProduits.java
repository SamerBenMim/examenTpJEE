package metier;
import java.util.Vector;

import dao.GestProduitsDAO;

public class GestionProduits {
	GestProduitsDAO dao;
	public GestionProduits()
	{
		dao=new GestProduitsDAO();
	}
	public Vector lister(){
        return dao.selectAll();
    }
	public Vector listKeyword(String keyword)
	{
		return dao.selectNameCode(keyword);
	}
}
