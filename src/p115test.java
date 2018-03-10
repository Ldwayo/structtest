public class p115test {     //wrong
    int a,b;
    private p115test(int a,int b){
        this.a = a;
        this.b = b;
    }
    protected int extgcd(int a,int b,int x,int y){
        int d = a;
        if (b!=0){
            d = extgcd(b,a%b,y,x);
            y -= (a/b)*x;
        }
        else {
            x = 1;
            y = 0;
        }
        System.out.println(x+":"+y);
        return d;
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int a = new p115test(4,11).extgcd(4,11,x,y);
    }
}
