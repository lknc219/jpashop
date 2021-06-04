package jpabook.jpashop;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext // 엔티티매니저를 스프링부트에서 주입해준다.
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        return member.getId();//커맨드랑 쿼리를 분리해서 리턴값을 안만드는데 아이디정도는 조회되게 설계한다.
    }

    public Member find(Long id){
        return em.find(Member.class,id);
    }

}
