
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





/**
 *
 * @author etonam
 */
public class Id {
       Connection con = ConnectDb.getConnection();
       PreparedStatement ps;
       
       
       public int getMax(){
           int id= 0;
           Statement st;
           try {
               st = con.createStatement();
                ResultSet rs = st.executeQuery("Select max(id) from Id");
                while (rs.next()){
                    id = rs.getInt(1);
                    
                }
           } catch (SQLException ex) {
               Logger.getLogger(Id.class.getName()).log(Level.SEVERE, null, ex);
           }
          return id + 1;
           
       }
       
       public void insert (int id, String photo, String age, String sexe, String email, String nom, String prenom, String institue, String semestre, String annee_acadmique, String annee_academique)
       {
           String sql ="insert into student values (?,?,?,?,?)";
           try {
               ps = con.prepareStatement(sql);
               ps.setString(1, nom);
               ps.setString(2, prenom);
               ps.setString(3, institue);
               ps.setString(4, semestre);
               ps.setString(5, annee_academique);
               ps.setString(6, age);
               ps.setString(7, sexe);
               ps.setString(8, email);
               ps.setInt(9, id);
               
               
               
               if(ps.executeUpdate()>0){
                   JOptionPane.showMessageDialog(null, "Enrégistrement réussi");
               }
           } catch (SQLException ex) {
               Logger.getLogger(Id.class.getName()).log(Level.SEVERE, null, ex);
           }
       }

    void insert(String nom, String prenoms, String institue, String semestre, String Année_academique, String Année_academique0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
      
      
}
