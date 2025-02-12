package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }

    public List listBooks() {
        return books;
    }

    public String getBook(int index){
        return books.get(index);
    }

    public int size(){
        return books.size();
    }
}



