package com.sistemaeducativo.controller;

import com.sistemaeducativo.model.TramiteAdministrativo;
import com.sistemaeducativo.service.TramiteAdministrativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tramites")
public class TramiteAdministrativoController {

    @Autowired
    private TramiteAdministrativoService tramiteService;

    @GetMapping("/estudiante/{idEstudiante}")
    public List<TramiteAdministrativo> obtenerTramitesPorEstudiante(@PathVariable String idEstudiante) {
        return tramiteService.obtenerTramitesPorEstudiante(idEstudiante);
    }

    @PostMapping
    public TramiteAdministrativo registrarTramite(@RequestBody TramiteAdministrativo tramite) {
        return tramiteService.registrarTramite(tramite);
    }

    @PutMapping
    public TramiteAdministrativo actualizarTramite(@RequestBody TramiteAdministrativo tramite) {
        return tramiteService.actualizarTramite(tramite);
    }

    @DeleteMapping("/{id}")
    public void eliminarTramite(@PathVariable String id) {
        tramiteService.eliminarTramite(id);
    }
}
