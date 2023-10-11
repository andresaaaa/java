package newpackage;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author tegue
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static Scanner teclado = new Scanner(System.in);
    public static Trabajopintura t0 = new Trabajopintura();
    public static Revision_alarma r0 = new Revision_alarma();

    public static void main(String[] args) {
        int op = 0;

        do {
            System.out.println("BIENVENIDO A LA CENTRAL DE TRAVAJOS ");
            System.out.println("que deseas hacer hoy");
            System.out.println("------------------------------------------------");
            System.out.println("(1)---ingresar un nuevo trabajador");
            System.out.println("(2)---ingresar nueva revision de alarma");
            System.out.println("(3)---reporte");
            System.out.println("(4)---salir");
            int opc = teclado.nextInt();
            op = opc;

            switch (opc) {
                case 1:
                    new_Trabajador();
                    break;
                case 2:
                    new_alamr();
                    break;
                case 3:
                    reporte();

                case 4:
                    break;
                default:
                    throw new AssertionError();
            }

        } while (!(op == 4));

    }

    public static void new_Trabajador() {
        System.out.println("ingrese nombre del trabajador");
        String nom = teclado.next();

        System.out.println("ingrese fecha");
        System.out.println("año");
        int year = teclado.nextInt();
        System.out.println("dia");
        int day = teclado.nextInt();

        System.out.println("cual es el nombre del cliente?");
        String client = teclado.next();

        System.out.println("¿cual es la medida de la superficie?");
        double sup = teclado.nextDouble();

        System.out.println("y por ultimo a como esta la pintura");
        double paint = teclado.nextDouble();

        Trabajopintura t1 = new Trabajopintura(nom, LocalDate.of(year, Month.SEPTEMBER, day), client, sup, paint);
        t0 = t1;

    }

    public static void new_alamr() {
        System.out.println("para comenzar ingresa la fecha");
        System.out.println("año");
        int year = teclado.nextInt();
        System.out.println("dia");
        int day = teclado.nextInt();

        System.out.println("nombre del cliente");
        String name = teclado.next();
        System.out.println("cantidad de alarmas");
        int cant = teclado.nextInt();

        Revision_alarma r1 = new Revision_alarma(LocalDate.of(year, Month.SEPTEMBER, day), name, cant);
        r0 = r1;

    }

    public static void reporte() {
        System.out.println(t0.detalle_Servicio());
        System.out.println(r0.detalle_Servicio());

    }

}
