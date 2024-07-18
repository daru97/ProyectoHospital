package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.models.Paciente;
import com.demo.repositories.PacienteRepository;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository;

	public List<Paciente> listarPacientes() {
		return pacienteRepository.findAll();
	}

	public Paciente guardarPaciente(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}

	public Paciente obtenerPacientePorId(Long id) {
		return pacienteRepository.findById(id).orElse(null);
	}
	
	public void eliminarPaciente(Long id) {
		pacienteRepository.deleteById(id);
	}

}
