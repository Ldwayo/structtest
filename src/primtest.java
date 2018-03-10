import java.util.Scanner;

public class primtest {
    int n;
    int m;
    int prime[];
    boolean[] is_prim;
    private primtest(int n,int m){
        this.n = n;
        this.m = m;
        prime = new int[m];
        is_prim = new boolean[m+1];
    }

    boolean is_prime(){
        for (int i = 2; i*i <= n; i++) {
            if (n%i == 0)
                return false;
        }
        return n!=1;
    }

    private int sieve(){
        int p = 0;
        for (int i = 0;i <= m;i++){
            is_prim[i] = true;
        }
        is_prim[0] = false;
        is_prim[1] = false;
        for (int i = 2; i <= m; i++) {
            if (is_prim[i]){
                prime[p++] = i;
                for (int j = 2*i; j <= m; j += i) {
                    is_prim[j] = false;
                }
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要判断的数：");
        int n = scanner.nextInt();
        System.out.println("请输入一个范围：");
        int m = scanner.nextInt();
        primtest primtest = new primtest(n,m);
        System.out.println("是否素数："+primtest.is_prime());
        System.out.println("范围内素数的个数："+primtest.sieve());
    }
}
