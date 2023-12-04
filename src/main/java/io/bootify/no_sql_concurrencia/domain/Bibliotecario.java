package io.bootify.no_sql_concurrencia.domain;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("bibliotecarios")
@Getter
@Setter
public class Bibliotecario extends Biblioteca {

    @NotNull
    @Size(max = 255)
    private String nombre;

    @NotNull
    @Size(max = 255)
    private String apellido;

    @NotNull
    @Size(max = 255)
    private String zona;

    @NotNull
    @Size(max = 255)
    private String numEmpleado;

}
