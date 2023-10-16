/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author tegue
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static Coleccion c0 = new Coleccion();
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opc = 0;
        System.out.println("HOLA SOY ANDRES Y ESTOY ES DINEY CHANNEL");
        System.out.println("antes de comenzar a hacer cualquier cosa tienes que crear una figura");
        do {
            
            try {
                
            System.out.println("BIENVENIDO QUE DESEAS HACER");
            
            
            System.out.println("(1)---crear figura de accion");
            System.out.println("(2)---saber el cual es la figura mas valiosa");
            System.out.println("(3)---ver cuales son las figuras que tiene capa");
            System.out.println("(4)---cual es el valor por coleccion");
            System.out.println("(5)---volumen de la coleccion");
            System.out.println("(6)---ver todas las figuras");
            System.out.println("(7)---subir precio");
            System.out.println("(8)---salir");
         
            
            opc = teclado.nextInt();
            switch (opc) {

                case 1:
                    crear_figura();
                    break;

                case 2:
                    System.out.println(c0.mas_Valioso());
                    break;
                case 3:
                    System.out.println(c0.conCapa());
                    break;
                case 4:
                    System.out.println(c0.valor_Coleccion());
                    break;
                case 5:
                    System.out.println(c0.volumen_Coleccion());
                    break;
                case 6:
                    System.out.println(c0.toString());
                    break;
                case 7:
                    System.out.println("ingrese la cantidad");
                    double can = teclado.nextDouble();
                    System.out.println("y el id de la figura");
                    String id = teclado.next();
                    c0.up_precrio(can, id);
                    break;
                case 8:
                    break;
                default:
                    throw new AssertionError();
            }
            } catch (Exception e) {
                System.out.println("ERROR");
                System.out.println("\n -------------------------------------------------------------------------------------");
                break;
            }
            

        } while (!(opc == 8));
    }


    public static void crear_figura() {
        System.out.println("ingrese los siguientes datos para crear su figura");

        System.out.println("codigo para identificar la figura");
        String codigo = teclado.next();

        System.out.println("precio que tendra la figura");
        double op = teclado.nextDouble();

        System.out.println("ahora dame sus dimenciones");
        System.out.println("alto");
        double alto = teclado.nextDouble();

        System.out.println("ancho");
        double ancho = teclado.nextDouble();

        System.out.println("profundidad");
        double prof = teclado.nextDouble();

        Dimension dimen = new Dimension(alto, ancho, prof);

        System.out.println(" dame el nombre de la figura");
        String superh = teclado.next();

        System.out.println("deseas que tenga capa?");
        boolean cap = teclado.nextBoolean();
        superHeroe s1 = new superHeroe(superh);

        s1.setcapa(cap);

        System.out.println("descripccion para tu figura");
        String desc = teclado.next();
        s1.setdescripcion(desc);

        System.out.println("y a que coleccion pertenece");
        String colecc = teclado.next();

        Coleccion c1 = new Coleccion(colecc);

        c0 = c1;

        figura f1 = new figura(codigo, op, dimen, s1);

        c1.añadir_figura(f1);
        System.out.println("esta es tu figura");

        System.out.println(c0.toString());

        superHeroe s2 = new superHeroe("superman");
        s2.setcapa(true);
        s2.setdescripcion("viene de crypton");
        Dimension d2 = new Dimension(2.5, 6.0, 7.0);
        figura f2 = new figura("22dc", 2000, d2, s2);
        c1.añadir_figura(f2);

        superHeroe s3 = new superHeroe("batman");
        s3.setcapa(true);
        s3.setdescripcion("joa tiene plata");
        Dimension d3 = new Dimension(4.5, 3.4, 4.9);
        figura f3 = new figura("02dc", 2900, d3, s3);
        c1.añadir_figura(f3);
        //-------------------------------------------
        superHeroe s4 = new superHeroe("spyder-man");
        s4.setcapa(false);
        s4.setdescripcion("y esa araña que lo mordio que");
        Dimension d4 = new Dimension(8.9, 3.5, 7.7);
        figura f4 = new figura("22mv", 8000, d4, s4);
        c1.añadir_figura(f4);

        superHeroe s5 = new superHeroe("thor");
        s5.setcapa(true);
        s5.setdescripcion("erda se le daño el martillo");
        Dimension d5 = new Dimension(9.9, 1.5, 5.7);
        figura f5 = new figura("67mv", 7590, d5, s5);
        c1.añadir_figura(f5);
        //-------------------------------------------
        superHeroe s6 = new superHeroe("finn el humado");
        s6.setcapa(false);
        s6.setdescripcion("es un humano");
        Dimension d6 = new Dimension(6.9, 2.5, 4.4);
        figura f6 = new figura("87ha", 7590, d6, s6);
        c1.añadir_figura(f6);

        superHeroe s7 = new superHeroe("jake el perro");
        s7.setcapa(false);
        s7.setdescripcion("es un perro magico");
        Dimension d7 = new Dimension(7.9, 3.5, 2.4);
        figura f7 = new figura("98ha", 7590, d7, s7);
        c1.añadir_figura(f7);
    }

}
