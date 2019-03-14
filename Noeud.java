import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Noeud {
public static void main (String [] args) throws RemoteException, NotBoundException
{
	
	Distributeur dis = new Distributeur();
	
	Registry reg = LocateRegistry.getRegistry(args[0], Integer.parseInt(args[1]) );

	
	ServiceTexte rd = (ServiceTexte) reg.lookup("Phrases");
	
	ServiceDistributeur st = (ServiceDistributeur) UnicastRemoteObject.exportObject(dis,0);
	
	
	rd.enregistrerNoeud(st);
	System.out.println("Noeud connecter aux serveur");	
	

}
}
