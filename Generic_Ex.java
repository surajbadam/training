
public class Generic_Ex {
    public static void main(String[] args) {
        System.out.println(returnMax(10, 12,15));
        System.out.println(returnMax(1.1,1.12,1.23));
        System.out.println(returnMax("suraj", "shyam", "sam"));
    }
    public static <T extends Comparable<T>> T returnMax(T a,T b,T c){
        T maximum=a;
        if(b.compareTo(maximum)>0){
            maximum=b;
        }
        if(c.compareTo(maximum)>0){
            maximum=c;
        }
        return maximum;
    }
}
