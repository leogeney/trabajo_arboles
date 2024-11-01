package com.mycompany.arbolesbinarios;

import javax.swing.JOptionPane;

//Clase para contruir los nodos
public class Nodo {
    
    int valor;
    String Color,Nombre;
    int tamaño;
    String Marca;
    Nodo nodoIzq;
    Nodo nodoDerecho;

    public Nodo(String Nombre,int valor,  String Color , int tamaño , String Marca) {
       
        this.Nombre=Nombre;
        this.valor = valor;
        this.Color = Color;
        this.tamaño = tamaño;
        this.Marca = Marca;
        this.nodoDerecho = null;
        this.nodoIzq = null;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    //Funcion para agtregar un nodo a la derecha si es mayor y a la izquierda si es menor
    public void insertar( String _nombre, int _valor , String _Color, int _tamaño,String _marca){
        //if para comprobar que el valor no se repita
        if(_valor == this.valor){
            JOptionPane.showMessageDialog(null, "Ese numero ya esta en el arbol");
            return;
        }
        
        if(_valor < this.valor){
            //Insertar en lado izquierdo
            if(this.nodoIzq == null){
                this.nodoIzq = new Nodo(_nombre,_valor, _Color,_tamaño,_marca  );
            } else {
                this.nodoIzq.insertar(_nombre,_valor, _Color,_tamaño,_marca);
            }
        } else {
            //Insertar en lado derecho
            if(this.nodoDerecho == null){
                this.nodoDerecho = new Nodo(_nombre,_valor, _Color,_tamaño,_marca);
            } else {
                this.nodoDerecho.insertar(_nombre,_valor, _Color,_tamaño,_marca);
            }
        }
    }
    
    
}
