package com.sistemaeducativo.service;

import com.sistemaeducativo.model.TramiteAdministrativo;
import com.sistemaeducativo.repository.TramiteAdministrativoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TramiteAdministrativoService {
    @Autowired
    private TramiteAdministrativoRepository tramiteAdministrativoRepository;

    public List<TramiteAdministrativo> obtenerTramitesPorEstudiante(String idEstudiante) {
        return tramiteAdministrativoRepository.findByEstudiante(idEstudiante);
    }

    public TramiteAdministrativo registrarTramite(TramiteAdministrativo tramite) {
        tramite.setFechaSolicitud(new java.util.Date());
        return tramiteAdministrativoRepository.save(tramite);
    }

    public TramiteAdministrativo actualizarTramite(TramiteAdministrativo tramite) {
        return tramiteAdministrativoRepository.save(tramite);
    }

    public void eliminarTramite(String id) {
        tramiteAdministrativoRepository.deleteById(id);
    }
}
