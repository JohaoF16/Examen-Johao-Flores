package test;

import dominio.Plano;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PruebaPlano {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Plano obj1 = null;
        int x = 0;
        int y = 0; 
        int opcion = 0;
        int valor=0;
        int px=0;
        int py=0;
        boolean auxb;
        boolean auxd;
        do {
            auxb = false;
            try {
                System.out.println("Plano Cartesiano");
                System.out.println("Coordenada Iniciales X=0  &&  Y=0");
                obj1 = new Plano(0, 0);
            } catch (NumberFormatException e) {
                auxb = true;
            }
        } while (auxb);
        do {
            auxd = false;
            try {
                System.out.println("""
                                   Opciones de Movimiento
                                   1. Y+
                                   2. Y-
                                   3. X-
                                   4. X+
                                   5. Terminar proceso""");
                opcion = entrada.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Opcion no existe ");
                auxd = true;
            } 
            if(opcion!=5){
                try{
                    System.out.println("Ingrese el valor");
                    valor = entrada.nextInt();
                }catch(NumberFormatException e){
                    System.out.println("Dato no valido");
                }                
            }            
            switch(opcion){
                case 1:
                        obj1.setArriba(valor);
                        auxd = true;
                        break;
                case 2:
                        obj1.setAbajo(valor);
                        auxd = true;
                        break;
                case 3:
                        obj1.setIzquierda(valor);
                        auxd = true;
                        break;
                case 4:
                        obj1.setDerecha(valor);
                        auxd = true;
                        break;
                case 5:
                        auxd=false;
            }
            System.out.println("Posicion: "+ "x = "+obj1.getX()+" Y = "+obj1.getY());
            px+=obj1.getX();
            py+=obj1.getY();
         } while (auxd); 
        System.out.println("La distancia final de movimiento es: "+sqrt(pow((px), 2) + pow((py), 2)));
    }         
}