import java.util.Scanner;

public class gcdtest {
    public int gcd(int a,int b){
        if (b == 0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {    //最大公约数
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        int a = scanner.nextInt();
        System.out.print("b:");
        int b = scanner.nextInt();
        int ans = new gcdtest().gcd(a,b);
        System.out.println(ans);
    }
}
