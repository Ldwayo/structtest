import java.util.Comparator;
import java.util.PriorityQueue;

public class p74test {
    int L,P,N;
    int[] A,B;
    PriorityQueue<Integer> priorityQueue;
    private p74test(int L,int P,int N,int[] A,int[] B){
        this.A = A;
        this.B = B;
        this.L = L;
        this.N = N;
        this.P = P;
        this.priorityQueue = new PriorityQueue<Integer>(N, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
    }
    private void solve(){
        A[N] = L;
        B[N] = 0;
        N++;
        int ans = 0,pos = 0,tank = P;
        for (int i = 0; i < N; i++) {
            int d = A[i] - pos;
            while (tank-d<0){
                if (priorityQueue.isEmpty()){
                    System.out.println(-1);
                    return;
                }
                tank += priorityQueue.poll();
                ans++;
            }
            tank -= d;
            pos = A[i];
            priorityQueue.add(B[i]);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new p74test(25,10,4,new int[]{10,14,20,21,0},new int[]{10,5,2,4,0}).solve();
    }
}
