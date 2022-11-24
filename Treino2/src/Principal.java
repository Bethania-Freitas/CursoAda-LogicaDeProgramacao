import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	static final int TAM = 10;
	static Usuarios[] perfis = new Usuarios[TAM];
	static Postagens[] post = new Postagens[TAM];
	static int quantPost = 0;
	static int quantUsuarios = 0;
	static int login = 0;

	public static void main(String[] args) {
		System.out.println("      **** Bee ****      ");
		System.out.println("**** Sua rede social ****");
		System.out.println();
		menuInicial();
	}

	static void menuInicial() {
		try {
			System.out.println("+++++ MENU INICIAL ++++++");
			System.out.println("digite 1 - para Cadastrar");
			System.out.println("digite 2 - para Login");
			System.out.println("digite 3 - para Fechar");
			login = sc.nextInt();
			switch (login) {
			case 1:
				cadastrar();
				menuInicial();
				break;
			case 2:
				login();
				break;
			case 3:
				sair();
				break;
			default:
				System.out.println("Opção inválida");
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Caractere inválido");
		} catch (Exception e) {
			System.out.println("Ups... ocorreu um erro no sistema, tente novamente.");
		}
	}

	private static void login() {
		if (quantUsuarios == 0) {
			System.out.println("É necessário que o cadastro seja feito primeiro");
			menuInicial();
		}
		System.out.println("---- LOGIN -----");
		System.out.println("Login: ");
		var login = sc.next().toUpperCase();
		System.out.println("Senha: ");
		var senha = sc.next();
		for (int i = 0; i < quantUsuarios; i++) {
			if (perfis[i].login.equals(login) && perfis[i].senha.equals(senha)) {
					System.out.println();
					System.out.printf("Bem vindo/a rede BEE, %s !", perfis[i].nome);
					System.out.println();
					menuUsuario();
					break;
			} else {
				System.out.println("Login ou senha inválidos.");
				menuInicial();
			}
		}
	}

	private static void menuUsuario() {
		System.out.println();
		System.out.println("----- MENU DO USUÁRIO -----");
		System.out.println("digite 1 - para Postar");
		System.out.println("digite 2 - para Timeline");
		System.out.println("digite 3 - para Sair");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			postar();
			menuUsuario();
			break;
		case 2:
			timeline();
			break;
		case 3:
			sair();
		}
	}

	static void timeline() {
		System.out.println();
		System.out.println("----- TIMELINE DO USUÁRIO -----");
		for (int i = 0; i < quantPost; i++) {
			System.out.printf("%s às %s - '%s'\n", post[i].data, post[i].hora, post[i].conteúdo);
		}
		menuUsuario();
	}

	static void postar() {
		Postagens a = new Postagens();
		System.out.println();
		System.out.println("----- POSTAR -----");
		System.out.printf("Data: ");
		a.data = sc.next();
		System.out.printf("Hora: ");
		a.hora = sc.next();
		System.out.printf("Mensagem: ");
		sc.nextLine();
		a.conteúdo = sc.nextLine();
		while (a.data.isEmpty() | a.hora.isEmpty() | a.conteúdo.isEmpty()) {
			System.out.println("Todos os campos precisam ser preenchidos");
			return;
		}
		post[quantPost] = a;
		quantPost++;
	}

	static void cadastrar() {
		Usuarios a = new Usuarios();
		System.out.println("---- NOVO USUÁRIO -----");
		System.out.println("Digite seu nome para cadastrar:");
		sc.nextLine();
		a.nome = sc.nextLine();
		System.out.println("Digite seu login para cadastrar:");
		a.login = sc.next().toUpperCase();
		for (int i = 0; i < quantUsuarios; i++) {
			while (a.login.equals(perfis[i].login)) {
				System.out.println("Login já existe no sistema, tentar novamente");
				return;
			}
		}
		System.out.println("Digite sua senha: ");
		a.senha = sc.next();
		while (a.nome.isEmpty() | a.login.isEmpty() | a.senha.isEmpty()) {
			System.out.println("Nome, login ou senha não foram registrados, tente novamente");
			return;
		}
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println();
		perfis[quantUsuarios] = a;
		quantUsuarios++;
	}
	
	private static void sair() {
		System.out.println("Sistema finalizado");
		System.out.println("--  Volte logo!  --");
		System.out.println();
		menuInicial();
	}

}
