package br.com.entra21.backend.spring.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.entra21.backend.spring.projeto.model.Carro;
import br.com.entra21.backend.spring.projeto.model.Usuario;

@Repository
@EnableJpaRepositories
public interface ICarroRepository extends JpaRepository<Usuario, Integer> {

	@Query("From Carro where cor = :corParam")
	List<Carro> qualCor(@Param("corParam") String cor);
	
	@Query("From Carro where velocidade_maxima = :velocidadeParam")
	Carro velocidade(@Param("velocidadeParam")Integer velocidade);
	
}
