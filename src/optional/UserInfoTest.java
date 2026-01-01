package optional;

import java.util.ArrayList;
import java.util.Optional;

public class UserInfoTest {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo(12345, "Noel"));
        userInfos.add(new UserInfo(12346, "Liam"));
        userInfos.add(new UserInfo(12347, "Andy"));

        UserInfo userInfo = getUserInfoById(1245, userInfos); // 없는 회원을 찾을 시 NPE 발생
        if(userInfo != null){ // 이게 최선? -> Optional을 써보자
            System.out.println(userInfo.getName());
        }
    }

    // Optional
    public static Optional<UserInfo> getUserInfoByIdOptional(int id, ArrayList<UserInfo> list){
        for(UserInfo userInfo : list){
            if(id == userInfo.getId())
                return Optional.of(userInfo);
        }
        return Optional.empty();
    }

    public static UserInfo getUserInfoById(int id, ArrayList<UserInfo> list){
        for(UserInfo userInfo : list){
            if(id == userInfo.getId()) return userInfo;
        }
        return null;
    }
}
