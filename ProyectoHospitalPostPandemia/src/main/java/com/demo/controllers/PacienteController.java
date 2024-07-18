package com.demo.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.demo.models.Paciente;
import com.demo.services.PacienteService;

@Controller
@RequestMapping("/")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping 
	public String inicio() {
		return "inicio";
	}
	
	  @GetMapping ("/pacientes")
	    public String listarUsuarios(Model model) {
	        List<Paciente> paciente = pacienteService.listarPacientes();
	        model.addAttribute("paciente", paciente);
	        return "listar-pacientes";
	    }

	  @GetMapping("/formulario")
	    public String formularioPaciente(Model model) {
	            model.addAttribute("paciente", new Paciente());        
	        return "registro-paciente";
	    }
	 
	  @GetMapping("/formulario/{id}")
	    public String formularioEdicion(@PathVariable("id") Long id, Model model) {
	        Paciente paciente = pacienteService.obtenerPacientePorId(id);
	        model.addAttribute("paciente", paciente);
	            return "registro-paciente";        
	    }  
	  	    	    
	   @PostMapping("/save")
	    public String guardarPaciente(@ModelAttribute("paciente") Paciente paciente) {
	    	
	    	pacienteService.guardarPaciente(paciente);
	        return "redirect:/pacientes";
	    }
		
	    @GetMapping("/delete/{id}")
	    public String eliminarPaciente(@PathVariable("id") Long id) {
	        pacienteService.eliminarPaciente(id);
	        return "redirect:/pacientes";
	    }


}
