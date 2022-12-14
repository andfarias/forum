package br.com.andersonfariasdev.forum.reposittory;

import br.com.andersonfariasdev.forum.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNome(String nome);

}
