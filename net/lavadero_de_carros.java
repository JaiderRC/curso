
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaider Contreras
 */
public class lavadero_de_carros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type,documento,registro=0,typeservice,typecar = 0,servicevalue = 0,servicievaluecamionetas=0,servicievaluemotos=0,carros = 0,camionetas = 0,motos=0,variablevalue=0,contvalorcarros=0,contvalormotos=0,contvalorcamionetas=0;
        do{
        System.out.println("Bienvenido a mi Car S.A.");
        System.out.println("Por favor ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su documento de identidad");
        documento=sc.nextInt();
        System.out.println("Tipo de vehiculo 1. Autos y 2. Motos");
        type = sc.nextInt();
        if (type ==1){
            System.out.println("Tipo de de auto: 1. Automóvil, 2. Camioneta");
            typecar= sc.nextInt();
            if (typecar==1){
                carros++;
            }
            if (typecar==2){
                camionetas++;
            }
        }
        if (type ==2){
            motos++;
        }
        System.out.println("Tipo de servicio 1. Lavado automático (manual) valor $ 20.000 pesos, 2. Túnel de lavado (Los túneles cuentan con grandes rodillos que presionan y limpian el exterior de tu auto), valor $ 25.000 pesos, 3. Lavado en seco o ecológico, valor $ 30.000 pesos");
        typeservice = sc.nextInt();
        if (typeservice==1){
              servicevalue = servicevalue = 20000;
              
                }
        if (typeservice==2){
              servicevalue = servicevalue = 25000;
              
                }
        if (typeservice==3){
              servicevalue = servicevalue = 30000;
              
                }
        
        
        switch (type){
            case 1:
                if (typecar==1){
                    
                    System.out.println("El valor a cancelar es de "+servicevalue);
                    contvalorcarros=contvalorcarros+servicevalue;
                    
                }
                
                if (typecar==2){
                    variablevalue=(servicevalue*20)/100;
                    servicevalue=servicevalue+variablevalue;
                  System.out.println("El valor a cancelar es de "+servicevalue);
                  contvalorcamionetas=contvalorcamionetas+servicevalue;
                }
                break;
            case 2:
               
               variablevalue=(servicevalue*30)/100;
               servicevalue=servicevalue-variablevalue;
               System.out.println("El valor a cancelar es de "+servicevalue); 
               contvalormotos=contvalormotos+servicevalue;
               break;
                
                
                
                
                
        } System.out.println("ADMIN 1. Continuar recibiendo vehículos, 2. Finalizar la jornada");
        registro = sc.nextInt();
                
                
        }while(registro==1);
        System.out.println("TOTAL DE GANANCIAS POR CLASIFICACIÓN");
        System.out.println("CARROS: "+contvalorcarros+" pesos");
        System.out.println("MOTOS: "+contvalormotos+" pesos");
        System.out.println("CAMIONETAS: "+contvalorcamionetas+" pesos");
        System.out.println("TOTAL DE VEHÍCULOS POR CLASIFICACIÓN");
        System.out.println("CARROS: "+carros);
        System.out.println("MOTOS: "+motos);
        System.out.println("CAMIONETAS: "+camionetas);
        System.out.println("TOTAL DE GANANCIAS");
        System.out.println(contvalorcarros+contvalormotos+contvalorcamionetas+" pesos");
        
        
        

    }
    
}
