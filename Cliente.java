/**
 *
 * @author Znoque
 */
public class Cliente {
    private int id;             //VARIAVEL ID DO TIPO INTEIRO
    private String nome;        //VARIAVEL NOME DO TIPO INTEIRO
    private int idade;         //VARIAVEL IDADE DO TIPO INTEIRO
    private String cnh;         //VARIAVEL CNH DO TIPO INTEIRO
    private String cpf;         //VARIAVEL CPF DO TIPO INTEIRO
    private String endereco;    //VARIAVEL ENEREÇO DO TIPO INTEIRO

    public Cliente() {
    }

    public Cliente(int id, String nome, int idade, String cnh, String cpf, String endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{ID: " + id + ", Nome: " + nome + ", idade: " + idade + ", CNH:" + cnh + ", CPF: " + cpf + ", Endereco: " + endereco + '}';
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}