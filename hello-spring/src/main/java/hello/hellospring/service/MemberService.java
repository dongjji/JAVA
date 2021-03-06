package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemoryMemberRepository memberRepository;

    @Autowired
    public MemberService(MemoryMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
    회원가입
     */
    public Long join(Member member) {
        validateDuplicateMember(member);

        this.memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        this.memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /*
    * 전체 회원 조회
    * */
    public List<Member> findMembers() {
        return this.memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return this.memberRepository.findById(memberId);
    }

    public void clearStore() {
        this.memberRepository.clearStore();
    }
}
