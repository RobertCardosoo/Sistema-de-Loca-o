/**
 *
 * @author Znoque
 */
public class Veiculo {
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

    public Veiculo() {
        this.alugado = false;
    }

    public Veiculo(int id, String nome, String fabricante, String modelo, String cor, String placa, String chassi, int ano_fab) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.ano_fab = ano_fab;
        this.alugado = false;
    }

    @Override
    public String toString() {
        if(alugado){
            return "{ID: " + id + ", Nome: " + nome + ", Fabricante: " + fabricante + ", Modelo:" + modelo + ", Cor: " + cor + ", Placa: " + placa + ", Chassi: " + chassi + ", Ano de Fabricação: " + ano_fab + ", Alugado: Sim, valor do Aluguel: " + val_alug + '}';
        }else{
            return "{ID: " + id + ", Nome: " + nome + ", Fabricante: " + fabricante + ", Modelo:" + modelo + ", Cor: " + cor + ", Placa: " + placa + ", Chassi: " + chassi + ", Ano de Fabricação: " + ano_fab + ", Alugado: Não}";
        }
        
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getAno_fab() {
        return ano_fab;
    }

    public void setAno_fab(int ano_fab) {
        this.ano_fab = ano_fab;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public double getVal_alug() {
        return val_alug;
    }

    public void setVal_alug(double val_alug) {
        this.val_alug = val_alug;
    }
    
    
}