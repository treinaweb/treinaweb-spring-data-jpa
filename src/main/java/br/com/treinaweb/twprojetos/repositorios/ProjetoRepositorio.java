package br.com.treinaweb.twprojetos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojetos.entidades.Projeto;

public interface ProjetoRepositorio extends JpaRepository<Projeto, Long> {
    
}
