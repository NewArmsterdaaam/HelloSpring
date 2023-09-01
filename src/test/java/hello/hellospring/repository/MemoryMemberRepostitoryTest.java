package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepostitoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }
    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        Assertions.assertEquals(member, result);
    }

    @Test
    public void findByName(){
        Member mem1 = new Member();
        mem1.setName("spring1");
        repository.save(mem1);

        Member mem2 = new Member();
        mem2.setName("spring2");
        repository.save(mem2);

        Member result = repository.findByName("spring1").get();
        Assertions.assertEquals(mem1, result);
    }
}
