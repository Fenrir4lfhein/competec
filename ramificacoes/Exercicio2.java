/*
Se tiver chovendo E relampejando, eu não sairei de casa. Tente fazer essa comparação lógica no código.
Se tiver macarrão ou estrogonofe hoje no almoço, vou ficar muito feliz! 
Tente fazer essa comparação lógica no código.
*/

public class Exercicio2 {
    public static void main(String[] args) {
        // Escreva o código abaixo
        boolean chovendo = true;
        boolean relampejando = false;
        boolean condicao = (chovendo && relampejando);
        System.out.print("Se tiver chovendo e relampejando eu nao sairei de casa?" + condicao);
        boolean macarrao = false;
        boolean estrogonofe = true;
        boolean condicao2 = (macarrao || estrogonofe);
        System.out.println("Se tiver macarrao e estrogonofe, eu vou ficar feliz?" + condicao2);
    }
}
