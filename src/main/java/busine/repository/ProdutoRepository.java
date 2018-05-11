package busine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import busine.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	Produto findByDescricaoLike(String descricao);

}
