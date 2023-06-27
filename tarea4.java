import java.io.FileInputStream;
import java.util.*;

public class tarea1 {
    public static void comparar(String[] comparar){
        for (int i = 0; i <comparar.length; i++) {
            for (int in = 0; in < comparar.length; in++) {
            if (comparar [i].compareTo(comparar[in]) <0){
String xd=comparar[i];
comparar[i]=comparar[in];
comparar[in]=xd;

                }
            }


        }
    }
    public static void main(String[] args) {
      String []g={"axcvb","ghjk","fghioo"};
        //Arrays.sort(g);
        comparar(g);
        for (int i = 0; i < 3; i++) {
            System.out.println(g[i]);
        }




    }
    }







