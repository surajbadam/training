package Elibrary_Mgmnt_System.Elibrary_model;
public class BookIssue {
    public int ISBN;
    public String bookname;
    public String date;
    public BookIssue(int ISBN,String bookname,String date){
        this.ISBN=ISBN;
        this.bookname=bookname;
        this.date=date;
    }
    
}
