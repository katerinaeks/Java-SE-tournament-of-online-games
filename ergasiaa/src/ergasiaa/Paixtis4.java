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
public class Paixtis4 extends Simmetexontas 
{
    
    private String email;
    
    
    public Paixtis4()
    {
      super();
      this.SetEmail("");
    }
   
    public Paixtis4(String onoma_paixth,String the_pseudwnumo,String game,String e_mail)
    {
     super(onoma_paixth,the_pseudwnumo,game);
     this.email=e_mail;   
     
    }

    public void SetEmail(String e_mail){
            this.email=e_mail;
        }
   
     public String GetEmail(){
            return this.email;
        }
    
    @Override
    public String getParticipantType() {
        return "Player"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
