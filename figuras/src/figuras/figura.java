/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author tegue
 */
public class figura{
    private String codigo;
    private double precio;
    private superHeroe superheroe;
    private Dimension dimension;
    
    public figura(String codigo, double precio, Dimension dimension, superHeroe superheroe){
        this.codigo = codigo;
        this.precio = precio;
        this.dimension = dimension;
        this.superheroe = superheroe;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public superHeroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(superHeroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "figura\n {" + "codigo = " + codigo + "\n precio = " + precio + ",\n superheroe = " + superheroe.getnombre() + 
                ", descripcion = "+ superheroe.getdescripcion()+ ", capa = "+ superheroe.iscapa() +"\n dimension de la figura :" +" alto = "+ dimension.isalto() +
                ", ancho = "+ dimension.isancho()+ ", profundidad = " +dimension.isprofundidad()+'}';
    }
    
    public void subirprecio(double altaprecio){
        this.precio += altaprecio;
        
    }
    
    

}
