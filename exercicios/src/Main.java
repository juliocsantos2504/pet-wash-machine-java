import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;
        do {
            System.out.println("------- escolha uma das opcoes---------");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer amaquina com agua");
            System.out.println("3 - Abastecer amaquina com shampoo");
            System.out.println("4 - verifica agua da maquina");
            System.out.println("5 - verifica shampoo da maquina");
            System.out.println("6 - verifica se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar a maquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 ->  petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opcao invalida");
            }
        }while (true);
    }
    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }
    private static void setWater(){
        System.out.println("Tentando colocar agua na maquina");
        petMachine.addWater();
    }
    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println(" A maquina esta no momento com "
                +amount+ "litro(s) de agua");
    }
    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println(" A maquina esta no momento com "
                +amount+ "litro(s) de shampoo");
    }

    private static void checkIfHasPetInMachine() {
       var hasPet =  petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na maquina " : "Nao tem pet na maquina");
    }


    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
            System.out.println("Informe o nome do Pet");
            name = scanner.next();
        }
        var pet = new Pet(name);
        petMachine.setPet(pet);
    }


}