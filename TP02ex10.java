// Nome: Luan dos Santos Sales Pinheiro CB3025977
// 10 -  Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
// sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
// calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
// colunas).

import java.util.Scanner;

public class TP02ex10 {

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas (Máx. 10 e igual a quantidade de colunas): ");
        int M = reader.nextInt();

        System.out.println("Digite a quantidade de colunas (Máx. 10 e igual a quantidade de linhas): ");
        int N = reader.nextInt();

        if (M > 10 || N > 10 || M != N) {
            while (M > 10 || N > 10 || M != N) {
                System.out.println("Digite a quantidade de linhas (Máx. 10 e igual a quantidade de colunas): ");
                M = reader.nextInt();
        
                System.out.println("Digite a quantidade de colunas (Máx. 10 e igual a quantidade de linhas): ");
                N = reader.nextInt();
            } 
        }

        int[][] matriz = new int[M][N]; 
          
        for (int l = 0; l < M; l++) {
            for (int c = 0; c < N; c++) {
                System.out.println("Digite o valor de linha " + (l + 1) + " e coluna " + (c + 1));
                matriz[l][c] = reader.nextInt();
            }
        }

        System.out.println("Matriz: ");
        for (int l = M; l > 0; l--) {
            for (int c = N; c > 0; c--) {
                //System.out.print("Linha: " + l + " Coluna: " + c);
                System.out.print(matriz[l - 1][c - 1] +  " ");
            }
            System.out.println("");
        }

        reader.close();
    }
}
// c < N = enquanto true, continua, se false, para
// 0 < 2 = true, continua
// 1 < 2 = true, continua
// 2 < 2 = false, para

// c == 0 se C = N = 2
// 2 == 0 = false, para

// c > 0 
// 2 > 0 = true, continua
// 1 > 0 = true, continua
// 0 > 0 = false, para


// linha 1 coluna 1 = printa 1
// linha 1 coluna 2 = printa 2
// linha 2 coluna 1 = printa 3 
// linha 2 coluna 2 = printa 4

// linha 2 coluna 2 = printa 4
// linha 2 coluna 2 = printa 3
// linha 1 coluna 1 = printa 1

// l = 2; l < 2; 2--
// c = 2; c < 2; 2--
// matriz[2 - 1][2 - 1]
// matriz []