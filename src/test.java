import java.sql.Connection;

public class test {
    public static void main(String[] args) {
        Connection conn = DBconnection.getConnection();
        if (conn != null) {
            try {
                System.out.println("Connected to: " + conn.getCatalog());
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Connection failed!");
        }
    }
}

