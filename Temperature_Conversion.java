import java.util.Scanner;
class Temp {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double c =in.nextDouble();
        double f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}
