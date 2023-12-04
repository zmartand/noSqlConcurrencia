package io.bootify.no_sql_concurrencia.service;

import io.bootify.no_sql_concurrencia.domain.Prestamo;
import io.bootify.no_sql_concurrencia.model.PrestamoDTO;
import io.bootify.no_sql_concurrencia.repos.PrestamoRepository;
import io.bootify.no_sql_concurrencia.util.NotFoundException;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class PrestamoService {

    private final PrestamoRepository prestamoRepository;

    public PrestamoService(final PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    public List<PrestamoDTO> findAll() {
        final List<Prestamo> prestamoes = prestamoRepository.findAll(Sort.by("id"));
        return prestamoes.stream()
                .map(prestamo -> mapToDTO(prestamo, new PrestamoDTO()))
                .toList();
    }

    public PrestamoDTO get(final Long id) {
        return prestamoRepository.findById(id)
                .map(prestamo -> mapToDTO(prestamo, new PrestamoDTO()))
                .orElseThrow(NotFoundException::new);
    }

    public Long create(final PrestamoDTO prestamoDTO) {
        final Prestamo prestamo = new Prestamo();
        mapToEntity(prestamoDTO, prestamo);
        return prestamoRepository.save(prestamo).getId();
    }

    public void update(final Long id, final PrestamoDTO prestamoDTO) {
        final Prestamo prestamo = prestamoRepository.findById(id)
                .orElseThrow(NotFoundException::new);
        mapToEntity(prestamoDTO, prestamo);
        prestamoRepository.save(prestamo);
    }

    public void delete(final Long id) {
        prestamoRepository.deleteById(id);
    }

    private PrestamoDTO mapToDTO(final Prestamo prestamo, final PrestamoDTO prestamoDTO) {
        prestamoDTO.setId(prestamo.getId());
        prestamoDTO.setFechaInicio(prestamo.getFechaInicio());
        prestamoDTO.setFechaDevolucion(prestamo.getFechaDevolucion());
        return prestamoDTO;
    }

    private Prestamo mapToEntity(final PrestamoDTO prestamoDTO, final Prestamo prestamo) {
        prestamo.setFechaInicio(prestamoDTO.getFechaInicio());
        prestamo.setFechaDevolucion(prestamoDTO.getFechaDevolucion());
        return prestamo;
    }

}
