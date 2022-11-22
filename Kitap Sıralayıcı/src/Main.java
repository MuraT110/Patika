import java.util.TreeSet;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        TreeSet<book> sortBook1 = new TreeSet<>();

        book book1 = new book("Yüzüklerin Efendisi", 75, "J. R. R. Tolkien", 1955);
        book book2 = new book("Hobbit", 76, "J. R. R. Tolkien", 1937);
        book book3 = new book("Yorgun Savaşçı", 77, "Kemal TahiR", 1965);
        book book4 = new book("Suç ve Ceza", 78, "Fyodor Dostoyevski", 1866);

        sortBook1.add(book1);
        sortBook1.add(book2);
        sortBook1.add(book3);
        sortBook1.add(book4);


        for (book bookName : sortBook1) {
            System.out.println("Book Name: " + bookName.getBookName() +
                    "\nPage Number: " + bookName.getPageNumber() +
                    "\nAuthor Name: " + bookName.getAuthorName() +
                    "\nDate: " + bookName.getDate());
            System.out.println("------------------------------------------------");
        }

        System.out.println("=====================================================");

        TreeSet<book> sortBook2 = new TreeSet<>(new Comparator<book>() {
            @Override
            public int compare(book o1, book o2) {
                if (o1.getPageNumber() == o2.getPageNumber()) {
                    return o1.getBookName().compareTo(o2.getBookName());
                }
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        sortBook2.add(book1);
        sortBook2.add(book2);
        sortBook2.add(book3);
        sortBook2.add(book4);

        for (book pageNum : sortBook2) {
            System.out.println("Book Name: " + pageNum.getBookName() +
                    "\nPage Number: " + pageNum.getPageNumber() +
                    "\nAuthor Name: " + pageNum.getAuthorName() +
                    "\nDate: " + pageNum.getDate());
            System.out.println("------------------------------------------------");
        }
    }
}