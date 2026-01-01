package optional;

import java.util.ArrayList;
import java.util.Optional;

public class UserInfoTestUsingOptional {
    public static void main(String[] args) {
        ArrayList<UserInfo> userInfos = new ArrayList<>();

        userInfos.add(new UserInfo(12345, "Noel"));
        userInfos.add(new UserInfo(12346, "Liam"));
        userInfos.add(new UserInfo(12347, "Andy"));

        usingOptional(userInfos);
    }

    private static void usingOptional(ArrayList<UserInfo> list) {

        // ArrayList 에서 아이디로 사용자를 찾아옴. 반환값이 Optional 클래스
        Optional<UserInfo> userInfoOptional = getUserInfoByIdOptional(12349, list);

        // ifPresent() 메서드를 사용하여 값이 존재하는 경우에만 출력
        userInfoOptional.ifPresent(userInfo -> System.out.println("User name found: " + userInfo.getName()));

        // isPresent() 메서드를 사용하여 조건문 처리
        if(userInfoOptional.isPresent()){
            System.out.println("User name found: " + userInfoOptional // Optional<UserInfo> 타입
                    .get() // UserInfo 객체를 꺼내야
                    .getName()); // getName() 메서드 실행 가능
        }else{
            System.out.println("User not found");
        }
        // 실무 방식
//        userInfoOptional.map(UserInfo::getName)
//                .ifPresentOrElse(name -> System.out.println("User name found: " + name),
//                () -> System.out.println("User not found"));


        // orElse(): 값을 바로 전달, orElseGet(): 람다식을 전달
        // orElse() 메서드를 사용하여 값이 없는 경우 기본값을 생성(값이 있어도 무조건 실행됨)
        // 1. new가 먼저 실행됨
        // 2. 그 다음 Optional 안에 값이 있으면 그 값을 쓰고, 없으면 만든 객체를 씀
        UserInfo nameOrDefault = userInfoOptional.orElse(new UserInfo(00000, "Guest"));
        System.out.println("User name: " + nameOrDefault.getName());

        // orElseGet() 메서드를 사용하여 기본값을 람다식 처리(Optional에 값이 없을 때만 실행이 됨)
        UserInfo nameOrComputed = userInfoOptional.orElseGet(() -> generateDefaultUserInfo());
        // UserInfoTestUsingOptional::generateDefaultUserInfo -> orElseGet + ClassName::method(static 메서드이기 때문에 가능)
        System.out.println("UserName: " + nameOrComputed.getName());

        // orElseThrow() 메서드를 사용하여 값이 없을 때 예외 처리
        try{
            UserInfo userNotFound = userInfoOptional.orElseThrow(() -> new IllegalStateException("User not found!!"));
            System.out.println("User name: " + userNotFound.getName()); // 여기선 무슨 이름이 나오는겨?
        }catch(IllegalStateException e){
            System.err.println(e.getMessage());
        }
    }

    private static UserInfo generateDefaultUserInfo() {
        return new UserInfo(00000, "Guest");
    }

    public static Optional<UserInfo> getUserInfoByIdOptional(int id, ArrayList<UserInfo> list){
        for(UserInfo userInfo : list){
            if(id == userInfo.getId())
                return Optional.of(userInfo);
        }
        return Optional.empty();
    }
}
