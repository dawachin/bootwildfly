package bootwildfly.model.repository;

import bootwildfly.model.entity.EventEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EventRepository extends MongoRepository<EventEntity, String> {

    Optional<EventEntity> findEventEntityById(String eventId);

}
