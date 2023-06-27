import java.io.FileInputStream;
import java.util.*;

public class tarea1 {
    public static void comparar(String[] comparar){
        int contador=0;
        for (int i = 0; i <comparar.length-1; i++) {
            for (int in = 0; in < comparar.length-1-i; in++) {
            if (comparar [in+1].compareTo(comparar[in]) <0){
String xd=comparar[in];
comparar[in]=comparar[in+1];
comparar[in+1]=xd;

                }
            }
contador++;
            System.out.println("contador = " + contador);

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







