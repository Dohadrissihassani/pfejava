/***********************************************************************
 * Module:  Groupe.java
 * Author:  hp
 * Purpose: Defines the Class Groupe
 ***********************************************************************/
package com.pfeasy.pfeasy.Modals;

import java.util.Collection;
import java.util.Iterator;

/** @pdOid 946cfe75-9e33-4bf6-b227-1158defee505 */
public class Groupe {
   /** @pdOid 74a38171-be2f-4aea-a6c5-16551937aa22 */
   public java.lang.String membres;
   /** @pdOid 9f6850dd-1baa-4111-a57f-57ec9cd582c3 */
   public int numero;

   /**
    * @pdRoleInfo migr=no name=Etudiant assc=appartientA coll=java.util.Collection
    *             impl=java.util.HashSet mult=1..* type=Composition
    */
   public java.util.Collection<Etudiant> etudiant;
   /**
    * @pdRoleInfo migr=no name=ResponsablePFE assc=affecter
    *             coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A
    */
   public java.util.Collection<ResponsablePFE> responsablePFE;

   /** @pdGenerated default getter */
   public java.util.Collection<Etudiant> getEtudiant() {
      if (etudiant == null)
         etudiant = new java.util.HashSet<Etudiant>();
      return etudiant;
   }

   /** @pdGenerated default iterator getter */
   public java.util.Iterator<Etudiant> getIteratorEtudiant() {
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
         this.etudiant = new java.util.HashSet<Etudiant>();
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
   public java.util.Collection<ResponsablePFE> getResponsablePFE() {
      if (responsablePFE == null)
         responsablePFE = new java.util.HashSet<ResponsablePFE>();
      return responsablePFE;
   }

   /** @pdGenerated default iterator getter */
   public Iterator<ResponsablePFE> getIteratorResponsablePFE() {
      if (responsablePFE == null)
         responsablePFE = new java.util.HashSet<ResponsablePFE>();
      return responsablePFE.iterator();
   }

   /**
    * @pdGenerated default setter
    * @param newResponsablePFE
    */
   public void setResponsablePFE(java.util.Collection<ResponsablePFE> newResponsablePFE) {
      removeAllResponsablePFE();
      for (Iterator<ResponsablePFE> iter = newResponsablePFE.iterator(); iter.hasNext();)
         addResponsablePFE((ResponsablePFE) iter.next());
   }

   /**
    * @pdGenerated default add
    * @param newResponsablePFE
    */
   public void addResponsablePFE(ResponsablePFE newResponsablePFE) {
      if (newResponsablePFE == null)
         return;
      if (this.responsablePFE == null)
         this.responsablePFE = new java.util.HashSet<ResponsablePFE>();
      if (!this.responsablePFE.contains(newResponsablePFE))
         this.responsablePFE.add(newResponsablePFE);
   }

   /**
    * @pdGenerated default remove
    * @param oldResponsablePFE
    */
   public void removeResponsablePFE(ResponsablePFE oldResponsablePFE) {
      if (oldResponsablePFE == null)
         return;
      if (this.responsablePFE != null)
         if (this.responsablePFE.contains(oldResponsablePFE))
            this.responsablePFE.remove(oldResponsablePFE);
   }

   /** @pdGenerated default removeAll */
   public void removeAllResponsablePFE() {
      if (responsablePFE != null)
         responsablePFE.clear();
   }

}