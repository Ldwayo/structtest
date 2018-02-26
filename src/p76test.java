import java.util.PriorityQueue;

public class p76test {
    int N,L[];
    PriorityQueue<Integer> priorityQueue;
    private p76test(int N,int L[]){
        this.L = L;
        this.N = N;
        priorityQueue = new PriorityQueue<Integer>(N);
    }
    private void solve(){
        long ans = 0;
        for (int i = 0; i < N; i++) {
            priorityQueue.add(L[i]);
        }
        while (priorityQueue.size()>1){
            int l1,l2;
            l1 = priorityQueue.poll();
            l2 = priorityQueue.poll();
            ans += l1+l2;
            priorityQueue.add(l1+l2);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new p76test(3,new int[]{8,5,8}).solve();
    }
}
