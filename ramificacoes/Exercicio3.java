/*
Suponha duas pessoas, A e B:
Faça uma comparação lógica para ver se A e B têm a mesma idade E A tem mais de 18 anos.
Faça uma comparação lógica para ver se A e B têm idades diferentes E se B tem menos de 12 anos.
*/

public class Exercicio3 {
    public static void main(String[] args) {
        // Escreva o código abaixo
        int idade1 = 36;
        int idade2 = 9;
        if (idade1 = idade2) {
            System.out.println("Os dois tem a mesma idade");
        }
        else{
            System.out.println("Eles nao tem a mesma idade");
        }
        if (idade1>18) {
            System.out.println(idade1 + "É maior de 18 anos");
            
        }
        else{
            System.out.println(idade1 + "Não é maio de 18 anos");
        }
        if (idade1!=idade2) {
            System.out.println("Sim, eles tem a idade diferentes");
            
        }
        else{
            System.out.println("Não, eles tem a mesma idade");
        }
        if (idade2<12) {
            System.out.println(idade2 + "Tem menos de 12 anos");
            
        }
        else{
            System.out.println(idade1 + "Não tem menos de 12 anos");
        }
    }
}