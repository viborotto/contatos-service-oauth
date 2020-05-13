package br.com.mastertech.contatosserviceoauth.repository;

import br.com.mastertech.contatosserviceoauth.model.Contato;
import org.springframework.data.repository.CrudRepository;

public interface ContatoRepository extends CrudRepository<Contato, Long> {
}
