// Nome: Luan dos Santos Sales Pinheiro CB3025977
// 7 - Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
// digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
// valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes. 

import java.util.Arrays;
import java.util.Scanner; 

public class TP02ex07 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        int[][] matriz = new int[3][4]; 
          
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Digite o valor de linha " + (l + 1) + " e coluna " + (c + 1));
                matriz[l][c] = reader.nextInt();
            }
        }

        System.out.println("Digite uma constante que irá multiplicar os valores da matriz: ");
        int constante = reader.nextInt();

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 4; c++) {
                matriz[l][c] *= constante;
            }
        }

        System.out.println("A matriz tem os seguintes valores: ");
        System.out.println(Arrays.deepToString(matriz));

        reader.close();
    }
}