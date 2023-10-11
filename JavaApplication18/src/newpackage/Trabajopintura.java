package newpackage;


import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tegue
 */
public class Trabajopintura extends Servicio{
    
    private double superficie;
    private double precio_pintura;

    public Trabajopintura() {
    }

    public Trabajopintura(String trabajador,LocalDate fecha_inicio,String cliente, double superficie, double precio_pintura ) {
        super(trabajador, fecha_inicio, cliente);
        this.superficie = superficie;
        this.precio_pintura = precio_pintura;
       
        
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecio_pintura() {
        return precio_pintura;
    }

    public void setPrecio_pintura(double precio_pintura) {
        this.precio_pintura = precio_pintura;
    }

    @Override
    public double coste_material() {
        return (superficie / 7.8) * precio_pintura;
    }

    @Override
    public double coste_ManoHobra() {
        return (superficie / 10) * 9.5;
    }

    @Override
            
    public double coste_total() {
        double total = 0;
        double costo_adicional = 0.15;
        total = coste_material() + coste_ManoHobra();
        if (superficie < 50){
            
            return total * costo_adicional; 
        }
 
        return total;
    }
    
    public double costo_adicional(){
        double costo_adicional = 0;
         if (superficie < 50){
            costo_adicional = 0.15;
            return costo_adicional; 
        }
         return costo_adicional;
    }
    
    

    @Override
    public String detalle_Servicio() {
        return "TRABAJO DE PINTURA" + 
                "\n Cliente : " + getCliente() + 
                "\n FECHA DE INICIO : " + getFecha_inicio() +
                "\n -----------------------------------------------" +
                "\n PINTOR : " + getTrabajador() +
                "\n COSTO MATERIAL : " + coste_material() +
                "\n COSTO MANO DE OBRA : " +coste_ManoHobra() +
                "\n COSTO ADICIONAL : " + costo_adicional() +
                "\n TOTAL : " + coste_total() +
                "\n -----------------------------------------------";
        
        
    }
    
    
    
}
