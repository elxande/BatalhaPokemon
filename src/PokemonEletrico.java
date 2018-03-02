
public class PokemonEletrico extends Pokemon{
	private int dano = 10;
	
	public PokemonEletrico(String nome, int hp, boolean evolucao) {
		super(nome, hp, evolucao);
		
	}

	public int calcularDanoExtra() {
		return dano*10/(100);
	}

	
	public int calcularDano(String tipoAdversario) {
		if (tipoAdversario == "voador" && getEvolucao() == true){
			return calcularDanoExtra() + dano + (dano*50/(100));
		}else if (tipoAdversario == "voador"){
			return dano + (dano*50/(100));
		}else if (tipoAdversario == "agua" && getEvolucao() == true){
			return calcularDanoExtra() + dano + (dano*20/(100));
		}else if (tipoAdversario == "agua"){
			return dano + (dano*20/(100));
		}else if (getEvolucao() == true) {
			return calcularDanoExtra() + dano;
		}else {
			return dano;
		}
	}

	
	public String getTipo() {

		return "eletrico";
	}


	

}
