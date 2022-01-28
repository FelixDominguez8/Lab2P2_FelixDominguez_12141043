/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_felixdominguez_12141043;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lenovo I7
 */
public class Lab2P2_FelixDominguez_12141043 {
    static Scanner lea=new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList animales=new ArrayList();
        char resp='s';
        while(resp=='s' || resp=='S'){
            System.out.println();
            System.out.println("- MENU -");
            System.out.println("1) Registrar un animal");
            System.out.println("2) Modificar un animal");
            System.out.println("3) Eliminar un animal");
            System.out.println("4) Listar animales");
            System.out.println("5) Alimentar a un animal");
            System.out.println("6) Salida");
            System.out.println("Ingrese la opcion que usted desea: ");
            int opcion=lea.nextInt();
            System.out.println();
            switch(opcion){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    break;
                }
            }
        }
    }
}
