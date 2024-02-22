
import java.util.Scanner;
public class Prueba {

    /** author: José Antonio Guirado González
     * */

    private static Scanner teclado;

    public static void main(String[] args) {
        /* Queremos averiguar si la figura introducida es un cuadrado o un rectángulo
         * y mostrar su perímetro.
         */
        double base, altura;
        String forma;
        teclado = new Scanner(System.in);
        System.out.print("Introduce la base de la figura: ");
        base = teclado.nextDouble();
        System.out.print("Introduce la altura de la figura: ");
        altura = teclado.nextFloat();
        if (base == altura) {
            forma = "cuadrado";
        }else
            {
                forma = "rectángulo";
            }
            double perimetro = 2 * base + 2 * altura;
            System.out.println("La figura es un " + forma + " y su perímetro es: " + perimetro);
            teclado.close();
        }
    }
