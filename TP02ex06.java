// Nome: Luan dos Santos Sales Pinheiro CB3025977
// 6 - Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela. 

import java.util.Arrays;
import java.util.Scanner; 

public class TP02ex06 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        String[][] matriz = new String[3][4]; 
          
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Digite o nome de linha " + (l + 1) + " e coluna " + (c + 1));
                matriz[l][c] = reader.next();
            }
        }

        System.out.println("Os valores escolhidos foram: ");
        System.out.println(Arrays.deepToString(matriz));

        reader.close();
    }
}