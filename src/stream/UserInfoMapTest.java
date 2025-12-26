package stream;

import java.util.ArrayList;
import java.util.List;

class UserInfo{
    private String name;
    private int age;

    public UserInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

public class UserInfoMapTest {
    public static void main(String[] args) {
        UserInfo userKim = new UserInfo("김영희", 30);
        UserInfo userLee = new UserInfo("이철수", 40);
        UserInfo userSong = new UserInfo("송영수", 55);

        List<UserInfo> userInfoList = new ArrayList<>();
        userInfoList.add(userKim);
        userInfoList.add(userLee);
        userInfoList.add(userSong);

        // filter와 map 연산으로 40세 이상인 사용자의 이름 추출
        userInfoList.stream()
                .filter(user -> user.getAge()>=40)
                .map(UserInfo::getName) // .map(user -> user.getName())
                .forEach(s -> System.out.println(s)); // String.out::println 일케 써도 됨


        /* 스트림 파이프라인
        Stream<UserInfo>
            ↓ filter (조건)
        Stream<UserInfo>
            ↓ map (변환)
        Stream<String>
            ↓forEach (소비)
         */
    }

}
