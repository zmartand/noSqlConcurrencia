package io.bootify.no_sql_concurrencia.repos;

import io.bootify.no_sql_concurrencia.domain.Libro;
import io.bootify.no_sql_concurrencia.service.PrimarySequenceService;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;


@Component
public class LibroListener extends AbstractMongoEventListener<Libro> {

    private final PrimarySequenceService primarySequenceService;

    public LibroListener(final PrimarySequenceService primarySequenceService) {
        this.primarySequenceService = primarySequenceService;
    }

    @Override
    public void onBeforeConvert(final BeforeConvertEvent<Libro> event) {
        if (event.getSource().getId() == null) {
            event.getSource().setId(primarySequenceService.getNextValue());
        }
    }

}
