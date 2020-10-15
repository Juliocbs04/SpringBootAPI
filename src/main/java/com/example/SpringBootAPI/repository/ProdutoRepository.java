package com.example.crud.postgresql.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.postgresql.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
