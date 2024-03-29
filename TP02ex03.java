// Nome: Luan dos Santos Sales Pinheiro CB3025977
// 3 - Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
//números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
//satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
//digitação dos “N” valores, exibir:
//a. O maior valor;
//b. O menor valor;
//c. A soma dos valores;
//d. A média aritmética dos valores;
//e. A porcentagem de valores que são positivos;
//f. A porcentagem de valores negativos;

import java.util.Scanner; 

public class TP02ex03 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        String continuar = "S";

        while (continuar.toUpperCase().equals("S")) {
            System.out.println("Digite a quantidade de valores a ser digitado (valor N): ");
            int N = reader.nextInt();
            while (N < 0 && N >= 20) {
                System.out.println("ERRO. N deve que ser positivo e menor que vinte: ");
                N = reader.nextInt();
            }
    
            double soma = 0;
            double maior = 0;
            double menor = 0;
            double media = 0;
            double positivo = 0;
            double negativo = 0;
    
            for (int i = 0; i < N; i++) {
                System.out.println("Digite o " + (i + 1) + "º valor: ");
                int x = reader.nextInt();
                if (x > maior) {
                    maior = x;
                }
                if (x < menor) {
                    menor = x;
                }
                soma += x;
                if (x > 0) {
                    positivo++;
                } 
                if (x < 0) {
                    negativo++;
                }
            }
            
            media = soma / N;
    
            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);
            System.out.println("A soma dos valores é: " + soma);
            System.out.println("A média dos valores é: " + media);
            System.out.println("Esse conjunto é composto de " + (Math.round(positivo * 100.0/N)) + "% de números positivos.");
            System.out.println("Esse conjunto é composto de " + (Math.round(negativo * 100.0/N)) + "% de números negativos." + "\r\n");

            System.out.println("Continuar? [S/N]: ");
            continuar = reader.next();
            while  (!(continuar.equals("S") || continuar.equals("N"))) { 
                System.out.println("ERRO. Continuar? [S/N]: ");
                continuar = reader.next();
            }
        }

        reader.close();
    }
}
