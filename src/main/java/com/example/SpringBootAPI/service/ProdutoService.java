package com.example.crud.postgresql.service;

import java.util.List;

import com.example.crud.postgresql.model.Produto;

public interface ProdutoService {

	List<Produto> findAll();
    Produto FindById(long id);
    Produto save(Produto p);

}
