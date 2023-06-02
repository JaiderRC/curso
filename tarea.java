import javax.swing.*;
import java.util.Scanner;

public class tarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean error=false;
        double notas=0,prom=0, t = 0,o=0, t1 = 0, r = 0, r1 = 0, e = 0, e1 = 0,prom1 = 0,prom2=0,prom3 = 0;


      for (int i = 1; i < 21; i++) {

                System.out.println("ingrese una nota");
                    notas = sc.nextDouble();
if (notas <1||notas >7){
error=true;
break;
}
    if (notas > 5) {
        t++;
        t1 = t1 + notas;
        prom1 = t1/t;

    }
    if (notas < 4) {
        r++;
        r1 +=notas;
        prom2=r1/r;

    }
    if (notas == 1) {
        e++;

    }
    if (notas==4||notas==5){
        e1++;
        o+=notas;
        
        prom3= o/e1;
    }
prom+=notas;
}


      if (error){
          System.err.println("Error fin del programa");
          System.exit(1);
      }
        System.out.println("el promedio de las notas mayores a 5 es "+prom1);
        System.out.println("promedio de notas inferiores a 4 es "+prom2);
        System.out.println("la cantidad de notas 1 es "+e);
        System.out.println("el promedio total es "+prom/20);





    }
}
