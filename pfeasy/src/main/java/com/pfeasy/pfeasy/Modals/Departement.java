
package com.pfeasy.pfeasy.Modals;

import java.util.*;

public class Departement {

   public String dnom;

   public Collection<Professeur> professeur;

   public Collection<Administrateur> administrateur;

   public Collection<Professeur> getProfesseur() {
      if (professeur == null)
         professeur = new HashSet<Professeur>();
      return professeur;
   }

   public Iterator<Professeur> getIteratorProfesseur() {
      if (professeur == null)
         professeur = new java.util.HashSet<Professeur>();
      return professeur.iterator();
   }

   /**
    * @pdGenerated default setter
    * @param newProfesseur
    */
   public void setProfesseur(Collection<Professeur> newProfesseur) {
      removeAllProfesseur();
      for (Iterator<Professeur> iter = newProfesseur.iterator(); iter.hasNext();)
         addProfesseur((Professeur) iter.next());
   }

   /**
    * @pdGenerated default add
    * @param newProfesseur
    */
   public void addProfesseur(Professeur newProfesseur) {
      if (newProfesseur == null)
         return;
      if (this.professeur == null)
         this.professeur = new java.util.HashSet<Professeur>();
      if (!this.professeur.contains(newProfesseur))
         this.professeur.add(newProfesseur);
   }

   /**
    * @pdGenerated default remove
    * @param oldProfesseur
    */
   public void removeProfesseur(Professeur oldProfesseur) {
      if (oldProfesseur == null)
         return;
      if (this.professeur != null)
         if (this.professeur.contains(oldProfesseur))
            this.professeur.remove(oldProfesseur);
   }

   /** @pdGenerated default removeAll */
   public void removeAllProfesseur() {
      if (professeur != null)
         professeur.clear();
   }

   /** @pdGenerated default getter */
   public Collection<Administrateur> getAdministrateur() {
      if (administrateur == null)
         administrateur = new java.util.HashSet<Administrateur>();
      return administrateur;
   }

   /** @pdGenerated default iterator getter */
   public Iterator<Administrateur> getIteratorAdministrateur() {
      if (administrateur == null)
         administrateur = new java.util.HashSet<Administrateur>();
      return administrateur.iterator();
   }

   /**
    * @pdGenerated default setter
    * @param newAdministrateur
    */
   public void setAdministrateur(Collection<Administrateur> newAdministrateur) {
      removeAllAdministrateur();
      for (Iterator<Administrateur> iter = newAdministrateur.iterator(); iter.hasNext();)
         addAdministrateur((Administrateur) iter.next());
   }

   /**
    * @pdGenerated default add
    * @param newAdministrateur
    */
   public void addAdministrateur(Administrateur newAdministrateur) {
      if (newAdministrateur == null)
         return;
      if (this.administrateur == null)
         this.administrateur = new java.util.HashSet<Administrateur>();
      if (!this.administrateur.contains(newAdministrateur))
         this.administrateur.add(newAdministrateur);
   }

   /**
    * @pdGenerated default remove
    * @param oldAdministrateur
    */
   public void removeAdministrateur(Administrateur oldAdministrateur) {
      if (oldAdministrateur == null)
         return;
      if (this.administrateur != null)
         if (this.administrateur.contains(oldAdministrateur))
            this.administrateur.remove(oldAdministrateur);
   }

   /** @pdGenerated default removeAll */
   public void removeAllAdministrateur() {
      if (administrateur != null)
         administrateur.clear();
   }

}