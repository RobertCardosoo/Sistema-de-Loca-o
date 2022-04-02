public class Consultor{

    private int matricula;
    private String nome;
    private int cpf;    
    
    public Consultor(){

    }        
    

    int getMatricula (){
        return this.matricula;
    }
    
    void setMatricula (int matricula){
        this.matricula = matricula;
        System.ou.println("Matricula setada com sucesso ");

    }

    String getNome (){
        return this.nome;
    }

    void setNome (String nome){
        this.nome = nome;
        System.out.println("Nome setado com sucesso ");

    }

    int getCpf(){
        return this.cpf;
    }

    void setCpf( int cpf){
        this.cpf = cpf;
        System.out.println(" Cpf setado com sucesso ");
    }
}