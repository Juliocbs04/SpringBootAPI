package com.example.SpringBootAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootAPI.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
