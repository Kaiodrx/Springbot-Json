package br.senac.df.ProdutoRest;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class ProdutoService {
 
    @Autowired
    private ProdutoRepository repo;
     
    public List<Produto> listAll() {
        return repo.findAll();
    }
     
    public void save(Produto produto) {
        repo.save(produto);
    }
     
    public Produto get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}