package com.mycompany.arbolbinario;

public class Nodo {
    private Persona persona;
    private Nodo nodoIzq;
    private Nodo nodoDerecho;

    public Nodo(Persona persona) {
        this.persona = persona;
        this.nodoIzq = null;
        this.nodoDerecho = null;
    }

    public Persona getPersona() {
        return persona;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    public void insertar(Persona nuevaPersona) {
        if (nuevaPersona.getEdad() >= 18) {
            if (this.nodoIzq == null) {
                this.nodoIzq = new Nodo(nuevaPersona);
            } else {
                this.nodoIzq.insertar(nuevaPersona);
            }
        } else {
            if (this.nodoDerecho == null) {
                this.nodoDerecho = new Nodo(nuevaPersona);
            } else {
                this.nodoDerecho.insertar(nuevaPersona);
            }
        }
    }
}
