import java.util.Scanner;

public class u1 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Iveskite apskritimo spinduli");
        double r = skait.nextDouble();
        System.out.println("Plotas su = " + r + "spinduliu yra: " + apskritimoPlotas(r));

        System.out.println("Iveskite apskritimo spinduli1");
        double r1 = skait.nextDouble();
        System.out.println("Ilgis su = " + r1 + "spindli yra: " + apskritimoIlgis(r1));

        System.out.println("Iveskite apskritimo spinduli2");
        double r2 = skait.nextDouble();
        System.out.println("Diametras su= " + r2 + "spinduliu yra: " + apskritimoDiametras(r2));

    }
    public static double apskritimoPlotas(double r) {
        return Math.PI * r * r;
    }
    public static double apskritimoIlgis ( double r1) {
        return Math.PI * r1 * 2;
    }
    public static double apskritimoDiametras ( double r2) {
        return 2 * r2;
    }
}
