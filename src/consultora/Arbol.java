/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultora;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author blacktiger
 */
public class Arbol {
    Stack<Institucion> pila = new Stack();
    
   Nodo raiz;
   List lista = new LinkedList();

    public Arbol() {
        this.raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
/*
    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }*/
   
   public void postOrden(Nodo n)
    {
        if (n != null)
        {
            
            postOrden(n.getNodoIz());
            postOrden(n.getNodoDer());
            //pila.push(n.toString());
            System.out.println(" "+ n.getDato());
            if (n.getDato().getAnno() < 2015) {
                lista.add(n.getDato().getCodigo()+" "+ n.getDato().getTipo()+" "+n.getDato().getNombre());                       
            }
            
            
        }
    }
   
   public void prueba()
   {
       while (!pila.empty()) {
           System.out.println(pila.pop());            
        }
   }
   public void obtenerLista()
   {
       for (int x = 0; x< lista.size() ; x++)
        {
            System.out.println(lista.get(x));
        }
   }
   public void procesarpila()
   {
      
   }
   
}
