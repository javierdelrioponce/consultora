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
public class Nodo {
    private Institucion dato;
    private Nodo nodoIz;
    private Nodo nodoDer;
    private String dati;

    public Nodo(Institucion dato) {
        this.dato = dato;
        this.nodoIz = null;
        this.nodoDer = null;
    }
    
    public Nodo(String dato)
    {
        this.dati = dato;
        this.nodoIz = null;
        this.nodoDer = null;
    }

    public Nodo() {
    }

    public Nodo getNodoIz() {
        return nodoIz;
    }

    public void setNodoIz(Nodo nodoIz) {
        this.nodoIz = nodoIz;
    }

    @Override
    public String toString() {
        return " "+ dato.getCodigo() + " "+ dato.getValorA()+ " " +dato.getTipo();
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(Nodo nodoDer) {
        this.nodoDer = nodoDer;
    }

    public Institucion getDato() {
        return dato;
    }

    public void setDato(Institucion dato) {
        this.dato = dato;
    }
    
}
