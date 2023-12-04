package io.bootify.no_sql_concurrencia.repos;

import io.bootify.no_sql_concurrencia.domain.Prestamo;
import io.bootify.no_sql_concurrencia.service.PrimarySequenceService;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;


@Component
public class PrestamoListener extends AbstractMongoEventListener<Prestamo> {

    private final PrimarySequenceService primarySequenceService;

    public PrestamoListener(final PrimarySequenceService primarySequenceService) {
        this.primarySequenceService = primarySequenceService;
    }

    @Override
    public void onBeforeConvert(final BeforeConvertEvent<Prestamo> event) {
        if (event.getSource().getId() == null) {
            event.getSource().setId(primarySequenceService.getNextValue());
        }
    }

}
