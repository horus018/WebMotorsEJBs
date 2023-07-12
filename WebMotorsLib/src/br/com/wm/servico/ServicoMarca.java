package br.com.wm.servico;

import br.com.wm.modelo.Marca;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface ServicoMarca {
    public void inserir(Marca m);
    public void alterar(Marca m);
    public void remover(Marca m);
    public List<Marca> listar();    
}
