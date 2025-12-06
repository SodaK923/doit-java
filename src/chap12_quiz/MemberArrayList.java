package chap12_quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

//    public boolean removeMember(int memberId){
//        for(int i=0; i<arrayList.size(); i++){
//            Member member = arrayList.get(i);
//            if(member.getMemberId()==memberId){
//                arrayList.remove(i);
//                return true;
//            }
//        }
//        System.out.println(memberId + "가 존재하지 않습니다.");
//        return false;
//    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir = arrayList.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                // arrayList.remove(member); // ir.remove()를 써야함
                ir.remove();
                return true;
            }
        }
        System.out.println(memberId+"가 존재하지 않습니다.");
        return false;
    }


    // Q8. 회원을 특정 위치에 추가하는 메서드
    public void insertMember(Member member, int index){
        if(index<0 || index>arrayList.size()+1){ // 1의 이유로 전체 크기에서 +1을 해줘야 함
            System.out.println("유효하지 않은 번호입니다.");
            return;
        }
        arrayList.add(index-1, member); // 1. 사용자 기준에서 1부터 시작하도록 함
    }


    public void showAllMember(){
        for(Member member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }

    public void sort(){
        Collections.sort(arrayList);
    }
}
