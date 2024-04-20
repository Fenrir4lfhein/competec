/*
Receba um input numérico e imprima VERDADEIRO se ele for múltiplo de 3 OU de 5, 
caso contrário, imprima FALSO.
*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero = 30;
        if (numero%3==0){
            System.out.print("Verdadeiro");   
        }
        else if(numero%5==0){
            System.out.println("Verdadeiro");

        }
        else{
            System.out.println("Falso");
        }
        
    }
}
