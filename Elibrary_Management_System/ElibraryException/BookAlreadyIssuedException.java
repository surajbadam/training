package Elibrary_Mgmnt_System.ElibraryException;

public class BookAlreadyIssuedException extends Exception{
    public BookAlreadyIssuedException(String msg){
        super(msg);
    }
}
