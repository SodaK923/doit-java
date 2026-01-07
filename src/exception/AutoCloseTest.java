package exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();
        try(obj){
            throw new Exception(); // 강제 예외 발생
        } catch (Exception e){
            System.out.println("예외 부분");
        }
    }
}
