package com.backend.pruebaclinicaOdontologica.service;

import com.backend.pruebaclinicaOdontologica.dto.entrada.modificacion.PacienteModificacionEntradaDto;
import com.backend.pruebaclinicaOdontologica.dto.entrada.paciente.PacienteEntradaDto;
import com.backend.pruebaclinicaOdontologica.dto.salida.paciente.PacienteSalidaDto;
import com.backend.pruebaclinicaOdontologica.exception.ResourceNotFoundException;


import java.util.List;

public interface IPacienteService
{
    List<PacienteSalidaDto> listarPacientes();

    PacienteSalidaDto registrarPaciente(PacienteEntradaDto paciente);

    PacienteSalidaDto buscarPacientePorId(Long id);

    void eliminarPaciente(Long id) throws ResourceNotFoundException;

    PacienteSalidaDto modificarPaciente(PacienteModificacionEntradaDto pacienteModificado) throws ResourceNotFoundException;

}
