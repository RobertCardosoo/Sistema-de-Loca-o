import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Znoque
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Cliente> clientes = new ArrayList();
        int menu=1, subMenu=0;
        int id, idade;
        String nome, cnh, cpf, endereco;
        Cliente novoCliente = new Cliente();
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("                     BADOO LOCACOES LTDA\n1.Cliente       2.Veículo       3.Consultor     0.Sair\n\nDigite o número correspondente a uma das opções acima:"));
            switch(menu){
                case 1:
                    subMenu = Integer.parseInt(JOptionPane.showInputDialog("                     CLIENTE\n1.Consultar     2.Cadastrar       3.Editar      4.Listar Cadastrados       5.Deletar      0.voltar\n\nDigite o número correspondente a uma das opções acima:"));
                    switch(subMenu){
                        case 1:
                            if(clientes.size()!=0){
                                cpf = JOptionPane.showInputDialog("Digite o CPF do Cliente (APENAS NUMEROS):");
                                for(Cliente x: clientes){
                                    if(x.getCpf().equals(cpf)){
                                        JOptionPane.showMessageDialog(null, x.toString());
                                    }else{
                                        JOptionPane.showMessageDialog(null,"ERRO\n\nNão foi encontrado nenhum Cliente com esse CPF!");
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"ERRO\n\nNão há Clientes Cadastrados!");
                            }
                            break;
                        case 2:
                            idade = Integer.parseInt(JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite a idade do Cliente:\n(NÃO PODE SER MENOR QUE 21 ANOS"));
                            if(idade < 21){
                                JOptionPane.showMessageDialog(null,"ERRO\n\nNão e possível Cadastrar o cliente, pois é menor de 21 anos");
                            }else{
                                id = Integer.parseInt(JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite o id do Cliente:"));
                                nome = JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite o nome do Cliente:");
                                cnh = JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite a CNH do Cliente:");
                                cpf = JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite o CPF do Cliente:");
                                endereco = JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite o Endereço do Cliente:");
                                novoCliente = new Cliente(id, nome, idade, cnh, cpf, endereco);
                                clientes.add(novoCliente);
                                JOptionPane.showMessageDialog(null,"SUCESS\n\nCliente Cadastrado com SUCESSO!!");
                            }
                            break;
                        case 3:
                            if(clientes.size()!=0){
                                cpf = JOptionPane.showInputDialog("Digite o CPF do Clinete (APENAS NUMEROS): ");
                                for(int i = 0; i<clientes.size(); i++){
                                    if(clientes.get(i).getCpf().equals(cpf)){
                                        idade = Integer.parseInt(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nIdade atual do Cliente: "+clientes.get(i).getIdade()+"\n\nDigite a nova idade do Cliente:\n(NÃO PODE SER MENOR QUE 21 ANOS)"));
                                        if(idade < 21){
                                            JOptionPane.showMessageDialog(null,"ERRO\n\nNão e possível Atualizar o cliente, pois é menor de 21 anos");
                                        }else{
                                            clientes.get(i).setIdade(idade);
                                            clientes.get(i).setId(Integer.parseInt(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nID atual do Cliente: "+clientes.get(i).getId()+"\n\nDigite o novo id do Cliente:")));
                                            clientes.get(i).setNome(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nNome atual do Cliente: "+clientes.get(i).getNome()+"\n\nDigite o novo nome do Cliente:"));
                                            clientes.get(i).setCnh(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nCNH atual do Cliente: "+clientes.get(i).getCnh()+"\n\nDigite a nova CNH do Cliente:"));
                                            clientes.get(i).setCpf(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nCPF atual do Cliente: "+clientes.get(i).getCpf()+"\n\nDigite o novo CPF do Cliente:"));
                                            clientes.get(i).setEndereco(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nEndereço atual do Cliente: "+clientes.get(i).getEndereco()+"\n\nDigite o novo Endereço do Cliente:"));                                            
                                            JOptionPane.showMessageDialog(null,"SUCESS\n\nCliente Atualizado com SUCESSO!!\n\n"+clientes.get(i).toString());
                                        }
                                        break;
                                    }else{
                                        JOptionPane.showMessageDialog(null,"ERRO\n\nNão foi encontrado nenhum Cliente com esse CPF!");
                                    }
                                }
                            }
                            break;
                        case 4:
                            if(clientes.size()!=0){
                                for(Cliente c: clientes){
                                    JOptionPane.showMessageDialog(null, c.toString());
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"ERRO\n\nNão há Clientes Cadastrados!");
                            }
                            break;
                        case 5:
                            if(clientes.size()!=0){
                                cpf = JOptionPane.showInputDialog("Digite o CPF do Clinete (APENAS NUMEROS): ");
                                for(int i = 0; i<clientes.size(); i++){
                                    if(clientes.get(i).getCpf().equals(cpf)){
                                        clientes.remove(i);
                                        JOptionPane.showMessageDialog(null,"SUCESS\n\nCliente Excluido com SUCESSO!!");
                                        break;
                                    }else{
                                        JOptionPane.showMessageDialog(null,"ERRO\n\nNão foi encontrado nenhum Cliente com esse CPF!");
                                    }                                    
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"ERRO\n\nNão há Clientes Cadastrados!");
                            }
                            break;
                        case 0:
                            
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"ERRO\n\nFechando o Programa");
                    }                    
                    break;
                case 2:
                    break;
                case 3:
                    
                    break;
                case 0:
                    System.out.println("Saindo do Programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Essa opção não existe, digite o número correspondente a uma das opções do menu apresentado!");
                
            }
        }while(menu!=0);
    }
    
}