package git;
import java.util.Scanner;
public class gitdev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[]nome = new String[50];
        String[]telefone = new String[50];
        String[]email = new String[50];
        int opcao;
        do{
            exibirCabecalho();
            exibirMenu();
            opcao = scan.nextInt();

            switch(opcao){
                case 1:
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
}
