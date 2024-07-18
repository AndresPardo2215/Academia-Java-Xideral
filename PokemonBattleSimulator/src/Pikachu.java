
public class Pikachu extends Pokemon implements Capturable{

	
	public Pikachu(String nombre, int nivel) {
        super(nombre, nivel, "El�ctrico");
    }

	@Override
    public void atacar() {
        System.out.println(getNombre() + " usa Impactrueno!");
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " se defiende con una barrera el�ctrica!");
    }


    @Override
    public boolean capturar() {
        System.out.println(getNombre() + " ha sido capturado!");
        return true;
    }
		
}

