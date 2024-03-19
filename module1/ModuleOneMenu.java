import java.util.Scanner;

public class ModuleOneMenu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.print("1. Write Data \n2. Read Data \n3. Exit \nInput Selection: ");
                int choice = scanner.nextInt();
                switch(choice){
                    case 1: ModuleOneWrite.writeData();
                        System.out.println("\n **New Data has been written**\n");
                        break;
                    case 2: ModuleOneRead.readData();
                        break;
                    case 3: System.exit(0);
                    default: System.out.println("Invalid Selection");
                        break;

                }
            } catch(Exception ex){
                System.out.println("Invalid Input. ");
            }
        }
    }
}
