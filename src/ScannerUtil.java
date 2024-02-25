import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static int nextInt() {
        try {
            int r = scanner.nextInt();
            scanner.nextLine();
            return r;
        } catch (InputMismatchException ex) {
            ScannerUtil.nextLine();
            System.out.println("Entrada inválida. Por favor, insira um número");
            return ScannerUtil.nextInt();
        } catch (Exception ex) {
            ScannerUtil.nextLine();
            System.out.println("Ocorreu um erro!");
            return ScannerUtil.nextInt();
        }
    }
    public static float nextFloat() {
        try {
            float r = scanner.nextFloat();
            scanner.nextLine();
            return  r;
        }catch (InputMismatchException ex) {
            ScannerUtil.nextLine();
            System.out.println("Entrada inválida. Por favor, insira um número");
            return ScannerUtil.nextFloat();
        } catch (Exception ex) {
            ScannerUtil.nextLine();
            System.out.println("Ocorreu um erro!");
            return ScannerUtil.nextFloat();
        }
    }
    public static String nextLine() {
        return scanner.nextLine();
    }
}
