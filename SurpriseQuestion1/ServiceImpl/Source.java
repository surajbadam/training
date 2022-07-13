package SurpriseQuestion1.ServiceImpl;
import SurpriseQuestion1.Exception.InvalidOperatorException;
import SurpriseQuestion1.Exception.StringErrorException;
public class Source {
    public String handleExcception(Activity a) throws StringErrorException, InvalidOperatorException{
        if(a.str1=="null"||a.str2=="null")
            throw new StringErrorException("null values found");
        if(a.operator.charAt(0)!='+'&&a.operator.charAt(0)!='-'){
            throw new InvalidOperatorException("not a valid operator");
        }
        else
            throw new StringErrorException("No Exception found");
    }
    public String doOperation(Activity a) throws StringErrorException{
        switch(a.operator.charAt(0)){
            case '+':return a.str1+a.str2;
            case '-':if(a.str1.length()>a.str2.length())
                    {
                    int index=a.str1.indexOf(a.str2);
                    if(index==-1)
                        throw new StringErrorException("Substring is not present");
                    return a.str1.replace(a.str2,"");
                    }
                    else
                    {
                        int index=a.str2.indexOf(a.str1);
                        if(index==-1)
                            throw new StringErrorException("Substring not present");
                        return a.str2.replace(a.str1, "");
                    }                        
            default: throw new StringErrorException("Invalid Operator");

        }
        
        
    }
}
