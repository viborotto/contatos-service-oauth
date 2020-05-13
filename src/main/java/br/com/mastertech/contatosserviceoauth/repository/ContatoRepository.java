package br.com.mastertech.contatosserviceoauth.repository;

import br.com.mastertech.contatosserviceoauth.model.Contato;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContatoRepository extends CrudRepository<Contato, Long> {

    List<Contato> findAllByIdUsuario(Long idUsuario);
}
