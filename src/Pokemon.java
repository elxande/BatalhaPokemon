
public abstract class Pokemon implements Evolucao {
	//Atributos
	protected String nome;
	private int hp;
	private boolean evolucao;
	//Construtor
	public Pokemon(String nome, int hp, boolean evolucao) {
		this.nome = nome;
		this.hp = hp;
		this.evolucao = evolucao;
	}
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public boolean getEvolucao() {
		return evolucao;
	}
	public void setEvolucao(boolean evolucao) {
		this.evolucao = evolucao;
	}
	public abstract String getTipo();
	
	//Métodos Especiais
	public void receberAtaque(int dano){
		this.hp = this.hp - dano;
	}

	public String getDados(){
		return getNome() + " " + getTipo() + " " + getHp();
	}
	
	public abstract int calcularDano(String tipoAdversario);
		



	

}
