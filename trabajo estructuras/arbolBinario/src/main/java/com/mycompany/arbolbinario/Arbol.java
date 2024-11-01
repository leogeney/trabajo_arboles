package com.mycompany.arbolbinario;

import javax.swing.JOptionPane;

public class Arbol {
    Nodo inicial;

    public Arbol() {
        this.inicial = null;
    }

    public void insertar() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre:");
        String sexo = JOptionPane.showInputDialog(null, "Ingrese el sexo:");
        String edadStr = JOptionPane.showInputDialog(null, "Ingrese la edad:");

        try {
            int edad = Integer.parseInt(edadStr);
            Persona persona = new Persona(nombre, sexo, edad);

            if (this.inicial == null) {
                this.inicial = new Nodo(persona);
            } else {
                this.inicial.insertar(persona);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La edad ingresada no es válida. Por favor, ingrese un número entero.");
        }
    }
      public String dispararPreorden() {
        return preorden(this.inicial).trim();
    }

    private String preorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = nodo.getPersona().getNombre() + " (" + nodo.getPersona().getEdad() + " años, " + nodo.getPersona().getSexo() + "), ";
            resultado += preorden(nodo.getNodoIzq());
            resultado += preorden(nodo.getNodoDerecho());
            return resultado;
        }
    }

    public String dispararInorden() {
        return inorden(this.inicial).trim();
    }

    private String inorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = inorden(nodo.getNodoIzq());
            resultado += nodo.getPersona().getNombre() + " (" + nodo.getPersona().getEdad() + " años, " + nodo.getPersona().getSexo() + "), ";
            resultado += inorden(nodo.getNodoDerecho());
            return resultado;
        }
    }

    public String dispararPostorden() {
        return postorden(this.inicial).trim();
    }

    private String postorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = postorden(nodo.getNodoIzq());
            resultado += postorden(nodo.getNodoDerecho());
            resultado += nodo.getPersona().getNombre() + " (" + nodo.getPersona().getEdad() + " años, " + nodo.getPersona().getSexo() + "), ";
            return resultado;
        }
    }
    
     public void mostrarArbol() {
        String resultadoPreorden = dispararPreorden();
        String resultadoInorden = dispararInorden();
        String resultadoPostorden = dispararPostorden();

        JOptionPane.showMessageDialog(null, 
            "Preorden:\n" + resultadoPreorden + "\n" +
            "Inorden:\n" + resultadoInorden + "\n" +
            "Postorden:\n" + resultadoPostorden);
    }
    
    
}
