package git;
import java.util.Scanner;

public class gitdev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao;
        String usuario, tel, e, busca="", remove="";
        do{
            exibirCabecalho();
            exibirMenu();
            System.out.print("Escolha uma opção:");
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
                    System.out.println("Insira o nome do contato que deseja buscar: ");
                    busca = scan.next().toLowerCase();
                    Buscar(busca);
                    break;
                
                    case 5:
                    System.out.println("Insira o nome do contato que deseja remover: ");
                    remove = scan.next().toLowerCase();
                    Remover(remove);
                    break;

                    case 6:
                    System.out.println("Saindo...");
                    break;
                default: System.out.println("Opção Invalida!");
                    
            }
        }while(opcao !=6);

        scan.close();


    }
    public static void exibirCabecalho(){
        System.out.println("==============================");
        System.out.println("      Agenda de Contatos      ");
        System.out.println("==============================");

    }

 
       
static void exibirMenu(){
    System.out.println("============================== MENU DE CONTATOS ==============================");

    System.out.println("1 - CADASTRAR Contato");
    System.out.println("2 - LISTAR Contatos");
    System.out.println("3 - VERIFICAR Contatos");
    System.out.println("4 - BUSCAR  Contatos");
    System.out.println("5 - REMOVER CONTATO");
    System.out.println("6 - SAIR");



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


static void Buscar(String busca) {
    for(int i=0; i<nome.length; i++){
        if(nome[i] != null && nome[i].toLowerCase().contains(busca)){
            System.out.println("Contato ENCONTRADO!");
            System.out.println(nome[i]);
            System.out.println("Telefone: " + telefone[i]);
            System.out.println("Email: " + email[i]);
            return;
        }
    }
    System.out.println("Contato não encontrado.");
}

static void Remover(String remove) {
    for(int i=0; i<nome.length; i++){
        if(nome[i] != null && nome[i].toLowerCase().contains(remove)){
            System.out.println("Contato REMOVIDO!");
            System.out.println(nome[i]);
            System.out.println("Telefone: " + telefone[i]);
            System.out.println("Email: " + email[i]);
            nome[i] = null;
            telefone[i] = null;
            email[i] = null;
               for (int j = i; j < quantidade - 1; j++) {
                nome[j] = nome[j + 1];
                telefone[j] = telefone[j + 1];
                email[j] = email[j + 1];
            }
            nome[quantidade - 1] = null;
            telefone[quantidade - 1] = null;
            email[quantidade - 1] = null;

            quantidade--; 
            Listar();
            return;

        }
    }
    System.out.println("Contato não encontrado.");


}

}
