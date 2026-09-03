import java.util.Scanner;

public class gitdev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao;
        String usuario, tel, e, busca="", remove="";
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
                    System.out.println("Insira o nome do contato que deseja buscar: ");
                    busca = scan.next().toLowerCase();
                    Buscar(busca);
                    break;
                
                    case 5:
                    System.out.println("Insira o nome do contato que deseja remover: ");
                    remove = scan.next().toLowerCase();
                    Remover(remove);
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
<<<<<<< HEAD
=======
    public static void exibirMenu(){
    System.out.println("=== AGENDA DE CONTATOS ===");
    System.out.println("1 - Adicionar");
    System.out.println("2 - Listar");
    System.out.println("3 - Buscar");
    System.out.println("4 - Remover");
    System.out.println("0 - Sair");
    System.out.println("Escolha uma opçãosss: ");
    System.out.println("Escolha uma opçãosss: ");
    }
>>>>>>> a-inclusao

 
       
static void exibirMenu(){
    System.out.println("============================== MENU DE CONTATOS ==============================");

    System.out.println("1 - CADASTRAR Contato");
    System.out.println("2 - LISTAR Contatos");
    System.out.println("3 - BUSCAR Contatos");
    System.out.println("4 - EXCLUIR  Contatos");
    System.out.println("5 - SAIR");
    System.out.println("6 - VERIFICAR Contatos");



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
