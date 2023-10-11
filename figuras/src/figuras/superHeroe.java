/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author tegue
 */
public class superHeroe {
    
    private String nombre;
    private String descriccion;
    private boolean capa;
    
    public superHeroe(){
    }
    
    public superHeroe (String nombre){
        this.nombre = nombre;
        this.descriccion = "";
        this.capa = false;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getdescripcion(){
        return descriccion;
    }
    
    public void setdescripcion(String descripcion){
        this.descriccion = descripcion;
    }
    
    public boolean iscapa(){
        return capa;
    }
    
    public void setcapa(boolean capa){
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "superheroe{" + ",nombre = " + nombre +", descripcion = "+ descriccion + ", capa = " + capa;
    }
    
    
}
