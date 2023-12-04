package io.bootify.no_sql_concurrencia.model;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PrestamoDTO {

    private Long id;

    @NotNull
    private LocalDate fechaInicio;

    @NotNull
    private LocalDate fechaDevolucion;

}
