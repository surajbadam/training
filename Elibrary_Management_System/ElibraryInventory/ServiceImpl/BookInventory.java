package Elibrary_Mgmnt_System.ElibraryInventory.ServiceImpl;
import java.util.List;
import java.util.Scanner;

import Elibrary_Mgmnt_System.Elibrary_model.Book;
import Elibrary_Mgmnt_System.Elibrary_model.BookIssue;
import Elibrary_Mgmnt_System.ElibraryException.*;
import Elibrary_Mgmnt_System.ElibraryInventory.InventoryInterface;;

public class BookInventory implements InventoryInterface{
    Scanner sc=new Scanner(System.in);
    public void showBooks(List<Book> al) {
        System.out.println("Name:\t Author\t Publisher\t Quantity \t Pages\t ISBN");
        for (Book book : al) {
            System.out.println(book.bookname+"  "+book.author+"  "+book.publisher+
                                "  "+book.quantity+"\t"+book.pages+"\t"+book.ISBN);
        }

    }
    public void addBook(List<Book> al,List<Book> totalBooks,int n) throws ISBNAlreadyExistsException{
        while(n-->0)
        {
            
            System.out.println("Enter Book Name:");
            String name=sc.nextLine();
            System.out.println("Enter author name:");
            String author=sc.nextLine();
            System.out.println("Enter the name of publisher:");
            String publisher=sc.nextLine(); 
            System.out.println("Enter the total no. of units:");
            int quantity=sc.nextInt();
            System.out.println("Enter total number of pages:");
            int pages=sc.nextInt(); 
            System.out.println("Enter ISBN number:");
            int isbn=sc.nextInt();
            for (Book book : al) {
                if(book.ISBN==isbn){
                    throw new ISBNAlreadyExistsException("Book is already present with specified ISBN");
                }
            }
            sc.nextLine();
            al.add(new Book(name, author, publisher, quantity, pages, isbn));
            totalBooks.add(new Book(name, author, publisher, quantity, pages, isbn));
        }
    }
    public void issueBook(List<Book> al,List<BookIssue> issued) throws BookAlreadyIssuedException, ISBNDoesNotExistsException{
        System.out.println("Enter ISBN of the book to be issued:");
        int isbn=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the date of the book that is issued:");
        String date=sc.nextLine();
        int flag=check(isbn,al);
        if(flag!=-1){
            String bookname=al.get(flag).bookname;
            al.get(flag).quantity--;
            issued.add(new BookIssue(isbn, bookname, date));
        }
        else
            return;
    }
    private int check(int isbn, List<Book> al) throws BookAlreadyIssuedException, ISBNDoesNotExistsException {
        for (int i=0;i<al.size();i++) {
            if(isbn==al.get(i).ISBN)
            {
                if(al.get(i).quantity>0)
                {
                    return i;
                }
                else
                    throw new BookAlreadyIssuedException("Book with specified ISBN have already issued");
                
            }
        }
        throw new ISBNDoesNotExistsException("Book with specified ISBN does not exists");
    }

    public List<Book> remainingBooks(List<Book> al,List<BookIssue> issued){
        return al;
    }
    public Book searchBook(List<Book> al) throws ISBNDoesNotExistsException{
        System.out.println("Enter the ISBN of the book to be searched:");
        int isbn=sc.nextInt();
        for (Book book : al) {
            if(book.ISBN==isbn)
                return book;
        }
        throw new ISBNDoesNotExistsException("Book with given ISBN does not exists");
    }
    public void showOptions() {
        System.out.println("1.Add Books:");
        System.out.println("2.Show Books:");
        System.out.println("3.Issue Book:");
        System.out.println("4.Display Remaining Books:");
        System.out.println("5.Search a Book:");
        System.out.println("6.exit");
    }
    public void issueDisplay(List<BookIssue> issued) {
        for (BookIssue bookIssue : issued) {
            System.out.println("Name:"+bookIssue.bookname);
            System.out.println("ISBN:"+bookIssue.ISBN);
            System.out.println("Date:"+bookIssue.date);
        }
    }
    
}
