import java.util.Scanner;

public class ScannerUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static int nextInt() {
        int r = scanner.nextInt();
        scanner.nextLine();
        return  r;
    }
    public static float nextFloat() {
        float r = scanner.nextFloat();
        scanner.nextLine();
        return  r;
    }
    public static String nextLine() {
        return scanner.nextLine();
    }
}
