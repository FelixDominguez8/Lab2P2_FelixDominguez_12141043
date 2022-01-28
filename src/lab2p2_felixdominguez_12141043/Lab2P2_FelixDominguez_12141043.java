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
        animales.add(new Animal("Phocidea","Foca","Antartida","Pescados","Gordo","Zonas heladas",30));
        animales.add(new Animal("Hydrocoerus","Capybara","Jungla","Vegetales","Peludo","America del sur",20));
        animales.add(new Animal("Anatinae","Pato","Lagos","Granos","Pico plano","Zona norte",10));
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
                    lea.nextLine();
                    System.out.println("Ingrese el nombre cientifico del animal: ");
                    String nomc=lea.nextLine();
                    System.out.println("Ingrese el nombre comun del animal: ");
                    String nom=lea.nextLine();
                    System.out.println("Ingrese el habitat del animal: ");
                    String hab=lea.nextLine();
                    System.out.println("Ingrese la alimentacion del animal: ");
                    String ali=lea.nextLine();
                    System.out.println("Ingrese los rasgos del animal: ");
                    String ras=lea.nextLine();
                    System.out.println("Ingrese la distribucion geografica del animal: ");
                    String geo=lea.nextLine();
                    System.out.println("Ingrese la vida del animal: ");
                    int vi=lea.nextInt();
                    animales.add(new Animal(nomc,nom,hab,ali,ras,geo,vi));
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    lea.nextLine();
                    System.out.println("Ingrese el nombre cientifico de animal que desea eliminar");
                    String tempnom=lea.nextLine();
                    for(int i=0;i<animales.size();i++){
                        if(((Animal)animales.get(i)).getNombrec()==tempnom){
                            animales.remove(i);
                            System.out.println("El animal se ha eliminado");
                        }
                    }
                    System.out.println(((Animal)animales.get(0)).getNombrec());
                    System.out.println(tempnom);
                    break;
                }
                case 4:{
                    String salida="";
                    for(Object temp: animales){
                        if(temp instanceof Animal){
                            salida+=""+animales.indexOf(temp)+" - "+temp+"\n";
                        }
                    }
                    System.out.println(salida);
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    resp='n';
                    break;
                }
            }
        }
    }
}
