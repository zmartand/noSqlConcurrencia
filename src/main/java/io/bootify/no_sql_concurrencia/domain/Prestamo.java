package io.bootify.no_sql_concurrencia.domain;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("prestamoes")
@Getter
@Setter
public class Prestamo extends Biblioteca {

    @NotNull
    private LocalDate fechaInicio;

    @NotNull
    private LocalDate fechaDevolucion;

}
