/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UGallery;

/**
 *
 * @author lenovo
 */
public class Data {
    private ListaEnlazada ListaUsuarios;
    private ListaDoble ListaImagenes;

    public Data(ListaEnlazada ListaUsuarios, ListaDoble ListaImagenes) {
        this.ListaUsuarios = ListaUsuarios;
        this.ListaImagenes = ListaImagenes;
    }

    public ListaEnlazada getListaUsuarios() {
        return ListaUsuarios;
    }

    public void setListaUsuarios(ListaEnlazada ListaUsuarios) {
        this.ListaUsuarios = ListaUsuarios;
    }

    public ListaDoble getListaImagenes() {
        return ListaImagenes;
    }

    public void setListaImagenes(ListaDoble ListaImagenes) {
        this.ListaImagenes = ListaImagenes;
    }
    
 
}
