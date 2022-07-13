import java.util.*;

public class Array_duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> al=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int a;
        while((a=sc.nextInt())!=-1){
            al.add(a);
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }
            else
                map.put(a,1);
        }
        //Set<Integer> set=new HashSet<>();
        System.out.println(map);
        int flag=0;
        while (flag==0) {
            al.clear();
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()==1){
                    al.add(entry.getKey());
                    continue;
                }
                al.add(entry.getKey()+entry.getValue());
            }
            map.clear();
            for(int i:al){
                if(map.containsKey(i)){
                    map.put(i, map.get(i)+1);
                }
                else
                    map.put(i,1);
            }
            flag=1;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>1)
                    flag=0;
            }
        }
        for (int i : al) {
            System.out.println(i);
        }
    }
}
