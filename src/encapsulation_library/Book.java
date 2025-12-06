package encapsulation_library;

public class Book {
    private String title;
    private boolean available;

    public Book(String title){
        this.title = title;
        this.available = true;
    }

    public String getTitle(){
        return title;
    }

    public boolean getAvailable(){
        return available;
    }

    public void rent(){
        this.available = false;
    }

    private void returnBook(){
        this.available = true;
    }
}
