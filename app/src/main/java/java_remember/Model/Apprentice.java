 package java_remember.Model;

import java_remember.Abstracts.Worker;
import java_remember.Interfaces.IAgent;
import java_remember.Interfaces.IBuilding;

/**
  * IApprentice
  */
 public class Apprentice extends Worker{
    
    public Worker setInstitution(){
      return null;
    };
    public String getInstitution() throws Exception {
      return null;
    };


   @Override
   public long getID() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getID'");
   }
   @Override
   public String getName() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getName'");
   }
   @Override
   public IAgent setHome() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'setHome'");
   }
   @Override
   public IBuilding getHome() throws Exception {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getHome'");
   }
    
 }