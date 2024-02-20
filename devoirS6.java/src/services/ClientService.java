package services;

import java.util.List;

import entities.Client;

public class ClientService {

    public void addClient(Client client) {
        clientRepository.insert(client);
    }

    public List<Client> listerClients() {
        return clientRepository.selectAll();
    }
    
}
