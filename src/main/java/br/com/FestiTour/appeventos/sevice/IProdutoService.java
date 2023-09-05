package br.com.FestiTour.appeventos.sevice;

import java.util.List;

import br.com.FestiTour.appeventos.model.Produto;

public interface IProdutoService {
	public Produto criarNovoProduto(Produto prod);
	public Produto alterarProduto(Produto prod);
	public List<Produto> listarTodos();
	public List<Produto> buscarPorPalavraChave(String key);
	public Produto buscarPorId(Integer id);
}
