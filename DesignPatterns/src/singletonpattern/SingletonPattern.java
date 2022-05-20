/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;


public class SingletonPattern {

  //usage:   when need to create only one object per class.
	
    public static void main(String[] args) {
      Satellite s1=Satellite.getSatellite();
      Satellite s2=Satellite.getSatellite();
      
      System.out.println(s1.hashCode());
      System.out.println(s2.hashCode());
    }
    
}
