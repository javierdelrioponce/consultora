/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultora;

/**
 *
 * @author blacktiger
 */
public class Institucion {
    private int codigo;
    private String nombre;
    private String tipo;
    private int anno;
    private int valorA;

    public Institucion(int codigo, String nombre, String tipo, int anno, int valorA) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.anno = anno;
        this.valorA = valorA;
    }
    
    public Institucion() {
    }

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
       return " " + codigo + " " + anno + " " + tipo ;
    }
    
    public String toString2() {
       return " " + codigo + " " + nombre ;
    }
  
    
    
}
