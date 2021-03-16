package bitacora_ejercicios;
/**
 * @author 
 * Dzul Noh Jose Julio - 19070047
 * Llanes Barrera Luis Angel - 19070023
 * Poot Pool Riger Emmanuel - 19070067
 * Semestre: Cuarto Grupo: A
 */
import java.util.Scanner;
public class Bitacora_Ejercicios {
    public static void main(String[] args) {
        Scanner xd = new Scanner(System.in);
        int opc;
        do {
            System.out.println("---------------------------------");
            System.out.println("|              MENU             |");
            System.out.println("| 1.- Euler                     |");
            System.out.println("| 2.- Ecuacion Cuadratica       |");
            System.out.println("---------------------------------");
            System.out.print("Seleccione Una Opcion: ");
            opc = xd.nextInt();
            System.out.println("\n************************************\n");
            switch (opc) {
                case 1:
                    double Euler = 0;
                    System.out.print("Ingrese el valor de x: ");
                    int x = xd.nextInt();
                    System.out.print("Ingrese el valor de n: ");
                    int n = xd.nextInt();
                    for (int j = 0; j <= n; j++) {
                        Euler += (Math.pow(x, j) / Factorial(j));
                    }
                    System.out.println("");
                    System.out.println("El resultado de euler elevado a " + x + " es: " + Euler);
                    System.out.println("El resultado de euler elevado a -" + x + " es: " + (1 / Euler));
                    break;

                case 2:
                    double ax = 0, bx = 0, cx = 0, Raizx, x1 = 0, x2 = 0, x = 0;

                    System.out.println("INGRESA EL VALOR DE 'ax2'");
                    ax = xd.nextDouble();
                       if (ax == 0) {
                          System.out.println("\n-No se puede realizar la formula");
                           }
        
                    System.out.println("INGRESA EL VALOR DE 'bx'");
                    bx = xd.nextDouble();

                    System.out.println("INGRESE EL VALOR DE 'c'");
                    cx = xd.nextDouble();
                     System.out.println(" ");
                    Raizx = (Math.pow(bx, 2)) - 4 * ax * cx;

                    if (Raizx >= 0) {
                         if (Raizx == 0) {
                             x = -bx / 2 * ax;
                             System.out.println("La unica raiz es x = " + x);
                         } else {
                            x1 = (-bx + (Math.sqrt(Raizx))) / 2 * ax;
                            x2 = (-bx - (Math.sqrt(Raizx))) / 2 * ax;
                            System.out.println("Resultado de x1 = " + x1);
                            System.out.println("Resultado de x2 = " + x2);
                         }
                    }
                    else {
                        System.out.println("No tiene ninguna solucion");
                    }
                    break;

                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
            System.out.println("\n************************************\n");
            System.out.println("Desea Volver Al Menu");
            System.out.println("1: SI    Otro N°: NO");
            System.out.print("R: ");
            opc = xd.nextInt();
            System.out.println("\n************************************\n");
        } while (opc == 1);
    }

    public static double Factorial(int n) {
        double cont = 1;
        for (int i = 1; i <= n; i++) {
            cont *= i;
        }
        return cont;
    }
}
