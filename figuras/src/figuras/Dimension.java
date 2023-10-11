/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author tegue
 */
public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;
     
    public Dimension (){
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }
    
    public Dimension (double alto,double ancho, double profundidad ){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        
    }
    
    public double isalto(){
        return alto;
    }
    
    public void setalto(double alto){
        this.alto = alto;
    }
    
    public double isancho(){
        return ancho;
    }
    
    public void setancho(double ancho){
        this.ancho = ancho;
    }
    
    public double isprofundidad(){
        return profundidad;
    }
    
    public void setprofundidad(double profundidad){
        this.profundidad = profundidad;
    }
    
    
    public double getVolumen(){
        return (alto*ancho*profundidad);
    }

    @Override
    public String toString() {
        return "Dimension{"+ ",alto = " + alto + " ,ancho = " + ancho + " ,profundidad = " + profundidad + "}" ;
    }
    
    
}
