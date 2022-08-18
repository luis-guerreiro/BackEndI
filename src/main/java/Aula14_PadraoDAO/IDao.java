package Aula14_PadraoDAO;

public interface IDao <T> {

    public T salvar(T t);
    public T buscar(Integer id);
}
