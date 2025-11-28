import java.util.Scanner;

class CalculadoraSimpleMenu {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int n = 1;
        float n1 = 0, n2 = 0;
        while (n != 0) {
        System.out.print("\nMENÚ\n=========================\n1. Sumar\n2. Restar\n0. Salir\nElige una opción: ");
        n = entrada.nextInt();
            switch (n) {
                case 1:
                    System.out.print("\nSUMA\n=========================\nDime un número: ");
                    n1 = entrada.nextFloat();
                    System.out.print("Dime otro número: ");
                    n2 = entrada.nextFloat();
                    float result = n1 + n2;

                    System.out.println("RESULTADO: La suma entre " + n1 + " y " + n2 + " es " + result);
                    break;
                case 2:
                    System.out.print("\nRESTA\n=========================\nDime un número: ");
                    n1 = entrada.nextFloat();
                    System.out.print("Dime otro número: ");
                    n2 = entrada.nextFloat();
                    result = n1 - n2;
                    
                    System.out.println("RESULTADO: La resta entre " + n1 + " y " + n2 + " es " + result);
                    break;
                case 0:
                    break;
                default:
                    System.out.print("Error. Valor introducido no válido.");
                    break;
            }
        }
        entrada.close();
    }
}
