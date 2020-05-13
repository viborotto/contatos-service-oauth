package br.com.mastertech.contatosserviceoauth.principal;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Map;

public class UsuarioPrincipalExtractor implements PrincipalExtractor {

    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        Usuario usuario = new Usuario();
        usuario.setName((String)map.get("name"));
        usuario.setId(((Integer)map.get("id")));

        return usuario;
    }
}
