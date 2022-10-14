import java.util.*;
class Can_Share_Equally{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        char n=in.next().charAt(0);
        if(n=='A' || n=='E' || n=='I' || n=='O' || n=='U' ||n=='a' || n=='e' || n=='i' || n=='o' || n=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}