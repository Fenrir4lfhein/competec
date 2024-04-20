import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    double idade;
    boolean verdade = idade>=26;
    System.out.print("Digite sua idade?");
    idade = leia.doublenext();
    System.out.println("Voce é mais novo que o professo?" + verdade);
    }
}
