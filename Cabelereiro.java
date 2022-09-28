public class Cabelereiro {
	private int cpf;
	private String nome;
	private int id;
	
	public Cabelereiro(int cpf, String nome) {
		this.cpf=cpf;
		setNome(nome);
	}
	
	//getando nome
	public String getNome() {
		return nome;
	}
	//setando nome
	public void setNome(String nome) {
		if(nome.length()>=3) //nome maior que 3 caracteres
			this.nome=nome;
	}
	//getando id
	public int getId() {
		return id;
	}
	//setando id
	public void setId(int id) {
		if(id>0)
		this.id = id;
	}
	
	
}
