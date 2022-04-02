public class Cliente{           //CLASSE CLIENTE
    private int id;             //VARIAVEL ID DO TIPO INTEIRO
    private String nome;        //VARIAVEL NOME DO TIPO INTEIRO
    private int idade;          //VARIAVEL IDADE DO TIPO INTEIRO
    private int cnh;            //VARIAVEL CNH DO TIPO INTEIRO
    private int cpf;            //VARIAVEL CPF DO TIPO INTEIRO
    private String endereco;    //VARIAVEL ENEREÇO DO TIPO INTEIRO

    //METÓDO CONSTRUTOR VAZIO 
    public Cliente(){ 
        
    }
    
    //METÓDO CONSTRUTOR INICIALIZANDO TODAS AS VARIAVEIS 
    public Cliente (int id, String nome, int idade, int cnh, int cpf, String endereco){ 
        setId(id);
        setNome(nome);
        setIdade(idade);       
        setCNH(cnh);
        setCPF(cpf);
        setEndereco(endereco);
    }
    
    //CONSULTAR ID
    public int getId(){
        return this.id;
    }

    //ALTERAR ID
    public void setId(int novo_id){
        this.id = novo_id;
    }

    //CONSULTAR NOME
    public String getNome(){
        return this.nome;
    }

    //ALTERAR NOME
    public void setNome(String novo_nome){
        this.nome = novo_nome;
    }

    //CONSULTAR IDADE
    public int getIdade(){
        return this.idade;
    }

    //ALTERAR IDADE
    public void setIdade(int nova_idade){
        this.idade = nova_idade;
    }

    //CONSULTAR CNH
    public int getCNH(){
        return this.cnh;
    }

    //ALTERAR CNH
    public void setCNH(int nova_cnh){
        this.cnh = nova_cnh;
    }

    //CONSULTAR CPF
    public int getCPF(){
        return this.cpf;
    }

    //ALTERAR CPF
    public void setCPF(int novo_cpf){
        this.cpf = novo_cpf;
    }

    //CONSULTAR EBDERECO
    public String getEndereco(){
        return this.endereco;
    }

    //ALTERAR ENDEREÇO
    public void setEndereco(String novo_endereco){
        this.endereco = novo_endereco;
    }
}