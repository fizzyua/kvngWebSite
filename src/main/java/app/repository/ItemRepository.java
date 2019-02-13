package app.repository;

import app.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;

public interface ItemRepository extends  JpaRepository<Item, Long> {
    /*
        @Query("SELECT u FROM CustomUser u where u.login = :login")
    CustomUser findByLogin(@Param("login") String login);
    */
   List<Item> findAllByTitleContainingOrTextContainingOrArticleContaining(org.springframework.data.domain.Pageable pageable, String title, String text, String article);
}
