import java.util.Scanner;

class Palindromo {
    public static void main(String args[]) {
        String reves = "";
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe una frase y te diré si es un palíndromo: ");
        String fr = entrada.nextLine().toLowerCase().replaceAll(" ", "");
        entrada.close();

        for (int i = fr.length() - 1; i >= 0; i--) {
            char car = fr.charAt(i);
            reves = reves + "" + car;
        }

        if (reves.equals(fr)) {
            System.out.println("Es un palíndromo.");
        } else if (fr != reves) {
            System.out.println("No es un palíndromo.");
        }
    }
}