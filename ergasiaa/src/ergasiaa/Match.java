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
public class Match {
    
    private Paixtis4 player1;
    private Paixtis4 player2;
    private String winner; //gyrizei string me to pseudonimo tou paikti pou kerdise.
    private String loser;
    private String gamename; //to paixnidi gia to opoio paizoun
    
    public Match()
    {
     Paixtis4 player1=new Paixtis4();
     Paixtis4 player2=new Paixtis4();
     String winner=""; 
     String loser="";
     String gamename=""; 
    }
    
    public Match(Paixtis4 p1,Paixtis4 p2)
    {
     this.player1=p1;
     this.player2=p2;
    }
    
    
    public Paixtis4 getPlayer1()
   {
    return this.player1;
   }
    public Paixtis4 getPlayer2()
   {
    return this.player2;
   }
   public String getWinner()
   {
    return this.winner;
   }
    public String getLoser()
   {
    return this.loser;
   }
     public String getGameName()
   {
    return this.gamename;
   }
    
   public void SetPlayer1(Paixtis4 onoma_paixti1){
            this.player1=onoma_paixti1;
        } 
   public void SetPlayer2(Paixtis4 onoma_paixti2){
            this.player2=onoma_paixti2;
        } 
   public void SetWinner(String onoma_winner){
            this.winner=onoma_winner;
        } 
   public void Setloser(String onoma_loser){
            this.loser=onoma_loser;
        }
   public void Setgamename(String onoma_gamename){
            this.gamename=onoma_gamename;
        } 
   
    
    
    
}
