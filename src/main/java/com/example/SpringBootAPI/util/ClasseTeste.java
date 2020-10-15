package com.example.SpringBootAPI.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SpringBootAPI.model.Produto;
import com.example.SpringBootAPI.repository.ProdutoRepository;

@Component
public class ClasseTeste {

	@Autowired
	ProdutoRepository crudProduto;

	@PostConstruct
	public void savePosts() {
		List<Produto> produtoList = new ArrayList<>();
		Produto teste = new Produto();
		teste.setDescricao("Remédio loratadina");
		teste.setData(LocalDate.now());
		teste.setPreco_unit(20.00);
		teste.setQuantidade(50);

		Produto teste2 = new Produto();
		teste2.setDescricao("Budesonida");
		teste2.setData(LocalDate.now());
		teste2.setPreco_unit(30.00);
		teste2.setQuantidade(150);

		produtoList.add(teste);
		produtoList.add(teste2);

		for (Produto p : produtoList) {
			Produto produtoSalvo = crudProduto.save(p);
			System.out.println("O objeto com id" + produtoSalvo.getId_produto() + "Foi salvo com sucesso!!");
		}
	}

}
