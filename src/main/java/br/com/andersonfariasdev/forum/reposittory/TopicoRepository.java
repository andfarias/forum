package br.com.andersonfariasdev.forum.reposittory;

import br.com.andersonfariasdev.forum.modelo.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    Page<Topico> findByCursoNome(String nomeCurso, Pageable pageable);

}
