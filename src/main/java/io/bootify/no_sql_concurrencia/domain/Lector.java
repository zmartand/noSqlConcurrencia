package io.bootify.no_sql_concurrencia.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("lectors")
@Getter
@Setter
public class Lector extends Biblioteca {

    @NotNull
    @Size(max = 255)
    private String nombre;

    @NotNull
    @Size(max = 255)
    private String apellido;

    @NotNull
    @Size(max = 255)
    private String libro;

    @NotNull
    @Size(max = 255)
    private String dni;

}
