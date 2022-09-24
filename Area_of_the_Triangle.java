import java.util.*;
class Area{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        double a,b,c;
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}