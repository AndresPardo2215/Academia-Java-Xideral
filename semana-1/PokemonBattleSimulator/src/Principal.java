

public class Principal {

    public static void main(String[] args) {
        // Crear instancia del entrenador
        Entrenador ash = new Entrenador("Ash");

        // Crear una instancia de Pikachu y otros Pokémon
        Pikachu pikachu = new Pikachu("Pikachu", 10);
        Pokemon charmander = new Charmander("Charmander", 8);
        
        // Capturar pokemones
        pikachu.capturar();
        ((Charmander)charmander).capturar(); //hacemos un DownCasting

        // Agregar Pokemon al equipo del entrenador
        ash.agregarPokemon(pikachu);
        ash.agregarPokemon(charmander);

        // Simular ataques y defensas
        pikachu.atacar();
        pikachu.defender();

        charmander.atacar();
        charmander.defender();

        // Entrenar Pokemones
        ash.entrenarPokemon();
    }
}

