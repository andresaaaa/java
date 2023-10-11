/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author tegue
 */
public class parking {

    private ArrayList<String> matriculas;
    private String nombre;

    public parking() {
        
    }

    public parking(String nombre, int n_plazas) {
        this.matriculas = new ArrayList<>();
        this.nombre = nombre;
        for (int i = 0; i < n_plazas; i++) {
            matriculas.add(null);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String get_nombre() {
        return nombre;
    }

    public void entrada(String matricula, int plaza) {
        int b = 0;
        int a = matricula.length();
        String c = matriculas.get(plaza);
        
        if (a < 4 && !(matricula == null)) {
            System.out.println("Matricula incorrecta");
        } else {
            
            b += 1;
        }
        if(b == 1){
            if (matriculas.contains(matricula) == true) {
                System.out.println("matricula repetida");
            } else {
                
                b += 1;
            }
        }
        
        if(b == 2){
            if (!(c == null)) {
                    System.out.println("lugar ocupado");
                } else {
                    
                    b += 1;
                }
        } 
        
        if(b == 3){
            matriculas.set(plaza, matricula);
            System.out.println("carro agregado exitosamente");
            System.out.println(matriculas);
        }
    }
    
    public int salida(String matricula){
        int a = matriculas.indexOf(matricula);
        
        if(matriculas.contains(matricula) == true){
            matriculas.set(a, null);
            System.out.println("el carro salio exitosamente");
        }else{
            System.out.println("matricula no existe");
        }
        return a;
    }
    
    public int get_plazasTotales(){
        return matriculas.size();
    }
    
    public int get_PLazasOcupadas(){
        int po = 0;
        
        for(Object aa :matriculas){
            if(aa instanceof String){
                po++;
            }
        }
        
        return po;
    }
    
    public int get_PLazasLibres(){
        int c = Collections.frequency(matriculas, null);
        
        return c;
    }
    

    @Override
    public String toString() {
        String a ="Parking avenida"+"\n" ;
        a +="--------------------- \n";
        for (int i = 0; i < matriculas.size(); i++) {
            a +="pieza"+ i + ":";
            if(matriculas.get(i) == null){
             a+= "(vacio)";
            }else if(matriculas.get(i)instanceof String) {
             a+= "(" +matriculas.get(i) +")";
            }
            a += "\n";
            
        }
        return a;
                
    }
    
    
}
