/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasiaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class GameEngine {
    //pedia dedomenwn gia diaxeirhsh paixnidiwn
    private int GamesNumber;  //na min ksexaso na ftiakso getters kai setters
    private ArrayList<PaixnidiGyrwn> paixnidiaGyrwn; //dimiourgo mia dinamiki domi dedomenon pou legetai arrayList i opoia dexetai antikeimena tipou Hlpaixnidi3 orizetai mesa sta <>
    private ArrayList<PaixnidiXronou> paixnidiaXronou;
    private ArrayList<Paixtis4> paiktes;
    private ArrayList<Diaxeirhsths5> admins;
    private ArrayList<Tournoua2> tournaments;
    //pedia dedomenwn gia diaxeirhsh symmetoxwn
   
    public GameEngine()
    {
      paixnidiaGyrwn=new ArrayList();   //arxikopoiisi mnimis liston
      paixnidiaXronou=new ArrayList();
      paiktes=new ArrayList();
      admins=new ArrayList();
      tournaments=new ArrayList();
    }
    public GameEngine(ArrayList paixnidiagyrwn,ArrayList paixnidiaxronou,ArrayList paixtes,ArrayList diaxeiristes,ArrayList tournoua,ArrayList simmetexontas)
    {
      this.paixnidiaGyrwn=paixnidiagyrwn;
      this.paixnidiaXronou=paixnidiaxronou;
      this.paiktes=paixtes;
      this.admins=diaxeiristes;
      this.tournaments=tournoua;
    }
    
    
    public ArrayList getPaixnidiaGyrwnList()
    {
      return this.paixnidiaGyrwn;
    }
    public ArrayList getPaixnidiaXronouList()
    {
     return this.paixnidiaXronou;
    }
    public ArrayList getPaixtesList()
    {
     return this.paiktes;
    }
    public ArrayList getAdminsList()
    {
     return this.admins;
    }
    public ArrayList getTournamentsList()
    {
     return this.tournaments;
    }
   
    public void set(ArrayList paixnidia_gyrwn)
   {
     this.paixnidiaGyrwn=paixnidia_gyrwn;
   }
    public void setPaixnidiaXronouList(ArrayList Paixnidia_xronou)
   {
     this.paixnidiaXronou=Paixnidia_xronou;
   }
    public void setPaixtesList(ArrayList the_paixtes)
   {
     this.paiktes=the_paixtes;
   }
    public void setAdminsList(ArrayList the_admins)
   {
     this.admins=the_admins;
   }
    public void setTournamentsList(ArrayList the_tournaments)
   {
     this.tournaments=the_tournaments;
   }
    /////////////////////////////////////////////////////DIAXEIRHSH PAIXNIDIWN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//////////////////////////////////////////////////////
   //................................................................DIAXEIRHSH PAIXNIDIWN.......................................................
    public void addGame() //eisagogi paixnidiou
    {
      PaixnidiXronou timegame=null;
      PaixnidiGyrwn roundsgame=null;
      String tempname="";
      int choice=0;
      int time=0;
      int rounds=0;
      boolean run=true;
      String s="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Dwse Onoma Paixnidiou:");
      try {
            s = br.readLine();
            tempname=s;
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      do {
      System.out.println("******Dwse Typo Paixnidiou**********");
      System.out.println("1.Paixnidi Me Sigkekrimmeno Xrono");
      System.out.println("2.Paixnidi Me Sigkekrimmenous Gyrous");
      System.out.println("Dwse Epilogi 1-2");
      System.out.println("************************************");
      try {
            s = br.readLine();
            choice=Integer.parseInt(s);
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      switch(choice)
            {
              case 1:
              run=false;
              timegame=new PaixnidiXronou();
              timegame.SetOnomaPaixnidi(tempname);
              break;
              case 2:
              roundsgame=new PaixnidiGyrwn();
              roundsgame.SetOnomaPaixnidi(tempname);
              run=false;              
              break;
              default:
              break;
            }
      } while (run);
      
      switch(choice)
      {
          case 1:
          boolean runok=true;
          do {
            System.out.println("Dwse diarkeia xronou gia to paixnidi:");
            try {
            s = br.readLine();
            time=Integer.parseInt(s);
           }
           catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
           {
            System.out.println("Den edoses thetiko arithmo gia to xrono!!"); // H e.toString() mas epistrefei to string me to minima lathous
           }
           if (time > 0)
             runok=false;
          } while (runok);
          timegame.setTime(time);
          break;
          case 2:
          boolean runok1=true;
          do {
            System.out.println("Dwse arithmo gyrwn gia to paixnidi:");
            try {
            s = br.readLine();
            rounds=Integer.parseInt(s);
           }
           catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
           {
            System.out.println("Den edoses thetiko arithmo gia to xrono!!"); // H e.toString() mas epistrefei to string me to minima lathous
           }
           if (rounds > 0)
             runok1=false;
          } while (runok1);
          roundsgame.setRounds(rounds);
          break;
          default:
          break;
      }
        //mexri edw exoume ftiaksei ena prosorino antikeimeno timegame i roundgame analoga me auto pou epelekse o xristis      
       switch(choice) //apo edo kai kato theloume na apothikesoume to antikeimeno tou paixnidiou stin antistoixi lista, elenxontas prota an iparxei idi paixnidi me to idio onoma!!
       {
           case 1:
           boolean exists=false;
           for(int i=0;i<this.getPaixnidiaXronouList().size();i++)
           {
             PaixnidiXronou temp1=new PaixnidiXronou();
             temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (temp1.GetOnomaPaixnidi().equals(timegame.GetOnomaPaixnidi()))
             {
              exists=true;
              System.out.println("Den mporw na prostheso to paixnidi iparxei idi!!");
              break;
             }
           }
           if (!exists) // to ! simainei not, not false=true
             this.getPaixnidiaXronouList().add(timegame);
           break;
           case 2:
           boolean exists2=false;
           for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++)
           {
             PaixnidiGyrwn temp2=new PaixnidiGyrwn();
             temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (temp2.GetOnomaPaixnidi().equals(roundsgame.GetOnomaPaixnidi()))
             {
              exists2=true;
              System.out.println("Den mporw na prostheso to paixnidi iparxei idi!!");
              break;
             }
           }
           if (!exists2) // to ! simainei not, not false=true
             this.getPaixnidiaGyrwnList().add(roundsgame);
           break;
           default:
           break;
       }  
    }
    
public void tropopoihshGame(){

      PaixnidiXronou timegame=null;
      PaixnidiGyrwn roundsgame=null;
      boolean timegameexists=false;
      boolean roundsgameexists=false;
      String gamename="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("An theleis na allakseis to onoma tou paixnidiou diagrapse to kai kane nea eisagogi!\n");
      System.out.println("Dwse to onoma tou paixnidiou pou theleis na tropopoih8ei:");
      try {
            gamename = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      int thesi=0;
      for(int i=0;i<this.getPaixnidiaXronouList().size();i++)//anazhthsh sta paixnidia xronou
           {
             PaixnidiXronou temp1=new PaixnidiXronou();
             temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (temp1.GetOnomaPaixnidi().equals(gamename.trim())) //i trim afairei ta spaces mprosta kai piso apo to string
             {
              timegameexists=true;
              thesi=i;
              break;
             }
           }
      
      for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++)//anazhthsh sta paixnidia gyrwn
           {
             PaixnidiGyrwn temp2=new PaixnidiGyrwn();
             temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (temp2.GetOnomaPaixnidi().equals(gamename.trim()))
             {
              roundsgameexists=true;
              thesi=i;
              break;
             }
           }
      
      if (timegameexists) {
      
      timegame=new PaixnidiXronou(); 
      timegame.SetOnomaPaixnidi(gamename);
      int time=0;
      String s="";
      boolean runok=true;
          do {
            System.out.println("Dwse nea diarkeia xronou gia to paixnidi:");
            try {
            s = br.readLine();
            time=Integer.parseInt(s);
           }
           catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
           {
            System.out.println("Den edoses thetiko arithmo gia to xrono!!"); // H e.toString() mas epistrefei to string me to minima lathous
           }
           if (time > 0)
             runok=false;
          } while (runok);
          timegame.setTime(time);    
          this.getPaixnidiaXronouList().remove(thesi); //afairw apo ti lista sti thesi pou to vrika to palio antikeimeno paixnidiou xronou
          this.getPaixnidiaXronouList().add(thesi,timegame); //prostheto sti lista to neo tropopoiimeno antikeimeno paixnidiou xronou stin idia thesi pou itan to palio
      }
      else if (roundsgameexists)
      {
       roundsgame=new PaixnidiGyrwn();
       String s="";
       int rounds=0;
       roundsgame.SetOnomaPaixnidi(gamename);
       boolean runok1=true;
          do {
            System.out.println("Dwse neo arithmo gyrwn gia to paixnidi:");
            try {
            s = br.readLine();
            rounds=Integer.parseInt(s);
           }
           catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
           {
            System.out.println("Den edoses thetiko arithmo gia to xrono!!"); // H e.toString() mas epistrefei to string me to minima lathous
           }
           if (rounds > 0)
             runok1=false;
          } while (runok1);
          roundsgame.setRounds(rounds);
          this.getPaixnidiaGyrwnList().remove(thesi); //afairw apo ti lista sti thesi pou to vrika to palio antikeimeno paixnidiou xronou
          this.getPaixnidiaGyrwnList().add(thesi,roundsgame); //prostheto sti lista to neo tropopoiimeno antikeimeno paixnidiou xronou stin idia thesi pou itan to palio  
      }
      else
      System.out.println("Edoses onoma paixnidiou pou den iparxei!!!");
}

    public void removeGame()
     {
      String gamename="";
      String gametype="";
      int choice=0;
      boolean run=true;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Dwse to onoma tou paixnidiou pou theleis na diagrafei:");
      try {
            gamename = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
       do {
      System.out.println("******Dwse Typo Paixnidiou**********");
      System.out.println("1.Paixnidi Me Sigkekrimmeno Xrono");
      System.out.println("2.Paixnidi Me Sigkekrimmenous Gyrous");
      System.out.println("Dwse Epilogi 1-2");
      System.out.println("************************************");
      try {
            gametype = br.readLine();
            choice=Integer.parseInt(gametype);
            run=false;
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      } while (run);
       
      switch(choice)
      {
          case 1:
           boolean exists1=false;//elegxos
           for(int i=0;i<this.getPaixnidiaXronouList().size();i++)
           {
             PaixnidiXronou temp1=new PaixnidiXronou();
             temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (temp1.GetOnomaPaixnidi().equals(gamename))
             {
              exists1=true;
              this.getPaixnidiaXronouList().remove(i);
              break;
             }
           }
           if (exists1) // to ! simainei not, not false=true
            System.out.println("To paixnidi:"+gamename+" diagrafike epitixos!!");
           else
            System.out.println("To paixnidi:"+gamename+" den iparxei sti lista!!");
          break;
          case 2:
          boolean exists2=false;
           for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++)
           {
             PaixnidiGyrwn temp2=new PaixnidiGyrwn();
             temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (temp2.GetOnomaPaixnidi().equals(gamename))
             {
              exists2=true;
              this.getPaixnidiaGyrwnList().remove(i);
              break;
             }
           }
           if (exists2) // to ! simainei not, not false=true
            System.out.println("To paixnidi:"+gamename+" diagrafike epitixos!!");
           else
            System.out.println("To paixnidi:"+gamename+" den iparxei sti lista!!");
          break;
          default:
          break;
      }
       
   }
 public void PrintGameData()
 {
  String s="";
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Dwse onoma paixnidiou gia to opoio theleis na deis analitikes plirofories:");
   try {
         s = br.readLine();
       }
       catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
       {
        System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
       }
      boolean timegameexists=false;
      boolean roundsgameexists=false;
      int thesi=0;
      for(int i=0;i<this.getPaixnidiaXronouList().size();i++)
         {
          PaixnidiXronou temp1=new PaixnidiXronou();
          temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
              if (temp1.GetOnomaPaixnidi().equals(s.trim())) //i trim afairei ta spaces mprosta kai piso apo to string
              {
               timegameexists=true;
               thesi=i;
               break;
              }
             }
             for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++)
              {
               PaixnidiGyrwn temp2=new PaixnidiGyrwn();
               temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
               if (temp2.GetOnomaPaixnidi().equals(s.trim()))
               {
                roundsgameexists=true;
                thesi=i;
                break;
               }
              }
              if (timegameexists)
              {
               PaixnidiXronou temp3=new PaixnidiXronou();
               temp3=(PaixnidiXronou)this.getPaixnidiaXronouList().get(thesi);
               System.out.println("------------------------------------------------"); 
               System.out.println("Onoma Paixnidiou:"+temp3.GetOnomaPaixnidi()+"\n");
               System.out.println("Typos Paixnidiou:"+temp3.getType()+"\n");
               System.out.println("Diarkeia Paixnidiou:"+temp3.getTime()+"\n");
               System.out.println("------------------------------------------------"); 
              }
              else if (roundsgameexists)
              {
               PaixnidiGyrwn temp4=new PaixnidiGyrwn();
               temp4=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(thesi);
               System.out.println("------------------------------------------------"); 
               System.out.println("Onoma Paixnidiou:"+temp4.GetOnomaPaixnidi()+"\n");
               System.out.println("Typos Paixnidiou:"+temp4.getType()+"\n");
               System.out.println("Gyroi Paixnidiou:"+temp4.getRounds()+"\n");
               System.out.println("------------------------------------------------"); 
              }
              else
              System.out.println("Edoses lathos onoma paixnidiou!!,ksanaprospathise!\n");
 }  
 public void PrintAllGamesData()
 {
  System.out.println("**************************************************");
  System.out.println("**Kataxwrimena Paixnidia sto Sistima Diaxeirisis**");
  System.out.println("**************************************************");
  System.out.println("*********Paixnidia Xronou*************************");
  for(int i=0;i<this.getPaixnidiaXronouList().size();i++)
  {
    PaixnidiXronou temp1=new PaixnidiXronou();
    temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i);
    System.out.println("Onoma Paixnidiou:"+temp1.GetOnomaPaixnidi()+"\n");
    System.out.println("------------------------------------------------");
  }
  for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++)
  {
    PaixnidiGyrwn temp2=new PaixnidiGyrwn();
    temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i);
    System.out.println("Onoma Paixnidiou:"+temp2.GetOnomaPaixnidi()+"\n");
    System.out.println("------------------------------------------------");
  }
  System.out.println("**************************************************");
 }
 //////////////////////////////////////DIAXEIRHSH SYMMETOXWN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//////////////////////////////////////////////////////////////////////////
  //.............................................DIAXEIRHSH SYMMETOXWN.........................................................................................  
 public void addSymmetoxonta(){
    Paixtis4 player=null;//??
    Diaxeirhsths5 admin =null;//??
    String tempname="";
      int choice=0;
      boolean run=true;
      String s="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      do {
      System.out.println("******Dwse Typo symmetexonta**********");
      System.out.println("1.symmetexontas pou einai aplos paixths");
      System.out.println("2.symmetexontas pou einai diaxeirhsths");
      System.out.println("Dwse Epilogi 1-2");
      System.out.println("************************************");
      try {
            s = br.readLine();
            choice=Integer.parseInt(s);
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      switch(choice)
            {
              case 1:
              run=false;
              player=new Paixtis4();
              System.out.println("Dwse Onoma Paikti:");
              try {
                   s = br.readLine();
                   tempname=s;
              }
              catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
              {
               System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
              }
              
              player.SetOnoma(tempname);
              
              System.out.println("Dwse Pseudonimo Paikti:");
             try {
                   s = br.readLine();
                   tempname=s;
              }
              catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
               System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }   
             player.SetPseudwnumo(tempname);
             System.out.println("Dwse E-mail Paikti:");
             try {
                  s = br.readLine();
                  tempname=s;
              }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
              player.SetEmail(tempname);
              boolean rungame=true;
              do {
              for(int i=0;i<this.getPaixnidiaXronouList().size();i++) //tupwnw ta onomata ton paixnidion xronou
              {
               PaixnidiXronou temp1=new PaixnidiXronou();
               temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i);
               System.out.println(i+"."+temp1.GetOnomaPaixnidi()+","+temp1.getType()+"\n");
              }
              for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++) //tipono ta onomata ton paixnidion gyrwn
              {
               PaixnidiGyrwn temp2=new PaixnidiGyrwn();
               temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i);
               System.out.println(Integer.toString(this.getPaixnidiaXronouList().size()+i)+"."+temp2.GetOnomaPaixnidi()+","+temp2.getType()+"\n");
              }
              System.out.println("Dose onoma paixnidiou apo ta parapano diathesima:");
              try {
                  s = br.readLine();
                  tempname=s;
              }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             boolean timegameexists=false;
             boolean roundsgameexists=false;
              int thesi=0;
             for(int i=0;i<this.getPaixnidiaXronouList().size();i++)
             {
              PaixnidiXronou temp1=new PaixnidiXronou();
              temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
              if (temp1.GetOnomaPaixnidi().equals(tempname.trim())) //i trim afairei ta spaces mprosta kai piso apo to string
              {
               timegameexists=true;
               thesi=i;
               break;
              }
             }
             for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++)
              {
               PaixnidiGyrwn temp2=new PaixnidiGyrwn();
               temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
               if (temp2.GetOnomaPaixnidi().equals(tempname.trim()))
               {
                roundsgameexists=true;
                thesi=i;
                break;
               }
              }
              
              if (timegameexists || roundsgameexists)
              {
                player.SetGame(tempname);
                rungame=false;
                System.out.println("Edoses swsto onoma paixnidiou\n");
              }
              else
              {
               System.out.println("Edoses lathos onoma paixnidiou!!,ksanaprospathise!\n");
              }
              } while (rungame);
              boolean exists1=false;
              boolean exists2=false;
              for(int i=0;i<this.getPaixtesList().size();i++)
              {
               Paixtis4 temp=new Paixtis4();
               temp=(Paixtis4)this.getPaixtesList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
               if (temp.GetPseudwnumo().equals(player.GetPseudwnumo()))
                {
                 exists1=true;
                 System.out.println("Den mporw na prostheso ton paikti iparxei idi allos me idio pseudonimo stous paixtes!!");
                 break;
                }
               }
              for(int i=0;i<this.getAdminsList().size();i++)
              {
               Diaxeirhsths5 temp2=new Diaxeirhsths5();
               temp2=(Diaxeirhsths5)this.getAdminsList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
               if (temp2.GetPseudwnumo().equals(player.GetPseudwnumo()))
               {
                exists2=true;
                System.out.println("Den mporw na prostheso ton paikti iparxei idi allos me to idio pseudonimo stous diaxeiristes!!");
                break;
               }
              }
              if (!exists1 && !exists2)
              {// to ! simainei not, not false=true
                this.getPaixtesList().add(player); //prostheto to neo antikeimeno paixti sti lista twn paiktwn
                System.out.println("O paixtis prostethike epitixos!!\n");
              }
              break;
              case 2://////////gia diaxeirhsth
              admin=new Diaxeirhsths5();
              System.out.println("Dwse Onoma Diaxeiristi:");
              try {
                   s = br.readLine();
                   tempname=s;
              }
              catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
              {
               System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
              }
              
              admin.SetOnoma(tempname);
              
              System.out.println("Dwse Pseudonimo Diaxeiristi:");
             try {
                   s = br.readLine();
                   tempname=s;
              }
              catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
               System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }   
             admin.SetPseudwnumo(tempname);
             System.out.println("Dwse Thlephono diaxeiristi:");
             try {
                  s = br.readLine();
                  tempname=s;
              }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             admin.setThlefwno(tempname);
              
             boolean rungame1=true;
              do {
              for(int i=0;i<this.getPaixnidiaXronouList().size();i++) //tipono ta onomata ton paixnidion xronou
              {
               PaixnidiXronou temp1=new PaixnidiXronou();
               temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i);
               System.out.println(i+"."+temp1.GetOnomaPaixnidi()+","+temp1.getType()+"\n");
              }
              for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++) //tipono ta onomata ton paixnidion gyrwn
              {
               PaixnidiGyrwn temp2=new PaixnidiGyrwn();
               temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i);
               System.out.println(Integer.toString(this.getPaixnidiaXronouList().size()+i)+"."+temp2.GetOnomaPaixnidi()+","+temp2.getType()+"\n");
              }
              System.out.println("Dose onoma paixnidiou apo ta parapano diathesima:");
              try {
                  s = br.readLine();
                  tempname=s;
              }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             boolean timegameexists=false;
             boolean roundsgameexists=false;
              int thesi=0;
             for(int i=0;i<this.getPaixnidiaXronouList().size();i++)
             {
              PaixnidiXronou temp1=new PaixnidiXronou();
              temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
              if (temp1.GetOnomaPaixnidi().equals(tempname.trim())) //i trim afairei ta spaces mprosta kai piso apo to string
              {
               timegameexists=true;
               thesi=i;
               break;
              }
             }
             for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++)
              {
               PaixnidiGyrwn temp2=new PaixnidiGyrwn();
               temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
               if (temp2.GetOnomaPaixnidi().equals(tempname.trim()))
               {
                roundsgameexists=true;
                thesi=i;
                break;
               }
              }
              
              if (timegameexists || roundsgameexists)
              {
                admin.SetGame(tempname);
                rungame1=false;
                System.out.print("Edoses swsto onoma paixnidiou\n");
              }
              else
              {
               System.out.print("Edoses lathos onoma paixnidiou!!,ksanaprospathise!\n");
              }
              } while (rungame1);
             
              boolean exists3=false;
              boolean exists4=false;
              for(int i=0;i<this.getAdminsList().size();i++)
              {
               Diaxeirhsths5 temp2=new Diaxeirhsths5();
               temp2=(Diaxeirhsths5)this.getAdminsList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
               if (temp2.GetPseudwnumo().equals(admin.GetPseudwnumo()))
               {
                exists3=true;
                System.out.println("Den mporw na prostheso ton diaxeiristi iparxei idi allos me to idio pseudonimo stous diaxeiristes!!");
                break;
               }
              }
              for(int i=0;i<this.getPaixtesList().size();i++)
              {
               Paixtis4 temp=new Paixtis4();
               temp=(Paixtis4)this.getPaixtesList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
               if (temp.GetPseudwnumo().equals(admin.GetPseudwnumo()))
                {
                 exists4=true;
                 System.out.println("Den mporw na prostheso ton diaxeirhsth iparxei idi allos me idio pseudonimo stous paiktes!!");
                 break;
                }
               }
              if (!exists3 && !exists4)
              {// to ! simainei not, not false=true
               this.getAdminsList().add(admin);
               System.out.println("O diaxeiristis prostethike epitixos!!\n");
              }
              run=false;              
              break;
              default:
              break;
            }
      } while (run); 
    }
    public void tropopoihshSymmetoxwn()
    {
       // Paixtis4 paixtissim=null;
      //Diaxeirhsths5 diaxeiristissim=null; 
      boolean pseudonunoexists=false;
     // boolean diaxeiristissimexists=false;
      String pseudonumoname="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("An theleis na allakseis to pseydonumo tou symmetexonta diagrapse ton kai kane nea eisagogi!\n");
      System.out.println("Dwse to pseydonumo tou symmetexonta pou theleis na tropopoih8ei kati:");
      try {
             pseudonumoname= br.readLine();//diavazei to pseydonymo
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
         int thesi=0;
         int type=0; 
        for(int i=0;i<this.getPaixtesList().size();i++)//elegxei an yparxei ayto to pseydomymo sth lista paixtes
           {
             Paixtis4 temp1=new Paixtis4();
             temp1=(Paixtis4)this.getPaixtesList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (temp1.GetPseudwnumo().equals(pseudonumoname.trim())) //i trim afairei ta spaces mprosta kai piso apo to string
             {
              pseudonunoexists=true;
              thesi=i;
              type=1; //an vrika to pseudonimo sti lista twn paikton to type einai 1
              break;
             }
           }
        for(int i=0;i<this.getAdminsList().size();i++)//elegxei an yparxei ayto to pseydomymo sth lista admins
           {
             Diaxeirhsths5 temp2=new Diaxeirhsths5();
             temp2=(Diaxeirhsths5)this.getAdminsList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (temp2.GetPseudwnumo().equals(pseudonumoname.trim())) //i trim afairei ta spaces mprosta kai piso apo to string
             {
              pseudonunoexists=true;
              thesi=i;
              type=2; //an vrika to pseudonimo sti lista twn admin to type einai 2
              break;
             }
           }
        
            if (pseudonunoexists) 
            {
              switch(type)
              {
                case 1:
                String s="";
                Paixtis4 temp3=new Paixtis4();
                System.out.println("Dose neo onoma paikti("+pseudonumoname+")"+":");
                try {
                      s= br.readLine(); 
                    }
                catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                {
                 System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                }
                temp3.SetOnoma(s);
                System.out.println("Dose neo e-mail paikti("+pseudonumoname+")"+":");
                try {
                      s= br.readLine();
                    }
                catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                {
                 System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                }
                temp3.SetEmail(s);
                 boolean rungame=true;
              do {
              for(int i=0;i<this.getPaixnidiaXronouList().size();i++) //tupwnw ta onomata ton paixnidion xronou
              {
               PaixnidiXronou temp1=new PaixnidiXronou();
               temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i);
               System.out.println(i+"."+temp1.GetOnomaPaixnidi()+","+temp1.getType()+"\n");
              }
              for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++) //tipono ta onomata ton paixnidion gyrwn
              {
               PaixnidiGyrwn temp2=new PaixnidiGyrwn();
               temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i);
               System.out.println(Integer.toString(this.getPaixnidiaXronouList().size()+i)+"."+temp2.GetOnomaPaixnidi()+","+temp2.getType()+"\n");
              }
              System.out.println("Dose onoma paixnidiou apo ta parapano diathesima:");
              try {
                  s = br.readLine();
              }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             boolean timegameexists=false;
             boolean roundsgameexists=false;
             for(int i=0;i<this.getPaixnidiaXronouList().size();i++)
             {
              PaixnidiXronou temp1=new PaixnidiXronou();
              temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
              if (temp1.GetOnomaPaixnidi().equals(s.trim())) //i trim afairei ta spaces mprosta kai piso apo to string
              {
               timegameexists=true;
               thesi=i;
               break;
              }
             }
             for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++)
              {
               PaixnidiGyrwn temp2=new PaixnidiGyrwn();
               temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
               if (temp2.GetOnomaPaixnidi().equals(s.trim()))
               {
                roundsgameexists=true;
                thesi=i;
                break;
               }
              }
              
              if (timegameexists || roundsgameexists)
              {
                temp3.SetGame(s);
                rungame=false;
                System.out.print("Edoses swsto onoma paixnidiou\n");
              }
              else
              {
               System.out.print("Edoses lathos onoma paixnidiou!!,ksanaprospathise!\n");
              }
              } while (rungame);
               this.getPaixtesList().remove(thesi);
               this.getPaixtesList().add(thesi, temp3);
                break;
                case 2://an einai diaxeirhsths
                    /* //elegxos:epe3ergasia diaxeirhsth h metatroph se paixth
                    boolean runee=true;
                    int choiceee=0;
                    String see="";
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    do {
                        System.out.println("**********************************************************");  
                        System.out.print("1.an 8es na alla3eis kati apo tis plhrofories tou diaxeirhsth\n");
                        System.out.print("2.an 8es na alla3eis typo symmetexonta apo diaxeirhsth se paixth \n");
                        System.out.print("dwse epilogh 1 h 2 gia na synexiseis\n");
                        System.out.println("**********************************************************");  
                        try {
                            see = br.readLine();//
                            choiceee = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
                            }
                        catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                            {
                        System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                            }
                        switch(choiceee)
                            {
                            case 1:
                             break;//break h default??
                            case 2:
                                //METATROPH DIAXEIRHSTH SE PAIXTH:
                                turnAdminToPaixth();
                                
                             break;
                            case 3:
                              runee=false;
                             break;
                                default:
                        //System.out.println(s);//????
                         //break;//???
                            }
                    } while (runee);      
                    */
                    
                  //epe3ergasia dedomenwn diaxeirhsth:  
                String s1="";
                Diaxeirhsths5 temp4=new Diaxeirhsths5();
                System.out.println("Dose neo onoma diaxeiristi("+pseudonumoname+")"+":");
                try {
                      s1= br.readLine();
                    }
                catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                {
                 System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                }
                temp4.SetOnoma(s1);
                System.out.println("Dose neo tilephono diaxeiristi("+pseudonumoname+")"+":");
                try {
                      s1= br.readLine();
                    }
                catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                {
                 System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                }
                temp4.setThlefwno(s1);
                 boolean rungame1=true;
                 
                 
              do {
              for(int i=0;i<this.getPaixnidiaXronouList().size();i++) //tupwnw ta onomata ton paixnidion xronou
              {
               PaixnidiXronou temp1=new PaixnidiXronou();
               temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i);
               System.out.println(i+"."+temp1.GetOnomaPaixnidi()+","+temp1.getType()+"\n");
              }
              for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++) //tipono ta onomata ton paixnidion gyrwn
              {
               PaixnidiGyrwn temp2=new PaixnidiGyrwn();
               temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i);
               System.out.println(Integer.toString(this.getPaixnidiaXronouList().size()+i)+"."+temp2.GetOnomaPaixnidi()+","+temp2.getType()+"\n");
              }
              System.out.println("Dose onoma paixnidiou apo ta parapano diathesima:");
              try {
                  s1 = br.readLine();
              }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             boolean timegameexists=false;
             boolean roundsgameexists=false;
             for(int i=0;i<this.getPaixnidiaXronouList().size();i++)
             {
              PaixnidiXronou temp1=new PaixnidiXronou();
              temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
              if (temp1.GetOnomaPaixnidi().equals(s1.trim())) //i trim afairei ta spaces mprosta kai piso apo to string
              {
               timegameexists=true;
               thesi=i;
               break;
              }
             }
             for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++)
              {
               PaixnidiGyrwn temp2=new PaixnidiGyrwn();
               temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
               if (temp2.GetOnomaPaixnidi().equals(s1.trim()))
               {
                roundsgameexists=true;
                thesi=i;
                break;
               }
              }
              
              if (timegameexists || roundsgameexists)
              {
                temp4.SetGame(s1);
                rungame=false;
                System.out.print("Edoses swsto onoma paixnidiou\n");
              }
              else
              {
               System.out.print("Edoses lathos onoma paixnidiou!!,ksanaprospathise!\n");
              }
              } while (rungame1);
               this.getAdminsList().remove(thesi); //afairo apo ti lista to palio antikeimeno diaxeiristi
               this.getAdminsList().add(thesi, temp4); //prostheto sti lista sti thesi pou itan to palio to tropopoiimeno antikeimeno admin,temp4
                break;
                default:
                break;
              }
            }
            else
            System.out.println("To pseudonimo simmetexonta pou edoses den iparxei!!");   
     }
    public void turnAdminToPaixth(){
    
    }//public void turnAdminToPaixth(){
    
    
    
    public void removeSymmetoxwn()
    {String symname="";
      String symtype="";
      int choice=0;
      boolean run=true;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Dwse to pseydonumo tou symmetexonta pou theleis na diagrafei:");
      try {
            symname = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
     do {
      System.out.println("******Dwse Typo symmetexonta**********");
      System.out.println("1.symmetexontas aplos paixths");
      System.out.println("2.symmetexontas diaxeirhsths");
      System.out.println("Dwse Epilogi 1-2");
      System.out.println("************************************");
      try {
            symtype = br.readLine();
            choice=Integer.parseInt(symtype);
            run=false;
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      
        } while (run);
     switch(choice)
      {
          case 1://aplos paixths
              boolean exists1=false;
           for(int i=0;i<this.getPaixtesList().size();i++)
           {
               Paixtis4 tempp=new Paixtis4();
             tempp=(Paixtis4)this.getPaixtesList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (tempp.GetPseudwnumo().equals(symname))
             {
              exists1=true;
              this.getPaixtesList().remove(i);
              break;
             }
           }
           if (exists1)
               System.out.println("To pseydonumo:"+symname+" diagrafike epitixos!!");
           else
            System.out.println("To pseydonumo:"+symname+" den iparxei sti lista!!");
          break;
          case 2:
              boolean exists2=false;
           for(int i=0;i<this.getAdminsList().size();i++)
           {
             Diaxeirhsths5 tempd=new Diaxeirhsths5();
             tempd=(Diaxeirhsths5)this.getAdminsList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (tempd.GetPseudwnumo().equals(symname))
             {
              exists2=true;
              this.getAdminsList().remove(i);
              break;
             }
           }
           if (exists2)
               System.out.println("To pseydonumo:"+symname+" diagrafike epitixos!!");
           else
            System.out.println("To pseydonumo:"+symname+" den iparxei sti lista!!");
          break;
          default:
          break;  
           }
    }
 public void PrintSimmetexontaData()
 {
     String s="";
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Dwse pseudonumo simmetexonta gia ton opoio theleis na deis analitikes plirofories:");
   try {
         s = br.readLine();
       }
       catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
       {
        System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
       }
        if (this.searchParticipant(s.trim()) != null)
        {
             if (this.searchParticipant(s).getParticipantType().equals("Player"))
              {
               Paixtis4 temp3=new Paixtis4();
               temp3=(Paixtis4)this.searchParticipant(s.trim());
               System.out.println("------------------------------------------------"); 
               System.out.println("pseydonymo paikti:"+temp3.GetPseudwnumo()+"\n");
               System.out.println("onoma paikti:"+temp3.GetOnoma()+"\n");
               System.out.println("to paixnidi pou tha pai3ei o symmetexontas:"+temp3.getGame()+"\n");
               System.out.println("Typos symmetexonta:"+temp3.getParticipantType()+"\n");
               System.out.println("email summetexonta:"+temp3.GetEmail()+"\n");//////!!!!
               System.out.println("------------------------------------------------"); 
              }
              else if (this.searchParticipant(s).getParticipantType().equals("Admin"))
              {
               Diaxeirhsths5 temp4=new Diaxeirhsths5();
               temp4=(Diaxeirhsths5)this.searchParticipant(s.trim());
               System.out.println("------------------------------------------------"); 
               System.out.println("pseydonumo diaxeiristi:"+temp4.GetPseudwnumo()+"\n");
               System.out.println("onoma diaxeiristi:"+temp4.GetOnoma()+"\n");
               System.out.println("to paixnidi pou tha diaxeiristi o symmetexontas:"+temp4.getGame()+"\n");
               System.out.println("Typos summetexonta:"+temp4.getParticipantType()+"\n");
               System.out.println("thlefwno diaxeiristi:"+temp4.GetThlefwno()+"\n");
               System.out.println("------------------------------------------------"); 
              }
        }
        else
        {
         System.out.println("Edoses pseudonimo simmetexonta pou den iparxei!!,ksanaprospathise!\n");
         this.pause();
        }
 }
 
 public void printSimmetexontes(String type)
 {
   switch(type)
   {
       case "Players":
       for(int i=0;i<this.getPaixtesList().size();i++)
       {
        Paixtis4 temp=new Paixtis4();
        temp=(Paixtis4)this.getPaixtesList().get(i);
        System.out.println(i+"."+"Paixtis:"+temp.GetPseudwnumo()+"\n");
       }
       break;
       case "Admins":
       for(int i=0;i<this.getAdminsList().size();i++)
       {
        Diaxeirhsths5 temp=new Diaxeirhsths5();
        temp=(Diaxeirhsths5)this.getAdminsList().get(i);
        System.out.println(i+"."+"Diaxeiristis:"+temp.GetPseudwnumo()+"\n");
       }
       break;
       default:    
       break;       
   }
 }
 
 public void printSimmetexontes(String type,String gamename) //idio onoma methodou diaforetiki lista parametrwn auto onomazetai method overloading 
 {
   switch(type)
   {
       case "Players":
       for(int i=0;i<this.getPaixtesList().size();i++)
       {
        Paixtis4 temp=new Paixtis4();
        temp=(Paixtis4)this.getPaixtesList().get(i);
        if (temp.getGame().equals(gamename))
        System.out.println(i+"."+"Paixtis:"+temp.GetPseudwnumo()+"\n");
       }
       break;
       case "Admins":
       for(int i=0;i<this.getAdminsList().size();i++)
       {
        Diaxeirhsths5 temp=new Diaxeirhsths5();
        temp=(Diaxeirhsths5)this.getAdminsList().get(i);
        if (temp.getGame().equals(gamename))
        System.out.println(i+"."+"Diaxeiristis:"+temp.GetPseudwnumo()+"\n");
       }
       break;
       default:    
       break;       
   }
 }
 
 
 
 public void PrintSimmetexontesData()
 {
  System.out.println("**************************************************");
  System.out.println("**Kataxwrimenoi symmetexontes sto Sistima Diaxeirisis**");
  System.out.println("**************************************************");
  System.out.println("*********summetexontes*************************");
  for(int i=0;i<this.getPaixtesList().size();i++)
  {
    Paixtis4 temp1=new Paixtis4();
    temp1=(Paixtis4)this.getPaixtesList().get(i);
    System.out.println("Typos summetexonta:"+temp1.getParticipantType()+"\n");
    System.out.println("Onoma summetexonta:"+temp1.GetOnoma()+"\n");
    System.out.println("pseydonumo summetexonta:"+temp1.GetPseudwnumo()+"\n");
    System.out.println("E-mail summetexonta:"+temp1.GetEmail()+"\n");
    System.out.println("Paixnidi summetexonta:"+temp1.getGame()+"\n");
    System.out.println("///////////////////////////////////////////////////");
  }
  System.out.println("------------------------------------------------");
  for(int i=0;i<this.getAdminsList().size();i++)
  {
    Diaxeirhsths5 temp2=new Diaxeirhsths5();
    temp2=(Diaxeirhsths5)this.getAdminsList().get(i);
    System.out.println("Typos summetexonta:"+temp2.getParticipantType()+"\n");
    System.out.println("Onoma summetexonta:"+temp2.GetOnoma()+"\n");
    System.out.println("pseydonumo summetexonta:"+temp2.GetPseudwnumo()+"\n");
    System.out.println("Tilephono summetexonta:"+temp2.GetThlefwno()+"\n");
    System.out.println("Paixnidi summetexonta:"+temp2.getGame()+"\n");
    System.out.println("///////////////////////////////////////////////////");
  }
  System.out.println("------------------------------------------------");
  System.out.println("**************************************************");
 }
     
    /////////////////////////////DIAXEIRHSH TOURNOUA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!////////////////////////////////////////////////////////////////////////////
    //.........................................................DIAXEIRHSH TOURNOUA......................................................................................................................
 public void addTournoua()
    {
     Tournoua2 temp=new Tournoua2();
     String s="";
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Dwse to  onoma tou tournoua:");
      try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }       
    if (!this.TournouaExists(s.trim())) //an den yparxei hdh, allo tournoua me to idio onoma, to pros8etw
    {//if (!exists1 ) //an den yparxei hdh, allo tournoua me to idio onoma, to pros8etw
        
        temp.SetOnomaTournoua(s);
        System.out.println("Dwse topothesia tournoua:");
       try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
       
       temp.SetTopos(s);
       
       System.out.println("Dwse imerominia enarksis tournoua(mera/minas/etos):");
       
       try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
       temp.SetDayStart(s);
       
       System.out.println("Dwse imerominia liksis tournoua(mera/minas/etos):");
       
       try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
       temp.SetDayEnd(s);
       
       System.out.println("Dwse wra enarkis tou tournoua(wra:lepta):");
       
       try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
       
       String[] decode=s.split(":");
       temp.setHour(Integer.parseInt(decode[0])); //i Integer.parseInt metatrepei to string pou anaparista integer se integer 
       temp.setMin(Integer.parseInt(decode[1]));
       
       boolean loop=true;
       do {
        this.PrintAllGamesData();
        System.out.println("Dose onoma (h onomata ,ena ena) paixnidiou apo ta parapano to opoio tha anikei sto tournoua.");
        System.out.println("Otan teleioseis me tin eisagwgi paixnidiwn gia to tournoua dwse to onoma 'telos' :");
        System.out.println("An den exoun eisaxthei paixnidia sto sistima dose tin entoli 'eleima' kai pigaine prota na eisageis.");
        this.pause();
         try {//diavazei apo plhktrologio
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
         if (s.trim().equals("telos"))
         {
          if ((temp.getPaixnidiaXronouTournouaList().size() == 0) && (temp.getPaixnidiaGyrwnTournouaList().size() == 0))
           {
            System.out.println("Den mporeis na teleioseis den exeis eisagei oute ena paixnidi sto tournoua!!");
            this.pause();
           }
           else
           loop=false;
         }
         else if (s.trim().equals("eleima"))
         {
          return;   
         }
         else
         {
           if (this.searchGame(s.trim()) != null)
           {
           if (this.searchGame(s.trim()).getType().equals("TimeGame"))//an ayto pou edwse einai paixnidi xronou:
           {
            temp.getPaixnidiaXronouTournouaList().add(this.searchGame(s.trim()));
           }
           else if (this.searchGame(s.trim()).getType().equals("RoundsGame"))//an ayto pou edwse einai paixnidi gyrwn:
           {
            temp.getPaixnidiaGyrwnTournouaList().add(this.searchGame(s.trim()));
           }
         }
         else if (this.searchGame(s.trim()) == null) //an ayto pou edwse den einai oute paixnidi xronou oute gyrwn
         {
           System.out.println("Edoses onoma paixnidiou pou den iparxei ksanaprospathise!!");
           this.pause();
         } 
        }
       } while (loop);
       
       boolean loop1=true;
       int players=0;
       int admins=0;
       for(int i=0;i<temp.getPaixnidiaXronouTournouaList().size();i++)
       {//for(int i=0;i<temp.getPaixnidiaXronouTournouaList().size();i++)
         players=0;
         PaixnidiXronou check=new PaixnidiXronou();
         check=(PaixnidiXronou)temp.getPaixnidiaXronouTournouaList().get(i);
//an eixe dwsei paixnidi xronou,pame twra na symplhrwsoume gia to sygkekrimeno ,tous toulaxiston 2 paixtes kai 1 diaxeirhsth
         do {
             this.PrintSimmetexontesData();
             System.out.println("Dilosi paiktwn gia to paixnidi xronou:"+check.GetOnomaPaixnidi()+" tou tournoua:"+temp.GetOnomaTournoua());   
             
             this.printSimmetexontes("Players",check.GetOnomaPaixnidi());
             System.out.println("Dose pseudonimo paikti apo ta parapano. Prepei na diloseis toulaxiston dyo paiktes");
             System.out.println("Se periptosi pou den iparxoun diathesimoi paiktes gia to paixnidi dose tin entoli 'eleima'");
             System.out.println("Otan teleioseis me tin eisagwgi paiktwn gia to paixnidi tou tournoua "+check.GetOnomaPaixnidi()+" dwse tin entoli 'telos' ");
             this.pause();
             try 
             {
              s = br.readLine();
             }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             
             if (s.trim().equals("telos"))
             {
               if (players >= 2)
               loop1=false;
               else
               {
                System.out.println("Prepei na prostheseis toulaxiston dyo paiktes sto paixnidi,ksanaprospathise!!");
                this.pause(); 
               }  
             }
             else if (s.trim().equals("eleima"))
             {
               return;
             }
             else 
             {
             if (this.searchParticipant(s.trim()) != null)
             {
              Paixtis4 p=new Paixtis4();
              p=(Paixtis4)this.searchParticipant(s);
              if (p.getParticipantType().equals("Player") && p.getGame().equals(check.GetOnomaPaixnidi()))
              {
               temp.getPlayersTournouaList().add(p);
               players++;
              }
              else
              {
               System.out.println("Edwses lathos pseudonimo paikti gia to sigkekrimmeno paixnidi,ksanaprospathise!!");
               this.pause();
              }
             }
             else if (this.searchParticipant(s.trim()) == null)
             {
              System.out.println("To pseudonimo paixti pou edoses den iparxei,ksanaprospathise!!");
              this.pause();   
             }
           }
       } while(loop1);
       admins=0;
       loop1=true;
       do {
             System.out.println("Dilosi diaxeiristwn gia to paixnidi xronou:"+check.GetOnomaPaixnidi()+" tou tournoua:"+temp.GetOnomaTournoua());   
             this.printSimmetexontes("Admins",check.GetOnomaPaixnidi());
             System.out.println("Dose pseudonimo diaxeiristi apo ta parapano. Prepei na diloseis toulaxiston ena diaxeiristi");
             System.out.println("Se periptosi pou den iparxoun diathesimoi diaxeiristes gia to paixnidi dose tin entoli 'eleima' kai pigaine na prostheseis.");
             System.out.println("Otan teleioseis me tin eisagwgi diaxeiristwn gia to paixnidi tou tournoua "+check.GetOnomaPaixnidi()+" dwse tin entoli 'telos' ");
             this.pause();
             try 
             {
              s = br.readLine();
             }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             
             if (s.trim().equals("telos"))
             {
              if (admins >= 1)
               loop1=false;
               else
               {
                System.out.println("Prepei na prostheseis toulaxiston ena diaxeiristi sto paixnidi,ksanaprospathise!!");
                this.pause(); 
               } 
             }
             else if (s.trim().equals("eleima"))
             {
              return;  
             }
             else
             {
             if (this.searchParticipant(s.trim()) != null)
             {
              Diaxeirhsths5 d=new Diaxeirhsths5();
              d=(Diaxeirhsths5)this.searchParticipant(s.trim());
              if (d.getParticipantType().equals("Admin") && d.getGame().equals(check.GetOnomaPaixnidi()))
              {
               temp.getAdminsTournouaList().add(d);
               admins++;
              }
              else
              {
               System.out.println("Edwses lathos pseudonimo diaxeiristi gia to sigkekrimmeno paixnidi,ksanaprospathise!!");
               this.pause();
              }
             }
             else if (this.searchParticipant(s.trim()) == null)
             {
              System.out.println("To pseudonimo diaxeiristi pou edoses den iparxei,ksanaprospathise!!");
              this.pause();   
             }
           }
         } while (loop1); 
       }//telos if an eixe dwsei paixnidi xronou
       //an eixe dwsei paixnidi gyrwn,pame twra na symplhrwsoume gia to sygkekrimeno ,tous toulaxiston 2 paixtes kai 1 diaxeirhsth
       boolean loop2=true;
       int players2=0;
       int admins2=0;
       for(int i=0;i<temp.getPaixnidiaGyrwnTournouaList().size();i++)
       {//for(int i=0;i<temp.getPaixnidiaGyrwnTournouaList().size();i++)
         players2=0;
         PaixnidiGyrwn check2=new PaixnidiGyrwn();
         check2=(PaixnidiGyrwn)temp.getPaixnidiaGyrwnTournouaList().get(i);
         do {
             System.out.println("Dilosi paiktwn gia to paixnidi gyrwn:"+check2.GetOnomaPaixnidi()+" tou tournoua:"+temp.GetOnomaTournoua());   
             this.printSimmetexontes("Players",check2.GetOnomaPaixnidi());
             System.out.println("Dose pseudonimo paikti apo ta parapano. Prepei na diloseis toulaxiston dyo paiktes");
             System.out.println("Se periptosi pou den iparxoun diathesimoi paiktes gia to paixnidi dose tin entoli 'eleima'");
             System.out.println("Otan teleioseis me tin eisagwgi paiktwn gia to paixnidi tou tournoua "+check2.GetOnomaPaixnidi()+" dwse tin entoli 'telos' ");
             this.pause();
             try  
             {
              s = br.readLine();
             }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             
             if (s.trim().equals("telos"))
             {
              if (players2 >= 2)
               loop2=false;
               else
               {
                System.out.println("Prepei na prostheseis toulaxiston dyo paiktes sto paixnidi,ksanaprospathise!!");
                this.pause(); 
               }  
             }
             else if (s.trim().equals("eleima"))
             {
               return;
             }
             else
             {
             if (this.searchParticipant(s.trim()) != null)
             {
              Paixtis4 di=new Paixtis4();
              di=(Paixtis4)this.searchParticipant(s.trim());
              if (di.getParticipantType().equals("Player") && di.getGame().equals(check2.GetOnomaPaixnidi()))
              {
               temp.getPlayersTournouaList().add(di);
               players2++;
              }
              else
              {
               System.out.println("Edwses lathos pseudonimo paikti gia to sigkekrimmeno paixnidi,ksanaprospathise!!");
               this.pause();
              }
             }
             else if (this.searchParticipant(s.trim()) == null)
             {
              System.out.println("To pseudonimo paikti pou edoses den iparxei,ksanaprospathise!!");
              this.pause();   
             }
           }
         } while (loop2); //telos do
       admins2=0;
       boolean loop3=true;
       do {
             System.out.println("Dilosi diaxeiristwn gia to paixnidi gyrwn:"+check2.GetOnomaPaixnidi()+" tou tournoua:"+temp.GetOnomaTournoua());   
             this.printSimmetexontes("Admins",check2.GetOnomaPaixnidi());
             System.out.println("Dose pseudonimo diaxeiristi apo ta parapano. Prepei na diloseis toulaxiston ena diaxeiristi");
             System.out.println("Se periptosi pou den iparxoun diathesimoi diaxeiristes gia to paixnidi dose tin entoli 'eleima' kai pigaine na prostheseis.");
             System.out.println("Otan teleioseis me tin eisagwgi diaxeiristwn gia to paixnidi tou tournoua "+check2.GetOnomaPaixnidi()+" dwse tin entoli 'telos' ");
             this.pause();
             try 
             {
              s = br.readLine();
             }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             
             if (s.trim().equals("telos"))
             {
              if (admins2 >= 1)
               loop3=false;
               else
               {
                System.out.println("Prepei na prostheseis toulaxiston ena diaxeiristi sto paixnidi,ksanaprospathise!!");
                this.pause(); 
               } 
             }
             else if (s.trim().equals("eleima"))
             {
              return;  
             }
             else
             {
             if (this.searchParticipant(s.trim()) != null)
             {
              Diaxeirhsths5 d=new Diaxeirhsths5();
              d=(Diaxeirhsths5)this.searchParticipant(s.trim());
              if (d.getParticipantType().equals("Admin") && d.getGame().equals(check2.GetOnomaPaixnidi()))
              {
               temp.getAdminsTournouaList().add(d);
               admins2++;
              }
              else
              {
               System.out.println("Edwses lathos pseudonimo diaxeiristi gia to sigkekrimmeno paixnidi,ksanaprospathise!!");
               this.pause();
              }
             }
             else if (this.searchParticipant(s.trim()) == null)
             {
              System.out.println("To pseudonimo diaxeiristi pou edoses den iparxei,ksanaprospathise!!");
              this.pause();   
             }
           }
         } while (loop3);
      }
       
     this.getTournamentsList().add(temp);
     this.createMatches(temp.GetOnomaTournoua());
    }//if (!exists1 ) //an den yparxei hdh, allo tournoua me to idio onoma, to pros8etw
   else
    {
       System.out.println("to onoma tou tournoua pou edwses yparxei hdh,den mporw na to pros8esw!!!");
       this.pause();
    }  
}//telos addtournoua
 /////synarthseis : pause & searchgame = voi8htikes sunarthseis 
    public void pause()
    {
      /*Runtime rt = Runtime.getRuntime();
        try {
            Process proc = rt.exec("dir");
        } catch (IOException ex) {
            Logger.getLogger(GameEngine.class.getName()).log(Level.SEVERE, null, ex);
        } */
      // String s=""; 
  /*     System.out.println("Pieste ena pliktro gia sinexeia");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try {
            br.read();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         } */ 
    }
    
    
    
    
    
        
    public Hlpaixnidi3 searchGame(String name)//Voithitiki synarthsh
    {
     boolean timegameexists=false;
     boolean roundsgameexists=false;
     int thesi=0;
     for(int i=0;i<this.getPaixnidiaXronouList().size();i++)
       {
        PaixnidiXronou temp1=new PaixnidiXronou();
        temp1=(PaixnidiXronou)this.getPaixnidiaXronouList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
        if (temp1.GetOnomaPaixnidi().equals(name.trim())) //i trim afairei ta spaces mprosta kai piso apo to string
          {
           timegameexists=true;
           thesi=i;
           break;
          }
        }
       for(int i=0;i<this.getPaixnidiaGyrwnList().size();i++)
         {
            PaixnidiGyrwn temp2=new PaixnidiGyrwn();
            temp2=(PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
            if (temp2.GetOnomaPaixnidi().equals(name.trim()))
              {
               roundsgameexists=true;
               thesi=i;
               break;
              }
            }
        if (timegameexists)
        {
          return (PaixnidiXronou)this.getPaixnidiaXronouList().get(thesi);
        }
        else if (roundsgameexists)
        {
         return (PaixnidiGyrwn)this.getPaixnidiaGyrwnList().get(thesi);   
        }
        else
        return null; //an den vreis paixnidi me to onoma pou edoses parametro tote gyrise keno ntikeimeno
    }
    
    public Simmetexontas searchParticipant(String pseudoname) 
    {
      boolean exists1=false;
      boolean exists2=false;
      int thesi=0;
      for(int i=0;i<this.getPaixtesList().size();i++)
        {
         Paixtis4 temp=new Paixtis4();
         temp=(Paixtis4)this.getPaixtesList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
         if (temp.GetPseudwnumo().equals(pseudoname))
           {
            exists1=true;
            thesi=i;
            break;
           }
         }
       for(int i=0;i<this.getAdminsList().size();i++)
          {
           Diaxeirhsths5 temp2=new Diaxeirhsths5();
           temp2=(Diaxeirhsths5)this.getAdminsList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
           if (temp2.GetPseudwnumo().equals(pseudoname))
              {
               exists2=true;
               thesi=i;
               break;
              }
          }  
      if (exists1)
      {
        return (Paixtis4)this.getPaixtesList().get(thesi);
      }
      else if (exists2)
      {
       return (Diaxeirhsths5)this.getAdminsList().get(thesi);   
      }
      else  
      return null;
    }////////////////////////////////////
    public void tropopoihshTournoua(){////////////////////////
     Tournoua2 temp=new Tournoua2();
     String s="";
     int thesi=0;
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("An theleis na allakseis to onoma tou tournoua diagrapse to kai kane nea eisagogi!\n");
      System.out.println("Dwse to onoma tou tournoua pou theleis na tropopoih8ei kati:");
      try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
           boolean exists1=false;//elegxos
           for(int i=0;i<this.getTournamentsList().size();i++)
           {
             Tournoua2 check=new Tournoua2();
             check=(Tournoua2)this.getTournamentsList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (check.GetOnomaTournoua().equals(s))
             {
               exists1=true;//yparxei to onoma tou tournoua pou edwse ara mporw na tropopoihsw dedomena
               thesi=i;
               break;
             }
           }
            if (exists1 ) 
    {//if (exists1 )3ekina h tropopoihsh 
        
        temp.SetOnomaTournoua(s);
        System.out.println("Dwse thn nea topothesia tou tournoua:");
       try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
       
       temp.SetTopos(s);
       
       System.out.println("Dwse thn nea imerominia enarksis tournoua(mera/minas/etos):");
       
       try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
       temp.SetDayStart(s);
       
       System.out.println("Dwse thn nea imerominia liksis tournoua(mera/minas/etos):");
       
       try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
       temp.SetDayEnd(s);
       
       System.out.println("Dwse thn nea wra enarkis tou tournoua(wra:lepta):");
       
       try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
       
       String[] decode=s.split(":");
       temp.setHour(Integer.parseInt(decode[0])); //i Integer.parseInt metatrepei to string pou anaparista integer se integer 
       temp.setMin(Integer.parseInt(decode[1]));
       //mexri edw mesa sthn tropopoihsh tournoua exw ftia3ei :allagh gia topo8esia day enar3hs day lh3hs time enar3hs, twra pame na epe3ergastoume se ka8e tournoua:ta paixnidia pou 8a exei tous paixtes kai ton diaxeirhsth 
           boolean loop=true;
       do {
        this.PrintAllGamesData();
        System.out.println("Dose to neo onoma (h onomata ,ena ena) paixnidiou apo ta parapano to opoio tha anikei sto tournoua.");
        System.out.println("Otan teleioseis me tin eisagwgi twn newn paixnidiwn gia to tournoua dwse to onoma 'telos' :");
        this.pause();
         try {//diavazei apo plhktrologio
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
         if (this.searchGame(s) != null)
         {
           if (this.searchGame(s).getType().equals("TimeGame"))//an ayto pou edwse einai paixnidi xronou:
           {
            temp.getPaixnidiaXronouTournouaList().add(this.searchGame(s));
           }
           else if (this.searchGame(s).getType().equals("RoundsGame"))//an ayto pou edwse einai paixnidi gyrwn:
           {
            temp.getPaixnidiaGyrwnTournouaList().add(this.searchGame(s));
           }
         }
         else if (this.searchGame(s) == null) //an ayto pou edwse den einai oute paixnidi xronou oute gyrwn
         {
           System.out.println("Edoses onoma paixnidiou pou den iparxei ksanaprospathise!!");
           this.pause();
         }
         else if (s.equals("telos"))
         {
           if ((temp.getPaixnidiaXronouTournouaList().size() == 0) && (temp.getPaixnidiaGyrwnTournouaList().size() == 0))
           {
            System.out.println("Den mporeis na teleioseis den exeis eisagei oute ena paixnidi sto tournoua!!");
            this.pause();
           }
           else
           loop=false;
         }
         }while (loop);
       boolean loop1=true;
       int players=0;
       int admins=0;
       for(int i=0;i<temp.getPaixnidiaXronouTournouaList().size();i++)
       {//for(int i=0;i<temp.getPaixnidiaXronouTournouaList().size();i++)
         players=0;
         PaixnidiXronou check=new PaixnidiXronou();
         check=(PaixnidiXronou)temp.getPaixnidiaXronouTournouaList().get(i);
//an eixe dwsei paixnidi xronou,pame twra na symplhrwsoume gia to sygkekrimeno ,tous toulaxiston 2 paixtes kai 1 diaxeirhsth
         do {
             System.out.println("Dilosi newn paiktwn gia to paixnidi xronou( tou tournoua):"+check.GetOnomaPaixnidi());   
             this.printSimmetexontes("Players",check.GetOnomaPaixnidi());
             System.out.println("Dose neo pseudonimo paikti apo ta parapano. Prepei na diloseis toulaxiston dyo paiktes");
             System.out.println("Se periptosi pou den iparxoun diathesimoi paiktes gia to paixnidi dose tin entoli 'eleima'");
             System.out.println("Otan teleioseis me tin nea eisagwgi paiktwn gia to paixnidi tou tournoua "+check.GetOnomaPaixnidi()+" dwse tin entoli 'telos' ");
             this.pause();
             try 
             {
              s = br.readLine();
             }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             if (this.searchParticipant(s.trim()) != null)
             {
              Paixtis4 p=new Paixtis4();
              p=(Paixtis4)this.searchParticipant(s);
              if (p.getParticipantType().equals("Player") && p.getGame().equals(check.GetOnomaPaixnidi()))
              {
               temp.getPlayersTournouaList().add(p);
               players++;
              }
              else
              {
               System.out.println("Edwses lathos pseudonimo paikti gia to sigkekrimmeno paixnidi,ksanaprospathise!!");
               this.pause();
              }
             }
             else if (this.searchParticipant(s.trim()) == null)
             {
              System.out.println("To pseudonimo paixti pou edoses den iparxei,ksanaprospathise!!");
              this.pause();   
             }
             else if (s.trim().equals("telos"))
             {
               if (players >= 2)
               loop1=false;
               else
               {
                System.out.println("Prepei na prostheseis toulaxiston dyo paiktes sto paixnidi,ksanaprospathise!!");
                this.pause(); 
               }
             }
             else if (s.trim().equals("eleima"))
             {
               return;   
             }
       } while(loop1);
       admins=0;
       loop1=true;
       
       do {
           System.out.println("Dilosi newn diaxeiristwn gia to paixnidi xronou tou tournoua:"+check.GetOnomaPaixnidi());   
           this.printSimmetexontes("Admins",check.GetOnomaPaixnidi());
             System.out.println("Dose neo pseudonimo diaxeiristi apo ta parapano. Prepei na diloseis toulaxiston ena diaxeiristi");
             System.out.println("Se periptosi pou den iparxoun diathesimoi diaxeiristes gia to paixnidi dose tin entoli 'eleima' kai pigaine na prostheseis.");
             System.out.println("Otan teleioseis me tin nea eisagwgi diaxeiristwn gia to paixnidi tou tournoua "+check.GetOnomaPaixnidi()+" dwse tin entoli 'telos' ");
             this.pause();
             try 
             {
              s = br.readLine();
             }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             if (this.searchParticipant(s.trim()) != null)
             {
              Diaxeirhsths5 d=new Diaxeirhsths5();
              d=(Diaxeirhsths5)this.searchParticipant(s.trim());
              if (d.getParticipantType().equals("Admin") && d.getGame().equals(check.GetOnomaPaixnidi()))
              {
               temp.getAdminsTournouaList().add(d);
               admins++;
              }
              else
              {
               System.out.println("Edwses lathos (to neo) pseudonimo diaxeiristi gia to sigkekrimmeno paixnidi,ksanaprospathise!!");
               this.pause();
              }
             }
             else if (this.searchParticipant(s.trim()) == null)
             {
              System.out.println("To (neo) pseudonimo  diaxeiristi pou edoses den iparxei,ksanaprospathise!!");
              this.pause();   
             }
             else if (s.trim().equals("telos"))
             {
               if (admins >= 1)
               loop1=false;
               else
               {
                System.out.println("Prepei na prostheseis toulaxiston ena diaxeiristi sto paixnidi,ksanaprospathise!!");
                this.pause(); 
               }
             }
             else if (s.trim().equals("eleima"))
             {
               return;   
             }
         } while (loop1); 
        }//telos if an eixe dwsei paixnidi xronou
       //an eixe dwsei paixnidi gyrwn,pame twra na symplhrwsoume gia to sygkekrimeno (to neo) ,tous toulaxiston 2 paixtes kai 1 diaxeirhsth
       boolean loop2=true;
       int players2=0;
       int admins2=0;
       for(int i=0;i<temp.getPaixnidiaGyrwnTournouaList().size();i++)
       {//for(int i=0;i<temp.getPaixnidiaGyrwnTournouaList().size();i++)
         players2=0;
         PaixnidiGyrwn check2=new PaixnidiGyrwn();
         check2=(PaixnidiGyrwn)temp.getPaixnidiaGyrwnTournouaList().get(i);

         do {
             System.out.println("Dilosi newn paiktwn gia to paixnidi gyrwn( tou tournoua):"+check2.GetOnomaPaixnidi());   
             this.printSimmetexontes("Players",check2.GetOnomaPaixnidi());
             System.out.println("Dose neo pseudonimo paikti apo ta parapano. Prepei na diloseis toulaxiston dyo paiktes");
             System.out.println("Se periptosi pou den iparxoun diathesimoi paiktes gia to paixnidi dose tin entoli 'eleima'");
             System.out.println("Otan teleioseis me tin nea eisagwgi paiktwn gia to paixnidi tou tournoua "+check2.GetOnomaPaixnidi()+" dwse tin entoli 'telos' ");
             this.pause();
             try  
             {
              s = br.readLine();
             }
             catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
             {
              System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
             }
             if (this.searchParticipant(s.trim()) != null)
             {
              Diaxeirhsths5 di=new Diaxeirhsths5();
              di=(Diaxeirhsths5)this.searchParticipant(s.trim());
              if (di.getParticipantType().equals("Admin") && di.getGame().equals(check2.GetOnomaPaixnidi()))
              {
               temp.getAdminsTournouaList().add(di);
               admins++;
              }
              else
              {
               System.out.println("Edwses lathos to neo pseudonimo diaxeiristi gia to sigkekrimmeno paixnidi,ksanaprospathise!!");
               this.pause();
              }
             }
             else if (this.searchParticipant(s.trim()) == null)
             {
              System.out.println("To neo pseudonimo diaxeiristi pou edoses den iparxei,ksanaprospathise!!");
              this.pause();   
             }
             else if (s.trim().equals("telos"))
             {
               if (admins >= 1)
               loop2=false;
               else
               {
                System.out.println("Prepei na prostheseis toulaxiston ena neo diaxeiristi sto paixnidi,ksanaprospathise!!");
                this.pause(); 
               }
             }
             else if (s.trim().equals("eleima"))
             {
               return;   
             }
         } while (loop2); 
       
          }
 }
 else
 {
  System.out.println("to onoma tou tournoua pou edwses den yparxei,den mporw na to epe3ergastw!!!");
  this.pause();
 }    
}//telos tropopoihshTournoua//////////////////
    public void removeTournoua(){
    String tournouaname="";
      //boolean run=true;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Dwse to onoma tou tournoua pou theleis na diagrafei:");
      try {
            tournouaname = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      boolean exists1=false;//elegxos
      int thesi =0;
           for(int i=0;i<this.getTournamentsList().size();i++)
           {
             Tournoua2 temp1=new Tournoua2();
             temp1=(Tournoua2)this.getTournamentsList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
             if (temp1.GetOnomaTournoua().equals(tournouaname))
             {
              exists1=true;
              thesi=i;
              break;
             }
           }
           if (exists1) // to ! simainei not, not false=true
           {
            Tournoua2 t=new Tournoua2();
            t=(Tournoua2)this.getTournamentsList().get(thesi);
            for(int j=0;j<t.getPaixnidiaXronouTournouaList().size();j++)
            {
             PaixnidiXronou x=new PaixnidiXronou();
             x=(PaixnidiXronou)t.getPaixnidiaXronouTournouaList().get(j);
             x.getmatchesList().clear();
            }
            for(int h=0;h<t.getPaixnidiaGyrwnTournouaList().size();h++)
            {
             PaixnidiGyrwn g=new PaixnidiGyrwn();
             g=(PaixnidiGyrwn)t.getPaixnidiaGyrwnTournouaList().get(h);
             g.getmatchesList().clear();
            }
            this.getTournamentsList().remove(thesi);
            
            System.out.println("To tournoua:"+tournouaname+" diagrafike epitixos!!");
           }
            else
            System.out.println("To tournoua:"+tournouaname+" den iparxei sti lista!!");   
    }
//telos removeTournoua()
    public void printTournamentData()/////////////////////////////////
    {//public void PrintTournamentData()
     String s="";
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Dwse to onoma tournoua gia to opoio theleis na deis analitikes plirofories:");
   try {
         s = br.readLine();
       }
       catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
       {
        System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
       }
      if (this.TournouaExists(s.trim()))
              {
               Tournoua2 temp3=new Tournoua2();
               temp3=this.getTournoua(s.trim());
               System.out.println("------------------------------------------------"); 
               System.out.println("Onoma Tournoua:"+temp3.GetOnomaTournoua()+"\n");
               System.out.println("Topo8esia Tournoua:"+temp3.GetTopos()+"\n");
               System.out.println("hmeromhnia enar3hs Tournouau:"+temp3.GetDayStart()+"\n");
               System.out.println("hmeromhnia lh3hs Tournouau:"+temp3.GetDayEnd()+"\n");
               System.out.println("wra enar3hs Tournouau: "+temp3.getHour()+":"+temp3.getMin());
               System.out.println("ta paixnidia xronou tou Tournoua:");
               for(int i=0;i<temp3.getPaixnidiaXronouTournouaList().size();i++)
               {
                PaixnidiXronou temp=new PaixnidiXronou();
                temp=(PaixnidiXronou)temp3.getPaixnidiaXronouTournouaList().get(i);
                System.out.println(temp.GetOnomaPaixnidi());
               } 
               System.out.println("ta paixnidia gyrwn tou Tournoua:\n");
               for(int i=0;i<temp3.getPaixnidiaGyrwnTournouaList().size();i++)
               {
                PaixnidiGyrwn temp1=new PaixnidiGyrwn();
                temp1=(PaixnidiGyrwn)temp3.getPaixnidiaGyrwnTournouaList().get(i);
                System.out.println(temp1.GetOnomaPaixnidi());
               } 
               System.out.println("oi admins tou Tournoua:");
               for(int i=0;i<temp3.getAdminsTournouaList().size();i++)
               {
                Diaxeirhsths5 temp2=new Diaxeirhsths5();
                temp2=(Diaxeirhsths5)temp3.getAdminsTournouaList().get(i);
                System.out.println(temp2.GetPseudwnumo());
               } 
               System.out.println("oi paixtes tou Tournoua:");
               for(int i=0;i<temp3.getPlayersTournouaList().size();i++)
               {
                Paixtis4 temp4=new Paixtis4();
                temp4=(Paixtis4)temp3.getPlayersTournouaList().get(i);
                System.out.println(temp4.GetPseudwnumo());
               } 
               System.out.println("------------------------------------------------"); 
              }
      else
         System.out.println("Edoses lathos onoma tournoua!!,ksanaprospathise!\n");
    }//public void PrintTournamentData()
    
    
    public void printTournamentData(String tournouaname)/////////////////////////////////
    {//public void PrintTournamentData()
      if (this.TournouaExists(tournouaname))
              {
               Tournoua2 temp3=new Tournoua2();
               temp3=this.getTournoua(tournouaname);
               System.out.println("------------------------------------------------"); 
               System.out.println("Onoma Tournoua:"+temp3.GetOnomaTournoua()+"\n");
               System.out.println("Topo8esia Tournoua:"+temp3.GetTopos()+"\n");
               System.out.println("hmeromhnia enar3hs Tournouau:"+temp3.GetDayStart()+"\n");
               System.out.println("hmeromhnia lh3hs Tournouau:"+temp3.GetDayEnd()+"\n");
               System.out.println("wra enar3hs Tournouau: "+temp3.getHour()+":"+temp3.getMin());
               System.out.println("ta paixnidia xronou tou Tournoua:");
               for(int i=0;i<temp3.getPaixnidiaXronouTournouaList().size();i++)
               {
                PaixnidiXronou temp=new PaixnidiXronou();
                temp=(PaixnidiXronou)temp3.getPaixnidiaXronouTournouaList().get(i);
                System.out.println(temp.GetOnomaPaixnidi());
               } 
               System.out.println("ta paixnidia gyrwn tou Tournoua:"+temp3.getPaixnidiaXronouTournouaList()+"\n");
               for(int i=0;i<temp3.getPaixnidiaGyrwnTournouaList().size();i++)
               {
                PaixnidiGyrwn temp1=new PaixnidiGyrwn();
                temp1=(PaixnidiGyrwn)temp3.getPaixnidiaGyrwnTournouaList().get(i);
                System.out.println(temp1.GetOnomaPaixnidi());
               } 
               System.out.println("oi admins tou Tournoua:");
               for(int i=0;i<temp3.getAdminsTournouaList().size();i++)
               {
                Diaxeirhsths5 temp2=new Diaxeirhsths5();
                temp2=(Diaxeirhsths5)temp3.getAdminsTournouaList().get(i);
                System.out.println(temp2.GetPseudwnumo());
               } 
               System.out.println("oi paixtes tou Tournoua:");
               for(int i=0;i<temp3.getPlayersTournouaList().size();i++)
               {
                Paixtis4 temp4=new Paixtis4();
                temp4=(Paixtis4)temp3.getPlayersTournouaList().get(i);
                System.out.println(temp4.GetPseudwnumo());
               } 
               System.out.println("------------------------------------------------"); 
              }
      else
         System.out.println("Edoses lathos onoma tournoua!!,ksanaprospathise!\n");
    }
    
    
    
    public void printAllTournamentsData()
    {
     System.out.println("**************************************************");
     System.out.println("**Kataxwrimena Tournaments sto Sistima Diaxeirisis**");
     for(int i=0;i<this.getTournamentsList().size();i++)
      {
       Tournoua2 temp1=new Tournoua2();
       temp1=(Tournoua2)this.getTournamentsList().get(i);
       this.printTournamentData(temp1.GetOnomaTournoua());
      }
     System.out.println("**************************************************");
    }
/////////DIAXEIRHSH MATCHES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!/////
//..............................................DIAXEIRHSH MATCHES.....................................................................................
  
  public void createWinnersMatches(String tournouaname,String gamename,int type) //0 paixnidi xronou,1 paixnidi gyrwn
  {
    switch(type)
    {
        case 0:
        PaixnidiXronou temp1=new PaixnidiXronou();
        temp1=(PaixnidiXronou)this.searchTournouaGame(tournouaname, gamename);
        ArrayList<Paixtis4> p=new ArrayList(); //prosorini lista paiktwn pou tha gemisei simfona me ta pseudonima pou iparxoun sti lista nikitwn 
        int gameplayers=0; //arithmos paiktwn gia to ka8e paixnidi xronou
        int thesi=0;
        thesi=this.getTournouaGameListaPosition(tournouaname, gamename);
       for(int l=0;l<temp1.getWinnersList().size();l++)//to l einai o ari8mos twn nikitwn, gia to sygkekrimeno paixnidi tou tournoua
       {//for(int l=0;l<temp.getPlayersTournouaList().size();l++)
        Paixtis4 pl=new Paixtis4();
        String pseudoname=(String)temp1.getWinnersList().get(l);
        pl=(Paixtis4)this.searchParticipant(pseudoname);
        p.add(pl);
        gameplayers++;
       }
       if (gameplayers == 2)
       {
        temp1.SetMaxPaixtes(gameplayers);
        Match m=new Match((Paixtis4)p.get(0),(Paixtis4)p.get(1));//twra paixnw ta stoixeia ths listas twn paixtwn, se ka8e paixnidi xronou,kai ta kataxwrw sto ka8e antikeimeno match
        m.Setgamename(temp1.GetOnomaPaixnidi());
        temp1.getmatchesList().clear();
        temp1.getmatchesList().add(m);
        temp1.getWinnersList().clear();
        Tournoua2 t=new Tournoua2();
        t=this.getTournoua(tournouaname);
        t.getPaixnidiaXronouTournouaList().remove(thesi);
        t.getPaixnidiaXronouTournouaList().add(thesi,temp1);
       }
       else
       {
        if ((gameplayers % 2) == 0)
        {
          temp1.SetMaxPaixtes(gameplayers);
         // temp1.getmatchesList().clear();
          ArrayList<Integer> r=new ArrayList();
          
          boolean randomok=false;
          do { //elenxos gia na eksasfalisoume oti den iparxoun epanalamvanomenes times apo tin random generator
          r.clear();
          for(int k=0;k<p.size();k++) //gemizoume thn arraylist akairaiwn r , me ta tyxaia noumera pou mas dinei ka8e fora h randint , sto euros 0-mege8os_listas_twn_paixtwn_pou_dhlwsan_to_paixnidi
            r.add(randInt(0,p.size()-1));
          
           if (this.findDuplicateValues(r))
           {
             randomok=true;
            // System.out.println("Duplicate values!!!");
           }
           else
               randomok=false;
          
          } while (randomok);
          
          temp1.getmatchesList().clear();
          
          for(int o=0;o<gameplayers-1;o=o+2)//gia ka8e paixth tou paixnidiou xronou
          {
            Match a=new Match((Paixtis4)p.get((Integer)r.get(o)),(Paixtis4)p.get((Integer)r.get(o+1)));//afou hdh h lista exei tyxaia tous paixtes tous vazw twra 2 2 gia ka8e match meta3y tous
            a.Setgamename(temp1.GetOnomaPaixnidi());
            temp1.getmatchesList().add(a);
          }
        temp1.getWinnersList().clear();
        Tournoua2 t1=new Tournoua2();
        t1=this.getTournoua(tournouaname);  
        t1.getPaixnidiaXronouTournouaList().remove(thesi);
        t1.getPaixnidiaXronouTournouaList().add(thesi,temp1);
          
        }
        else if ((gameplayers % 2) != 0)
        {
          temp1.SetMaxPaixtes(gameplayers);
        //  temp1.getmatchesList().clear();
          ArrayList<Integer> r1=new ArrayList();
          temp1.setLastOddPlayer(p.get(p.size()-1)); //o atixos paiktis einai o paiktis stin  teleutaia thesi tis listas ,h opoia exei tous paiktes pou exoun dilosei to sigkekrimmeno paixnidi
          
          boolean randomok1=false;
          do { //elenxos gia na eksasfalisoume oti den iparxoun epanalamvanomenes times apo tin random generator
          r1.clear();
          for(int k=0;k<p.size();k++) //gemizoume thn arraylist akairaiwn r , me ta tyxaia noumera pou mas dinei ka8e fora h randint , sto euros 0-mege8os_listas_twn_paixtwn_pou_dhlwsan_to_paixnidi
            r1.add(randInt(0,p.size()-1));
          
           if (this.findDuplicateValues(r1))
           {
             randomok1=true;
            // System.out.println("Duplicate values!!!");
           }
           else
               randomok1=false;
          
          } while (randomok1);
          
          temp1.getmatchesList().clear();
          
          for(int g=0;g<gameplayers-1;g=g+2)
          {
           Match d=new Match((Paixtis4)p.get((Integer)r1.get(g)),(Paixtis4)p.get((Integer)r1.get(g+1)));////afou hdh h lista exei tyxaia tous paixtes tous vazw twra 2 2 gia ka8e match meta3y tous
           d.Setgamename(temp1.GetOnomaPaixnidi());
           temp1.getmatchesList().add(d);
          }
          temp1.getWinnersList().clear();
          Tournoua2 t2=new Tournoua2();
          t2=this.getTournoua(tournouaname);  
          t2.getPaixnidiaXronouTournouaList().remove(thesi);
          t2.getPaixnidiaXronouTournouaList().add(thesi,temp1); 
         }
        }
        break;
        case 1:
        PaixnidiGyrwn temp2=new PaixnidiGyrwn();
        temp2=(PaixnidiGyrwn)this.searchTournouaGame(tournouaname, gamename);
        ArrayList<Paixtis4> p1=new ArrayList(); //prosorini lista paiktwn pou tha gemisei simfona me ta pseudonima pou iparxoun sti lista nikitwn 
        int gameplayers1=0; //arithmos paiktwn gia to ka8e paixnidi xronou
        int thesi1=this.getTournouaGameListaPosition(tournouaname, gamename);
       for(int l=0;l<temp2.getWinnersList().size();l++)//to l einai o ari8mos twn nikitwn, gia to sygkekrimeno paixnidi tou tournoua
       {//for(int l=0;l<temp.getPlayersTournouaList().size();l++)
        Paixtis4 pl=new Paixtis4();
        String pseudoname=(String)temp2.getWinnersList().get(l);
        pl=(Paixtis4)this.searchParticipant(pseudoname);
        p1.add(pl);
        gameplayers1++;
       }
       if (gameplayers1 == 2)
       {
        temp2.SetMaxPaixtes(gameplayers1);
        Match m=new Match((Paixtis4)p1.get(0),(Paixtis4)p1.get(1));//twra paixnw ta stoixeia ths listas twn paixtwn, se ka8e paixnidi xronou,kai ta kataxwrw sto ka8e antikeimeno match
        m.Setgamename(temp2.GetOnomaPaixnidi());
        temp2.getmatchesList().clear();
        temp2.getmatchesList().add(m);
        temp2.getWinnersList().clear();
        Tournoua2 t=new Tournoua2();
        t=this.getTournoua(tournouaname);
        t.getPaixnidiaGyrwnTournouaList().remove(thesi1);
        t.getPaixnidiaGyrwnTournouaList().add(thesi1,temp2);
       }
       else
       {
        if ((gameplayers1 % 2) == 0)
        {
          temp2.SetMaxPaixtes(gameplayers1);
          temp2.getmatchesList().clear();
          ArrayList<Integer> r=new ArrayList();
          
          boolean randomok=false;
          do { //elenxos gia na eksasfalisoume oti den iparxoun epanalamvanomenes times apo tin random generator
          r.clear();
          for(int k=0;k<p1.size();k++) //gemizoume thn arraylist akairaiwn r , me ta tyxaia noumera pou mas dinei ka8e fora h randint , sto euros 0-mege8os_listas_twn_paixtwn_pou_dhlwsan_to_paixnidi
            r.add(randInt(0,p1.size()-1));
          
           if (this.findDuplicateValues(r))
           {
             randomok=true;
            // System.out.println("Duplicate values!!!");
           }
           else
               randomok=false;
          
          } while (randomok);
          
          temp2.getmatchesList().clear();
          
          for(int o=0;o<gameplayers1-1;o=o+2)//gia ka8e paixth tou paixnidiou xronou
          {
            Match a=new Match((Paixtis4)p1.get((Integer)r.get(o)),(Paixtis4)p1.get((Integer)r.get(o+1)));//afou hdh h lista exei tyxaia tous paixtes tous vazw twra 2 2 gia ka8e match meta3y tous
            a.Setgamename(temp2.GetOnomaPaixnidi());
            temp2.getmatchesList().add(a);
          }
        temp2.getWinnersList().clear();
        Tournoua2 t2=new Tournoua2();
        t2=this.getTournoua(tournouaname);  
        t2.getPaixnidiaGyrwnTournouaList().remove(thesi1);
        t2.getPaixnidiaGyrwnTournouaList().add(thesi1,temp2);
        }
        else if ((gameplayers1 % 2) != 0)
        {
          temp2.SetMaxPaixtes(gameplayers1);
          temp2.getmatchesList().clear();
          ArrayList<Integer> r=new ArrayList();
          temp2.setLastOddPlayer(p1.get(p1.size()-1)); //o atixos paiktis einai o paiktis stin  teleutaia thesi tis listas ,h opoia exei tous paiktes pou exoun dilosei to sigkekrimmeno paixnidi
          
          boolean randomok=false;
          do { //elenxos gia na eksasfalisoume oti den iparxoun epanalamvanomenes times apo tin random generator
          r.clear();
          for(int k=0;k<p1.size();k++) //gemizoume thn arraylist akairaiwn r , me ta tyxaia noumera pou mas dinei ka8e fora h randint , sto euros 0-mege8os_listas_twn_paixtwn_pou_dhlwsan_to_paixnidi
            r.add(randInt(0,p1.size()-1));
          
           if (this.findDuplicateValues(r))
           {
             randomok=true;
            // System.out.println("Duplicate values!!!");
           }
           else
               randomok=false;
          
          } while (randomok);
          
          temp2.getmatchesList().clear();
          
          for(int g=0;g<gameplayers1-1;g=g+2)
          {
           Match d=new Match((Paixtis4)p1.get((Integer)r.get(g)),(Paixtis4)p1.get((Integer)r.get(g+1)));////afou hdh h lista exei tyxaia tous paixtes tous vazw twra 2 2 gia ka8e match meta3y tous
           d.Setgamename(temp2.GetOnomaPaixnidi());
           temp2.getmatchesList().add(d);
          }
          temp2.getWinnersList().clear();
          Tournoua2 t3=new Tournoua2();
          t3=this.getTournoua(tournouaname);  
          t3.getPaixnidiaGyrwnTournouaList().remove(thesi1);
          t3.getPaixnidiaGyrwnTournouaList().add(thesi1,temp2); 
         }
        }
        break;
        default:
        break;
    }
  }
  
 boolean duplicates(final ArrayList<Integer> list)
{
  Set<Integer> lump = new HashSet<Integer>();
  for (int i : list) //foreach
  {
    if (lump.contains(i)) return true;
    lump.add(i);
  }
  return false;
}
 
 
  public boolean findDuplicateValues(ArrayList<Integer> list)
  {
    boolean foundduplicate=false;
    
    int thesi=0;
    for(int i=0;i<list.size();i++)
    {
      thesi=i;  
      for(int j=0;j<list.size();j++)
      {
        if (j != thesi)
        {
            if (list.get(i) == list.get(j))
            {
             foundduplicate=true;
             break;
            }
        }
          
      }
    }
    return foundduplicate;
  }
 
  
      
  public void createMatches(String tournouaname) 
  {   
     Tournoua2 temp=new Tournoua2();
     temp=this.getTournoua(tournouaname);//to temp antikeimeno allazei se ka8e i,i=metritis twn tournoua2
     for(int j=0;j<temp.getPaixnidiaXronouTournouaList().size();j++) //gia kathe paixnidi xronou tou tournoua , 
     {//for(int j=0;j<temp.getPaixnidiaXronouTournouaList().size();j++) //gia kathe paixnidi xronou tou tournoua
       ArrayList<Paixtis4> p=new ArrayList(); //prosorini lista paiktwn pou exoun dilosei to sigkekrimeno paixnidi xronou 
       int gameplayers=0; //arithmos paiktwn gia to ka8e paixnidi xronou
       PaixnidiXronou t=new PaixnidiXronou();
       t=(PaixnidiXronou)temp.getPaixnidiaXronouTournouaList().get(j);//to t antikeimeno allazei se ka8e j
       for(int l=0;l<temp.getPlayersTournouaList().size();l++)//to l einai o ari8mos twn paixtwn, gia to sygkekrimeno paixnidi tou tournoua
       {//for(int l=0;l<temp.getPlayersTournouaList().size();l++)
        Paixtis4 pl=new Paixtis4();
        pl=(Paixtis4)temp.getPlayersTournouaList().get(l);//to pl antikeimeno allazei se ka8e l,
        System.out.println("Player pseudo:"+pl.GetPseudwnumo()+" Player Game:"+pl.getGame()); //debug
        if (pl.getGame().equals(t.GetOnomaPaixnidi()))//an gia ka8e paixth to paixnidi pou eixe epile3ei einai t paixnidi xronou t twrino
          {
            p.add(pl);
            gameplayers++;//o synolikos ari8mos twn paixtwn se ka8e paixnidi xronou 
          }  
       }
       if (gameplayers == 2)
       {
        t.SetMaxPaixtes(gameplayers);
        Match m=new Match((Paixtis4)p.get(0),(Paixtis4)p.get(1));//twra paixnw ta stoixeia ths listas twn paixtwn, se ka8e paixnidi xronou,kai ta kataxwrw sto ka8e antikeimeno match
        m.Setgamename(t.GetOnomaPaixnidi());
        t.getmatchesList().add(m);
        temp.getPaixnidiaXronouTournouaList().remove(j);
        temp.getPaixnidiaXronouTournouaList().add(j,t); //add sthn 8esh j to antikeimeno paixnidiou xronou t
       }
       else
       {
        if ((gameplayers % 2) == 0)
        {
          t.SetMaxPaixtes(gameplayers);
          ArrayList<Integer> r=new ArrayList();
          boolean randomok=false;
          do { //elenxos gia na eksasfalisoume oti den iparxoun epanalamvanomenes times apo tin random generator
          r.clear();
          for(int k=0;k<p.size();k++) //gemizoume thn arraylist akairaiwn r , me ta tyxaia noumera pou mas dinei ka8e fora h randint , sto euros 0-mege8os_listas_twn_paixtwn_pou_dhlwsan_to_paixnidi
            r.add(randInt(0,p.size()-1));
          
           if (this.findDuplicateValues(r))
           {
             randomok=true;
            // System.out.println("Duplicate values!!!");
           }
           else
               randomok=false;
          
          } while (randomok);
           
          for(int o=0;o<gameplayers-1;o=o+2)//gia ka8e paixth tou paixnidiou xronou
          {
            Match a=new Match((Paixtis4)p.get((Integer)r.get(o)),(Paixtis4)p.get((Integer)r.get(o+1)));//afou hdh h lista exei tyxaia tous paixtes tous vazw twra 2 2 gia ka8e match meta3y tous
            a.Setgamename(t.GetOnomaPaixnidi());
            t.getmatchesList().add(a);
          }
          
          temp.getPaixnidiaXronouTournouaList().remove(j);
          temp.getPaixnidiaXronouTournouaList().add(j,t);
          
        }
        else
        if ((gameplayers % 2) != 0)
        {
          t.SetMaxPaixtes(gameplayers);
          ArrayList<Integer> rodd=new ArrayList();
          t.setLastOddPlayer(p.get(p.size()-1)); //o atixos paiktis einai o paiktis stin  teleutaia thesi tis listas ,h opoia exei tous paiktes pou exoun dilosei to sigkekrimmeno paixnidi
          
          boolean randomok1=false;
          do {
          rodd.clear();
          for(int k=0;k<p.size()-1;k++) //gemizoume thn arraylist akairaiwn r , me ta tyxaia noumera pou mas dinei ka8e fora h randint , sto euros 0-mege8os_listas_twn_paixtwn_pou_dhlwsan_to_paixnidi
            rodd.add(randInt(0,p.size()-2));
          
           if (this.findDuplicateValues(rodd))
           {
             randomok1=true;
             //System.out.println("Duplicate values!!!");
           }
           else
               randomok1=false;
          
          } while (randomok1);
          
          for(int g=0;g<gameplayers-1;g=g+2)
          {
           Match d=new Match((Paixtis4)p.get((Integer)rodd.get(g)),(Paixtis4)p.get((Integer)rodd.get(g+1)));////afou hdh h lista exei tyxaia tous paixtes tous vazw twra 2 2 gia ka8e match meta3y tous
           d.Setgamename(t.GetOnomaPaixnidi());
           t.getmatchesList().add(d);
          }
          
          temp.getPaixnidiaXronouTournouaList().remove(j);
          temp.getPaixnidiaXronouTournouaList().add(j,t);
        }
       } 
     }//for(int j=0;j<temp.getPaixnidiaXronouTournouaList().size();j++) //gia kathe paixnidi xronou tou tournoua
     
     //todo paixnidiagyrwn:
     for(int q=0;q<temp.getPaixnidiaGyrwnTournouaList().size();q++)
     {//gia kathe paixnidi gyrwn tou tournoua
         ArrayList<Paixtis4> p_gyrwn=new ArrayList(); //prosorini lista paiktwn pou exoun dilosei to sigkekrimeno paixnidi gyrwn
       int game_gyrwn_players=0; //arithmos paiktwn 
       PaixnidiGyrwn gyrwn=new PaixnidiGyrwn();
       gyrwn=(PaixnidiGyrwn)temp.getPaixnidiaGyrwnTournouaList().get(q);
       for(int lg=0;lg<temp.getPlayersTournouaList().size();lg++)//to teliko lg einai o ari8mos twn paixtwn, gia to sygkekrimeno paixnidi tou tournoua
       {
        Paixtis4 pl_2=new Paixtis4();
        pl_2=(Paixtis4)temp.getPlayersTournouaList().get(lg);
        if (pl_2.getGame().equals(gyrwn.GetOnomaPaixnidi()))
          {
            p_gyrwn.add(pl_2);//sto antikeimeno p_gyrwn typou Paixtis4 pros8etw 
            System.out.println("Player pseudo:"+pl_2.GetPseudwnumo()+" Player Game:"+pl_2.getGame());
            game_gyrwn_players++;//o ari8mos twn paixtwn se ka8e paixnidi gyrwn
          }  
       } //for(int lg=0;lg<temp.getPlayersTournouaList().size();lg++)
       System.out.println("Game Players:"+Integer.toString(game_gyrwn_players)); 
     if (game_gyrwn_players == 2)
       {
        gyrwn.SetMaxPaixtes(game_gyrwn_players);
        Match mm=new Match((Paixtis4)p_gyrwn.get(0),(Paixtis4)p_gyrwn.get(1));
        mm.Setgamename(gyrwn.GetOnomaPaixnidi());
        gyrwn.getmatchesList().add(mm);
        temp.getPaixnidiaGyrwnTournouaList().remove(q);
        temp.getPaixnidiaGyrwnTournouaList().add(q,gyrwn); //add sthn 8esh q to antikeimeno gyrwn, typou paixnidiGyrwn  
       }
      else
       {
        if ((game_gyrwn_players % 2) == 0)
        {
          gyrwn.SetMaxPaixtes(game_gyrwn_players);
          ArrayList<Integer> rg=new ArrayList();
          
          boolean randomok2=false;
          do {
           rg.clear();
           for(int kg=0;kg<p_gyrwn.size();kg++) //gemizoume thn arraylist akairaiwn r , me ta tyxaia noumera pou mas dinei ka8e fora h randint , sto euros 0-mege8os_listas_twn_paixtwn_pou_dhlwsan_to_paixnidi
            rg.add(randInt(0,p_gyrwn.size()-1));
          
           if (this.findDuplicateValues(rg))
           {
             randomok2=true;
             //System.out.println("Duplicate values!!!");
           }
           else
               randomok2=false;
          
          } while (randomok2);
          
          for(int og=0;og<game_gyrwn_players-1;og=og+2) //vima 2
          {
            Match ag=new Match((Paixtis4)p_gyrwn.get((Integer)rg.get(og)),(Paixtis4)p_gyrwn.get((Integer)rg.get(og+1)));
            ag.Setgamename(gyrwn.GetOnomaPaixnidi());
            gyrwn.getmatchesList().add(ag);
          }
          
          temp.getPaixnidiaGyrwnTournouaList().remove(q);
          temp.getPaixnidiaGyrwnTournouaList().add(q,gyrwn);
        } 
      else
        if ((game_gyrwn_players % 2) != 0)
        {
          System.out.println("Inside odd creation");
          gyrwn.SetMaxPaixtes(game_gyrwn_players);
          ArrayList<Integer> rg1=new ArrayList();
          gyrwn.setLastOddPlayer(p_gyrwn.get(p_gyrwn.size()-1)); //o atixos paiktis einai o paiktis stin  teleutaia thesi tis listas pou exei tous paiktes pou exoun dilosei to sigkekrimmeno paixnidi
          
          boolean randomok3=false;
          do {
           rg1.clear();
           for(int kg=0;kg<p_gyrwn.size()-1;kg++) //gemizoume thn arraylist akairaiwn r , me ta tyxaia noumera pou mas dinei ka8e fora h randint , sto euros 0-mege8os_listas_twn_paixtwn_pou_dhlwsan_to_paixnidi
            rg1.add(randInt(0,p_gyrwn.size()-2));
          
           if (this.findDuplicateValues(rg1))
           {
             randomok3=true;
             //System.out.println("Duplicate values!!!");
           }
           else
               randomok3=false;
          
          } while (randomok3);
          
          for(int kg=0;kg<p_gyrwn.size()-1;kg++)
             System.out.println("Integer ArrayList,position:"+Integer.toString(kg)+" is:"+Integer.toString(rg1.get(kg)));
          
          for(int gg=0;gg<game_gyrwn_players-1;gg=gg+2)
          {
           Match dg=new Match((Paixtis4)p_gyrwn.get((Integer)rg1.get(gg)),(Paixtis4)p_gyrwn.get((Integer)rg1.get(gg+1)));
           System.out.println("Match:"+Integer.toString(gg)+" Player1:"+Integer.toString(rg1.get(gg))+" Player 2:"+Integer.toString(rg1.get(gg+1)));
           dg.Setgamename(gyrwn.GetOnomaPaixnidi());
           gyrwn.getmatchesList().add(dg);
          }
          temp.getPaixnidiaGyrwnTournouaList().remove(q);
          temp.getPaixnidiaGyrwnTournouaList().add(q,gyrwn); 
        }  
     }// for(int q=0;q<temp.getPaixnidiaGyrwnTournouaList().size();q++)
     
     }//gia ka8e paixnidi gyrwn tou tournoua 
    this.getTournamentsList().remove(this.getTournouaListaPosition(tournouaname));
    this.getTournamentsList().add(this.getTournouaListaPosition(tournouaname),temp);
   //gia kathe diaforetiko tournoua
  //telos create match
 } 
  
  public void updateMatches()
  {
   String s="";
   boolean tournouaexists=false;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Dwse to onoma tou tournoua gia to opoio theleis na kataxwriseis apotelesmata:");
      try {
            s = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
    if (this.TournouaExists(s.trim()))
    {
     String pseudoname="";
     System.out.println("Dwse pseudwnimo diaxeiristi:");
     try {
            pseudoname = br.readLine();
         }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
     
      if (this.searchParticipant(pseudoname.trim()) != null)//(this.searchTournouaParticipant(s.trim(),pseudoname.trim(),1) != null)
      {
       Diaxeirhsths5 temp1=new Diaxeirhsths5();
       temp1=(Diaxeirhsths5)this.searchParticipant(pseudoname.trim());  //this.searchTournouaParticipant(s.trim(),pseudoname.trim(),1);
       if (this.searchTournouaGame(s.trim(),temp1.getGame()).getType().equals("TimeGame"))////xronou
       {
        boolean oddplayerexists=false;
        PaixnidiXronou game1=new PaixnidiXronou();
        game1=(PaixnidiXronou)this.searchTournouaGame(s.trim(),temp1.getGame());
        if (!game1.getLastOddPlayer().GetEmail().equals(""))
        {
         Paixtis4 last=new Paixtis4();
         last=(Paixtis4)game1.getLastOddPlayer();
         oddplayerexists=true;
        }
        System.out.println("Odd player found!!!");
         boolean cont=true;
         int runtimewhile=0;
         while (cont)
         {
            if (runtimewhile == 0)
            {
             System.out.println("-----------------------------------------------");
             System.out.println("Diaxeirisi Agwnwn Paixnidiou Xronou:"+game1.GetOnomaPaixnidi());
             System.out.println("-----------------------------------------------");
            for(int m=0;m<game1.getmatchesList().size();m++) //H LISTA ME TA MATCH POU IPOLOGIZONTAI ETOIMA EINAI PANTA ZYGOI
            {
              System.out.println("Agwnas:"+Integer.toString(m));
              Paixtis4 p1=new Paixtis4();
              Paixtis4 p2=new Paixtis4();
              Match agwnas=new Match();
              agwnas=(Match)game1.getmatchesList().get(m);
              p1=(Paixtis4)agwnas.getPlayer1();
              p2=(Paixtis4)agwnas.getPlayer2();
              System.out.println("1.Paiktis:"+p1.GetOnoma()+" Pseudwnimo:"+p1.GetPseudwnumo());
              System.out.println("2.Paiktis:"+p2.GetOnoma()+" Pseudwnimo:"+p2.GetPseudwnumo());
              System.out.println("Dwse Epilogi tou paikti pou nikise ston agwna '1-2'"); 
              boolean runme=true;
              int choice=0;
              String winnerchoice="";
              do {
                 boolean error;
                 error=false;
                try {
                     winnerchoice=br.readLine();
                     choice=Integer.parseInt(winnerchoice);
                    }
                    catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                    {
                     System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                     System.out.println("Prepei na dwseis arithmo!!,ksanaprospathise");
                     error=true;
                    }
               if (!error)
               {
                 if ((choice == 1) || (choice == 2)) 
                    runme=false;
                 else
                 System.out.println("Epilegeis 1-2,Ksanaprospathise!!");
               }
              } while (runme);
              switch(choice)
              {
                  case 1:
                  game1.getWinnersList().add(p1.GetPseudwnumo());
                  game1.getLosersList().add(p2.GetPseudwnumo());
                  agwnas.SetWinner(p1.GetPseudwnumo());
                  agwnas.Setloser(p2.GetPseudwnumo());
                  break;
                  case 2:
                  game1.getWinnersList().add(p2.GetPseudwnumo());
                  game1.getLosersList().add(p1.GetPseudwnumo());
                  agwnas.SetWinner(p2.GetPseudwnumo());
                  agwnas.Setloser(p1.GetPseudwnumo());
                  break;
                  default:
                  break;
              }
            }
            
            if (oddplayerexists)
            {
             game1.getWinnersList().add(game1.getLastOddPlayer().GetPseudwnumo());
            }
         } 
         else
         {
           if (game1.getWinnersList().size() == 1)
             cont=false;
           else
           {
              if ((game1.getWinnersList().size() % 2) == 0)
               {
                this.createWinnersMatches(s.trim(),game1.GetOnomaPaixnidi(),0);
                System.out.println("-----------------------------------------------");
                System.out.println("Diaxeirisi Agwnwn Paixnidiou Xronou:"+game1.GetOnomaPaixnidi());
                System.out.println("-----------------------------------------------");
                 for(int m=0;m<game1.getmatchesList().size();m++) //H LISTA ME TA MATCH POU IPOLOGIZONTAI ETOIMA EINAI PANTA ZYGOI
                 {
                   System.out.println("Agwnas:"+Integer.toString(m));
                   Paixtis4 p1=new Paixtis4();
                   Paixtis4 p2=new Paixtis4();
                   Match agwnas=new Match();
                   agwnas=(Match)game1.getmatchesList().get(m);
                   p1=(Paixtis4)agwnas.getPlayer1();
                   p2=(Paixtis4)agwnas.getPlayer2();
                   System.out.println("1.Paiktis:"+p1.GetOnoma()+" Pseudwnimo:"+p1.GetPseudwnumo());
                   System.out.println("2.Paiktis:"+p2.GetOnoma()+" Pseudwnimo:"+p2.GetPseudwnumo());
                   System.out.println("Dwse Epilogi tou paikti pou nikise ston agwna '1-2'"); 
                   boolean runme=true;
                   int choice=0;
                   String winnerchoice="";
                   do {
                        boolean error;
                        error=false;
                        try {
                              winnerchoice=br.readLine();
                              choice=Integer.parseInt(winnerchoice);
                            }
                        catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                        {
                          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                          System.out.println("Prepei na dwseis arithmo!!,ksanaprospathise");
                          error=true;
                        }
                        if (!error)
                          {
                            if ((choice == 1) || (choice == 2)) 
                               runme=false;
                            else
                            System.out.println("Epilegeis 1-2,Ksanaprospathise!!");
                          }
                        } while (runme);
                   switch(choice)
                   {
                     case 1:
                     game1.getWinnersList().add(p1.GetPseudwnumo());
                     game1.getLosersList().add(p2.GetPseudwnumo());
                     agwnas.SetWinner(p1.GetPseudwnumo());
                     agwnas.Setloser(p2.GetPseudwnumo());
                     break;
                     case 2:
                     game1.getWinnersList().add(p2.GetPseudwnumo());
                     game1.getLosersList().add(p1.GetPseudwnumo());
                     agwnas.SetWinner(p2.GetPseudwnumo());
                     agwnas.Setloser(p1.GetPseudwnumo());
                     break;
                     default:
                     break;
                  }
                }
               }
               else if ((game1.getWinnersList().size() % 2) != 0)
                {
                  game1.setLastOddPlayer((Paixtis4)this.searchParticipant((String)game1.getWinnersList().get(game1.getWinnersList().size()-1)));
                  game1.getWinnersList().remove(game1.getWinnersList().size()-1);
                  this.createWinnersMatches(s.trim(), game1.GetOnomaPaixnidi(), 0);
                  System.out.println("-----------------------------------------------");
                  System.out.println("Diaxeirisi Agwnwn Paixnidiou Xronou:"+game1.GetOnomaPaixnidi());
                  System.out.println("-----------------------------------------------");
                  for(int m=0;m<game1.getmatchesList().size();m++) //H LISTA ME TA MATCH POU IPOLOGIZONTAI ETOIMA EINAI PANTA ZYGOI
                  {
                   System.out.println("Agwnas:"+Integer.toString(m));
                   Paixtis4 p1=new Paixtis4();
                   Paixtis4 p2=new Paixtis4();
                   Match agwnas=new Match();
                   agwnas=(Match)game1.getmatchesList().get(m);
                   p1=(Paixtis4)agwnas.getPlayer1();
                   p2=(Paixtis4)agwnas.getPlayer2();
                   System.out.println("1.Paiktis:"+p1.GetOnoma()+" Pseudwnimo:"+p1.GetPseudwnumo());
                   System.out.println("2.Paiktis:"+p2.GetOnoma()+" Pseudwnimo:"+p2.GetPseudwnumo());
                   System.out.println("Dwse Epilogi tou paikti pou nikise ston agwna '1-2'"); 
                   boolean runme=true;
                   int choice=0;
                   String winnerchoice="";
                   do {
                        boolean error;
                        error=false;
                        try {
                              winnerchoice=br.readLine();
                              choice=Integer.parseInt(winnerchoice);
                            }
                        catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                        {
                          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                          System.out.println("Prepei na dwseis arithmo!!,ksanaprospathise");
                          error=true;
                        }
                        if (!error)
                          {
                            if ((choice == 1) || (choice == 2)) 
                               runme=false;
                            else
                            System.out.println("Epilegeis 1-2,Ksanaprospathise!!");
                          }
                        } while (runme);
                       switch(choice)
                       {
                        case 1:
                        game1.getWinnersList().add(p1.GetPseudwnumo());
                        game1.getLosersList().add(p2.GetPseudwnumo());
                        agwnas.SetWinner(p1.GetPseudwnumo());
                        agwnas.Setloser(p2.GetPseudwnumo());
                        break;
                        case 2:
                        game1.getWinnersList().add(p2.GetPseudwnumo());
                        game1.getLosersList().add(p1.GetPseudwnumo());
                        agwnas.SetWinner(p2.GetPseudwnumo());
                        agwnas.Setloser(p1.GetPseudwnumo());
                        break;
                        default:
                        break;
                      }
                    }
                  
                  game1.getWinnersList().add((String)game1.getLastOddPlayer().GetPseudwnumo());
                }
           }
         }
         runtimewhile++;  
        }
        //if-else tipou paixnidiou!!!
       } 
       else if (this.searchTournouaGame(s.trim(),temp1.getGame()).getType().equals("RoundsGame"))
       {
        boolean oddplayerexists=false;
        PaixnidiGyrwn game2=new PaixnidiGyrwn();
        game2=(PaixnidiGyrwn)this.searchTournouaGame(s.trim(),temp1.getGame());
        if (!game2.getLastOddPlayer().GetEmail().equals(""))
        {
         Paixtis4 last=new Paixtis4();
         last=(Paixtis4)game2.getLastOddPlayer();
         oddplayerexists=true;
        }
        System.out.println("Odd player found!!!");
         boolean cont=true;
         int runtimewhile=0;
         while (cont)
         {
            if (runtimewhile == 0)
            {
             System.out.println("-----------------------------------------------");
             System.out.println("Diaxeirisi Agwnwn Paixnidiou Xronou:"+game2.GetOnomaPaixnidi());
             System.out.println("-----------------------------------------------");
            for(int m=0;m<game2.getmatchesList().size();m++) //H LISTA ME TA MATCH POU IPOLOGIZONTAI ETOIMA EINAI PANTA ZYGOI
            {
              System.out.println("Agwnas:"+Integer.toString(m));
              Paixtis4 p1=new Paixtis4();
              Paixtis4 p2=new Paixtis4();
              Match agwnas=new Match();
              agwnas=(Match)game2.getmatchesList().get(m);
              p1=(Paixtis4)agwnas.getPlayer1();
              p2=(Paixtis4)agwnas.getPlayer2();
              System.out.println("1.Paiktis:"+p1.GetOnoma()+" Pseudwnimo:"+p1.GetPseudwnumo());
              System.out.println("2.Paiktis:"+p2.GetOnoma()+" Pseudwnimo:"+p2.GetPseudwnumo());
              System.out.println("Dwse Epilogi tou paikti pou nikise ston agwna '1-2'"); 
              boolean runme=true;
              int choice=0;
              String winnerchoice="";
              do {
                 boolean error;
                 error=false;
                try {
                     winnerchoice=br.readLine();
                     choice=Integer.parseInt(winnerchoice);
                    }
                    catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                    {
                     System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                     System.out.println("Prepei na dwseis arithmo!!,ksanaprospathise");
                     error=true;
                    }
               if (!error)
               {
                 if ((choice == 1) || (choice == 2)) 
                    runme=false;
                 else
                 System.out.println("Epilegeis 1-2,Ksanaprospathise!!");
               }
              } while (runme);
              switch(choice)
              {
                  case 1:
                  game2.getWinnersList().add(p1.GetPseudwnumo());
                  game2.getLosersList().add(p2.GetPseudwnumo());
                  agwnas.SetWinner(p1.GetPseudwnumo());
                  agwnas.Setloser(p2.GetPseudwnumo());
                  break;
                  case 2:
                  game2.getWinnersList().add(p2.GetPseudwnumo());
                  game2.getLosersList().add(p1.GetPseudwnumo());
                  agwnas.SetWinner(p2.GetPseudwnumo());
                  agwnas.Setloser(p1.GetPseudwnumo());
                  break;
                  default:
                  break;
              }
            }
            
            if (oddplayerexists)
            {
             game2.getWinnersList().add(game2.getLastOddPlayer().GetPseudwnumo());
            }
         } 
         else
         {
           if (game2.getWinnersList().size() == 1)
             cont=false;
           else
           {
              if ((game2.getWinnersList().size() % 2) == 0)
               {
                this.createWinnersMatches(s.trim(),game2.GetOnomaPaixnidi(),1);
                System.out.println("-----------------------------------------------");
                System.out.println("Diaxeirisi Agwnwn Paixnidiou Xronou:"+game2.GetOnomaPaixnidi());
                System.out.println("-----------------------------------------------");
                 for(int m=0;m<game2.getmatchesList().size();m++) //H LISTA ME TA MATCH POU IPOLOGIZONTAI ETOIMA EINAI PANTA ZYGOI
                 {
                   System.out.println("Agwnas:"+Integer.toString(m));
                   Paixtis4 p1=new Paixtis4();
                   Paixtis4 p2=new Paixtis4();
                   Match agwnas=new Match();
                   agwnas=(Match)game2.getmatchesList().get(m);
                   p1=(Paixtis4)agwnas.getPlayer1();
                   p2=(Paixtis4)agwnas.getPlayer2();
                   System.out.println("1.Paiktis:"+p1.GetOnoma()+" Pseudwnimo:"+p1.GetPseudwnumo());
                   System.out.println("2.Paiktis:"+p2.GetOnoma()+" Pseudwnimo:"+p2.GetPseudwnumo());
                   System.out.println("Dwse Epilogi tou paikti pou nikise ston agwna '1-2'"); 
                   boolean runme=true;
                   int choice=0;
                   String winnerchoice="";
                   do {
                        boolean error;
                        error=false;
                        try {
                              winnerchoice=br.readLine();
                              choice=Integer.parseInt(winnerchoice);
                            }
                        catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                        {
                          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                          System.out.println("Prepei na dwseis arithmo!!,ksanaprospathise");
                          error=true;
                        }
                        if (!error)
                          {
                            if ((choice == 1) || (choice == 2)) 
                               runme=false;
                            else
                            System.out.println("Epilegeis 1-2,Ksanaprospathise!!");
                          }
                        } while (runme);
                   switch(choice)
                   {
                     case 1:
                     game2.getWinnersList().add(p1.GetPseudwnumo());
                     game2.getLosersList().add(p2.GetPseudwnumo());
                     agwnas.SetWinner(p1.GetPseudwnumo());
                     agwnas.Setloser(p2.GetPseudwnumo());
                     break;
                     case 2:
                     game2.getWinnersList().add(p2.GetPseudwnumo());
                     game2.getLosersList().add(p1.GetPseudwnumo());
                     agwnas.SetWinner(p2.GetPseudwnumo());
                     agwnas.Setloser(p1.GetPseudwnumo());
                     break;
                     default:
                     break;
                  }
                }
               }
               else if ((game2.getWinnersList().size() % 2) != 0)
                {
                  game2.setLastOddPlayer((Paixtis4)this.searchParticipant((String)game2.getWinnersList().get(game2.getWinnersList().size()-1)));
                  game2.getWinnersList().remove(game2.getWinnersList().size()-1);
                  this.createWinnersMatches(s.trim(), game2.GetOnomaPaixnidi(), 1);
                  System.out.println("-----------------------------------------------");
                  System.out.println("Diaxeirisi Agwnwn Paixnidiou Xronou:"+game2.GetOnomaPaixnidi());
                  System.out.println("-----------------------------------------------");
                  for(int m=0;m<game2.getmatchesList().size();m++) //H LISTA ME TA MATCH POU IPOLOGIZONTAI ETOIMA EINAI PANTA ZYGOI
                  {
                   System.out.println("Agwnas:"+Integer.toString(m));
                   Paixtis4 p1=new Paixtis4();
                   Paixtis4 p2=new Paixtis4();
                   Match agwnas=new Match();
                   agwnas=(Match)game2.getmatchesList().get(m);
                   p1=(Paixtis4)agwnas.getPlayer1();
                   p2=(Paixtis4)agwnas.getPlayer2();
                   System.out.println("1.Paiktis:"+p1.GetOnoma()+" Pseudwnimo:"+p1.GetPseudwnumo());
                   System.out.println("2.Paiktis:"+p2.GetOnoma()+" Pseudwnimo:"+p2.GetPseudwnumo());
                   System.out.println("Dwse Epilogi tou paikti pou nikise ston agwna '1-2'"); 
                   boolean runme=true;
                   int choice=0;
                   String winnerchoice="";
                   do {
                        boolean error;
                        error=false;
                        try {
                              winnerchoice=br.readLine();
                              choice=Integer.parseInt(winnerchoice);
                            }
                        catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
                        {
                          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
                          System.out.println("Prepei na dwseis arithmo!!,ksanaprospathise");
                          error=true;
                        }
                        if (!error)
                          {
                            if ((choice == 1) || (choice == 2)) 
                               runme=false;
                            else
                            System.out.println("Epilegeis 1-2,Ksanaprospathise!!");
                          }
                        } while (runme);
                       switch(choice)
                       {
                        case 1:
                        game2.getWinnersList().add(p1.GetPseudwnumo());
                        game2.getLosersList().add(p2.GetPseudwnumo());
                        agwnas.SetWinner(p1.GetPseudwnumo());
                        agwnas.Setloser(p2.GetPseudwnumo());
                        break;
                        case 2:
                        game2.getWinnersList().add(p2.GetPseudwnumo());
                        game2.getLosersList().add(p1.GetPseudwnumo());
                        agwnas.SetWinner(p2.GetPseudwnumo());
                        agwnas.Setloser(p1.GetPseudwnumo());
                        break;
                        default:
                        break;
                      }
                    }
                  
                  game2.getWinnersList().add((String)game2.getLastOddPlayer().GetPseudwnumo());
                }
           }
         }
         runtimewhile++;  
        }
       }
      }
      else
      System.out.println("Sto tournoua:"+s.trim()+" den iparxei diaxeirhsths me to sigkekrimmeno pseudonimo");
    }
    else
    {
     System.out.println("To tournoua pou epelekses den iparxei");
    }
  }
  
  public Tournoua2 getTournoua(String name)
  {
    Tournoua2 temp=new Tournoua2();
    if (this.TournouaExists(name))//an yparxei ayto to 
    {
     for(int i=0;i<this.getTournamentsList().size();i++)
      {
       temp=(Tournoua2)this.getTournamentsList().get(i);
       if (temp.GetOnomaTournoua().equals(name))
          break;
      }
      return temp;
    }
    else
    return null;
  }
  public Simmetexontas searchTournouaParticipant(String tournouaname,String pseudonimo,int type) //0 player type,1 admin type
  {
    Tournoua2 temp=new Tournoua2();
    Paixtis4 temp1=new Paixtis4();
    Diaxeirhsths5 temp2=new Diaxeirhsths5();
    
    if (this.TournouaExists(tournouaname))
    {
      if (type == 0)
      {
          boolean playerexists=false;
          for(int j=0;j<temp.getPlayersTournouaList().size();j++)
          {
            temp1=(Paixtis4)temp.getPlayersTournouaList().get(j);
            if (temp1.GetPseudwnumo().equals(pseudonimo))
            {
             playerexists=true;
             break;
            }
          }
          if (playerexists)
          {
           return (Paixtis4)temp1;   
          }
          else
          return null;
      } else if (type == 1)
      {
        boolean diaxeirhsthsexists=false;
        for(int k=0;k<temp.getAdminsTournouaList().size();k++)
        {
         temp2=(Diaxeirhsths5)temp.getAdminsTournouaList().get(k);
         if (temp2.GetPseudwnumo().equals(pseudonimo))
         {
           diaxeirhsthsexists=true;
           break;
         }
        }
        if (diaxeirhsthsexists)
          return (Diaxeirhsths5)temp2;
        else
        return null;    
      }
      else
      return null;
    }
    else
    return null;
  }
  
  public boolean TournouaExists(String name)
  {
   boolean tournouaexists=false;
   for(int i=0;i<this.getTournamentsList().size();i++)
    {
      Tournoua2 temp=new Tournoua2();
      temp=(Tournoua2)this.getTournamentsList().get(i);
      if (temp.GetOnomaTournoua().equals(name))
      {
       tournouaexists=true;
       break;
      }
    }
   return tournouaexists;
  }
  
  public int getTournouaListaPosition(String tournouaname)
  {
    int position=0;
    Tournoua2 temp=new Tournoua2();
    for(int i=0;i<this.getTournamentsList().size();i++) 
    {
     temp=(Tournoua2)this.getTournamentsList().get(i);
     if (temp.GetOnomaTournoua().equals(tournouaname))
     {
       position=i;
       break;
     }
    } 
    return position;
  }
  
  
  public int getTournouaGameListaPosition(String tournouaname,String gamename)
  {
   Tournoua2 temp=new Tournoua2();
   temp=this.getTournoua(tournouaname);
   PaixnidiXronou temp1=new PaixnidiXronou();
   PaixnidiGyrwn temp2=new PaixnidiGyrwn();
   
   for(int i=0;i<temp.getPaixnidiaXronouTournouaList().size();i++)
   {
     temp1=(PaixnidiXronou)temp.getPaixnidiaXronouTournouaList().get(i);
     if (temp1.GetOnomaPaixnidi().equals(gamename))
      return i;
   }
   for(int j=0;j<temp.getPaixnidiaGyrwnTournouaList().size();j++)
   {
     temp2=(PaixnidiGyrwn)temp.getPaixnidiaGyrwnTournouaList().get(j);
     if (temp2.GetOnomaPaixnidi().equals(gamename))
      return j;
   } 
   
   return 0;
  }
  public Hlpaixnidi3 searchTournouaGame(String tournouaname,String gamename)
  {
   Tournoua2 temp=new Tournoua2();
   PaixnidiXronou temp1=new PaixnidiXronou();
   PaixnidiGyrwn temp2=new PaixnidiGyrwn();
   
   for(int i=0;i<this.getTournoua(tournouaname).getPaixnidiaXronouTournouaList().size();i++)
   {
     temp1=(PaixnidiXronou)this.getTournoua(tournouaname).getPaixnidiaXronouTournouaList().get(i);
     if (temp1.GetOnomaPaixnidi().equals(gamename))
      return temp1;
   }
   
   for(int j=0;j<this.getTournoua(tournouaname).getPaixnidiaGyrwnTournouaList().size();j++)
   {
     temp2=(PaixnidiGyrwn)this.getTournoua(tournouaname).getPaixnidiaGyrwnTournouaList().get(j);
     if (temp2.GetOnomaPaixnidi().equals(gamename))
      return temp2;
   }
   return null;
  }
  
 
  
  
  
  
  
  
  
  
  public int randInt(int min, int max) //random number generator min=0 max=megethos tis listas twn players. 
  {
    // NOTE: Usually this should be a field rather than a method
    // variable so that it is not re-seeded every call.
    
    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
     Random rand = new Random();
     int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
 //telos h diaxeirhsh match!!:) :) :) 
  ////////////////////////////DIAXEIRHSH EKTYPWSEWN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//////////////////////////////////////////////////////
   //................................................................DIAXEIRHSH EKTYPWSEWN.......................................................
//1.System.out.println("1.ektypwsh olwn twn onomatwn twn tournoua"); //printAllTournamentsData()
// ("2.Ektypwsh stoixeiwn enos Tournoua"); //printTournamentData()
//("3.Ektypwsh olwn twn agwnwn-match (olwn twn tournoua)"); //tiponei olous tous agwnes gia ola ta paixnidia tou tournoua
//(/"4.Ektypwsh olwn twn agwnwn-match gia sigkekrimmeno Paixnidi"); //typwnei agwnes gia sigkekrimmeno paixnidi tou tournoua
//("5.Ektypwseis apotelesmatwn agwnwn-match Tournoua");
   public void printTournouaGameMatches()
   {
     String s="";
     String t="";
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Dwse onoma Tournoua:");
     try {
           t = br.readLine();
         }
        catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
        {
         System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
        }
     
     if (this.TournouaExists(t.trim()))
     {
       System.out.println("Dwse onoma paixnidiou tou Tournoua:");
       try {
            s = br.readLine();
         }
        catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
        {
         System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
        }
       
       if (this.searchTournouaGame(t.trim(),s.trim()) != null)
       {
         if (this.searchTournouaGame(t.trim(),s.trim()).getType().equals("TimeGame"))
         {
          PaixnidiXronou timegame=new PaixnidiXronou();
          timegame=(PaixnidiXronou)this.searchTournouaGame(t.trim(),s.trim());
          System.out.println("Agwnews tou Paixnidiou Xronou:"+timegame.GetOnomaPaixnidi());
          System.out.println("----------------------------------------------------------");
          for(int i=0;i<timegame.getmatchesList().size();i++)
          {
           Match agwnas=new Match();
           agwnas=(Match)timegame.getmatchesList().get(i);
           Paixtis4 p1=new Paixtis4();
           Paixtis4 p2=new Paixtis4();
           p1=agwnas.getPlayer1();
           p2=agwnas.getPlayer2();
           System.out.println("Agwnas:"+i);
           System.out.println("1os Paiktis:"+p1.GetOnoma()+" ,Pseudonimo:"+p1.GetPseudwnumo());
           System.out.println("2os Paiktis:"+p2.GetOnoma()+" ,Pseudonimo:"+p2.GetPseudwnumo());
           System.out.println("----------------------------------------------------------");
          }
         }
         else if (this.searchTournouaGame(t.trim(),s.trim()).getType().equals("RoundsGame"))
         {
          PaixnidiGyrwn roundsgame=new PaixnidiGyrwn();
          roundsgame=(PaixnidiGyrwn)this.searchTournouaGame(t.trim(),s.trim());
          System.out.println("Agwnews tou Paixnidiou Gyrwn:"+roundsgame.GetOnomaPaixnidi());
          System.out.println("----------------------------------------------------------");
          for(int i=0;i<roundsgame.getmatchesList().size();i++)
          {
           Match agwnas=new Match();
           agwnas=(Match)roundsgame.getmatchesList().get(i);
           Paixtis4 p1=new Paixtis4();
           Paixtis4 p2=new Paixtis4();
           p1=agwnas.getPlayer1();
           p2=agwnas.getPlayer2();
           System.out.println("Agwnas:"+i);
           System.out.println("1os Paiktis:"+p1.GetOnoma()+" ,Pseudonimo:"+p1.GetPseudwnumo());
           System.out.println("2os Paiktis:"+p2.GetOnoma()+" ,Pseudonimo:"+p2.GetPseudwnumo());
           System.out.println("----------------------------------------------------------");
          }   
         }
       }
       else
       System.out.println("To onoma paixnidiou tou tournoua pou edoses den iparxei!!:");
       
     }
     else
     System.out.println("To onoma tournoua pou edoses den iparxei!!:");
     
   }
   
   public void printWinnersData()
   {
    String s="";
     String t="";
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Dwse onoma Tournoua:");
     try {
           t = br.readLine();
         }
        catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
        {
         System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
        }
     
     if (this.TournouaExists(t.trim()))
     {
       System.out.println("Dwse onoma paixnidiou tou Tournoua:");
       try {
            s = br.readLine();
         }
        catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
        {
         System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
        }
       
       if (this.searchTournouaGame(t.trim(),s.trim()) != null)
       {
         if (this.searchTournouaGame(t.trim(),s.trim()).getType().equals("TimeGame"))
         {
          PaixnidiXronou timegame=new PaixnidiXronou();
          timegame=(PaixnidiXronou)this.searchTournouaGame(t.trim(),s.trim());
          if (timegame.getWinnersList().size() == 1)
            System.out.println("O prwtathlitis tou paixnidiou xronou:"+timegame.GetOnomaPaixnidi()+" gia to tournoua:"+t.trim()+" einai o paiktis me pseudonimo:"+timegame.getWinnersList().get(0));
          else
          {
           for(int i=0;i<timegame.getWinnersList().size();i++)
           {
            System.out.println("Nikites tou Paixnidiou Xronou:"+timegame.GetOnomaPaixnidi());
            System.out.println("----------------------------------------------------------");
            System.out.println(i+"."+timegame.getWinnersList().get(i));
            System.out.println("----------------------------------------------------------");
           }
          }
         }
         else if (this.searchTournouaGame(t.trim(),s.trim()).getType().equals("RoundsGame"))
         {
          PaixnidiGyrwn roundsgame=new PaixnidiGyrwn();
          roundsgame=(PaixnidiGyrwn)this.searchTournouaGame(t.trim(),s.trim());
           if (roundsgame.getWinnersList().size() == 1)
            System.out.println("O prwtathlitis tou paixnidiou gyrwn:"+roundsgame.GetOnomaPaixnidi()+" gia to tournoua:"+t.trim()+" einai o paiktis me pseudonimo:"+roundsgame.getWinnersList().get(0));
          else
          {
           for(int i=0;i<roundsgame.getWinnersList().size();i++)
           {
            System.out.println("Nikites tou Paixnidiou Gyrwn:"+roundsgame.GetOnomaPaixnidi());
            System.out.println("----------------------------------------------------------");
            System.out.println(i+"."+roundsgame.getWinnersList().get(i));
            System.out.println("----------------------------------------------------------");
           }
          }  
         }
       }
       else
       System.out.println("To onoma paixnidiou tou tournoua pou edoses den iparxei!!:");
     }
     else
     System.out.println("To onoma tournoua pou edoses den iparxei!!:");   
   }
  
  
  
  
  public void printMatchData()
  { 
    for(int q=0;q<this.getTournamentsList().size();q++) //gia kathe diaforetiko tournoua(q)
      {//for(int q=0;i<this.getTournamentsList().size();q++)
        Tournoua2 temp=new Tournoua2();
        temp=(Tournoua2)this.getTournamentsList().get(q);
        String s="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dwse onoma paixnidiou ,gia to opoio theleis na deis analitikes plirofories twn match tou:");
        try {
         s = br.readLine();
            }
        catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
        {
         System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
        }
        boolean timegameexists=false;
        boolean roundsgameexists=false;
        int thesi=0;
        for(int i=0;i<temp.getPaixnidiaXronouTournouaList().size();i++)
            {
            PaixnidiXronou temp1=new PaixnidiXronou();
            temp1=(PaixnidiXronou)temp.getPaixnidiaXronouTournouaList().get(i); //type casting tou antikeimenou pou pairno apo ti lista
            if (temp1.GetOnomaPaixnidi().equals(s.trim())) //i trim afairei ta spaces mprosta kai piso apo to string
              {
               timegameexists=true;
               thesi=i;
               
               break;
              }
            }
        for(int j=0;j<temp.getPaixnidiaGyrwnTournouaList().size();j++)
            {
            PaixnidiGyrwn temp2=new PaixnidiGyrwn();
            temp2=(PaixnidiGyrwn)temp.getPaixnidiaGyrwnTournouaList().get(j); //type casting tou antikeimenou pou pairno apo ti lista
            if (temp2.GetOnomaPaixnidi().equals(s.trim()))
              {
               roundsgameexists=true;
               thesi=j;
               break;
              }
            }
            if (timegameexists)
              {
               Match temp3=new Match();//???lista match??
               temp3=(Match)temp.getPaixnidiaXronouTournouaList().get(thesi);
               System.out.println("------------------------------------------------"); 
               System.out.println("to Onoma tou Paixnidiou pou epele3es:"+temp3.getGameName()+"\n"+"sto tournoua"+temp.GetOnomaTournoua()+"exei ta e3hs zeygaria sta match");
               System.out.println("o prwtos paixtis tou match:"+temp3.getPlayer1()+"\n");
               System.out.println("o deyteros paixtis tou match:"+temp3.getPlayer2()+"\n");
///////////////Hlpaixnidi3.getmatchesList.temp3.searchTournouaGame(temp.GetOnomaTournoua(),temp3.getGameName());
               //pws 8a ektypwnw ola ta match ???????
               System.out.println("------------------------------------------------"); 
              }
            else if (roundsgameexists)
              {
               Match temp4=new Match();
               temp4=(Match)temp.getPaixnidiaGyrwnTournouaList().get(thesi);
               System.out.println("------------------------------------------------"); 
               System.out.println("to Onoma tou Paixnidiou pou epele3es:"+temp4.getGameName()+"\n"+"sto tournoua"+temp.GetOnomaTournoua()+"exei ta e3hs zeygaria sta match");
               System.out.println("o prwtos paixtis tou match:"+temp4.getPlayer1()+"\n");
               System.out.println("o deyteros paixtis tou match:"+temp4.getPlayer2()+"\n");
               System.out.println("------------------------------------------------"); 
              }
            
            //else
                
              //System.out.println("Edoses lathos onoma paixnidiou!!,ksanaprospathise!\n");
        
    } //telos for q//an se ola ta tournoua ,den yparxei to paixnidi pou edwse ,ektypwse edwses la8os onoma paixnidiou
    
  }
 
 
  
  
  
  public void printAllMatchesData()
  {
    for(int i=0;i<this.getTournamentsList().size();i++)
    {
      Tournoua2 temp=new Tournoua2();
      temp=(Tournoua2)this.getTournamentsList().get(i);
      System.out.println("Tournoua:"+temp.GetOnomaTournoua());
      for(int j=0;j<temp.getPaixnidiaXronouTournouaList().size();j++)
      {
       PaixnidiXronou temp1=new PaixnidiXronou();
       temp1=(PaixnidiXronou)temp.getPaixnidiaXronouTournouaList().get(j);
       System.out.println("Paixnidi Xronou:"+temp1.GetOnomaPaixnidi());
       for(int k=0;k<temp1.getmatchesList().size();k++)
       {
        Match m=new Match();
        m=(Match)temp1.getmatchesList().get(k);
        Paixtis4 p1=new Paixtis4();
        Paixtis4 p2=new Paixtis4();
        p1=(Paixtis4)m.getPlayer1();
        p2=(Paixtis4)m.getPlayer2();
        System.out.println(Integer.toString(k)+".Match");
        System.out.println("--------------------------");
        System.out.println("Paiktis 1:"+p1.GetOnoma()+" ,/Pseudonimo:"+p1.GetPseudwnumo());
        System.out.println("Paiktis 2:"+p2.GetOnoma()+" ,/Pseudonimo:"+p2.GetPseudwnumo());
        System.out.println("--------------------------");
       }
      }//telos paixnidiaxronou
      for(int kj=0;kj<temp.getPaixnidiaGyrwnTournouaList().size();kj++)
      {
        PaixnidiGyrwn temp11=new PaixnidiGyrwn();
       temp11=(PaixnidiGyrwn)temp.getPaixnidiaGyrwnTournouaList().get(kj);
       System.out.println("Paixnidi gyrwn:"+temp11.GetOnomaPaixnidi());
       for(int kk=0;kk<temp11.getmatchesList().size();kk++)
       {
        Match mm=new Match();
        mm=(Match)temp11.getmatchesList().get(kk);
        Paixtis4 p11=new Paixtis4();
        Paixtis4 p22=new Paixtis4();
        p11=(Paixtis4)mm.getPlayer1();
        p22=(Paixtis4)mm.getPlayer2();
        System.out.println(Integer.toString(kk)+".Match");
        System.out.println("--------------------------");
        System.out.println("Paiktis 1:"+p11.GetOnoma()+" ,/Pseudonimo:"+p11.GetPseudwnumo());
        System.out.println("Paiktis 2:"+p22.GetOnoma()+" ,/Pseudonimo:"+p22.GetPseudwnumo());
        System.out.println("--------------------------");
       }  
      
      }//telos paixnidiagyrwn
        
   } //telos gia ka8e tournoua 
  }//telos synarthshs
  }//telos gameengine