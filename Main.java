
import java.util.Scanner;

public class Main {

  public static BookLibrary bookLibrary = new BookLibrary();

  public static void main(String[] args) {

    // while loop with options
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    while(loop){
      createMenu();
      int option = scanner.nextInt(); // Read the user's choice
      scanner.nextLine(); // Consume newline
      if (option == 1) {
        createBook(scanner); // Pass the Scanner to the method
      } else if (option == 2) {
        removeBook(scanner); // Pass the Scanner to the method
      } else if (option == 3) {
        showAllBooks();
      } else if (option == 4) {
        loop = false;
        System.out.println("That's all. Thanks!");
      } else {
        System.out.println("Invalid option. Please try again.");
      }
    }
        scanner.close();
  }

  public static void createMenu(){
    System.out.println("Here you can add a book. Make a choice: ");
    System.out.println("Write 1 to add a Book");
    System.out.println("Write 2 to remove a Book");
    System.out.println("Write 3 to show the list of books");
    System.out.println("Write 4 to EXIT.");
    System.out.print("Choose an option: ");
  }

  public static void createBook(Scanner scanner){
  System.out.println("Enter a name of the book you wish to add to the list: "); 
  var title = scanner.nextLine();

  var book = new Book(title); 
  bookLibrary.addBook(book);
  System.out.println("Book added: " + title);

  }  

  
  public static void removeBook(Scanner scanner){
  System.out.println("Enter a name of the book you wish to remove from the list: ");

  var title = scanner.nextLine(); 

  var book = new Book(title);
  bookLibrary.removeBook(book); 
    System.out.println("Book removed: " + title);
  // ad if else - could be added to improve the code
  
  }

  public static void showAllBooks(){
    var books = bookLibrary.getBooks();
   for (var book : books) {
    System.out.println(book.title);
    }
  }
}

// add user interface/print/check for valid options - could also be added to improve the code. 
