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
public class Tournoua2 {
    private String onomatournoua;
    private String datestart;
    private String dateend;
    private String topos;
    private int hour;
    private int min;
    private ArrayList<PaixnidiXronou> timegames;
    private ArrayList<PaixnidiGyrwn> roundsgames;
    private ArrayList<Paixtis4> players;
    private ArrayList<Diaxeirhsths5> admins;//10
    
    
    
    public Tournoua2()
    {
        this.onomatournoua="";
        this.datestart="";
        this.dateend="";
        this.topos="";                     
        this.hour=0;
        this.min=0;
        this.timegames=new ArrayList();
        this.roundsgames=new ArrayList();
        this.players=new ArrayList();
        this.admins=new ArrayList(); //10
    }  
    public Tournoua2(String onoma_tournoua,String day_start,String day_end,String topothesia,int h,int minutes,ArrayList time_games,ArrayList rounds_games,ArrayList pl,ArrayList adm)
    {
        this.onomatournoua=onoma_tournoua;
        this.datestart=day_start;
        this.dateend=day_end;
        this.topos=topothesia;                     
        this.hour=h;
        this.min=minutes;
        this.timegames=time_games;
        this.roundsgames=rounds_games;
        this.players=pl;
        this.admins=adm;//10
    }
     public void SetOnomaTournoua (String onoma_tournoua){
            this.onomatournoua=onoma_tournoua;
        }
     public void SetDayStart (String day_start){
            this.datestart=day_start;
        }
     public void SetDayEnd (String day_end){
            this.dateend=day_end;
        }
     public void SetTopos (String o_topos){
            this.topos=o_topos;
        }
     public void setHour(int h)
     {
      this.hour=h;
     }
     public void setMin(int m)
     {
      this.min=m;
     }
     public void set(ArrayList paixnidia_gyrwn)
    {
     this.roundsgames=paixnidia_gyrwn;
    }
     public void setPaixnidiaXronouList(ArrayList Paixnidia_xronou)
    {
     this.timegames=Paixnidia_xronou;
    }
     public void setPaixtesList(ArrayList the_paixtes)
    {
     this.players=the_paixtes;
    }
    public void setAdminsList(ArrayList the_admins)
    {
     this.admins=the_admins;//EDW EXOUYME VALEI TO IDIO ONOMA ME AYTO POU EINAI MESA STHN GAMEENGINE, PEIRAZEI???
    }
    public String GetOnomaTournoua (){
            return this.onomatournoua;
        }
     public String GetDayStart (){
            return this.datestart;
        }
     public String GetDayEnd (){
            return this.dateend;
        }
     public String GetTopos (){
            return this.topos;
        } 
     public int getHour()
     {
      return this.hour;
     }
     public int getMin()
     {
      return this.min;
     }
    public ArrayList getPaixnidiaXronouTournouaList()
    {
      return this.timegames;
    }
     public ArrayList getPaixnidiaGyrwnTournouaList()
    {
      return this.roundsgames;
    }
    public ArrayList getPlayersTournouaList()
    {
      return this.players;
    }
    public ArrayList getAdminsTournouaList()
    {
      return this.admins;
    }
    
}
