package respositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AdresseRespository {
    
  

  public void insert(Adresse adresse){
    
    String sql=String.format("INSERT INTO `adresse` (`ville_ad`, `quartier_ad` , 'numville_ad')"+
                              "VALUES ('%s', '%s', '%s') ",
                             adresse.getId(),adresse.getAdresse());
     try {
          
          Class.forName("com.mysql.cj.jdbc.Driver");                  
          Connection conn = DriverManager.getConnection(
                                     "jdbc:mysql://localhost:8889/iageb_ism_2024", "root", "root");
          Statement stmt = conn.createStatement();
          stmt.executeUpdate(sql);               
          conn.close();
      } catch (Exception e) 
      {
         System.out.println("Erreur de chargement du Driver");
      }

  }


  public ArrayList<Adresse>  selectAll(){
      String sql="select * from adresse ";
      ArrayList<Adresse> adresses=new ArrayList<>();
    try {
      
        Class.forName("com.mysql.cj.jdbc.Driver");
     
         Connection conn = DriverManager.getConnection(
             "jdbc:mysql://localhost:8889/iageb_ism_2024", "root", "root");
        
        Statement stmt = conn.createStatement();
      
        ResultSet rs=stmt.executeQuery(sql);
         while (rs.next()) {
           
             Adresse adresse=new Adresse();
             adresse.setId(rs.getInt("id_ad"));
             adresse.setVille(rs.getString("ville_ad"));
             adresse.setQuartier(rs.getString("quartier_ad"));
             adresse.setNumVilla(rs.getString("numVilla_ad"));
             adresses.add(adresse);
         }
         rs.close();
         conn.close();
    } catch (Exception e) {
         System.out.println("Erreur de chargement du Driver");
    }
       return adresses;
  }
}
