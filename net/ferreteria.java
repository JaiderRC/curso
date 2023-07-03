
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaider Contreras
 */
public class ferreteria {
    public static void main(String[] args) {
        Scanner fc= new Scanner(System.in);
        int z,i,valor,cantidad,producto=0,total = 0,totaldetotales = 0,num = 0;
        System.out.println("Bienvenido a ferreteria mi casa");
        System.out.println("Cantidad de secciones que tiene la ferretería");
        i =fc.nextInt();
        for(z=1;z<=i;z++){
            valor=0;
                    cantidad=0; 
                    producto=0;
                    total=0;
            do{System.out.println("Bienvenido a la sección "+z);
                System.out.println("Por favor ingresa el nombre del producto");
                String hola = fc.next();
                do{System.out.println("Precio unitario del producto.");
                valor=fc.nextInt();}while(valor<1);
                if (valor !=0){
                    producto++;
                }
                do{System.out.println("Cantidad disponible en el inventario.");
                cantidad=fc.nextInt();}while(cantidad<1);
                total = total + (valor*cantidad);
                totaldetotales = totaldetotales +total;
             System.out.println("La cantidad productos por esta seccion es de "+producto);
             System.out.println("El valor acumulado en stock "+total);
             System.out.println("¿Desea ingresar mas productos en esta sección? 1 para si 2 para no");
              num = fc.nextInt();
            }while (num!=2);
        }
        if (i>=1){
        System.out.println("El valor total del inventario de la ferretería "+totaldetotales);
        }else{
            System.out.println("Numero inválido");
        }
       
       
    }
   
}

