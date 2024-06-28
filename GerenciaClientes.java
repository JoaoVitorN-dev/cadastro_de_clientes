

/*
 *Aluno: João Vitor Nepomuceno de Souza RA:194546  
 *Aluno: João Afonso Moraes RA: 193387
 */
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciaClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao=0;
        boolean cadastrado;
        boolean termino10 = false; 
        boolean termino20 = false; 
        boolean termino30 = false; 
        Scanner leitor = new Scanner (System.in);
        
        
        
        while(opcao!=3){
            System.out.println("===================================");
            System.out.println("|\t Menu de Opcoes           |");
            System.out.println("===================================");
            System.out.println("|\t 1 Cadastrar Cliente      |");
            System.out.println("|\t 2 Exibir Cliente         |");
            System.out.println("|\t 3 Sair                   |");
            System.out.println("===================================");
            System.out.print("Escolha uma opcao: ");
            boolean controle2=false;
            while (controle2!=true){
                try{
                opcao=leitor.nextInt();
                controle2=true;
                }
                catch(Exception e){
                    System.out.println("Entrada invalida, digite apenas numeros inteiros!");
                    leitor.nextLine();
                }
            }
            leitor.nextLine();
            switch(opcao){
                case 1: 
                    //Intanciando Classe Data
                    ClasseData data1 = new ClasseData();
                    //Coletando cpf do cliente
                    System.out.print("Infome o cpf do cliente no formato 123.456.789-10: ");
                    Pessoa cliente = new Pessoa(leitor.nextLine());
                    //instanciando o cpf do cliente com a url da pasta
                    GerenciaArquivosTxt grava1 = new GerenciaArquivosTxt(cliente.getCpf(),"/home/joaovitor/teste1");
                    //verificando se o cliente esta cadastrado
                    cadastrado = grava1.verificaArquivo();
                    
                     if (cadastrado){
                         System.out.println("Cliente ja cadastrado");
                         System.out.println("===================================");
                         System.out.println("|\t1 Atualizar Cadastro      |");
                         System.out.println("|\t2 Exibir Dados            |");
                         System.out.println("===================================");
                         System.out.print("Escolha uma opcao: ");
                         int opp=0;
                         boolean controle=false;
                         while(controle!=true){
                            try{
                             int menuCliente = leitor.nextInt();
                             opp=menuCliente;
                             controle=true;
                            }
                            catch(Exception e){
                                System.out.println("opcao invalida informe apenas numeros inteiros! ");
                                leitor.nextLine();
                            }
                         }
                         
                          leitor.nextLine();
                         
                          switch (opp){
                              
                              case 1:
                                System.out.print("Informe o nome do cliente: ");
                                cliente.setNome(leitor.nextLine());
                                
                                    while(termino10!=true){
                                    
                                        try{
                                        
                                            System.out.print("Informe o DIA de nascimento do cliente: ");
                                            int dia = leitor.nextInt();
                                            
                                            System.out.print("Informe o MES de nascimento do cliente: ");
                                            int mes =leitor.nextInt();
                                
                                            System.out.print("Informe o ANO de nascimento do cliente: ");
                                            int ano = leitor.nextInt();
                                
                                            data1.setData(dia, mes, ano);
                                            cliente.setDataNascimento(data1.getData());
                                
                                            leitor.nextLine();
                                            termino10 = true;
                                
                                        }
                                    
                                        catch(Exception e){
                                         System.out.println("Erro: Informe um Valor Inteiro no Dia/Mes/Ano");
                                         leitor.nextLine(); 
                                        }
                                    
                                    }
                                    termino10 = false;
                                
                                System.out.print("Informe o Email do cliente: ");
                                cliente.setEmail(leitor.nextLine());
                                
                                String infos;
                                
                                infos=("Nome do cliente: "+cliente.getNome()+",Data de nascimento: "+cliente.getDataNascimento()+
                                        ",Email do cliente: "+cliente.getEmail()+",CPF do cliente: "+cliente.getCpf());
                                String[] partesTexto = infos.split(",");
                                
                                String escreva=(partesTexto[0]+"\n"+ partesTexto[1]+"\n"+partesTexto[2]+"\n"+partesTexto[3]);
                                
                                grava1.gravaArquivo(escreva);
                                 System.out.println("");
                                 System.out.println("Cadatro atualizado! ");
                                 System.out.println("");
                               break;
                                
                              case 2:
                                  System.out.println("===================================");
                                  System.out.println("|\t EXIBINDO INFORMACOES     |");
                                  System.out.println("===================================");  
                                  ArrayList<String> informacoesCliente = new ArrayList<String>();
                                  informacoesCliente = grava1.leArquivo();
                                  for (String lendoCliente : informacoesCliente){
                                      System.out.println(lendoCliente);
                                  }
                                  break;
                               
                              default: 
                                  System.out.println("Opcao inexistente! tente outra vez...");
                          }
                     }
                     else{
                         System.out.print("Informe o nome do cliente: ");
                         cliente.setNome(leitor.nextLine());
                               
                         while(termino20 != true){
                             
                             try{
                                 
                                 System.out.print("Informe o DIA de nascimento do cliente: ");
                                 int dia=leitor.nextInt();
                         
                                 System.out.println("Informe o MES de nascimento do cliente: ");
                                 int mes =leitor.nextInt();
                                
                                 System.out.println("Informe o ANO de nascimento do cliente: ");
                                 int ano = leitor.nextInt();
                         
                                 data1.setData(dia, mes, ano);
                                 cliente.setDataNascimento(data1.getData());
                         
                                 leitor.nextLine();
                                 
                                 termino20 = true;
                                 
                                 }
                             
                             catch(Exception e){
                                 System.out.println(" Erro: Informe um Valor Inteiro em Dia/Mes/Ano ");
                                 leitor.nextLine();
                                }
                             
                         }
                         termino20 = false;
                         
                         System.out.print("Informe o Email do cliente: ");
                         cliente.setEmail(leitor.nextLine());
                                
                         String infos;
                                
                         infos=("Nome do cliente: "+cliente.getNome()+",Data de nascimento: "+cliente.getDataNascimento()+
                                        ",Email do cliente: "+cliente.getEmail()+",CPF do cliente: "+cliente.getCpf());
                         String[] partesTexto = infos.split(",");
                                
                         String escreva=(partesTexto[0]+"\n"+ partesTexto[1]+"\n"+partesTexto[2]+"\n"+partesTexto[3]);
                                
                         grava1.gravaArquivo(escreva);
                         System.out.println("");
                         System.out.println("Cliente Cadastrado! ");
                         System.out.println("");
                     }
                break;
                
                case 2:
                    //Instanciando nova classe data
                    ClasseData data2 = new ClasseData();
                    //Coletando cpf do cliente
                    System.out.print("Infome o cpf do cliente no formato 123.456.789-10: ");
                    Pessoa cliente2 = new Pessoa (leitor.nextLine());
                    //instanciando o cpf do cliente com a url da pasta
                    GerenciaArquivosTxt grava2 = new GerenciaArquivosTxt(cliente2.getCpf(),"/home/joaovitor/teste1");
                    //verificando se o cliente esta cadastrado
                    cadastrado = grava2.verificaArquivo();
                    
                     if (cadastrado){
                         System.out.println("Cliente ja cadastrado");
                         System.out.println("===================================");
                         System.out.println("|\t EXIBINDO INFORMACOES     |");
                         System.out.println("===================================");  
                         ArrayList<String> informacoesCliente = new ArrayList<String>();
                         informacoesCliente = grava2.leArquivo();
                         for (String lendoCliente : informacoesCliente){
                            System.out.println(lendoCliente);
                          }
                         System.out.println("");
                     }
                     
                     else{
                         System.out.println("Cliente NAO cadastrado, deseja cadastrar? ");
                         System.out.println("===================================");
                         System.out.println("|\t1 SIM            |");
                         System.out.println("|\t2 NAO            |");
                         System.out.println("===================================");
                         System.out.print("Escolha uma opcao: ");
                         int opp=0;
                         boolean controle=false;
                         while(controle!=true){
                            try{
                             int menuCliente = leitor.nextInt();
                             opp=menuCliente;
                             controle=true;
                            }
                            catch(Exception e){
                                System.out.println("opcao invalida informe apenas numeros inteiros! ");
                                leitor.nextLine();
                            }
                         }
                          leitor.nextLine();
                         switch (opp){
                              case 1:

                                System.out.print("Informe o nome do cliente: ");
                                cliente2.setNome(leitor.nextLine());
                                
                                while(termino30!=true){
                                    
                                    try{
                                    
                                        System.out.print("Informe o DIA do nascimento do cliente: ");
                                        int dia=leitor.nextInt();

                                        System.out.println("Informe o MES de nascimento do cliente: ");
                                        int mes =leitor.nextInt();

                                        System.out.println("Informe o ANO de nascimento do cliente: ");
                                        int ano = leitor.nextInt();
                                
                                        data2.setData(dia, mes, ano);

                                        cliente2.setDataNascimento(data2.getData());

                                        leitor.nextLine();
                                
                                        termino30 = true;
                                    }
                                
                                    catch(Exception e){
                                    System.out.println("Erro: Informe um Valor Inteiro para Dia/Mes/Ano");
                                    leitor.nextLine();
                                    
                                    }
                                
                                }
                                termino30=false;
                                
                                System.out.print("Informe o Email do cliente: ");
                                cliente2.setEmail(leitor.nextLine());
                                
                                String infos;
                                
                                infos=("Nome do cliente: "+cliente2.getNome()+",Data de nascimento: "+cliente2.getDataNascimento()+
                                        ",Email do cliente: "+cliente2.getEmail()+",CPF do cliente: "+cliente2.getCpf());
                                String[] partesTexto = infos.split(",");
                                
                                String escreva=(partesTexto[0]+"\n"+ partesTexto[1]+"\n"+partesTexto[2]+"\n"+partesTexto[3]);
                                
                                grava2.gravaArquivo(escreva);
                                  System.out.println("");
                                 System.out.println("Cliente Cadastrado! ");
                                 System.out.println("");
                               break;
                                
                              case 2:
                                break;
                                
                              default: 
                                System.out.println("Opcao inexistente! tente outra vez...");
                            }
                     }
                    
                break;
                    
                    
                case 3: 
                    System.out.println("Finalizando.....");
                    opcao=3;
                    break;
                 
                    
                default: 
                    System.out.println("Opcao inexistente! tente outra vez...");
            }
        }
    }
}
