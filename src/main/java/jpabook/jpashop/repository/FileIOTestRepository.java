package jpabook.jpashop.repository;

import jpabook.jpashop.domain.FileIOTest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class FileIOTestRepository {

    private final EntityManager em;

    @Transactional
    public void save(FileIOTest fileIOTest) {
        em.persist(fileIOTest);
    }

}
