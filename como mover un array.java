import javax.swing.*;
import java.util.Scanner;

public class practica_2 {
    public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   int []d=new int[10];
        for (int i = 0; i < d.length; i++) {
            System.out.println("ingrese un numero");
            d[i]=sc.nextInt();
        }
        for (int i = 0; i < d.length ; i++) {
            System.out.println(d[i]);
        }

int ultimo=d[d.length-1];
        for (int i = d.length-2; i >=0; i--) {
            d[i+1]=d[i];

        }
        d[0]=ultimo;
        System.out.println("Después de correrlo");
        for (int i = 0; i <d.length ; i++) {
            System.out.println(d[i]);
        }

    }
}
