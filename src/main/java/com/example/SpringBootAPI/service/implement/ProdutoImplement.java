package com.example.SpringBootAPI.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.SpringBootAPI.model.Produto;
import com.example.SpringBootAPI.repository.ProdutoRepository;
import com.example.SpringBootAPI.service.ProdutoService;


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
