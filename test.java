import java.sql.*;
 
public class test {
 
    public static void main(String[] args) {
      /* */  try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", ""); 
            System.out.println("connected");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Table9");
            while (rs.next()) {
                System.out.println("PAY_ID= " + rs.getInt(1) );
                System.out.println("PAY_METHOD: " + rs.getString(2) );
                System.out.println("C_ID: " + rs.getInt(3) );
               System.out.println();
            }
        } catch (Exception s) {
            System.out.println(s);
        }
    }
}
 
 
//javac -cp Driver.jar;. Object.java
//java -cp Driver.jar;. Object
