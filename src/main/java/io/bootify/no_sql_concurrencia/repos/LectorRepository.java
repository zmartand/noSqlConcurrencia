package io.bootify.no_sql_concurrencia.repos;

import io.bootify.no_sql_concurrencia.domain.Lector;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LectorRepository extends MongoRepository<Lector, Long> {
}
