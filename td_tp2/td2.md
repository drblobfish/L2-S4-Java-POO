# TD 2

## Exo 1

```{Java}
public class Client {
    private int numero;
    private String nom;
    private double solde;

    //Constructeurs
    public Client(int numero,String nom, double solde){
        this.numero = numero;
        this.nom = nom;
        this.solde = solde;
    }
    public Client(){
        this.Client(0, “”, 0.0);
        
    }
    //Méthode
    public void afficherSolde(){
        System.out.println("Le Solde de votre compte : " + solde);
    }
}
class TestClient{
    public static void main(String[] args){
    Client c1 ;
    c1.afficherSolde();
}
```