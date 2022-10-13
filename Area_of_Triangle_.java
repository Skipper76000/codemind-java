import java.util.Scanner;
class area_of_a_triangle{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        float a=in.nextInt();
        float b=in.nextInt();
        float c=in.nextInt();
        float s=(a+b+c)/2;
        float area= (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f", area);
    }
}