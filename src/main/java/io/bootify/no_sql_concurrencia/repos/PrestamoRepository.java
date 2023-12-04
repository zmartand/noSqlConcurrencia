package io.bootify.no_sql_concurrencia.repos;

import io.bootify.no_sql_concurrencia.domain.Prestamo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PrestamoRepository extends MongoRepository<Prestamo, Long> {
}
