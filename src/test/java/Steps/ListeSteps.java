package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListeSteps {
  
  // Etape Given : utilisateur connecté
  @Given("je suis un utilisateur connecté")
  public void je_suis_un_utilisateur_connecté() {
      // Action simulée pour indiquer que l'utilisateur est connecté
      System.out.println("Inside Step - un utilisateur connecté ");
  }

  // Etape When : consultation de la liste des livres
  @When("je consulte la liste des livres")
  public void je_consulte_la_liste_des_livres() {
      // Action simulée pour indiquer que l'utilisateur consulte les livres
      System.out.println("Inside Step - un utilisateur consulte la liste des livres ");
  }

  // Etape Then : voir les livres disponibles
  @Then("je devrais voir tous les livres disponibles à la bibliothèque")
  public void je_devrais_voir_tous_les_livres_disponibles_à_la_bibliothèque() {
      // Action simulée pour indiquer que l'utilisateur voit les livres disponibles
      System.out.println("Inside Step - un utilisateur voir tous les livres disponibles à la bibliothèque ");
  }
}
