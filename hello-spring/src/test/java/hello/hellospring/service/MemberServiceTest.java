package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void 회원가입_테스트() {
        // given
        Member member = new Member();
        member.setName("Hello");

        // when
        Long saveId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복_회원_예외_테스트() {
        // given
        Member member1 = new Member();
        member1.setName("spring");

        // when
        Member member2 = new Member();
        member2.setName("spring");

        // then
        Long saveId1 = memberService.join(member1);
        IllegalStateException err = assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        assertThat(err.getMessage()).isEqualTo("이미 존재하는 회원입니다.");

        /*try {
            Long saveId2 = memberService.join(member2);
            fail("중복된 이름은 회원가입이 불가능해야 합니다.");
        } catch (IllegalStateException e) {
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        }*/
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}