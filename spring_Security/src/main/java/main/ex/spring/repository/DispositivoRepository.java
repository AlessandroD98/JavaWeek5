package main.ex.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.ex.spring.entity.Dispositivo;
import main.ex.spring.payload.DispositivoPut;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, Long>{

	

}
