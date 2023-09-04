/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Categoria.Categoria;

/**
 *
 * @author Usuario
 */
public class ProductosData implements Comparable<ProductosData> {
 //   private ProductosFrame p;
 
     private int codigo;
    private String descripcion;
    private double precio;
    private Categoria rubro;
    private int stock;

    public ProductosData(int codigo, String descripcion, double precio, Categoria rubro, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

    public ProductosData() {
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(ProductosData t) {
        if(codigo == t.codigo){
        
            return 0;
        } else if(codigo > t.codigo){
        
            return 1;
        }else {
        
            return -1;
        }
    }
    
}
