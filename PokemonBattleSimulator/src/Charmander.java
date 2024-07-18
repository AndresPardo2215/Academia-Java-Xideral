
public class Charmander extends Pokemon implements Capturable {

    public Charmander(String nombre, int nivel) {
        super(nombre, nivel, "Fuego");
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " usa Lanzallamas!");
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " se defiende con un muro de fuego!");
    }

    @Override
    public boolean capturar() {
        System.out.println(getNombre() + " ha sido capturado!");
        return true;
    }
}
