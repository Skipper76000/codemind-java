import java.util.*;
class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double area = (a+b)/2.0;
        System.out.printf("%.4f", area);
    }
}