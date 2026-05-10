	import java.util.Scanner;
	import java.util.Locale;
	import java.util.ArrayList;
	
	public class Main {
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
	
			ArrayList<Funcionario> funcionarios = new ArrayList<>();
			
			int op;
			String usuario = "";
			String senha = "";
			String conta_usuario = "";
			String conta_senha = "";
			String buscar_funcionario = "";
			String remover_funcionario = "";
			boolean conta_criada = false;
			boolean login = false;
			
			System.out.println("Escolha uma das opções abaixo: ");
			System.out.println("");
			
			do {
			
			System.out.println("[1] - CRIAR CONTA.");
			System.out.println("[2] - LOGIN.");
			System.out.println("[3] - CADASTRAR FUNCIONÁRIO.");
			System.out.println("[4] - CONSULTAR FUNCIONÁRIO.");
			System.out.println("[5] - LISTAR FUNCIONÁRIOS");
			System.out.println("[6] - REMOVER FUNCIONÁRIO.");
			System.out.println("[7] - SAIR");
			op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
			
			case 1:
					
				if(conta_criada) {
					System.out.println("Conta já criada.");
				}
				else {
					System.out.println("### CRIAR CONTA ###");
					System.out.println("");
					
					System.out.println("Crie seu usuário: ");
					usuario = sc.nextLine();
					
					System.out.println("Crie sua senha: ");
					senha = sc.nextLine();
					
					conta_criada = true;
					
					System.out.println("");
					System.out.println("Conta criada com sucesso!");
					System.out.println("");
						
				}
				break;	
			
			case 2:
				
				if(!conta_criada) {
					System.out.println("Crie uma conta.");
				}
				else if(login) {
					System.out.println("Login já realizado.");
				}
				else {
					while(!login) {
						System.out.println("### LOGIN ###");
						System.out.println("");
						
						System.out.println("Digite seu usuário: ");
						conta_usuario = sc.nextLine();
						
						System.out.println("Digite sua senha: ");
						conta_senha = sc.nextLine();
						
						if(conta_usuario.equals(usuario) && conta_senha.equals(senha)) {
							login = true;
							System.out.println("");
							System.out.println("Login realizado com sucesso!");
							System.out.println("");
						}
						else {
							System.out.println("Usuário ou senha incorretos.");
						}
					}
				}
				break;
				
			case 3:
				
				if(!conta_criada) {
					System.out.println("Crie uma conta.");
				}
				else if(!login) {
					System.out.println("Faça login para continuar.");
				}
				else {
					
					System.out.println("### CADASTRAR FUNCIONÁRIO ###");
					System.out.println("");
					
					Funcionario fnc = new Funcionario();
					
					System.out.println("Nome: ");
					fnc.nome = sc.nextLine();
					
					System.out.println("Setor: ");
					fnc.setor = sc.nextLine();
					
					System.out.println("Tarefa: ");
					fnc.tarefa = sc.nextLine();
					
					System.out.println("Idade: ");
					fnc.idade = sc.nextInt();
					
					System.out.println("Salário: ");
					fnc.salario = sc.nextDouble();
					
					funcionarios.add(fnc);
					
					System.out.println("");
					System.out.println("Funcionário cadastrado!");
					System.out.println("");
				}
				break;
				
			case 4:
				
				if(!conta_criada) {
					System.out.println("Crie uma conta.");
				}
				else if(!login) {
					System.out.println("Faça login para continuar.");
				}
				else {
					System.out.println("Digite o nome do funcionário: ");
					buscar_funcionario = sc.nextLine();
					boolean encontrado = false;
					
					for(Funcionario n : funcionarios) {
						if(buscar_funcionario.equalsIgnoreCase(n.nome)) {
							encontrado = true;
							
							System.out.println("");
							System.out.println("Funcionário encontrado!");
							System.out.println("");
							
							System.out.println("Nome: " + n.nome);
							System.out.println("Setor: " + n.setor);
							System.out.println("Tarefa: " + n.tarefa);
							System.out.println("Idade: " + n.idade);
							System.out.println("Salário: " + n.salario);
							System.out.println("");
						}
					}
					if(!encontrado) {
						System.out.println("Funcionário não encontrado.");
					}
					
				}
				break;
				
			case 5:
				
				if(!conta_criada) {
					System.out.println("Crie uma conta.");
				}
				else if(!login) {
					System.out.println("Faça login.");
				}
				else {
					System.out.println("### LISTAR FUNCIONÁRIO ###");
					System.out.println("");
					
					for(Funcionario n : funcionarios) {
						System.out.println("Nome: " + n.nome);
						System.out.println("Setor: " + n.setor);
						System.out.println("Tarefa: " + n.tarefa);
						System.out.println("Idade: " + n.idade);
						System.out.printf("Salário %.2f", n.salario);
						System.out.println("");
						System.out.println("");
					}
				}
				break;
				
			case 6:
				
				if(!conta_criada) {
					System.out.println("Crie uma conta.");
				}
				else if(!login) {
					System.out.println("Faça login.");
				}
				else {
					System.out.println("### REMOVER FUNCIONÁRIO ###");
					System.out.println("");
					
					System.out.println("Digite o nome do funcionário: ");
					remover_funcionario = sc.nextLine();
					int posicao = -1;
					
					for(int i = 0; i < funcionarios.size(); i++) {
						if(funcionarios.get(i).nome.equalsIgnoreCase(remover_funcionario)) {
							posicao = i;
							break;
						}
					}
					if(posicao != -1) {
						funcionarios.remove(posicao);
						System.out.println("Funcionário removido com sucesso!");
					}
					else {
						System.out.println("Funcionário não encontrado.");
					}
				}
				break;
				
			case 7:
				System.out.println("Programa encerrado com sucesso!");
				break;
				
			default:
				
				System.out.println("Opção inválida.");
				break;
		
			}// Chave do switch;
			
			}while(op != 7);
			
			sc.close();
		}
	}