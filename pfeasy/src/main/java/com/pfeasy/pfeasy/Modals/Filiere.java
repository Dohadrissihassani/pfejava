
package com.pfeasy.pfeasy.Modals;

import java.util.*;

/** @pdOid 81c98e39-9c0f-4eea-a778-5d3cc8b5fa34 */
public class Filiere {
   /** @pdOid e95cbd7a-eed1-4724-a375-0eab4b25cff9 */
   public int fnom;

   /**
    * @pdRoleInfo migr=no name=Etudiant assc=etudier coll=java.util.Collection
    *             impl=java.util.HashSet mult=0..*
    */
   public java.util.Collection<Etudiant> etudiant;
   /**
    * @pdRoleInfo migr=no name=Departement assc=composeDe coll=java.util.Collection
    *             impl=java.util.HashSet mult=1..* side=A
    */
   public java.util.Collection<Departement> departement;

   /** @pdGenerated default getter */
   public Collection<Etudiant> getEtudiant() {
      if (etudiant == null)
         etudiant = new java.util.HashSet<Etudiant>();
      return etudiant;
   }

   /** @pdGenerated default iterator getter */
   public Iterator<Etudiant> getIteratorEtudiant() {
      if (etudiant == null)
         etudiant = new java.util.HashSet<Etudiant>();
      return etudiant.iterator();
   }

   /**
    * @pdGenerated default setter
    * @param newEtudiant
    */
   public void setEtudiant(Collection<Etudiant> newEtudiant) {
      removeAllEtudiant();
      for (Iterator<Etudiant> iter = newEtudiant.iterator(); iter.hasNext();)
         addEtudiant((Etudiant) iter.next());
   }

   /**
    * @pdGenerated default add
    * @param newEtudiant
    */
   public void addEtudiant(Etudiant newEtudiant) {
      if (newEtudiant == null)
         return;
      if (this.etudiant == null)
         this.etudiant = new HashSet<Etudiant>();
      if (!this.etudiant.contains(newEtudiant))
         this.etudiant.add(newEtudiant);
   }

   /**
    * @pdGenerated default remove
    * @param oldEtudiant
    */
   public void removeEtudiant(Etudiant oldEtudiant) {
      if (oldEtudiant == null)
         return;
      if (this.etudiant != null)
         if (this.etudiant.contains(oldEtudiant))
            this.etudiant.remove(oldEtudiant);
   }

   /** @pdGenerated default removeAll */
   public void removeAllEtudiant() {
      if (etudiant != null)
         etudiant.clear();
   }

   /** @pdGenerated default getter */
   public java.util.Collection<Departement> getDepartement() {
      if (departement == null)
         departement = new java.util.HashSet<Departement>();
      return departement;
   }

   /** @pdGenerated default iterator getter */
   public Iterator<Departement> getIteratorDepartement() {
      if (departement == null)
         departement = new java.util.HashSet<Departement>();
      return departement.iterator();
   }

   /**
    * @pdGenerated default setter
    * @param newDepartement
    */
   public void setDepartement(Collection<Departement> newDepartement) {
      removeAllDepartement();
      for (Iterator<Departement> iter = newDepartement.iterator(); iter.hasNext();)
         addDepartement((Departement) iter.next());
   }

   /**
    * @pdGenerated default add
    * @param newDepartement
    */
   public void addDepartement(Departement newDepartement) {
      if (newDepartement == null)
         return;
      if (this.departement == null)
         this.departement = new HashSet<Departement>();
      if (!this.departement.contains(newDepartement))
         this.departement.add(newDepartement);
   }

   /**
    * @pdGenerated default remove
    * @param oldDepartement
    */
   public void removeDepartement(Departement oldDepartement) {
      if (oldDepartement == null)
         return;
      if (this.departement != null)
         if (this.departement.contains(oldDepartement))
            this.departement.remove(oldDepartement);
   }

   /** @pdGenerated default removeAll */
   public void removeAllDepartement() {
      if (departement != null)
         departement.clear();
   }

}