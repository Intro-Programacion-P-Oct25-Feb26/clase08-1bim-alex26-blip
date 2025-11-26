/*
Que se genere una solución que permita presenta lo siguiente, con una sola cadena
acumuladora

1
2
3
4
5
6
7
8
9
10

Y presente la suma
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        String mensaje = "";
        int contador = 1;
        int suma = 0;
        do {
        
             suma =suma + contador;
           mensaje = String.format("%s%s\n", mensaje , contador );
            contador = contador + 1;

        } while (contador <= 10);
        mensaje = String.format("%sla suma de la operacion es %s\n", mensaje ,suma );
        
        System.out.printf("%s", mensaje);
    }

}
