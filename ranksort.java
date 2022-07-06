import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ranksort {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        int a;
        Scanner sc=new Scanner(System.in);
        while((a=sc.nextInt())!=-1){
            al.add(a);
        }
        send(al);
        System.out.println(al);
    }
    private static void send(ArrayList<Integer> al) {
        PriorityQueue<Testing> pq=new PriorityQueue<>(new Comparator<Testing>() {
            public int compare(Testing o1, Testing o2) {
                return o2.a-o1.a;
            }   
        });
        for(int i=0;i<al.size();i++)
            pq.add(new Testing(al.get(i),i));
        int rank=al.size();
        while (!pq.isEmpty()) {
            al.set(pq.poll().b, rank);
            --rank;
        }
    }
}

class Testing{
    int a;
    int b;
    Testing(int a,int b){
        this.a=a;
        this.b=b;
    }
}
