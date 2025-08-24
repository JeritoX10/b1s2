package com.example;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Estadio
        Estadio estadio1 = new Estadio("Estadio Metropolitano", "Barranquilla", 47000);
        Estadio estadio2 = new Estadio("Estadio El Campín", "Bogotá", 36000);

        estadio1.mostrarInformacion();
        estadio2.mostrarInformacion();

        JugadorFutbol jugador1 = new JugadorFutbol("Neymar Jr", 25, "Delantero");
        JugadorFutbol jugador2 = new JugadorFutbol("Iñigo Martinez", 28, "Defensa");
        JugadorFutbol jugador3 = new JugadorFutbol("Johan Garcia", 22, "Portero");

        jugador1.presentarse();
        jugador2.presentarse();
        jugador3.presentarse();

        jugador1.cambiarPosicion("Centrocampista");
    }
}