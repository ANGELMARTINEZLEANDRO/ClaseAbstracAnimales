package Implemenatacion;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos;
import Model.Carnivoros;


//CLASE GENERICA
public class ImpGenerica implements Metodos {
	
	List<Object> lista = new ArrayList<Object>();
	
	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		lista.add(obj);
		
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
		
	}

	@Override
	public Object bucar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Object obj) {
		// TODO Auto-generated method stub
		lista.set(indice, obj);
		
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
		
		
	}
	public void indiceDescri() {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getClass().equals(Carnivoros.class)) {
				Carnivoros carnivoro = (Carnivoros) lista.get(i);
				System.out.println("[" + i + "]" + carnivoro.getNombre());
			}
		}
	}
	
	

}
