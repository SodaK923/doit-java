package chap14_quiz;

public class PasswordTest {
    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) throws PasswordException{
        if(password == null){
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        }else if(password.matches("[a-zA-z]+")){
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
        }else if(password.length() < 5){
            throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
        }
        this.password = password;
    }

    public static void main(String[] args) {
        PasswordTest test = new PasswordTest();

        String password = null;
        try{
            test.setPassword(password);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        password = "passss";
        try{
            test.setPassword(password);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        password = "1234";
        try{
            test.setPassword(password);
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
