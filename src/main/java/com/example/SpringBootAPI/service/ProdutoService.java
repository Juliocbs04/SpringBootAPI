package com.example.SpringBootAPI.service;

import java.util.List;

import com.example.SpringBootAPI.model.Produto;

public interface ProdutoService {

	List<Produto> findAll();
    Produto FindById(long id);
    Produto save(Produto p);

}
