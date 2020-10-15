package com.example.crud.postgresql.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.crud.postgresql.model.Produto;
import com.example.crud.postgresql.repository.ProdutoRepository;
import com.example.crud.postgresql.service.ProdutoService;

public class ProdutoImplement implements ProdutoService{

	@Autowired
	ProdutoRepository crudProduto;
	
	@Override
	public List<Produto> findAll() {
		return crudProduto.findAll();
	}

	@Override
	public Produto FindById(long id) {
		return crudProduto.findById(id).get();
	}

	@Override
	public Produto save(Produto p) {
		return crudProduto.save(p);
	}

	
}
