
public class PokemonAgua extends Pokemon{
	private int dano = 10;
	public PokemonAgua(String nome, int hp, boolean evolucao) {
		super(nome, hp, evolucao);
		
	}


	public int calcularDanoExtra() {
		return dano*20/(100);
	}

	
	public int calcularDano(String tipoAdversario) {
		if (tipoAdversario == "fogo" && getEvolucao() == true){
			return calcularDanoExtra() + dano + (dano*50/(100));
		}else if (tipoAdversario == "fogo"){
			return dano + (dano*50/(100));
		}else if (tipoAdversario == "terra" && getEvolucao() == true){
			return calcularDanoExtra() + dano + (dano*20/(100));
		}else if (tipoAdversario == "terra"){
			return dano + (dano*20/(100));
		}else if (getEvolucao() == true) {
			return calcularDanoExtra() + dano;
		}else {
			return dano;
		}
	}



	public String getTipo() {	
		return "agua";
	}
	

}
