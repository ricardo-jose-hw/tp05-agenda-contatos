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
                    Listar();
                    break;

                case 3:
                    Verificar();
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
        System.out.println("      Agenda de Contatos      ");
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
    static int quantidade = 0;

    public static void Adicionar(String usuario, String tel, String e){
        nome[quantidade] = usuario;
        telefone[quantidade] = tel;
        email[quantidade] = e;
        quantidade++;
    }
    public static void Listar(){
        System.out.println("NOMES:");
        for(int i=0; i<nome.length;i++){
            if(nome[i] != null){
                System.out.println("[" +(i+1)+ "] "+nome[i]);
            }
        }
        System.out.print("\n");
        System.out.println("TELEFONES:");
        for(int i=0;i<telefone.length;i++){
            if(telefone[i] != null){
                System.out.println("[" +(i+1)+ "] "+telefone[i]);
            }
        }
        System.out.print("\n");
        System.out.println("E-MAILS:");
        for(int i=0;i<email.length;i++){
            if(email[i] != null){
                System.out.println("[" +(i+1)+ "] "+email[i]);
            }
        }
    }
    public static void Verificar(){
        int sub = 0;
        sub = nome.length - quantidade;
        if(quantidade == nome.length && quantidade == telefone.length && quantidade == email.length){
            System.out.println("Está cheio!!!!");
            return;
        }
        else{
            System.out.println("Quantidade de espaço em todos os contatos: "+sub);
            return;
        }
    }
    
}
