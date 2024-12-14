package com.aluracursos.starwars;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el numero de la pelicula que quieres consultar: ");
        ConsultaPelicula consulta = new ConsultaPelicula();
        try{
            var numeroDePelicula = Integer.valueOf(lectura.nextLine()); // aqui se guarda el sacnner en una variable
            Pelicula pelicula = consulta.buscaPelicula(1);
            System.out.println(pelicula);
            GeneradorDeArchivo generador =new GeneradorDeArchivo();
            generador.guardarJson(pelicula);

        } catch (NumberFormatException e) {
            System.out.println("Numero no encontrado "+e.getMessage());;
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }

    }
}

