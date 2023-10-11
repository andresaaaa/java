package newpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tegue
 */
import java.util.*;
import java.time.LocalDate;
public abstract class Servicio {
    
    private String trabajador;
    private LocalDate fecha_inicio;
    private String cliente;
  

    public Servicio (){
    }
    
    public Servicio(String trabajador, LocalDate fecha_inicio, String cliente) {
        this.trabajador = trabajador;
        this.fecha_inicio = fecha_inicio;
        this.cliente = cliente;
        
    }

    
    
    
    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    public abstract double coste_material();
    
    public abstract double coste_ManoHobra();
    
    public abstract double coste_total();
    
    public abstract String detalle_Servicio();
    
   
    
}
