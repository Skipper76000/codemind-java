import java.util.*;
class Can_Share_Equally{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        if(n%2==0 ){
            if(n>0 || m%2==0){
            System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
    }
}