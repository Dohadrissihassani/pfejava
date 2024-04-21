/***********************************************************************
 * Module:  Projet.java
 * Author:  hp
 * Purpose: Defines the Class Projet
 ***********************************************************************/
package com.pfeasy.pfeasy.Modals;

import java.util.*;

/** @pdOid 442284d7-71fe-4377-aaed-a091f8535c31 */
public class Projet {
   /** @pdOid 35db0482-8e43-4a3c-91d4-5533d5bf64ad */
   public String titre;
   /** @pdOid 23038af4-719b-4942-b754-804e13b539b2 */
   public String objectif;
   /** @pdOid cce312f8-0289-4195-8453-6aac76bf049e */
   public Date dateCreation;
   /** @pdOid d30fb24f-21cc-42bc-9193-f64b523980f6 */
   public boolean cacher;

   /**
    * @pdRoleInfo migr=no name=Encadrant assc=organiser coll=java.util.Collection
    *             impl=java.util.HashSet mult=1..* side=A
    */
   public Collection<Encadrant> encadrant;

   /** @pdGenerated default getter */
   public Collection<Encadrant> getEncadrant() {
      if (encadrant == null)
         encadrant = new HashSet<Encadrant>();
      return encadrant;
   }

   /** @pdGenerated default iterator getter */
   public Iterator<Encadrant> getIteratorEncadrant() {
      if (encadrant == null)
         encadrant = new HashSet<Encadrant>();
      return encadrant.iterator();
   }

   /**
    * @pdGenerated default setter
    * @param newEncadrant
    */
   public void setEncadrant(Collection<Encadrant> newEncadrant) {
      removeAllEncadrant();
      for (Iterator<Encadrant> iter = newEncadrant.iterator(); iter.hasNext();)
         addEncadrant((Encadrant) iter.next());
   }

   /**
    * @pdGenerated default add
    * @param newEncadrant
    */
   public void addEncadrant(Encadrant newEncadrant) {
      if (newEncadrant == null)
         return;
      if (this.encadrant == null)
         this.encadrant = new HashSet<Encadrant>();
      if (!this.encadrant.contains(newEncadrant))
         this.encadrant.add(newEncadrant);
   }

   /**
    * @pdGenerated default remove
    * @param oldEncadrant
    */
   public void removeEncadrant(Encadrant oldEncadrant) {
      if (oldEncadrant == null)
         return;
      if (this.encadrant != null)
         if (this.encadrant.contains(oldEncadrant))
            this.encadrant.remove(oldEncadrant);
   }

   /** @pdGenerated default removeAll */
   public void removeAllEncadrant() {
      if (encadrant != null)
         encadrant.clear();
   }

}