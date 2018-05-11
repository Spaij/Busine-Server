package busine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import busine.model.Organizacao;

public interface OrganizacaoRepository extends JpaRepository<Organizacao, Long> {

	Organizacao findByNomeDaOrganizacaoLike(String nomeDaOrganizacao);

}

