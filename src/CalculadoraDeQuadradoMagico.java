import java.time.LocalTime;
import java.util.Random;

public class CalculadoraDeQuadradoMagico {

    public static void main(String[] args) {

        Random gerador = new Random();
        long inicio =
                LocalTime.now().toNanoOfDay();

        int x1 = gerador.nextInt(9) + 1, x2 = gerador.nextInt(9) + 1, x3 = gerador.nextInt(9) + 1,
            x4 = gerador.nextInt(9) + 1, x5 = gerador.nextInt(9) + 1, x6 = gerador.nextInt(9) + 1,
            x7 = gerador.nextInt(9) + 1, x8 = gerador.nextInt(9) + 1, x9 = gerador.nextInt(9) + 1;

        int contador = 1;

        while(
            (
                ((x1 + x2 + x3) != 15) || ((x4 + x5 + x6) != 15) || ((x7 + x8 + x9) != 15) ||
                ((x1 + x4 + x7) != 15) || ((x2 + x5 + x8) != 15) || ((x3 + x6 + x9) != 15) ||
                ((x1 + x5 + x9) != 15) || ((x3 + x5 + x7) != 15)
            )
                ||
            (
                (x1 == x2) || (x1 == x3) || (x1 == x4) || (x1 == x5) || (x1 == x6) || (x1 == x7) || (x1 == x8) || (x1 == x9) ||
                (x2 == x3) || (x2 == x4) || (x2 == x5) || (x2 == x6) || (x2 == x7) || (x2 == x8) || (x2 == x9) ||
                (x3 == x4) || (x3 == x5) || (x3 == x6) || (x3 == x7) || (x3 == x8) || (x3 == x9) ||
                (x4 == x5) || (x4 == x6) || (x4 == x7) || (x4 == x8) || (x4 == x9) ||
                (x5 == x6) || (x5 == x7) || (x5 == x8) || (x5 == x9) ||
                (x6 == x7) || (x6 == x8) || (x6 == x9) ||
                (x7 == x8) || (x7 == x9) ||
                (x8 == x9)
            )
        ) {
            contador++;
            x1 = gerador.nextInt(9) + 1;
            x2 = gerador.nextInt(9) + 1;
            x3 = gerador.nextInt(9) + 1;
            x4 = gerador.nextInt(9) + 1;
            x5 = gerador.nextInt(9) + 1;
            x6 = gerador.nextInt(9) + 1;
            x7 = gerador.nextInt(9) + 1;
            x8 = gerador.nextInt(9) + 1;
            x9 = gerador.nextInt(9) + 1;
        }

        long fim = LocalTime.now().toNanoOfDay();

        System.out.println(x1 + " - " + x2 + " - " + x3);
        System.out.println(x4 + " - " + x5 + " - " + x6);
        System.out.println(x7 + " - " + x8 + " - " + x9);

        System.out.println("------------------------------");
        System.out.println("Quantidade de Tentativas: " + contador);
        System.out.println("------------------------------");
        System.out.println("Nanosegundos: " + (fim - inicio));
        System.out.println("------------------------------");
        System.out.println("Segundos: " + ((fim - inicio) / 1000000000F));
    }
}
