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
public class PaixnidiXronou extends Hlpaixnidi3 {
    
    private int gametime;

      
    public PaixnidiXronou() 
    {
      super();  //kalw ton vasiko kataseuasti tis ypertaksis Hlpaixnidi3 pou epekteino
      this.gametime=0;
    }
    
    public PaixnidiXronou(String name,int time)
    {
      super(name); //kalw ton pliri kataskeuasti tis ypertaksis Hlpaixnidi3
      this.gametime=time;
    }
    
    public PaixnidiXronou(String name,int players,int time)
    {
      super(name,players); //kalw ton pliri kataskeuasti tis ypertaksis Hlpaixnidi3
      this.gametime=time;
    }
    
     public void setTime(int t)
    {
      this.gametime=t;
    }
    
    public int getTime()
    {
     return this.gametime;
    }
    
    @Override
    public String getType() //polimorfismos
    {
     return "TimeGame";
    }
    
}
