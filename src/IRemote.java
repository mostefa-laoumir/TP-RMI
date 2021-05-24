import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemote extends Remote {
    String verser(float solde) throws RemoteException;
}