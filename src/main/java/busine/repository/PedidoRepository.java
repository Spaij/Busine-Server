package busine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import busine.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
