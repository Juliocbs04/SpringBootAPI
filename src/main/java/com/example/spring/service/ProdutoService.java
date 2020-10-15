package com.example.spring.service;

import java.util.List;

import com.example.spring.model.Produto;

public interface ProdutoService {

	List<Produto> findAll();
    Produto FindById(long id);
    Produto save(Produto p);

}
