package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import dao.Utilitaire;
import metier.Produit;

public class GestProduitsDAO {
	
public Vector selectNameCode(String keyword){
    Connection conn=Utilitaire.getConnection();
    Vector produits=new Vector();
    Produit p=null;
    try {
        PreparedStatement ps=conn.prepareStatement("select * from produits where nom=? or id=?");
        ps.setString(1,keyword);
        ps.setString(2,keyword);
        ResultSet rsProduit=ps.executeQuery();
        while(rsProduit.next()){
            p=new Produit();
            p.setId(new Integer(rsProduit.getInt("id")));
            p.setNom(rsProduit.getString("nom"));
            p.setDescription(rsProduit.getString("description"));
            p.setQuantite(rsProduit.getInt("quantite"));
            p.setPrix(rsProduit.getInt("prix"));
            produits.add(p);
        }
    } catch (SQLException e) {
    e.printStackTrace();
    }
    return produits;
    }

}