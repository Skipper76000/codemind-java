import java.util.Scanner;
class multiply{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        float a=in.nextFloat();
        float b=in.nextFloat();
        float area=a*b;
        System.out.printf("%.2f", area);
    }
}