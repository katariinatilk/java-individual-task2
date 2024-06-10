import java.util.ArrayList;

public class BookLibrary {

private ArrayList<Book> books = new ArrayList<Book>();

public void addBook(Book book){
  books.add(book);
}

public void removeBook(Book book){
  books.remove(book);
}

public ArrayList<Book> getBooks(){
  return books; 
  }
}


// sorting?
// checking dups
