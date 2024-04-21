/***********************************************************************
 * Module:  Encadrant.java
 * Author:  hp
 * Purpose: Defines the Class Encadrant
 ***********************************************************************/
package com.pfeasy.pfeasy.Modals;

import java.util.*;

/** @pdOid fbc331c1-b3bf-4f85-969f-3684df21ac06 */
public class Encadrant extends Professeur {
   /** @pdOid b9ebb719-afe3-492b-ac5d-42a254b20507 */
   public boolean archive;

   /**
    * @pdRoleInfo migr=no name=ResponsablePFE assc=assigner
    *             coll=java.util.Collection impl=java.util.HashSet mult=1..* side=A
    */
   public Collection<ResponsablePFE> responsablePFE;

   /** @pdGenerated default getter */
   public java.util.Collection<ResponsablePFE> getResponsablePFE() {
      if (responsablePFE == null)
         responsablePFE = new HashSet<ResponsablePFE>();
      return responsablePFE;
   }

   /** @pdGenerated default iterator getter */
   public Iterator<ResponsablePFE> getIteratorResponsablePFE() {
      if (responsablePFE == null)
         responsablePFE = new HashSet<ResponsablePFE>();
      return responsablePFE.iterator();
   }

   /**
    * @pdGenerated default setter
    * @param newResponsablePFE
    */
   public void setResponsablePFE(Collection<ResponsablePFE> newResponsablePFE) {
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
         this.responsablePFE = new HashSet<ResponsablePFE>();
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