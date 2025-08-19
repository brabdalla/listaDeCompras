import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo a Lista de Compra");
        System.out.println("***************************");
        
        Scanner scanner = new Scanner(System.in);
        String[] minhaLista = new String[5];
        /*String item1,item2,item3,item4,item5;
        System.out.println("Insira o item 1");
        item1 = scanner.nextLine();
        System.out.println("Insira o item 2");
        item2 = scanner.nextLine();
        System.out.println("Insira o item 3");
        item3 = scanner.nextLine();
        System.out.println("Insira o item 4");
        item4 = scanner.nextLine(); 
        System.out.println("Insira o item 5");
        item5 = scanner.nextLine();
        System.out.println("Seus items são: "+ item1 +" - "
        + item2+" - "+ item3+" - "+ item4+" - "+ item5);*/

       /*System.out.println("Insira o item 1");
        minhaLista[0] = scanner.nextLine();
        System.out.println("Insira o item 2");
        minhaLista[1] = scanner.nextLine();
        System.out.println("Insira o item 3");
        minhaLista[2] = scanner.nextLine();
        System.out.println("Insira o item 4");
        minhaLista[3] = scanner.nextLine(); 
        System.out.println("Insira o item 5");
        minhaLista[4] = scanner.nextLine();
        System.out.println("Seus items são: "+ minhaLista[0] +" - "
        + minhaLista[1]+" - "+ minhaLista[2]+" - "
        + minhaLista[3]+" - "+ minhaLista[4]);*/

        for (int i = 0; i < minhaLista.length; i++) {
            System.out.println("Insira o item "+ (i+1));
            minhaLista[i] =  scanner.nextLine();
        }
        System.out.println("Seus items são: "+ minhaLista[0] +" - "
        + minhaLista[1]+" - "+ minhaLista[2]+" - "
        + minhaLista[3]+" - "+ minhaLista[4]);

    }
}
