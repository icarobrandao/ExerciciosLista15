package Exercicio01;

import java.util.List;

public class GerenciadorRegistroGenerico<T> implements GerenciadorRegistro<T> {

	private List<T> lista;

	@Override
	public void salvar(T obj) {
		lista.add(obj);

	}

	@Override
	public void excluir(T obj) {
		lista.remove(obj);
	}

	@Override
	public T pesquisar(T obj) {
		for (int i = 0; i < lista.size(); i++) {
			if (obj == lista.get(i)) {
				return lista.get(i);
			}
		}
		return null;
	}

	@Override
	public void imprimirTodos() {
		lista.iterator();

	}

}
