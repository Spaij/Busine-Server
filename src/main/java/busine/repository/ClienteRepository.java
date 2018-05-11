package busine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import busine.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	Cliente findByNomeLike(String nome);

}
