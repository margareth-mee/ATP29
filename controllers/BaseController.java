package controllers;

import java.util.ArrayList;

public class BaseController<B> {
   private ArrayList<B> lista;

   public BaseController(){
       this.lista = new ArrayList<B>();
   }

   public void create(B obj){
       this.lista.add(obj);
   }

   public ArrayList<B> read(){
       return this.lista;
   }

   public void update(B obj){
     if(existe(obj)){
         delete(obj);
         create(obj);
     }
   }
   
   public void delete(B obj){
       this.lista.remove(obj);
   }

   public boolean existe(B obj){
       return this.lista.contains(obj);
   }
}
