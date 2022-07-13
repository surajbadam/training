import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


public class HashMap_input {
    public static void main(String[] args) throws IOException{
        Map<String,Map<String,String>> mp=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of animals:");
        int n=sc.nextInt();
        while(n-->0){
            System.out.println("Enter the name of animal:");
            String a=sc.next();
            System.out.println("Enter the number properties of animal:");
            int n_prop=sc.nextInt();
            Map<String,String> map=new HashMap<>();
            while(n_prop-->0){
                System.out.println("Enter the properties in a key value pair:");
                
                String prop_a=sc.next();
                String prop_b=sc.next();
                map.put(prop_a, prop_b);
            }
            mp.put(a, map);
        }
        insertIntoFile(mp);
        Reader r=new FileReader("Example.txt");
        System.out.println("reading the contents from the file");
        readFromFile(r);
        sc.close();
    }

    private static void readFromFile(Reader r) throws IOException {
        BufferedReader br=new BufferedReader(r);
        String res=" ";
        while((res=br.readLine()) != null){
            System.out.println(res);
        }
        br.close();
        r.close();
    }

    private static void insertIntoFile(Map<String, Map<String, String>> mp) {
        try  {
            FileWriter fw = new FileWriter("Example.txt");
            fw.write("{");fw.write("\n");
            for (Entry<String, Map<String, String>> entry : mp.entrySet()) {
                fw.write("\t");fw.write("{"+entry.getKey()+":");fw.write("{");
                int count=entry.getValue().size();
                int k=1; 
                for (Map.Entry<String,String> innerEntry : entry.getValue().entrySet()) {   
                    fw.write(innerEntry.getKey()+":"+innerEntry.getValue());
                    if(k!=count)
                        fw.write(",");
                    else    
                        fw.write(" ");
                    k++;
                }
                fw.write("}");
                fw.write("}");
            }
            fw.write("\n");
            fw.write("}");
            fw.close();
        } 

        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
