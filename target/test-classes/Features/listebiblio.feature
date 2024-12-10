
@listlivre
Feature: Consultation des livres

  @dispolivre
  Scenario: Affichage de la liste des livres disponibles
    Given je suis un utilisateur connecté
    When je consulte la liste des livres
    Then je devrais voir tous les livres disponibles à la bibliothèque


