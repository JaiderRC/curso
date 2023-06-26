import java.io.FileInputStream;
import java.util.Properties;

public class tarea1 {
    public static void main(String[] args) {
      String[] ruleta ={"jaider","jose","juan"};
      double random = Math.random();
        System.out.println("random = " + random);
      random*=ruleta.length;
        System.out.println("random = " + random);
       random = Math.floor(random);
        System.out.println("random = " + random);
        System.out.println("el ganador es "+ruleta[(int)random]);

    }

    }





