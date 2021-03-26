package br.com.treinaweb.twprojetos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojetos.entidades.Funcionario;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {
    
}
