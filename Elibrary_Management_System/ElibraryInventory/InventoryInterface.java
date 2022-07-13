package Elibrary_Mgmnt_System.ElibraryInventory;

import java.util.List;

import Elibrary_Mgmnt_System.ElibraryException.BookAlreadyIssuedException;
import Elibrary_Mgmnt_System.ElibraryException.ISBNAlreadyExistsException;
import Elibrary_Mgmnt_System.ElibraryException.ISBNDoesNotExistsException;
import Elibrary_Mgmnt_System.Elibrary_model.Book;
import Elibrary_Mgmnt_System.Elibrary_model.BookIssue;

public interface InventoryInterface {
    public void showBooks(List<Book> al);
	public void addBook(List<Book> al,List<Book> totalBooks,int n) throws ISBNAlreadyExistsException;
	public void issueBook(List<Book> al,List<BookIssue> issued) throws BookAlreadyIssuedException, ISBNDoesNotExistsException;
	public List<Book> remainingBooks(List<Book> al,List<BookIssue> issued);
	public Book searchBook(List<Book> al) throws ISBNDoesNotExistsException;
}
