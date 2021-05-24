import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 22222);
            IRemote objet = (IRemote) registry.lookup("objet-banque");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Montant a verser :" );
            float solde = scanner.nextFloat();
            System.out.println(objet.verser(solde));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
