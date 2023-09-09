/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author etonam
 */
public class Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConnectDb  bd= new ConnectDb();
        bd.getConnection();
        
        Id id = new Id();
        id.getMax();
    }
    
}
