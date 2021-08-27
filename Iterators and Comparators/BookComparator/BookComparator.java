package src.Iterators.BookComparator;
import java.util.Comparator;
    public class BookComparator implements Comparator<Book> {


        @Override
        public int compare(Book first, Book second) {
            if (first.getTitle().compareTo(second.getTitle())>0) {
                return 1;
            }
            if (first.getTitle().compareTo(second.getTitle())<0) {
                return -1;
            }
            return first.getYear()-second.getYear();
        }
    }



