package com.mycompany.arbolesbinarios;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Arbol {
    
    Nodo inicial;

    
    // Constructor
    public Arbol() {
        this.inicial = null;
    }
    
     public void buscarYImprimirSimilares(String nombre, int valor, String color, int tamaño, String marca) {
        ArrayList<Nodo> similares = new ArrayList<>();
        buscarSimilaresRec(this.inicial, nombre, valor, color, tamaño, marca, similares);
        
        // Imprimir los productos similares encontrados
        if (similares.isEmpty()) {
            JOptionPane.showMessageDialog(null,"No se encontraron productos similares.");
        } else {
            JOptionPane.showMessageDialog(null,"Productos similares encontrados:");
            for (Nodo producto : similares) {
                JOptionPane.showMessageDialog(null, "Nombre: " + producto.getNombre() +
                        ", Valor: " + producto.getValor() +
                        ", Color: " + producto.getColor() +
                        ", Tamaño: " + producto.getTamaño() +
                        ", Marca: " + producto.getMarca());
            }
        }
    }
    
    
    
    
     public ArrayList<Nodo> buscarSimilares(String nombre, int valor, String color, int tamaño, String marca) {
        ArrayList<Nodo> similares = new ArrayList<>();
        buscarSimilaresRec(this.inicial, nombre, valor, color, tamaño, marca, similares);
        return similares;
    }

    private void buscarSimilaresRec(Nodo nodo, String nombre, int valor, String color, int tamaño, String marca, ArrayList<Nodo> similares) {
        if (nodo == null) {
            return;
        }

        // Define los criterios de similitud (aquí se puede ajustar según la relevancia de cada característica)
        boolean esSimilar = true;
        if (!nodo.getNombre().equalsIgnoreCase(nombre)) esSimilar = false;
        if (Math.abs(nodo.getValor() - valor) <= 50) esSimilar = true; // Tolerancia de 50 en el precio
        if (!nodo.getColor().equalsIgnoreCase(color)) esSimilar = false;
        if (Math.abs(nodo.getTamaño() - tamaño) <= 5) esSimilar = true; // Tolerancia de 5 en el tamaño
        if (!nodo.getMarca().equalsIgnoreCase(marca)) esSimilar = false;

        if (esSimilar) {
            similares.add(nodo);
        }

        // Recursión para explorar ambos lados del árbol
        buscarSimilaresRec(nodo.getNodoIzq(), nombre, valor, color, tamaño, marca, similares);
        buscarSimilaresRec(nodo.getNodoDerecho(), nombre, valor, color, tamaño, marca, similares);
    }

    
   public void buscarYMostrarRecomendado() {
    ArrayList<Nodo> todosLosProductos = new ArrayList<>();
    obtenerTodosLosProductos(this.inicial, todosLosProductos); // Obtener todos los productos en el árbol
    
    // Elige un producto aleatorio de la lista de todos los productos
    if (todosLosProductos.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontraron productos en el árbol.");
    } else {
        Random random = new Random();
        int index = random.nextInt(todosLosProductos.size()); // Genera un índice aleatorio
        Nodo recomendado = todosLosProductos.get(index); // Selecciona el producto aleatorio
        
        // Muestra el producto recomendado
        JOptionPane.showMessageDialog(null, "Producto recomendado:\n" +
            "Nombre: " + recomendado.getNombre() +
            "\nValor: " + recomendado.getValor() +
            "\nColor: " + recomendado.getColor() +
            "\nTamaño: " + recomendado.getTamaño() +
            "\nMarca: " + recomendado.getMarca());
    }
}

// Método auxiliar para obtener todos los productos en el árbol
private void obtenerTodosLosProductos(Nodo nodo, ArrayList<Nodo> productos) {
    if (nodo == null) {
        return;
    }
    
    productos.add(nodo); // Agregar el nodo actual a la lista
    obtenerTodosLosProductos(nodo.getNodoIzq(), productos); // Explorar el subárbol izquierdo
    obtenerTodosLosProductos(nodo.getNodoDerecho(), productos); // Explorar el subárbol derecho
}
    
    
    
    
    
    

    //Metodo para insertar el arbol
    public void insertar() {
        
                String Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto que va a ingresar");
        String valor = JOptionPane.showInputDialog(null, "Ingrese el valor del producto que va a ingresar");
        String Color = JOptionPane.showInputDialog(null, "Ingrese el color del producto que va a ingresar");
        String tamaño = JOptionPane.showInputDialog(null, "Ingrese el tamaño del producto que va a ingresar");

        String Marca = JOptionPane.showInputDialog(null, "Ingrese la marca del producto que va a ingresar");
        
        
        
        try {
            int numero = Integer.parseInt(valor);
            int tamano = Integer.parseInt(tamaño);
            if (this.inicial == null) {
                this.inicial = new Nodo(Nombre,numero,Color,tamano,Marca);
            } else {
                this.inicial.insertar(Nombre,numero,Color,tamano,Marca);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El dato que ingreso no es valido, por favor solamente ingrese numeros enteros");
        }
    }

    
    // Preorden: raíz -> izquierda -> derecha
    public String dispararPreorden() {
        return preorden(this.inicial).trim(); // Trim para evitar espacios o comas extra al final
    }

    public String preorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = "Valor:"+ nodo.getValor() + ", nombre:"+nodo.getNombre()+ ", marca:" +  nodo.getMarca()+ ", tamaño:" +  nodo.getTamaño()+ ", Color:" + nodo.getColor() ;
            resultado += preorden(nodo.getNodoIzq());
            resultado += preorden(nodo.getNodoDerecho());
            return resultado;
        }
    }

    
    // Inorden: izquierda -> raíz -> derecha
    public String dispararInorden() {
        return inorden(this.inicial).trim();
    }

    public String inorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = inorden(nodo.getNodoIzq());
            resultado = "Valor:"+ nodo.getValor() + ", nombre:"+nodo.getNombre()+ ", marca:" +  nodo.getMarca()+ ", tamaño:" +  nodo.getTamaño()+ ", Color:" + nodo.getColor() ;
            resultado += inorden(nodo.getNodoDerecho());
            return resultado;
        }
    }
    
    
    // Postorden: izquierda -> derecha -> raiz
    public String dispararPostorden() {
    return postorden(this.inicial);
}

    private String postorden(Nodo nodo) {
        if (nodo == null) {
            return ""; // Caso base
        } else {
            String resultado = postorden(nodo.getNodoIzq());
            resultado += postorden(nodo.getNodoDerecho());
            resultado = "Valor:"+ nodo.getValor() + ", nombre:"+nodo.getNombre()+ ", marca:" +  nodo.getMarca()+ ", tamaño:" +  nodo.getTamaño()+ ", Color:" + nodo.getColor() ;
            return resultado;
        }
    }

}
