package Elibrary_Mgmnt_System.Elibrary_model;

public class Book {
    public String bookname;
    public String author;
    public String publisher;
    public int quantity;
    public int pages;
    public int ISBN;
    public Book(String bookname,String author,String publisher,int quantity,int pages,int ISBN){
        this.bookname=bookname;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
        this.pages=pages;
        this.ISBN=ISBN;
    }
    
}