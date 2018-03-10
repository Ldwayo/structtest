public class gcdtest {
    public int gcd(int a,int b){
        if (b == 0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int ans = new gcdtest().gcd(12,30);
        System.out.println(ans);
    }
}
