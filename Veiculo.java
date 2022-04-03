public class Veiculo{               //CLASSE VEICULO
    private int id;                 //VARIAVEL ID DO TIPO INTEIRO
    private String nome;            //VARIAVEL NOME DO TIPO TEXTO
    private String fabricante;      //VARIAVEL FABRICANTE DO TIPO TEXTO
    private String modelo;          //VARIAVEL MODELO DO TIPO TEXTO
    private String cor;             //VARIAVEL COR DO TIPO TEXTO
    private String placa;           //VARIAVEL PLACA DO TIPO TEXTO
    private String chassi;          //VARIAVEL CHASSI DO TIPO TEXTO
    private int ano_fab;            //VARIAVEL ANO DE FABRICACAO DO TIPO INTEIRO
    private boolean alugado;        //VARIAVEL ALUGADO DO TIPO BOLEANO
    private double val_alug;        //VARIAVEL VALOR ALUGADO DO TIPO DOUBLE

    //METÓDO CONSTRUTOR VAZIO
    public Veiculo(){ 
        
    }

    //CONSULTAR ID
    public int getId(){
        return this.id;
    }

    //ALTERAR ID
    public void setId(int new_id){
        this.id = new_id;
    }

    //CONSULTAR NOME
    public String getNome(){
        return this.nome;
    }

    //ALTERAR NOME
    public void setNome(String new_nome){
        this.nome = new_nome;
    }

    //CONSULTAR FABRICANTE
    public String getFabricante(){
        return this.fabricante;
    }

    //ALTERAR FABRICNATE
    public void setFabricante(String new_fabricante){
        this.fabricante = new_fabricante;
    }

    //CONSULTAR MODELO
    public String getModelo(){
        return this.modelo;
    }

    //ALTERAR MODELO
    public void setModelo(String new_modelo){
        this.modelo = new_modelo;
    }

    //CONSULTAR COR
    public String getCor(){
        return this.cor;
    }

    //ALTERAR COR
    public void setCor(String new_cor){
        this.cor = new_cor;
    }
    
    //CONSULTAR PLACA
    public String getPlaca(){
        return this.placa;
    }

    //ALTERAR PLACA
    public void setPlaca(String new_placa){
        this.placa = new_placa;
    }

    //CONSULTAR CHASSI
    public String getChassi(){
        return this.chassi;
    }

    //ALTERAR CHASSI
    public void setChassi(String new_chassi){
        this.chassi = new_chassi;
    }

    //CONSULTAR ANO DE FABRICACAO
    public int getAno_fab(){
        return this.ano_fab;
    }

    //ALTERAR ANO DE FABRICACAO
    public void setAno_fab(int new_ano_fab){
        this.ano_fab = new_ano_fab;
    }

    //CONSULTAR SITUACAO DO ALUGUEL (S/N)
    public boolean getAlugado(){
        return this.alugado;
    }

    //ALTERAR NOME SITUACAO DO ALUGUEL (S/N)
    public void setAlugado(boolean new_alugado){
        this.alugado = new_alugado;
    }

    //CONSULTAR VALOR DO ALUGUEL
    public double getVal_alug(){
        return this.val_alug;
    }

    //ALTERAR VALOR DO ALUGUEL
    public void setVal_alug(double new_val_alug){
        this.val_alug = new_val_alug;
    }

}