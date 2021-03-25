package br.com.treinaweb.twprojetos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojetos.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
    
}
