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
public class PaixnidiGyrwn extends Hlpaixnidi3 {
    
    private int RoundsNo;
   
  
    public PaixnidiGyrwn() 
    {
      super();  //kalw ton vasiko kataseuasti tis ypertaksis Hlpaixnidi3 pou epekteino
      this.RoundsNo=0;
    }
    
    public PaixnidiGyrwn(String name,int rounds)
    {
      super(name); //kalw ton pliri kataskeuasti tis ypertaksis Hlpaixnidi3
      this.RoundsNo=rounds;
    }
    
    public PaixnidiGyrwn(String name,int players,int rounds)
    {
      super(name,players); //kalw ton pliri kataskeuasti tis ypertaksis Hlpaixnidi3
      this.RoundsNo=rounds;
    }
    
    public void setRounds(int r)
    {
      this.RoundsNo=r;
    }
    
    public int getRounds()
    {
     return this.RoundsNo;
    }
    
    @Override
    public String getType() //polimorfismos sti java klirinomo apo ti mama taksi mia methodo abstract pou tin ilopoio topika me diko mou kodika. 
    {
     return "RoundsGame";
    }
    
}
