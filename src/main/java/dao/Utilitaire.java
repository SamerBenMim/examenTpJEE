package dao;
import java.sql.Connection;
import java.sql.DriverManager;
public class Utilitaire {
    private static String name,pass,url;
    private static Connection conn=null;
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://localhost:3306/narwes";
            name="root";
            pass="";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/narwes","root","");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void main(String [] args)
    {
        Connection c = Utilitaire.getConnection();
    }}