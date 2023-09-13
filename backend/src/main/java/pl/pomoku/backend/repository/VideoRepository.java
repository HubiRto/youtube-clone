package pl.pomoku.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.pomoku.backend.model.Video;

public interface VideoRepository extends MongoRepository<Video, String> {
}
