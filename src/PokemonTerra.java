
public class PokemonTerra extends Pokemon {
	private int dano = 10;

	public PokemonTerra(String nome, int hp, boolean evolucao) {
		super(nome, hp, evolucao);
		
	}



	public int calcularDanoExtra() {
		return dano*10/(100);
	}

	
	public int calcularDano(String tipoAdversario) {
		if (tipoAdversario == "eletrico" && getEvolucao() == true){
			return calcularDanoExtra() + dano + (dano*50/(100));
		}else if (tipoAdversario == "eletrico"){
			return dano + (dano*50/(100));
		}else if (tipoAdversario == "fogo" && getEvolucao() == true){
			return calcularDanoExtra() + dano + (dano*20/(100));
		}else if (tipoAdversario == "fogo"){
			return dano + (dano*20/(100));
		}else if (getEvolucao() == true) {
			return calcularDanoExtra() + dano;
		}else {
			return dano;
		}
	}



	public String getTipo() {
		
		return "terra";
	}

}
