package io.bootify.no_sql_concurrencia.repos;

import io.bootify.no_sql_concurrencia.domain.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface LibroRepository extends MongoRepository<Libro, Long> {
}
