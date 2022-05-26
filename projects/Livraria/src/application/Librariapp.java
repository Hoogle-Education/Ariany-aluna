package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Book;
import utilities.BookManager;

public class Librariapp {

    public static List<Book> books = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
       
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        Date release = sdf.parse("06/1990");

        books.add( new Book("Fleabag", "Stan lee", release, 22.0) );
        books.add( new Book("Titanic", "Leonardo DiCaprio", release, 20.0) );
        books.add( new Book("Titanic 2",
                        "Quentin Tarantino",
                        release,
                        25.0,
                        "Um navio bate num iceberg") );

        BookManager manager = new BookManager();

        // Book founded;
        // if( (founded = manager.searchByAuthor("Titanic 2")) != null ){
        //     System.out.println("#### FOUNDED #####");
        //     System.out.println(founded);
        // } else {
        //     System.out.println("Not founded ...");
        // }

        Date old = sdf.parse("07/1990");
        manager.remove(old);
        for(Book book : books){
            System.out.println(book);
        }
        
    }
}
