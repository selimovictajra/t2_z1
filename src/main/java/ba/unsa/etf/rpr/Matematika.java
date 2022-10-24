package ba.unsa.etf.rpr;

public class Matematika {
    public static double sinus(double x) {
        x = x * Math.PI / 180;
        double sin = 0;
        int stepen = 1;
        int predznak = 1;
        for (int i = 0; i < 10; i++, stepen+=2, predznak *= -1) {
            sin += (Math.pow(x,stepen) / faktorijel(stepen)) * predznak;
        }
        return sin;
    }

    public static int faktorijel(int x) {
        int F = 1;
        for (int i = 1; i <= x; i++) F *= i;
        return F;
    }
}
