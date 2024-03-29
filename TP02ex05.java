// Nome: Luan dos Santos Sales Pinheiro CB3025977
// 5 - Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela. 

import java.util.Arrays;
import java.util.Scanner; 

public class TP02ex05 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        int[][] matriz = new int[3][2]; 
          
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 2; c++) {
                System.out.println("Digite o valor de linha " + (l + 1) + " e coluna " + (c + 1));
                matriz[l][c] = reader.nextInt();
            }
        }

        System.out.println("Os valores escolhidos foram: ");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 2; c++) {
                System.out.println(matriz[l][c]);
            }
        }

        System.out.println(Arrays.deepToString(matriz));


        reader.close();
    }
}

