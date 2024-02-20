import java.util.ArrayList;

import com.mysql.cj.xdevapi.Client;

public class Adresse {

    private int id;
    private String ville;
    private String quartier;
    private String numVilla; 

    private ArrayList<Client> ClientList;

    public int getId() {
        return id;
    }

    public void setId(String string) {
        this.id = string;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getNumVilla() {
        return numVilla;
    }

    public void setNumVilla(String numVilla) {
        this.numVilla = numVilla;
    }

    public ArrayList<Client> getClientList() {
        return ClientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        ClientList = clientList;
    }
}
