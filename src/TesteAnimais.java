import java.util.ArrayList;

public class TesteAnimais {

	public static void main(String[] args ) {
		
		Cachorro c1 = new Cachorro();
		Gato g1 = new Gato();
		Animal a1 = new Animal();
		Passaro p1 = new Passaro();
		Peixe px1 = new Peixe();
		
		System.out.println(c1.caminha());
		System.out.println(g1.caminha());
		System.out.println(c1.late());
		System.out.println(g1.mia());
		System.out.println(p1.voa());
		System.out.println(px1.nada());
		// ctrl+shift+O para importar automaticamente arraylist
		ArrayList<Animal> animais = new ArrayList<>();
		
		animais.add(c1);
		animais.add(g1);
		animais.add(a1);
		animais.add(p1);
	}
	
}
