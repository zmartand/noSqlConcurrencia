package io.bootify.no_sql_concurrencia.repos;

import io.bootify.no_sql_concurrencia.domain.Bibliotecario;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BibliotecarioRepository extends MongoRepository<Bibliotecario, Long> {
}
