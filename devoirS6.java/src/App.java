import java.util.List;
import java.util.Scanner;

import entities.Adresse;
import entities.Client;
import services.AdresseService;
import services.ClientService;

public class App {
    public static void main(String[] args) throws Exception {
        
           AdresseService adresseService=new AdresseService();
           ClientService clientService=new ClientService();
           Scanner scanner=new Scanner(System.in);
           int choix;
           do{
              System.out.println("1-Creer un client");
              System.out.println("2-Lister les  clents");
              System.out.println("3-Ajouter une adresse et lui associe un client");
              System.out.println("4-Lister les adresse en affichant le nom du client");
              System.out.println("5-Quitter");
              choix=scanner.nextInt();
              scanner.nextLine();
              switch (choix) {
                case 1:
                       Client client=new Client();
                         System.out.println("Entrer l'id");
                        client.setId(scanner.nextLine());
                        System.out.println("Entrer le nomcomplet");
                        client.setNomComplet(scanner.nextLine());
                        System.out.println("Entrer le telephone");
                        client.setTelephone(scanner.nextLine());
                        System.out.println("Entrer l'email");
                        client.setEmail(scanner.nextLine());
                        clientService.addClient(client);
                    break;
                case 2:
                  List<Client>  listerClients = clientService.listerClients();
                    for (Client cl: listerClients) {
                       System.out.println("id: "+ cl.getId());
                       System.out.println("nomComplet: "+ cl.getNomComplet());
                       System.out.println("telephone: "+ cl.getTelephone());
                       System.out.println("email: "+ cl.getEmail());
                    }
                    break;
                case 3:
                        Adresse adresse=new Adresse();
                        System.out.println("Entrer l'id");
                        adresse.setId(scanner.nextLine());
                        System.out.println("Entrer la ville");
                        adresse.setVille(scanner.nextLine());
                        System.out.println("Entrer le quartier");
                        adresse.setQuartier(scanner.nextLine());
                        System.out.println("Entrer le numVilla");
                        adresse.setNumVilla(scanner.nextLine());
                        adresseService.addAdresse(adresse);
                    break;

                    
                    case 4:

                    List<Adresse>  listerAdesses = adresseService.listerAdesses();
                    Adresse[] listerAdresses;
                    for (Adresse ad: listerAdresses) {
                       System.out.println("id: "+ ad.getId());
                       System.out.println("ville: "+ ad.getVille());
                       System.out.println("quartier: "+ ad.getQuartier());
                       System.out.println("numVille: "+ ad.getNumVilla());
                    }


                         System.out.println("Entrer le numero de Telephone");
                         String tel= scanner.nextLine();
                        comptesList=compteService.listerCompteUnClient(tel);
                        for (Compte cp: comptesList) {
                            System.out.println("Numero: "+ cp.getNumero());
                            System.out.println("Solde: "+ cp.getSolde());
                            System.out.println("===============");
                        }
                    break;

                   
                    
                default:
                    break;
              }
           }while(choix!=5);
       
    }
}

    