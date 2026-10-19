import java.util.Scanner;

public class ProcesadorArgumentosCLI {
    public static void main(String[] args) {
        int val1 = 0;
        int val2 = 0;
        
        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el primer valor:");
            val1 = scanner.nextInt();
            System.out.println("Introduce el segundo valor:");
            val2 = scanner.nextInt();
            scanner.close();
        } else {
            val1 = Integer.parseInt(args[0]);
            val2 = Integer.parseInt(args[1]);
        }
        System.out.println("Resultado de la suma: " + (val1 + val2));
    }
}

