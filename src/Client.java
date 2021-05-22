import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 22222);
            IRemote objDis = (IRemote) registry.lookup("objDis");
            Scanner scanner = new Scanner(System.in);
            System.out.print("donner equation:" );
            String equation = scanner.next();
            System.out.println("Resultat : "+objDis.Calculatrice(equation));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
