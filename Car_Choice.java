import java.util.*;

class Colour_code{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        int t=in.nextInt();
        while(t-- >0){
            float x1,x2,y1,y2;
            x1=in.nextInt();
            x2=in.nextInt();
            y1=in.nextInt();
            y2=in.nextInt();
            float c1,c2;
            c1=(y1/x1);
            c2=(y2/x2);
            if(c1<c2){
                System.out.println("-1");
            }
            else if(c1>c2){
                System.out.println("1");
            }
            else if(c1==c2){
                System.out.println("0");
            }
        }
    }
}