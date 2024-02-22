
import java.util.Scanner;
public class Prueba {

    /** author: José Antonio Guirado González
     * */

    private static Scanner teclado;

    public static void main(String[] args) {
        /* Queremos averiguar si la figura introducida es un cuadrado o un rectángulo
         * y mostrar su perímetro.
         */
        double b, a;
        String f;
        teclado = new Scanner(System.in);
        System.out.print("Introduce la base de la figura: ");
        b = teclado.nextDouble();
        System.out.print("Introduce la altura de la figura: ");
        a = teclado.nextFloat();
        if (b == a) {
            f = "cuadrado";
        }else
            {
                f = "rectángulo";
            }
            double perimetro = 2 * b + 2 * a;
            System.out.println("La figura es un " + f + " y su perímetro es: " + perimetro);
            teclado.close();
        }
    }
