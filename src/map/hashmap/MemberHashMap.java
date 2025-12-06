package map.hashmap;

import collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(), member); // key-value
    }

    public boolean removeMember(int memberId){
        if(hashMap.containsKey(memberId)){ // HashMap에 매개변수로 받은 key 값인 회원아이디가 있다면
            hashMap.remove(memberId); // 해당 회원 삭제
            return true;
        }
        System.out.println(memberId+"가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator(); // key값 모아둠
        while(ir.hasNext()){ // 다음 key 값이 있으면
            int key = ir.next();
            Member member = hashMap.get(key); // 해당 key에 맞는 value 꺼냄, Member 객체로 저장
            System.out.println(member);
        }
        System.out.println();
    }
}
