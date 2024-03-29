// Nome: Luan dos Santos Sales Pinheiro CB3025977
// Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
// Caso contrário solicitar novamente apenas o segundo valor. 

import java.util.Scanner;  // Import the Scanner class

public class TP02ex01 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in); 
          
        System.out.println("Digite o primeiro valor: ");
        int x = reader.nextInt(); 
          
        System.out.println("Digite o segundo valor, que deve ser maior que o primeiro: ");
        int y = reader.nextInt();
        
        while (x >= y) {
            System.out.println("O segundo valor tem que ser maior que o primeiro: ");
            y = reader.nextInt();
        }
          
        System.out.println("Os valores digitados sao: " + x + " e " + y);
        reader.close();
    }
}
