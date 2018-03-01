public class unionfind {
    int n;
    int[] par;
    int[] rank;

    protected unionfind(int n){
        this.n = n;
        rank = new int[n];
        par = new int[n];
    }

    protected void init(){
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }
    }

    protected int find(int x){
        if (par[x] == x)
            return x;
        else {
            return par[x] = find(par[x]);
        }
    }

    protected void unite(int x,int y){
        x = find(x);
        y = find(y);
        if (x == y)
            return;
        if (rank[x] < rank[y]){
            par[x] = y;
        }
        else {
            par[y] = x;
            if (rank[x] == rank[y]) rank[x]++;
        }
    }

    protected boolean same(int x,int y){
        return find(x) == find(y);
    }
}
