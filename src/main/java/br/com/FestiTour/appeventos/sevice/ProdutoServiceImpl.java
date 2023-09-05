package br.com.FestiTour.appeventos.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.FestiTour.appeventos.model.Produto;
import br.com.FestiTour.appeventos.repo.ProdutoRepo;

@Component
public class ProdutoServiceImpl implements IProdutoService{

	@Autowired
	private ProdutoRepo repo;
	
	@Override
	public Produto criarNovoProduto(Produto prod) {
		// TODO Auto-generated method stub
		return repo.save(prod);
	}

	@Override
	public Produto alterarProduto(Produto prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> buscarPorPalavraChave(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
