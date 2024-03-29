// Nome: Luan dos Santos Sales Pinheiro CB3025977
// 9 - Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
// sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
// elementos, calcular e exibir a matriz transposta. 

import java.util.Arrays;
import java.util.Scanner;

public class TP02ex09 {
    
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas (Máx. 10): ");
        int M = reader.nextInt();

        System.out.println("Digite a quantidade de colunas (Máx. 10): ");
        int N = reader.nextInt();

        if (M > 10 || N > 10) {
            while (M > 10 || N > 10) {
                System.out.println("Digite a quantidade de linhas (Máx. 10): ");
                M = reader.nextInt();
        
                System.out.println("Digite a quantidade de colunas (Máx. 10): ");
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

        System.out.println("A matriz tem os seguintes valores: ");
        System.out.println(Arrays.deepToString(matriz));

        reader.close();
    }
}
