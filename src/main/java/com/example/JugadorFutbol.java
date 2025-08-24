package com.example;

public class JugadorFutbol {
    private String nombre;
    private int edad;
    private String posicion;

    public JugadorFutbol(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public void presentarse() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Posición: " + posicion);
    }

    public void cambiarPosicion(String nuevaPosicion) {
        this.posicion = nuevaPosicion;
        System.out.println(nombre + " ahora juega como " + nuevaPosicion);
    }
}