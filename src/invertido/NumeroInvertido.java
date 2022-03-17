package invertido;

import java.util.Scanner;

public class NumeroInvertido {

    public static void main( String[] args ) {
        int numero, invertido = 0, resto;

        // Scanner é usado para "Escanear o número" (ler o numero que irá ser invertido).
        Scanner s = new Scanner( System.in );
        numero = s.nextInt();

        // A operação de modulo pega o numero de direita pra esquerda invertendo eles.
        while( numero > 0 ) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        System.out.println( "Número invertido: " + invertido );
    }

}