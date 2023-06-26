import java.io.FileInputStream;
import java.util.Properties;

public class tarea1 {
    public static void main(String[] args) {
        try {
            FileInputStream prueba = new FileInputStream("src/xd.properties");
            Properties p = new Properties(System.getProperties());
            p.load(prueba);
            p.setProperty("ZUCK","erberg");
            System.setProperties(p);
            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.err.println("no hay archivo "+e.getMessage());
        }


    }

    }





