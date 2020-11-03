package org.scu_db.demo.Repository;

import org.scu_db.demo.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitleRepository extends JpaRepository<Title, String> {
    List<Title>findAll();
    @Query(value = "select* from title where name in (select name from title where name=\'lliad\' or name=\'Odyssey\')",nativeQuery = true)
    List<Title> Request2();

}
