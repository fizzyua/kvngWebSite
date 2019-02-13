package app.service.member;


import app.entity.Member;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MemberService {
    boolean addMember(Member member);
    List<Member> getPagingListOfMember(Pageable pageable);
}
