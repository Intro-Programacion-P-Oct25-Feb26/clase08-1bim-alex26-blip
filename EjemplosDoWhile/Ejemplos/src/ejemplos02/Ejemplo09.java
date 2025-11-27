/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 (Muy buena) del estudiante rené
Calificación 4 (Buena) del estudiante rolando

Promedio de calificaciones: 8,50

---
Si la nota es mayor o igual a 5 es un nota "Muy buena", caso contrario es buena
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal;
        String nombre;
        int nota;
        int salida;
        double promedio;
        boolean bandera = true;
        int suma = 0;
        int contador_calificaciones = 0;

        cadenaFinal = "Listado de Notas\n";

        do {
            System.out.println("Ingrese el nombre del estudiante:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la calificación del estudiante "
                    + "(número entero):");
            nota = entrada.nextInt();

            String estadoCalificacion;
            if (nota >= 5) {
                estadoCalificacion = "Muy buena";
            } else {
                estadoCalificacion = "Buena";
            }

            cadenaFinal = String.format("%sCalificación %d (%s) del"
                    + " estudiante %s\n",
                    cadenaFinal,
                    nota,
                    estadoCalificacion,
                    nombre);

            suma = suma + nota;

            contador_calificaciones = contador_calificaciones + 1;

            System.out.println("---");
            System.out.println("Ingrese (1) si desea salir del ciclo; "
                    + "cualquier otro número para continuar");
            salida = entrada.nextInt();

            if (salida == 1) {
                bandera = false;
            }

            // Limpiar el buffer después de entrada.nextInt()
            entrada.nextLine();

        } while (bandera);

        if (contador_calificaciones > 0) {
            promedio = (double) suma / contador_calificaciones;
        } else {
            promedio = 0;
        }

        cadenaFinal = String.format("%s\nPromedio de calificaciones: %.2f",
                cadenaFinal,
                promedio);

        String reporteFinal = cadenaFinal.replace('.', ',');

        System.out.printf("\n%s\n", reporteFinal);
    }
}
