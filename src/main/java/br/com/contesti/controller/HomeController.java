package br.com.contesti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.contesti.repository.AssuntoRepository;
import br.com.contesti.repository.BancaRepository;
import br.com.contesti.repository.DisciplinaRepository;
import br.com.contesti.repository.UsuarioRepository;

@Controller
public class HomeController {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	@Autowired
	private AssuntoRepository assuntoRepository;
	
	@Autowired
	private BancaRepository bancaRepository;
	
	@RequestMapping("/testeT")
	public String testeT(){
		System.out.println("Hello Thymeleaf!!");
		return "testeThyme";
	}
	
		
	@RequestMapping("/")
	public String login(){	
		System.out.println("Hello Login!!");		
		return "Login";
	
	}
	@RequestMapping("/home")
	public String index(){	
		System.out.println("Hello Login!!");		
		return "PaginaInicialUser";
	
	}
	@RequestMapping("/homeAdm")
	public String indexAdmin(){	
		System.out.println("Hello Login!!");		
		return "PaginaInicialAdm";
	
	}
	
	@RequestMapping("/cadastroQuestao")
	public ModelAndView cadastroQuestao(){
		ModelAndView mav = new ModelAndView("CadastroQuestaoUser");
		mav.addObject("listarDisciplina", disciplinaRepository.findAll());
		mav.addObject("listarAssunto", assuntoRepository.findAll());	
		return mav;
	}
	
	@RequestMapping("/cadastroQuestaoConcurso")
	public ModelAndView cadastroQuestaoConcurso(){
		ModelAndView mav = new ModelAndView("CadastroQuestaoBC");
		mav.addObject("listarDisciplina", disciplinaRepository.findAll());
		mav.addObject("listarAssunto", assuntoRepository.findAll());
		mav.addObject("listarBanca", bancaRepository.findAll());
		return mav;
	}
	
		
	@RequestMapping("/cadastro")
	public String cadastro(){
		System.out.println("Hello usuario");
		return "cadastro";
	}
	
	@RequestMapping("/sobre")
	public String sobre(){
		System.out.println("Hello usuario");
		return "Sobre";
	}
	
	
	
}
