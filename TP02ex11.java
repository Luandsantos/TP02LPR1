// Nome: Luan dos Santos Sales Pinheiro CB3025977
// 11 -  Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
// sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
// calcular e exibir determinante da matriz. 

import java.util.Scanner;

public class TP02ex11 {

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz quadrática (Máx. 10): ");
        int ordem = reader.nextInt();

        if (ordem > 10) {
            while (ordem > 10) {
                System.out.println("Digite a ordem da matriz quadrática (Máx. 10): ");
                ordem = reader.nextInt();
            }
        }

        int[][] matriz = new int[ordem][ordem];

        for (int l = 0; l < ordem; l++) {
            for (int c = 0; c < ordem; c++) {
                System.out.println("Digite o valor de linha " + (l + 1) + " e coluna " + (c + 1));
                matriz[l][c] = reader.nextInt();
            }
        }

        double determinante = calcularDeterminante(matriz);
        System.out.println("Determinante: " + determinante);

        reader.close();
    }

    public static double calcularDeterminante(int[][] matriz) {
        int ordem = matriz.length;
        if (ordem == 1) {
            return matriz[0][0];
        } else if (ordem == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        } else {
            double determinante = 0;
            for (int i = 0; i < ordem; i++) {
                determinante += matriz[0][i] * cofator(matriz, 0, i);
            }
            return determinante;
        }
    }

    public static double cofator(int[][] matriz, int linha, int coluna) {
        int ordem = matriz.length;
        int[][] submatriz = new int[ordem - 1][ordem - 1];
        int p = 0, q = 0;
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (i != linha && j != coluna) {
                    submatriz[p][q++] = matriz[i][j];
                    if (q % (ordem - 1) == 0) {
                        q = 0;
                        p++;
                    }
                }
            }
        }
        return Math.pow(-1, linha + coluna) * calcularDeterminante(submatriz);
    }
}
