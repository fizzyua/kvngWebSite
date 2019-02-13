package app.service.member;

import app.entity.Member;
import app.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberRepository memberRepository;


    @Override
    public boolean addMember(Member member) {
        if (member != null && memberRepository.findOne(member.getId()) != null) return false;
        memberRepository.save(member);
        return true;
    }

    @Override
    public List<Member> getPagingListOfMember(Pageable pageable) {
        return memberRepository.findAll(pageable).getContent();
    }
}
