public class p89test {
    int N,K;
    int[] T,X,Y;

    public p89test(int n,int[] t,int[] x,int[] y){
        this.T = t;
        this.X = x;
        this.Y = y;
        this.N = n;
        this.K = t.length;
    }

    void solve(){
        unionfind u = new unionfind(N*3);
        u.init();
        int ans = 0;
        for (int i = 0; i < K; i++) {
            int t = T[i];
            int x = X[i]-1;
            int y = Y[i]-1;

            if (x<0||N<=x||y<0||N<=y){
                ans++;
                continue;
            }

            if(t == 1){
                if(u.same(x,y+N)||u.same(x,y+2*N)) ans++;
                else {
                    u.unite(x,y);
                    u.unite(x+N,y+N);
                    u.unite(x+N*2,y+N*2);
                }
            }
            else {
                if (u.same(x,y)||u.same(x,y+N*2)) ans++;
                else {
                    u.unite(x,y+N);
                    u.unite(x+N,y+N*2);
                    u.unite(x+N*2,y);
                }
            }
        }
        System.out.println("wrong:"+ans);
    }

    public static void main(String[] args) {
        new p89test(100,new int[]{1,2,2,2,1,2,1},new int[]{101,1,2,3,1,3,5},new int[]{1,2,3,3,3,1,5}).solve();
    }
}
