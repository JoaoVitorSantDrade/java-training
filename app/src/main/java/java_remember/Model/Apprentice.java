 package java_remember.Model;

import com.google.common.base.Objects;

import java_remember.Abstracts.Worker;
import java_remember.Interfaces.IBuilding;


/**
  * IApprentice
  */
 public class Apprentice extends Worker{

   private IBuilding Institution = null;
    
    public Apprentice setInstitution(IBuilding Institution) throws Exception{
      if(!Objects.equal(Institution, null)){
         throw new Exception("Ja tem uma instituicao");
      }
      this.Institution = Institution;
      return this;
    };
    public IBuilding getInstitution() throws Exception {
      if(Objects.equal(Institution, null)){
         throw new Exception("Nao tem uma instituicao");
      }
      return this.Institution;
    };

    @Override
    public String getHelp(){
      return "Peca ajuda ao seu Junior";
    }
    
 }