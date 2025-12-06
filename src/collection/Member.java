package collection;

import java.util.Objects;

public class Member implements Comparable<Member> {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Member){
//            Member member = (Member) obj;
//            if(this.memberId == member.memberId){
//                return true;
//            }else{
//                return false;
//            }
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || this.getClass() != obj.getClass()) return false;
        Member member = (Member) obj;
        return this.memberId == member.memberId;
    }

    @Override
    public int compareTo(Member member) {
        return this.memberId-member.memberId; // 새로 추가한 회원아이디 -
    }
}
