package encapsulation_library;

public class Library {
    private Book book;

    public Library(Book book){
        this.book = book;
    }

    public Book lendBook(String title){
        if(title.equals(book.getTitle()) && book.getAvailable()){
            checkMembership();
            recordLoan();
            printReceipt();
            book.rent();
            return book;
        }else{
            return null;
        }
    }

    private void printReceipt() {
        System.out.println("도서관: 대여증 출력");
    }

    private void recordLoan() {
        System.out.println("도서관: 대여 기록 저장");
    }

    private void checkMembership() {
        System.out.println("도서관: 회원 확인 완료");
    }
}
