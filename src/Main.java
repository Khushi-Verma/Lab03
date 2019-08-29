import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double F;
        double C;
        Scanner a = new Scanner(System.in);
        F = a.nextDouble();
        C = (F - 32) / 1.8;
        System.out.println(C);
    }
}