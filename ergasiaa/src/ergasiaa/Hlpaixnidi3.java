/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasiaa;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public abstract class Hlpaixnidi3 {
    
    private String onomapaixnidi;
    private int maxpaixtes;
    private Paixtis4 lastOddPlayer; //teleutaios perittos (odd) paiktis
    private ArrayList<String> winners; //lista me ta pseudonima twn paiktwn pou kerdisan.
    private ArrayList<String> losers;
    private ArrayList<Match> matches;
   
    public Hlpaixnidi3() 
    {
     this.onomapaixnidi="";
     this.maxpaixtes=0;
     this.winners=new ArrayList();
     this.losers=new ArrayList();
     this.matches=new ArrayList();
     this.lastOddPlayer=new Paixtis4();
    }
    
    public Hlpaixnidi3(String onoma_paixnidi)
    {
     this.onomapaixnidi=onoma_paixnidi;
     this.winners=new ArrayList();
     this.losers=new ArrayList();
     this.matches=new ArrayList();
     this.lastOddPlayer=new Paixtis4();
    }
    
   
    public Hlpaixnidi3(String onoma_paixnidi,int max_paixtes)
    {
     this.onomapaixnidi=onoma_paixnidi;
     this.maxpaixtes=max_paixtes;
     this.winners=new ArrayList();
     this.losers=new ArrayList();
     this.matches=new ArrayList();
     this.lastOddPlayer=new Paixtis4();
    }
    
    public abstract String getType();
    
    
    public void SetOnomaPaixnidi(String onoma_paixnidi)
    {
       this.onomapaixnidi=onoma_paixnidi;
    }
    public void SetMaxPaixtes (int max_paixtes)
    {
       this.maxpaixtes = max_paixtes;
    }
    public void Setwinners (ArrayList the_winners)
    {
       this.winners = the_winners;
    }
    public void Setlosers (ArrayList the_losers)
    {
       this.losers = the_losers;
    }
    public void Setmatches (ArrayList the_matches)
    {
       this.matches = the_matches;
    }
    
    public void setLastOddPlayer(Paixtis4 p)
    {
     this.lastOddPlayer=p;
    }
     
    public String GetOnomaPaixnidi()
    {
     return this.onomapaixnidi;
    } 
    public int GetMaxPaixtes ()
    {
     return this.maxpaixtes;
    }  
    public ArrayList getWinnersList()
    {
     return this.winners;
    }
    public ArrayList getLosersList()
    {
     return this.losers;
    }
    public ArrayList getmatchesList()
    {
     return this.matches;
    }
    
    public Paixtis4 getLastOddPlayer()
    {
     return this.lastOddPlayer;
    }
     
    
    
}
