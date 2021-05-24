import java.rmi.RemoteException;

public class RemoteImpl implements IRemote {
    public float solde;
    @Override
    public String verser(float solde) throws RemoteException {
        this.solde = solde;
        return "Solde actuel : "+this.solde;
    }
}