import java.io.FileInputStream;
import java.util.*;

public class tarea1 {
    public static void inverso(int[] inverse){
        for (int i = inverse.length-1; i >=0; i--) {
            System.out.println(inverse[i]);

        }
    }
    public static void main(String[] args) {
      int []g={3,2,1};
        Arrays.sort(g);
        inverso(g);




    }
    }







