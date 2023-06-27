import javax.swing.*;

public class practica_2 {
    public static void main(String[] args) {
int[]epale= new int[10];
int[]a= new int[10];
int[]c= new int[20];
int aux=0,aux1=0;
        for (int i = 0; i < epale.length; i++) {
            epale[i]=i+1;
            System.out.println(epale[i]);

        }
        for (int i = 0; i < epale.length/2; i++) {
            a[aux++]=epale[i];
           a[aux++]=epale[epale.length-1-i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; i+=2) {
            for (int j = 0; j < 2; j++) {
                c[aux1++]=epale[i+j];
            }
            for (int j = 0; j < 2; j++) {
              c[aux1++]=a[i+j];
            }


        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }
}
