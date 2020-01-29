
package myinfo;

/**
 *
 * @author Avishek 
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Update {
    public static void main(String[] args)
    {
       Database databaseManager = new Database( "root", "" ); 
       Calendar calendar = Calendar.getInstance();
       java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
       
       String query = " update info set Contact=?, Address=? where id=?";
       
       PreparedStatement preparedStmt= null;
       try{
        preparedStmt = databaseManager.getConection().prepareStatement(query);
        preparedStmt.setString(1,"9843584287");
        preparedStmt.setString(2,"Chabahil");
        preparedStmt.setInt(3,1);
        
        int i= preparedStmt.executeUpdate();
        System.out.println(i+" record updated");
       }
       catch (SQLException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
       }

    }
}
