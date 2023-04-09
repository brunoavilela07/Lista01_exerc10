import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Programa que peça a temperatura em graus Celsius
        double grauc;
        double grauf;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é a temperatura em graus Celsius na sua cidade hoje?");
        grauc = input.nextDouble();
        // transforme e mostre em graus Fahrenheit
        grauf = ((grauc * 1.8) + 32);
        System.out.println("Sendo assim, a temperatura onde você mora em graus Fahrenheit é de: " + grauf + "ºF");
    }
}
