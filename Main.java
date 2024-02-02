import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Disco disco = new Disco();
        diskTypeSelection(disco);
        diskCharacteristics(disco);

        String diskType = disco.getDiskType();
        System.out.println(disco);
        int option;
        do{
            System.out.println("\n-*-*-MENÚ-*-*-\n" +
                    "1) Girar tu disco\n" +
                    "2) Guardar datos\n" +
                    "3) Escribir datos\n" +
                    "4) Leer datos\n" +
                    "5) Mostrar datos de tu disco\n" +
                    "0) Salir");
            System.out.print("Elige una opción: ");
            option = in.nextInt();
            switch (option){
                case 1:
                    System.out.println(disco.spin());
                    break;
                case 2:
                    System.out.print("Que dato quieres guardar: ");
                    String data = in.next();
                    disco.saveData(data);
                case 3:
                    System.out.println(disco.writeData(diskType));
                    break;
                case 4:
                    System.out.println(disco.readData(diskType));
                    break;
                case 5:
                    System.out.println(disco.toString());
                case 0:
                    System.out.println("Has salido del programa");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta por favor.");
                    break;
            }
        }while(option != 0);
    }
    public static void diskTypeSelection(Disco disco){
        System.out.println("Cual es tu tipo de disco: \n" +
                "1- Cd\n" +
                "2- Disco Duro\n");
        System.out.print("Elige una opción: ");
        int option = in.nextInt();
        switch (option){
            case 1:
                disco.setDiskType("Cd");
                break;
            case 2:
                disco.setDiskType("Disco Duro");
                break;
            default:
                System.out.println("Introduce una opción correcta.");
                break;
        }
    }
    public static void diskCharacteristics(Disco disco){
        System.out.print("Nombre de tu disco: ");
        String name = in.next();
        disco.setName(name);
        System.out.print("Capacidad de tu disco(en GB): ");
        float capacity = in.nextFloat();
        disco.setCapacity(capacity);
    }
}
