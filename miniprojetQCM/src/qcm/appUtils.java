
package qcm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.codec.digest.DigestUtils;
import qcm.mysql.Person;
import qcm.mysql.Question;
import qcm.mysql.UserDaoImpl;


 final class appUtils {
     static Person user ; 
     static int numQuestion; 
     final static String nomProjet = "Mini projet" ; 
     final static String Copyright = "Built with <3 by Louhichi Amine" ;
     
     
          /*
        ** Crypter une chaine de caractère avec l'algorythme md5 
        */
         static String md5Hash(String str){
                return DigestUtils.md5Hex(str);
        }
        
         // définit l utilisateur actif 
         //
         static void setActifUser(Person u){
             
             user=u; 
             
         }
         
         static Person getActifUser(){
             return user; 
         }
         /*
         ** Inscrire un utilisateur dans la bdd
         */
         static void registerUser(Person p){
             UserDaoImpl perImplm = new UserDaoImpl(); 
                perImplm .insert(p);
             
             
         }
      
            static void updateUserScore(Person p, String username){
             UserDaoImpl per = new UserDaoImpl(); 
                per.update(p, username);
             
             
         }
            
         
         static Person getUserById(int id ){
             UserDaoImpl perImplm = new UserDaoImpl(); 
             return  perImplm.selectById(id);
             
             
         }
         
         
         
     public static List<Question> getRandomElement(List<Question> list, int totalItems) 
    { 
        Random rand = new Random(); 
  
        // create a temporary list for storing 
        // selected element 
        List<Question> newList = new ArrayList<Question>(); 
        
        for (int i = 0; i < totalItems; i++) { 
  
            // take a raundom index between 0 to size  
            // of given List 
            int randomIndex = rand.nextInt(list.size()); 
  
            // add element in temporary list 
            newList.add(list.get(randomIndex)); 
  
            // Remove selected element from orginal list 
            list.remove(randomIndex); 
        } 
        return newList; 
    }      
         
         
         
        
}
