// Nome: Luan dos Santos Sales Pinheiro CB3025977
// 2 - Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
//erro, se necessário. Após a digitação, exibir:
//a. O maior valor;
//b. A soma dos valores;
//c. A média aritmética dos valores.
//Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.

import java.util.Scanner; 

public class TP02ex02 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        double maior = 0;
        double soma = 0;
        double media = 0;
          
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            int x = reader.nextInt();
            if (x > maior) {
                maior = x;
            }
            soma += x;
        }
        
        media = soma / 10;
          
        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média dos valores é: " + media);
        
        reader.close();
    }
}
