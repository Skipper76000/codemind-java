import java.util.Scanner;
class Radius
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double r =in.nextDouble();
        final double pi=3.14;
        double area=pi*r*r;
        System.out.printf("%.2f",area);
    }
}
