package busine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import busine.model.Vendedor;



public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

	Vendedor findByNomeLike(String nome);

}
