package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "X|7/|9-|X|-8|8/|-6|X|X|X81";
        List<Integer> intList = new ArrayList<>();

        // Eliminar el último "" para simplificar el procesamiento
        input = input.replace("||", "|");

        // Convertir cada sección separada por "|" en valores numéricos
        String[] frames = input.split("\\|");

        for (String frame : frames) {
            for (int i = 0; i < frame.length(); i++) {
                char c = frame.charAt(i);

                if (c == 'X') {
                    // "X" representa 10 puntos
                    intList.add(10);
                } else if (c == '/') {
                    // "/" representa un spare, que hace que el segundo lanzamiento complete los 10 pines
                    // Necesitamos calcular el spare respecto al primer lanzamiento en el frame

                    //Crear lista y añadir a intList, dentro de la nueva lista añadir previousValue añadir linea 29 (osea añadirias 7 y 3)
                    //Y ahora borrar la posición anterior (en este caso el 7)

                    int previousValue = intList.get(intList.size() - 1);
                    intList.add(10 - previousValue);
                } else if (c == '-') {
                    // "-" representa 0 puntos
                    intList.add(0);
                } else {
                    // Si es un número, lo agregamos directamente a la lista
                    intList.add(Character.getNumericValue(c));
                }
            }
        }

        System.out.println(intList);
    }
}