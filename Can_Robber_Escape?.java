import java.util.*;
class Can_A_Robber_Escape {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, i, c = 0;
        n = in.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                c++;
            }
        }
        if (c <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}