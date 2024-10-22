package com.sistemaeducativo.repository;

import com.sistemaeducativo.model.TramiteAdministrativo;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TramiteAdministrativoRepository extends MongoRepository<TramiteAdministrativo, String> {
    List<TramiteAdministrativo> findByEstudiante(String estudiante);
}
