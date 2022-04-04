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
        ArrayList<Cliente> clientes = new ArrayList(); //ARRAY DE CLIENTES
        ArrayList<Veiculo> veiculos = new ArrayList(); //ARRAY DE VEICULOS
        int menu = 1, subMenu = 0, id, idade, ano;
        String nome, cnh, cpf, endereco,  fabricante,  modelo,  cor,  placa,  chassi, mensagem="";
        Cliente novoCliente = new Cliente();
        Veiculo novoVeiculo = new Veiculo();
        
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("                     BADOO LOCACOES LTDA\n1.Cliente       2.Veículo       3.Consultor     0.Sair\n\nDigite o número correspondente a uma das opções acima:"));
            switch (menu) {
                case 1:
                    subMenu = Integer.parseInt(JOptionPane.showInputDialog("                     CLIENTE\n1.Consultar     2.Cadastrar       3.Editar      4.Listar Clientes       5.Deletar      0.voltar\n\nDigite o número correspondente a uma das opções acima:"));
                    switch (subMenu) {
                        case 1:
                            if (clientes.size() != 0) {
                                cpf = JOptionPane.showInputDialog("Digite o CPF do Cliente (APENAS NUMEROS):");
                                for (Cliente x : clientes) {
                                    if (x.getCpf().equals(cpf)) {
                                        mensagem = x.toString();
                                        break;
                                    } else {
                                        mensagem = "ERRO\n\nNão foi encontrado nenhum Cliente com esse CPF!";
                                    }
                                }
                            } else {
                                mensagem = "ERRO\n\nNão há Clientes Cadastrados!";
                            }
                            JOptionPane.showMessageDialog(null, mensagem);
                            mensagem = "";
                            break;
                        case 2:
                            idade = Integer.parseInt(JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite a idade do Cliente:\n(NÃO PODE SER MENOR QUE 21 ANOS"));
                            if (idade < 21) {
                                JOptionPane.showMessageDialog(null, "ERRO\n\nNão e possível Cadastrar o cliente, pois é menor de 21 anos");
                            } else {
                                id = Integer.parseInt(JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite o id do Cliente:"));
                                nome = JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite o nome do Cliente:");
                                cnh = JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite a CNH do Cliente:");
                                cpf = JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite o CPF do Cliente:");
                                endereco = JOptionPane.showInputDialog("CADASTRO DO CLIENTE\n\nDigite o Endereço do Cliente:");
                                novoCliente = new Cliente(id, nome, idade, cnh, cpf, endereco);
                                clientes.add(novoCliente);
                                JOptionPane.showMessageDialog(null, "SUCESS\n\nCliente Cadastrado com SUCESSO!!");
                            }
                            mensagem = "";
                            break;
                        case 3:
                            if (clientes.size() != 0) {
                                cpf = JOptionPane.showInputDialog("Digite o CPF do Clinete (APENAS NUMEROS): ");
                                for (int i = 0; i < clientes.size(); i++) {
                                    if (clientes.get(i).getCpf().equals(cpf)) {
                                        idade = Integer.parseInt(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nIdade atual do Cliente: " + clientes.get(i).getIdade() + "\n\nDigite a nova idade do Cliente:\n(NÃO PODE SER MENOR QUE 21 ANOS)"));
                                        if (idade < 21) {
                                            mensagem = "ERRO\n\nNão e possível Atualizar o cliente, pois é menor de 21 anos";
                                            break;
                                        } else {
                                            clientes.get(i).setIdade(idade);
                                            clientes.get(i).setId(Integer.parseInt(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nID atual do Cliente: " + clientes.get(i).getId() + "\n\nDigite o novo id do Cliente:")));
                                            clientes.get(i).setNome(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nNome atual do Cliente: " + clientes.get(i).getNome() + "\n\nDigite o novo nome do Cliente:"));
                                            clientes.get(i).setCnh(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nCNH atual do Cliente: " + clientes.get(i).getCnh() + "\n\nDigite a nova CNH do Cliente:"));
                                            clientes.get(i).setCpf(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nCPF atual do Cliente: " + clientes.get(i).getCpf() + "\n\nDigite o novo CPF do Cliente:"));
                                            clientes.get(i).setEndereco(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO CLIENTE\n\nEndereço atual do Cliente: " + clientes.get(i).getEndereco() + "\n\nDigite o novo Endereço do Cliente:"));
                                            mensagem = "SUCESS\n\nCliente Atualizado com SUCESSO!!\n\n" + clientes.get(i).toString();
                                            break;
                                        }
                                    } else {
                                        mensagem = "ERRO\n\nNão foi encontrado nenhum Cliente com esse CPF!";
                                    }
                                }
                            }else {
                                mensagem = "ERRO\n\nNão há Clientes Cadastrados!";
                            }
                            JOptionPane.showMessageDialog(null, mensagem);
                            mensagem = "";
                            break;
                        case 4:
                            mensagem = "";
                            if (clientes.size() != 0) {
                                for (Cliente c : clientes) {
                                    mensagem += c.toString()+"\n";
                                }
                            } else {
                                mensagem = "ERRO\n\nNão há Clientes Cadastrados!";
                            }
                            JOptionPane.showMessageDialog(null, mensagem);
                            mensagem = "";
                            break;
                        case 5:
                            if (clientes.size() != 0) {
                                cpf = JOptionPane.showInputDialog("Digite o CPF do Cliente (APENAS NUMEROS): ");
                                for (int i = 0; i < clientes.size(); i++) {
                                    if (clientes.get(i).getCpf().equals(cpf)) {
                                        clientes.remove(i);
                                        mensagem = "SUCESS\n\nCliente Excluido com SUCESSO!!";
                                        break;
                                    } else {
                                        mensagem = "ERRO\n\nNão foi encontrado nenhum Cliente com esse CPF!";
                                    }
                                }
                            } else {
                                mensagem = "ERRO\n\nNão há Clientes Cadastrados!";
                            }
                            JOptionPane.showMessageDialog(null, mensagem);
                            mensagem = "";
                            break;
                        case 0:

                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "ERRO\n\nEssa opção não existe, digite o número correspondente a uma das opções do menu apresentado!");
                    }
                    break;
                case 2:
                    subMenu = Integer.parseInt(JOptionPane.showInputDialog("                     VEICULO\n1.Consultar     2.Cadastrar       3.Editar      4.Listar Veiculos       5.Deletar      0.voltar\n\nDigite o número correspondente a uma das opções acima:"));
                    switch (subMenu) {
                        case 1:
                            if (veiculos.size() != 0) {
                                placa = JOptionPane.showInputDialog("Digite a Placa do Carro:");
                                for(Veiculo y: veiculos){
                                    if(y.getPlaca().equals(placa)){
                                        JOptionPane.showMessageDialog(null, y.toString());
                                        break;
                                    }else{
                                        mensagem = "ERRO\n\nNão Foi Encontrado Nenhum Veiculo Com Essa Placa!";
                                    }
                                }
                            } else {
                                mensagem = "ERRO\n\nNão há Veiculos Cadastrados!";
                            }
                            JOptionPane.showMessageDialog(null, mensagem);
                            break;
                        case 2:
                            id = Integer.parseInt(JOptionPane.showInputDialog("CADASTRO DO VEICULO\n\nDigite o id do Veiculo:"));
                            nome = JOptionPane.showInputDialog("CADASTRO DO VEICULO\n\nDigite o Nome do Veiculo:");
                            fabricante = JOptionPane.showInputDialog("CADASTRO DO VEICULO\n\nDigite o Fabricante do Veiculo:");
                            modelo = JOptionPane.showInputDialog("CADASTRO DO VEICULO\n\nDigite o Modelo do Veiculo:"); 
                            cor = JOptionPane.showInputDialog("CADASTRO DO VEICULO\n\nDigite a Cor do Veiculo:");
                            placa = JOptionPane.showInputDialog("CADASTRO DO VEICULO\n\nDigite a Placa do Veiculo:");
                            chassi = JOptionPane.showInputDialog("CADASTRO DO VEICULO\n\nDigite o Chassi do Veiculo:");
                            ano = Integer.parseInt(JOptionPane.showInputDialog("CADASTRO DO VEICULO\n\nDigite o ano do Veiculo:"));
                            novoVeiculo = new Veiculo(id, nome, fabricante, modelo, cor, placa, chassi, ano);
                            veiculos.add(novoVeiculo);
                            JOptionPane.showMessageDialog(null,"SUCESS\n\nCliente Cadastrado com SUCESSO!!");
                            break;
                        case 3:
                            if (veiculos.size() != 0) {
                                placa = JOptionPane.showInputDialog("Digite a Placa do Veiculo: ");
                                for (int i = 0; i < veiculos.size(); i++) {
                                    if (veiculos.get(i).getPlaca().equals(placa)) {
                                        veiculos.get(i).setId(Integer.parseInt(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO VEICULO\n\nID atual do Veiculo: " + veiculos.get(i).getId() + "\n\nDigite o Novo ID do Veiculo:")));
                                        veiculos.get(i).setNome(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO VEICULO\n\nNome atual do Veiculo: " + veiculos.get(i).getNome() + "\n\nDigite o Novo Nome do Veiculo:"));
                                        veiculos.get(i).setFabricante(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO VEICULO\n\nFabricante atual do Veiculo: " + veiculos.get(i).getFabricante()+ "\n\nDigite o Novo Fabricante do Veiculo:"));
                                        veiculos.get(i).setModelo(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO VEICULO\n\nModelo atual do Veiculo: " + veiculos.get(i).getModelo()+ "\n\nDigite o Novo Modelo do Veiculo:"));
                                        veiculos.get(i).setCor(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO VEICULO\n\nCor atual do Veiculo: " + veiculos.get(i).getCor()+ "\n\nDigite o Novo Cor do Veiculo:"));
                                        veiculos.get(i).setPlaca(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO VEICULO\n\nPlaca atual do Veiculo: " + veiculos.get(i).getPlaca()+ "\n\nDigite o Novo Placa do Veiculo:"));
                                        veiculos.get(i).setChassi(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO VEICULO\n\nChassi atual do Veiculo: " + veiculos.get(i).getChassi()+ "\n\nDigite o Novo Chassi do Veiculo:"));
                                        veiculos.get(i).setAno_fab(Integer.parseInt(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO VEICULO\n\nAno de Fabricação atual do Veiculo: " + veiculos.get(i).getAno_fab()+ "\n\nDigite o Novo Ano de Fabricação do Veiculo:")));
                                        int estado = Integer.parseInt(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO VEICULO\n\nVeiculo Emprestado: " + veiculos.get(i).getModelo()+ "\n\nDigite se o veiculo está alugado:\n1.Sim   0.Não"));
                                        if(estado==1){
                                            veiculos.get(i).setAlugado(true);
                                            veiculos.get(i).setVal_alug(Double.parseDouble(JOptionPane.showInputDialog("ATUALIZANDO CADASTRO DO VEICULO\n\nValor do Aluguel atual do Veiculo: " + veiculos.get(i).getVal_alug()+ "\n\nDigite o Novo Valor do Aluguel do Veiculo:")));
                                        }else{
                                            veiculos.get(i).setAlugado(false);
                                        }
                                        mensagem = "SUCESS\n\nVeiculo Atualizado com SUCESSO!!\n\n" + veiculos.get(i).toString();
                                        break;
                                    } else {
                                        mensagem = "ERRO\n\nNão Foi Encontrado Nenhum Veiculo Com Essa Placa!";
                                    }
                                }
                            }else {
                                mensagem = "ERRO\n\nNão há Veiculos Cadastrados!";
                            }
                            JOptionPane.showMessageDialog(null, mensagem);
                            break;
                        case 4:
                            if(veiculos.size()!=0){
                                //mensagem = "VEICULOS CADASTRADOS\n\n";
                                int listagem = Integer.parseInt(JOptionPane.showInputDialog("LISTAR VEICULOS\n\n1.Listar Veiculos Disponiveis Para Aluguel\n2.Listar Veiculos Alugados\n3.Listar Todos os Veiculos"));
                                if(listagem==1){
                                    mensagem = "VEICULOS DISPONIVEIS PARA ALUGUEL\n\n";
                                    for(Veiculo v: veiculos){
                                        if(!v.isAlugado()){
                                            mensagem += v.toString()+"\n";
                                        }
                                    }
                                }else if(listagem==2){
                                    mensagem = "VEICULOS ALUGADOS\n\n";
                                    for(Veiculo v: veiculos){
                                        if(v.isAlugado()){
                                            mensagem += v.toString()+"\n";
                                        }
                                    }
                                }else{
                                    mensagem = "TODOS OS VEICULOS CADASTRADOS\n\n";
                                    for(Veiculo v: veiculos){
                                        mensagem += v.toString()+"\n";
                                    }
                                }
                            }else{
                                mensagem = "ERRO\n\nNão há Veiculos Cadastrados!";
                            }
                            JOptionPane.showMessageDialog(null, mensagem);
                            break;
                        case 5:
                            if(veiculos.size()!=0){
                                placa = JOptionPane.showInputDialog("Digite a Placa do Carro:");
                                for(int i = 0; i<veiculos.size(); i++){
                                    if(veiculos.get(i).getPlaca().equals(placa)){
                                        veiculos.remove(i);
                                        mensagem = "SUCESS\n\nVeiculo Excluido com SUCESSO!!";
                                        break;
                                    }else{
                                        mensagem = "ERRO\n\nNão Foi Encontrado Nenhum Veiculo Com Essa Placa!";
                                    }
                                }                                    
                            }else {
                                mensagem = "ERRO\n\nNão há Veiculos Cadastrados!";
                            }
                            JOptionPane.showMessageDialog(null, mensagem);
                            break;
                        case 0:
                        
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Essa opção não existe, digite o número correspondente a uma das opções do menu apresentado!");
                    }
                    break;
                case 3:
                     
                   break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do Programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Essa opção não existe, digite o número correspondente a uma das opções do menu apresentado!");

            }
        } while (menu != 0);
    }

}