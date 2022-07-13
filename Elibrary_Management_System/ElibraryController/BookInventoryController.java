package Elibrary_Mgmnt_System.ElibraryController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Elibrary_Mgmnt_System.Elibrary_model.*;
import Elibrary_Mgmnt_System.ElibraryException.BookAlreadyIssuedException;
import Elibrary_Mgmnt_System.ElibraryException.ISBNAlreadyExistsException;
import Elibrary_Mgmnt_System.ElibraryException.ISBNDoesNotExistsException;
import Elibrary_Mgmnt_System.ElibraryInventory.ServiceImpl.BookInventory;
public class BookInventoryController {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //List<Book> issued=new ArrayList<>();
        List<BookIssue> issued=new ArrayList<>();
        System.out.println("Enter the total number of books:");
        int n=sc.nextInt();
        BookInventory bi=new BookInventory();
        char ch=' ';
        List<Book> al=new ArrayList<>();
        List<Book> totalBooks=new ArrayList<>();
        do{
            System.out.println("Welcome to E-Library Management System");
            
            bi.showOptions();
            System.out.println("Choose the option:");
            int choose=sc.nextInt();
            
            switch(choose){
                case 1:try {
                            bi.addBook(al,totalBooks,n);
                        } catch (ISBNAlreadyExistsException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                case 2:bi.showBooks(totalBooks);
                        break;
                case 3:try {
                            bi.issueBook(al,issued);
                            bi.issueDisplay(issued);
                        } catch (ISBNDoesNotExistsException e) {
                            System.out.println(e.getMessage());
                        }
                        catch(BookAlreadyIssuedException e){
                            System.out.println(e.getMessage());
                        }
                        break;
                case 4:List<Book> rList=bi.remainingBooks(al, issued);
                System.out.println("Name\t Author\t Publisher\t Quantity \t Pages\t ISBN");
                        for (Book book : rList) {
                            
                            System.out.println(book.bookname+"  "+book.author+"  "+book.publisher+
                                                "  "+book.quantity+"\t"+book.pages+"\t"+book.ISBN);
                        }
                        break;
                case 5:try {
                            Book b=bi.searchBook(al);
                            System.out.println(b.bookname+" "+b.author+" "+b.publisher+
                            " "+b.quantity+" "+b.pages+" "+b.ISBN);
                        } catch (ISBNDoesNotExistsException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                case 6:
                default:
                    System.out.println("Do you want to continue: y/n");
                    ch=sc.next().charAt(0);
                    break;
            }
        }while(ch!='n');
        sc.close();
    }
    
}
