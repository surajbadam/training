import java.util.Arrays;
import java.util.Comparator;


public class sort_sal {
    public static void main(String[] args) {
        emp e1=new emp();
        e1.setName("suraj");
        e1.setAge(22);
        e1.setSal(30000);
        emp e2=new emp();
        e2.setName("ram");
        e2.setAge(24);
        e2.setSal(50000);
        emp e3=new emp();
        e3.setName("bheem");
        e3.setAge(20);
        e3.setSal(10000);
        emp e[]=new emp[3];
        e[0]=e1;e[1]=e2;e[2]=e3;
        Arrays.sort(e,new Comparator<emp>() {
            @Override
            public int compare(emp e1, emp e2) {
                    return e1.getAge()-e2.getAge();
                }
            
        });
        for(int i=0;i<e.length;i++)
        {
            System.out.println(e[i].getName()+" "+e[i].getAge()+" "+e[i].getSal());
        }
    }
}
