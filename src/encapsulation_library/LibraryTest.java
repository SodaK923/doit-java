package encapsulation_library;

public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book("해리포터");
        Library library = new Library(book);
        Member member = new Member("소다", 0);
//        member.borrowBook(library, "해리포터");

        System.out.println(book.getAvailable());

        /*Phone phone = new Phone("아이폰", 1000000);
        PhoneStore store = new PhoneStore(phone);
        Customer customer = new Customer("김유영", 1000000);
        customer.buyPhone(store);*/
    }
}
