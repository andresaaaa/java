/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parking;
import java.util.*;
/**
 *
 * @author tegue
 */
public class main {

   public static Scanner teclado = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        menu(); 
    }
    
    public static void menu(){
        parking p1 = new parking("Parking Centro", 10);
        int a = 0;
        do{
          System.out.println("--- BIENVEDIO AL CENTRO DE PARKING ---");
          System.out.println("(1)--- Entrada de coches");
          System.out.println("(2)--- salida de coches");
          System.out.println("(3)--- mostrar parking");
          System.out.println("(4)--- salir");
          System.out.println("que desea hacer?");
          int opc = Integer.parseInt(teclado.nextLine());
          a = opc;
          
          switch (opc) {
            case 1:
                try {
                    
                System.out.println("ingrese la matricula del vehiculo que desea ingresar");
                String matricula = teclado.nextLine();
                
                
                System.out.println("en que posicion lo quiere guardar");
                int pos = Integer.parseInt(teclado.nextLine());
                
                p1.entrada(matricula, pos);
                System.out.println("estos son todos los lugares libres"+ ":" +p1.get_plazasTotales());
                System.out.println("estas son todas los lugares libres "+ ":" + p1.get_PLazasLibres());
                System.out.println("estos son todos los lugares libres "+ ":" + p1.get_PLazasOcupadas());
                
            } catch (Exception ex) {
                    System.out.println("ERROR");
            }   
            break;
            case 2:
                try {
                    
                    System.out.println("introdusca la matricula que desea retirar");
                String mat = teclado.nextLine();
                
                p1.salida(mat);
                System.out.println(" lugares totales"+ ":" + p1.get_plazasTotales());
                System.out.println(" lugares libres "+ ":" + p1.get_PLazasLibres());
                System.out.println(" lugares ocupados "+ ":" + p1.get_PLazasOcupadas());
                
            } catch (Exception e) {
                    System.out.println("ERROR");
            }
            break;
            case 3:
                
                System.out.println(p1.toString());
                break;
                
            case 4:
            
                break;
            default:
                throw new AssertionError();
        }
          
      }while (!(a == 4));           
            
        
    }
    
}
