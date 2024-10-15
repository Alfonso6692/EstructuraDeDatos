
public class Main {
	public static void main(String[] args) {
		ListaEnlazada lista = new ListaEnlazada();
		lista.anadirInicio(23);
		lista.anadirInicio(4);
		lista.anadirInicio(74);
		lista.anadirInicio(32);
		
		//lista.borrarValor(23);
		
		lista.mostar();
	}
}

class  nodo {
	int valor;
	nodo siguiente;
	
	nodo(int valor) {
		this.valor=valor;
	}
}

class ListaEnlazada {
	nodo cabeza;
	
	public void AnadirFinal(int valor) {
		//Verificar si nuestra lista esta vacia
		if(vacia()==true) {
			cabeza=new nodo(valor);
		}
		
		//El nodo que el sigue el distinto a nulo
		//iterar hasta encontrar ultimo elemento
		
		nodo mensajero=cabeza;
		while (mensajero.siguiente!=null) {
			mensajero=mensajero.siguiente;
			
		}
		
		mensajero.siguiente= new nodo (valor);
	}
	
	public void anadirInicio (int valor) {
		//Verificar si lista esta vacia.....
		if(vacia()) {
			cabeza= new nodo(valor);
			return;
		}
		
		//1. Crear nodo....
		nodo nuevo =  new nodo(valor);
		nuevo.siguiente=cabeza;
		cabeza=nuevo;
		
		
	}
	
	public void borrarValor(int valor) {
		//verificar si nuestra lista enlasada esta cacia
		
		if(vacia())return;
		
		//Si la cabeza es el nodo que queremos eliminar...
		if(cabeza.valor==valor) {
			cabeza=cabeza.siguiente;
			return;
		}
		
		
		//Iterar hasta encontrar un nodo antes del que queremos eliminar
		
		nodo mensajero = cabeza;
		while (mensajero.siguiente!=null){
			if(mensajero.siguiente.valor==valor) {
				mensajero.siguiente=mensajero.siguiente.siguiente;
				return;
			}
			mensajero=mensajero.siguiente;	
		}
	}
	
	//crear una funcion en la cual nos permite crear nuestros los lementos
	
	public void mostar() {
		//verificar si lista esta vacia---
		if(vacia()) {
			System.out.println("Lista vacia---");
			return;
		}
		
		
		nodo mensajero = cabeza;
		
		while(mensajero!=null) {
			System.out.println("\n"+mensajero.valor);
			mensajero=mensajero.siguiente;
		}
	}
	private boolean vacia() {
		if(cabeza==null) return true;
		else {
			return false;
			
		}
	}
}
