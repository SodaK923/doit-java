package singleton_prc;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection;
    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(databaseConnection==null){
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

    public void connect(){
        System.out.println("DB 연결됨");
    }

    public void disconnect(){
        System.out.println("DB 연결 해제됨");
    }
}
