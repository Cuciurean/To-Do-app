package net.codejava.View;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.codejava.Model.Upcoming;

public interface UpcomingRepository extends JpaRepository<Upcoming, Long> {
	

}
