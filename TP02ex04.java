// Nome: Luan dos Santos Sales Pinheiro CB3025977
// 4 - Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela. 

import java.util.Arrays;
import java.util.Scanner; 

public class TP02ex04 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        int[][] matriz = new int[2][3]; 
          
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Digite o valor de linha " + (l + 1) + " e coluna " + (c + 1));
                matriz[l][c] = reader.nextInt();
            }
        }

        System.out.println("Os valores escolhidos foram: ");
        System.out.println(Arrays.deepToString(matriz));

        reader.close();
    }
}