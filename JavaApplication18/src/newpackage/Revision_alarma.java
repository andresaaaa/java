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
public class Revision_alarma extends Servicio{
    private int Numero_alarmas;

    public Revision_alarma() {
    }
    
    public Revision_alarma(LocalDate fecha_inicio,String cliente, int Numero_alarmas){
        super("Revisor Especialista Contraincendios", fecha_inicio, cliente);
        this.Numero_alarmas = Numero_alarmas;
    }

    public int getNumero_alarmas() {
        return Numero_alarmas;
    }

    public void setNumero_alarmas(int Numero_alarmas) {
        this.Numero_alarmas = Numero_alarmas;
    }

    @Override
    public double coste_material() {
        return 0;
    }

    @Override
    public double coste_ManoHobra() {
       return (Numero_alarmas / 3) * 40;
    }

    @Override
    public double coste_total() {
      return coste_ManoHobra();
    }

    @Override
    public String detalle_Servicio() {
      return "REVISION PERIODICA ALARMAS CONTRA INCENDIO" +
              "\n CLIENTE : " + getCliente() +
              "\n FECHA DE REVISION : " + getFecha_inicio() +
              "\n -------------------------------------------" +
              "\n TOTAL : ........" + coste_total() +
              "\n -------------------------------------------";
    }
    
    
    
    
}
