package hello.hellospring.ServiceTest;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;

public class MemberServiceTest {

    MemberService m = new MemberService();

    void join(){
        Member member = new Member();
        member.setName("hello");

        Long saveId = m.join(member);

    }
}
