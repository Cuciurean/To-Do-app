package net.codejava.View;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.codejava.Model.Today;

public interface TodayRepository extends JpaRepository<Today, Long> {

	@Query(value = "SELECT t FROM Today t WHERE t.id LIKE '%' || :keyword || '%'"
            + " OR t.hour LIKE '%' || :keyword || '%'"
            + " OR t.todo LIKE '%' || :keyword || '%'")
    public List<Today> search(@Param("keyword") String keyword);
		
}
