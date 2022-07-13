import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Parantheses {
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(check(s));
        
    }
    public static boolean check(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='['||c=='{'||c=='(')
                st.push(c);
            else if(c==']'){
                if(st.isEmpty()||st.pop()!='[')
                    return false;
            }
            else if(c=='}'){
                if(st.isEmpty()||st.pop()!='{')
                    return false;
            }
            else if(c==')'){
                if(st.isEmpty()||st.pop()!='(')
                    return false;
            }

        }
        return st.isEmpty();
    }
}