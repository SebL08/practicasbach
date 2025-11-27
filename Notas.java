import java.util.Scanner;

class Notas {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántas notas quieres introducir? ");
        int n = entrada.nextInt();
        int a = 0, s = 0;
        float sumanotas = 0, media = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nota " + i + ": ");
            float n1 = entrada.nextFloat();
            //bucle para evitar notas que no estén entre 0 y 10
            while (n1 > 10 || n1 < 0) {
                System.out.println("Incorrecto, introduce un número entre 0 y 10.");
                System.out.print("Nota " + i + ": ");
                n1 = entrada.nextFloat();
            }
            //suma de todas las notas para la media
            sumanotas = sumanotas + n1;
            //comprobar si es aprobado o no
            if (n1 >= 5) {
                a++;
            } else {
                s++;
            }
        }
        //media de las notas
        media = sumanotas / n;
        System.out.println("Número de aprobados: " + a + "\nNúmero de suspensos: " + s + "\nMedia aritmética: " + media);
        entrada.close();
    }
}