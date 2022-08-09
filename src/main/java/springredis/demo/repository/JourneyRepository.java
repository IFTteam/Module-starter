package springredis.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springredis.demo.entity.Journey;
import springredis.demo.entity.Node;

public interface JourneyRepository extends JpaRepository<Journey, Long> {
}
