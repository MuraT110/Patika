import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> bookList =new ArrayList<>();


        bookList.add(new Book("Hobbit", 565, "J.R.R Tolkien", 1940));
        bookList.add(new Book("Denizler altinda yirmi bin fersah", 55, "Jules Verne", 1925));
        bookList.add(new Book("Suc ve Ceza", 612, "Dostoyevski", 1925));
        bookList.add(new Book("Tutunamayanlar", 550, "Oğuz Atay", 1950));

        Map<String,String> bookMap=new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getBookName(), book.getAuthorName()));
        for (String s : bookMap.keySet()){
            System.out.println("Book Name: "+s+"\nAuthorName: "+bookMap.get(s));
        }
        System.out.println("---------------------------");
        List<Book> listBook = bookList.stream().filter(book->book.getPageNumber()>100).collect(Collectors.toList());
        listBook.stream().forEach(b->System.out.println("Kitap Adi : "+b.getBookName()+" | " +
                "Sayfa Sayisi : "+ b.getPageNumber() + " | " +
                "Yazar : "+ b.getAuthorName()+ " | " +
                "Yayin Tarihi : "+ b.getReleaseDate()));

    }
}