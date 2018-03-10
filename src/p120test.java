import java.util.Scanner;

public class p120test {
    int a;
    int b;
    boolean is_prime[];
    boolean is_prime_small[];
    
    private p120test(int a,int b){
        this.a = a;
        this.b = b;
        is_prime = new boolean[b-a];
        is_prime_small = new boolean[b];
    }
    
    protected int max(int a,int b){
        if(a>b){
            return a;
        }
        else return b;
    }
    
    private void segment_sieve(){
        int p = 0;
        for (int i = 0; i*i < b; i++) {
            is_prime_small[i] = true;
        }
        for (int i = 0; i < b-a; i++) {
            is_prime[i] = true;
        }
        for (int i = 2; i*i < b; i++) {
            if (is_prime_small[i])
            {
                for (int j = 2*i; j*j < b; j += i) {
                    is_prime_small[j] = false;
                }
                for (int j = max(2,(a+i-1)/i)*i; j < b; j += i) {
                    is_prime[j-a] = false;
                }
            }
        }
        for (int i = 0; i < b-a; i++) {
            if (is_prime[i])
                p++;
        }
        System.out.println(p);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请分别输入下界和上界：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        p120test p120test = new p120test(a,b);
        p120test.segment_sieve();
    }
}
