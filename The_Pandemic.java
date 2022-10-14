import java.util.*;
class Colour_code{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        int n=in.nextInt();
        if(n==2){
            System.out.println("1");
        }
        else if(n>2){
            System.out.println("2");
        }
        else{
            System.out.println("0");
        }
    }
}