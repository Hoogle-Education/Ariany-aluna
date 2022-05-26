package utilities;

import java.util.Date;

import application.Librariapp;
import entities.Book;

public class BookManager {
  
  public Book searchByAuthor(String title){

    int start = 0;
    int end = Librariapp.books.size() - 1;

    while(start <= end){
      int mid = (start + end) / 2;

      if(Librariapp.books.get(mid).getTitle().equalsIgnoreCase(title)){
        return Librariapp.books.get(mid);
      } else if(Librariapp.books.get(mid).getTitle().compareToIgnoreCase(title) > 0){
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return null;
  }

  public void remove(String title){
    Book toRemove = searchByAuthor(title);
    Librariapp.books.remove(toRemove);
  }

  public void remove(Date minDate){
    for(int i=0; i<Librariapp.books.size(); i++){
      if(Librariapp.books.get(i).getRelease().before(minDate)){
        Librariapp.books.remove(i);
        i--;
        System.out.println("removing");
      }
    }
  }

}
