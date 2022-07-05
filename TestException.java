import java.util.Scanner;

class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);

    }
}
public class TestException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try {
            if(age<=0)
            {
                throw new CustomException("Invalid age");
            }
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
    
}