import java.rmi.RemoteException;

import java.util.ArrayList;

public class Distributeur implements ServiceDistributeur {

	public ArrayList<Phrases>  traiterTexte(ArrayList<Phrases> travail, String mot) throws RemoteException {
		ArrayList<Phrases> res = new ArrayList<Phrases>();
		for(Phrases ph : travail)
		{
			if(ph.getPhr().contains(mot))
			{
				res.add(ph);
			}
		}
		return res;
		
	}

}