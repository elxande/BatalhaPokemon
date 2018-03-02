
public class PokemonVoador extends Pokemon {
	private int dano = 12;

	public PokemonVoador(String nome, int hp, boolean evolucao) {
		super(nome, hp, evolucao);
	}

	public int calcularDanoExtra() {
		return dano*10/(100);
	}

	
	public int calcularDano(String tipoAdversario) {
		if (tipoAdversario == "grama" && getEvolucao() == true){
			return calcularDanoExtra() + dano + (dano*50/(100));
		}else if (tipoAdversario == "grama"){
			return dano + (dano*50/(100));
		}else if (getEvolucao() == true) {
			return calcularDanoExtra() + dano;
		}else {
			return dano;
		}
	}
	
	public String getTipo() {
		return "voador";
	}

}
