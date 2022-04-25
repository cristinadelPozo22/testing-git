import java.util.ArrayList;
import java.util.Iterator;
public class Principal {
	
	public static void main(String[] args) {
		ArrayList v1= new ArrayList();
		
		ArrayList v2= new ArrayList(10);
		
		ArrayList<Integer> v3= new ArrayList<Integer>(10);
		
		ArrayList<String> v4= new ArrayList<String>(5);
		
		
		
		
		System.out.println("El numero de elementos de v1 es "+v1.size());
		System.out.println("El numero de elementos de v2 es "+v1.size());
		
		System.out.println(v1.isEmpty());
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add("Hola");
		Iterator i= v1.iterator();
		
		int valor;
		while(i.hasNext()) {
			valor= (int) i.next();
			System.out.println(valor);
		}
		
	}
}
