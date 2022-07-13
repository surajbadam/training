package SurpriseQuestion1;
import java.util.Scanner;

import SurpriseQuestion1.Exception.InvalidOperatorException;
import SurpriseQuestion1.Exception.StringErrorException;
import SurpriseQuestion1.ServiceImpl.Activity;
import SurpriseQuestion1.ServiceImpl.Source;

public class MainUtility {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String operator=sc.nextLine();
        Activity a=new Activity(str1, str2, operator);
        Source s=new Source();
        try {
            System.out.println(s.handleExcception(a));
        } catch (StringErrorException e) {
            System.out.println(e.getMessage());
        }
        catch(InvalidOperatorException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(s.doOperation(a));
        } catch (StringErrorException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
