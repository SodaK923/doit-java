package encapsulation_library;

public class Member {
    private String name;
    private int lateFee;

    public Member(String name, int lateFee){
        this.name = name;
        this.lateFee = lateFee;
    }

    public void borrowBook(Library library, String title){
        if(lateFee > 0){
            System.out.println("연체료를 먼저 납부하세요.");
            return;
        }

        Book book = library.lendBook(title);
        if(book!=null){
            System.out.println("회원: 책 대여 완료");
        }else{
            System.out.println("회원: 책 대여 실패");
        }
    }


}
