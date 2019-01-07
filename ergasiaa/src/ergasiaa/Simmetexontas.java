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
public abstract class Simmetexontas {
    
    private String onoma;
    private String pseudwnumo;
    private String gamename;
    
     public Simmetexontas()
    {
     this.SetOnoma("");
     this.SetPseudwnumo("");
     this.SetGame("");
    }
   
    public Simmetexontas(String onoma_paixth,String the_pseudwnumo,String game)
    {
     this.onoma=onoma_paixth;
     this.pseudwnumo=the_pseudwnumo;
     this.gamename=game;
    }
    
    
    public void SetPseudwnumo (String the_pseudwnumo){
            this.pseudwnumo=the_pseudwnumo;
        }
    public void SetOnoma (String on){
            this.onoma=on;
        }
    
     public void SetGame(String t)
     {
      this.gamename=t;
     }
     
     public String getGame()
     {
       return this.gamename;
     }
    
    public String GetOnoma(){
            return this.onoma;
        }
    public String GetPseudwnumo(){
            return this.pseudwnumo;
        }
    
    public abstract String getParticipantType();
    
}
