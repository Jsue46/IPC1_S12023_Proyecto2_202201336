/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UGallery;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author freddymonterroso
 */
public class ListaDoble {
    Nodo2 head;
    
    public ListaDoble() {
        this.head = null;
    }
    
    public void add(String valor) {
        Nodo2 nuevo = new Nodo2(valor);
        if (this.head == null) {
            this.head = nuevo;
        } else {
            Nodo2 actual = this.head;
            
            while (actual.next != null) {
                actual = actual.next;
            }
            
            actual.prev = actual;
            actual.next = nuevo;
        }
    }
    
    public void remove(int indice) {
        if (this.head == null) {
            return;
        }
        if (indice == 0) {
            this.head = this.head.next;
            this.head.prev = null;
            return;
        }
        
        Nodo2 actual = this.head;
        int i = 0;
        
        while(actual != null && i < indice - 1){
            actual = actual.next;
            i++;
        }
        
        if (actual != null && actual.next != null){ 
           actual.next = actual.next.next; 
           actual.next.prev = actual;
        }
    }
    
    public void printListNext() {
    Nodo2 actual = this.head;
    while (actual != null) {
      System.out.println(actual.valor);
      actual = actual.next;
    }
    System.out.println();
  }
    
    public void printListNext(int indice, JLabel imagen) throws IOException {
    Nodo2 actual = this.head;
    int index = 0;
    while (actual != null) {
        System.out.println("Indice " + index);
        if (index == indice) {
            System.out.println(actual.valor);
            File archivoImagen = new File(actual.valor);
            BufferedImage img = ImageIO.read(archivoImagen);
            ImageIcon imagenIcono = new ImageIcon(img.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH));

            imagen.setIcon(imagenIcono);
            break; }
        actual = actual.next;
      index++;
    }
    System.out.println();
  }
    public void printListPrev(int indice, JLabel imagen) throws IOException {
    Nodo2 actual = this.head;
    Nodo2 previo = null;
    int index = 0;
    while (actual != null) {
        if (index == indice) {
            System.out.println(actual.valor);
            File archivoImagen = new File(actual.valor);
            BufferedImage img = ImageIO.read(archivoImagen);
            ImageIcon imagenIcono = new ImageIcon(img.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH));

            imagen.setIcon(imagenIcono);
            if (previo != null) {
                actual = previo; // Retrocede al nodo anterior en lugar de avanzar al siguiente
            } else {
                actual = this.head;
            } break;}
        previo = actual;
        actual = actual.next;
        index++;}
    System.out.println();} 
    
    
    
    
    
  public void printListNext(int indice, JTextArea area) throws IOException {
    Nodo2 actual = this.head;
    int index = 0;
    while (actual != null) {
        System.out.println("Indice " + index);
        if (index == indice) {
            System.out.println(actual.valor);
            area.append(actual.valor + "\n");
            //Convertidor.consola.append(actual.valor + "\n");
            break;}
        actual = actual.next;
        index++; }
    System.out.println(); }
  
  public void borrarCategoria(int indice, JTextArea area) throws IOException {
       Nodo2 actual = this.head;
    int index = 0;
    while (actual != null) {
        if (index == indice) {
            // Eliminar la categoría actual
            if (actual.prev != null) {
                actual.prev.next = actual.next;
            } else {
                // Si es el primer elemento de la lista, actualizar el head
                this.head = actual.next;
            }
            if (actual.next != null) {
                actual.next.prev = actual.prev;
            }
            break;
        }
        actual = actual.next;
        index++;
    } 
  
  }
    
  
  
  



  
  
  
  public int size() {
    int index = 0;
    Nodo2 actual = this.head;
    while (actual != null) {
      System.out.print(actual.valor);
      actual = actual.next;
      index++;
    }
    
    return index;
  }
    
    public void printListPrev() {
        Nodo2 actual = this.head;
        while (actual != null) {
        if (actual.prev != null) {
            System.out.print(actual.valor);
            actual = actual.prev;
        }
    }
    System.out.println();
  }
    
}
