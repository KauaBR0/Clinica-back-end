package com.api.consultorio.dtos;

import com.api.consultorio.entities.paciente.Paciente;

public record PacienteListDTO(

        Long id,
        String nome,
        String email,
        String cpf,
        Boolean ativo
) {
    public PacienteListDTO(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(),paciente.getAtivo());
    }
}
