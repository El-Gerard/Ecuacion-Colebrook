
import java.util.Scanner;

public class ecuacion {

    public ecuacion() {
        double E, Re, X = 1, Y, M, Xp, Xs = 0, Xi = 0;
        int it = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese nivel de rugosidad: ");
        E = leer.nextDouble();
        System.out.println("ingrese el numero de Reynolds: ");
        Re = leer.nextDouble();

        Y = (-2 * Math.log10((E / (3.7)) + (2.51 / (Re * Math.sqrt(X)))) * Math.sqrt(X));

        if (Y > 1) {

            Xs = Y;
            Xi = X;

        } else if (Y <= 1) {

            Xi = Y;
            Xs = X;

        }

        do {
            Xp = (Xs + Xi) / 2;

            if (Xp < 1) {
                Xi = Xp;
            } else {
                Xs = Xp;
            }
            it++;
            System.out.println("iteracion: " + it);

        } while (Xp != 1);
        System.out.println(Y);

    }
}
