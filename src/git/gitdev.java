package git;
import java.util.Scanner;
public class gitdev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        String usuario, tel, e;
        do{
            exibirCabecalho();
            exibirMenu();
            opcao = scan.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Digite um nome:");
                    usuario = scan.next();
                    System.out.print("Digite o seu telefone:");
                    tel = scan.next();
                    System.out.print("Digite o seu email:");
                    e = scan.next();
                    Adicionar(usuario, tel, e);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("Desligando...");
                    break;
                
                default: System.out.println("Opção Invalida!");
                    
            }
        }while(opcao !=4);

        scan.close();


    }
    public static void exibirCabecalho(){
        System.out.println("==============================");
        System.out.println("       Agenda de Contatos     ");
        System.out.println("==============================");

    }
    public static void exibirMenu(){
        System.out.println("1)Adicionar contatos.");
        System.out.println("2)Listagem numerada.");
        System.out.println("3)Verificação.");
        System.out.println("4)Sair.");
        System.out.print("Escolha:");
    }

    static String[]nome = new String[50];
    static String[]telefone = new String[50];
    static String[]email = new String[50];

    public static void Adicionar(String usuario, String tel, String e){
        nome[0] = usuario;
        telefone[0] = tel;
        email[0] = e;
        System.out.println(nome[0]);
        System.out.println(telefone[0]);
        System.out.println(email[0]);
    }
    
}
