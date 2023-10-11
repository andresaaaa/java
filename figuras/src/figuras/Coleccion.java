/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.util.*;

/**
 *
 * @author tegue
 */
public class Coleccion {

    private String nombre_Coleccion;
    private ArrayList<figura> lista_figura;

    public Coleccion() {
    }

    public Coleccion(String nombre_coleccion) {
        this.nombre_Coleccion = nombre_coleccion;
        lista_figura = new ArrayList<>();
    }

    public String getNombre_Coleccion() {
        return nombre_Coleccion;
    }

    public void setNombre_Coleccion(String nombre_Coleccion) {
        this.nombre_Coleccion = nombre_Coleccion;
    }

    public ArrayList<figura> getLista_figura() {
        return lista_figura;
    }

    public void setLista_figura(ArrayList<figura> lista_figura) {
        this.lista_figura = lista_figura;
    }

    @Override
    public String toString() {
        String b = "Coleccion{" + "nombre_Coleccion=" +"\n";
        for (int i = 0; i < lista_figura.size(); i++) {
            b += lista_figura.get(i);
        }
        return b;
    }

    public boolean añadir_figura(figura fig) {
        lista_figura.add(fig);
        return true;
    }

    public void up_precrio(double cantidad, String id) {
        for (figura fig : lista_figura) {
            if (fig.getCodigo().equals(id)) {
                System.out.println("la figura existe en el arraid y ya fue subido el precio");
                fig.setPrecio(fig.getPrecio() + cantidad);

            } else {
                System.out.println("la figura no existe en el arraid");

            }
        }

    }

    public String conCapa() {
        String a = "estos son los superheroes con capa \n------------------\n";
        for (figura fig : lista_figura) {
            if (fig.getSuperheroe().iscapa()) {
                a = fig.getSuperheroe() + "\n"  ;
                return a;
            } 
            
        }
        return a;
    }

    public figura mas_Valioso() {
        double precio_max = 0.0;
        figura f_new = null;
        for (figura fig : lista_figura) {
            if (fig.getPrecio() > precio_max) {
                precio_max = fig.getPrecio();
                f_new = fig;
            }
        }
        return f_new;
    }

    public double valor_Coleccion() {
        double max = 0.0;
        
        for (figura fig : lista_figura) {
                max += fig.getPrecio();
        }
        return max;
    }
    
    public double volumen_Coleccion(){
        double max = 0.0;
        double suma = 0.0;
        for(figura fig :lista_figura){
            if(fig.getDimension().getVolumen() > max){
                max = fig.getDimension().getVolumen();
                suma = suma + max;
            }
        }
        return suma + 200 ;
    }
}
