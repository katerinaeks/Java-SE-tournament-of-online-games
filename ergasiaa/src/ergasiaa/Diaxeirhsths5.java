/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasiaa;

/**
 *
 * @author Lenovo
 */
 
    

public class Diaxeirhsths5 extends Simmetexontas  
{
    private String thlefwno;
    
    
    public Diaxeirhsths5()
    {
     super();
     this.setThlefwno("");
    }
   
    public Diaxeirhsths5(String onoma_diaxeirhsth,String pseudwnumo_diaxeirhsth,String game,String the_thlefwno)
    {
      super(onoma_diaxeirhsth,pseudwnumo_diaxeirhsth,game);
      this.thlefwno=the_thlefwno;
    }
    
    
   public void setThlefwno(String the_thlefwno)
   {
    this.thlefwno=the_thlefwno;     
   }
   
   public String GetThlefwno(){
            return this.thlefwno;
   }

    @Override
    public String getParticipantType() { //method overload, idio onoma methodou diaforetiki lista parametron i tipou epistrofis, method polymorhism=idio onoma methodou,idies parametroi alla diaforetikos kwdikas leitourgias tis methodou,method ovwerride=ilopoio stin taksi mou tin methodo pou klironomo apo tin taksi tin opoia klironomo
        return "Admin"; //To change body of generated methods, choose Tools | Templates.
    }
}
