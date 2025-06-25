package Fundamentos;

import java.util.*;
// 🔼 TEORÍA DE TIPOS PRIMITIVOS (y envoltorios)
public class TiposPrimitivos {
    public static void main(String[] args) {
        // 🔼 Tipos primitivos
        int edad = 25;
        double nota = 8.5;
        boolean aprobado = true;
        char inicial = 'A';

        System.out.println("PRIMITIVOS:");
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
        System.out.println("¿Aprobado?: " + aprobado);
        System.out.println("Inicial: " + inicial);
        System.out.println();

        // 🔼 Clases envoltorio (Wrappers)
        Integer edadObj = Integer.valueOf(edad);    // Autoboxing manual
        Double notaObj = nota;                      // Autoboxing automático
        Boolean aprobadoObj = Boolean.TRUE;         // Constante
        Character inicialObj = 'A';                 // Autoboxing

        System.out.println("ENVOLTORIOS:");
        System.out.println("Edad (objeto): " + edadObj);
        System.out.println("Nota (objeto): " + notaObj);
        System.out.println("Aprobado (objeto): " + aprobadoObj);
        System.out.println("Inicial (objeto): " + inicialObj);
        System.out.println();

        // Null solo es válido para envoltorios
        Integer indefinido = null;
        System.out.println("Edad indefinida (null): " + indefinido);

        // Cuidado: esto lanza NullPointerException si lo desenvuelves
        // int x = indefinido; // ❌ Error en tiempo de ejecución
        System.out.println();

        // 🔼 Conversión de texto a número
        String textoNumero = "123";
        int num = Integer.parseInt(textoNumero);
        double pi = Double.parseDouble("3.1416");
        boolean bool = Boolean.parseBoolean("true");

        System.out.println("CONVERSIÓN:");
        System.out.println("Texto a int: " + num);
        System.out.println("Texto a double: " + pi);
        System.out.println("Texto a boolean: " + bool);
        System.out.println();
    }
}
