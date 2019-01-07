/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasiaa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class Ergasiaa1 {
    
    static GameEngine startPlay=null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      startPlay=new GameEngine();  
      Ergasiaa1.initializeData();
      int choice=0;  
      boolean run=true;
      String s="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//System.in =pliktrologio siskeui eisodou dedomenon,  
    //BufferedReader einai ta3h vivlio8hkhs ths java , tou java.io , to br einai antikeimeno ths .to new InputStreamReader diavazei akolou8eies bit apo thn syskeuh eisodou dedomenwn 
     do {    //arxiko menou ergasias
          System.out.println("**********************************************************");  
          System.out.println("**Programma Diaxeirhshs Tournoua Hlektronikwn Paixnidiwn**");
          System.out.println("1.Diaxeirhsh Paixnidiwn");
          System.out.println("2.Diaxirhsh Symmetoxwn");  
          System.out.println("3.Diaxeirhsh tournoua");  
          System.out.println("4.Ektypwsh Plhroforiwn");  
          System.out.println("5.Eksodos Apo To Programma");  
          System.out.println("Dwse Epilogi:1-5"); 
          System.out.println("**********************************************************");    
          try {
               s = br.readLine();
               choice = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
          }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
          
         switch(choice)
         {
             case 1:
             diaxeirisiPaixnidionMenou();
             break;
             case 2:
             diaxeirisiSimmetoxownMenou();
             break;
             case 3:
             diaxeirisiTournouaMenou();
             break;
             case 4:
             diaxeirisiEktiposeonMenou();
             break;
             case 5:
             run=false;
             System.exit(0);
             break;
             default:
             System.out.println(s);
             break;
         }
          
         System.out.println(Integer.toString(choice));
        } while (run);
    }/////////////////////////////////////////////telos main!/////////////////////////////////////////////
    //
    public static void initializeData()
    {
     PaixnidiXronou g1=new PaixnidiXronou("skaki",120);
     Ergasiaa1.startPlay.getPaixnidiaXronouList().add(g1);
     PaixnidiGyrwn g2=new PaixnidiGyrwn("tavli",7);
     PaixnidiGyrwn g3=new PaixnidiGyrwn("rpg",12);
     Ergasiaa1.startPlay.getPaixnidiaGyrwnList().add(g2);
     Ergasiaa1.startPlay.getPaixnidiaGyrwnList().add(g3);
     Paixtis4 p1=new Paixtis4("katerina","eks","skaki","katerina@hua.gr");
     Paixtis4 p2=new Paixtis4("panagiotis","panos","skaki","panagiotis@hua.gr");
     Paixtis4 p3=new Paixtis4("petros","ps","skaki","katerina@hua.gr");
     Paixtis4 p4=new Paixtis4("kostas","ks","skaki","kostas@hua.gr");
     Paixtis4 p5=new Paixtis4("nikos","ns","skaki","nikos@hua.gr");
     Paixtis4 p6=new Paixtis4("alex","as","skaki","alex@hua.gr");
     Paixtis4 p7=new Paixtis4("maria","ms","rpg","maria@hua.gr");
     Paixtis4 p8=new Paixtis4("kate","kas","rpg","kate@hua.gr");
     Paixtis4 p9=new Paixtis4("katerina","ka","rpg","katerina@uoa.gr");
     Paixtis4 p10=new Paixtis4("giwrgos","gs","rpg","giwrgos@hua.gr");
     Paixtis4 p11=new Paixtis4("manos","mn","rpg","manos@hua.gr");
     Paixtis4 p12=new Paixtis4("makis","mk","rpg","makis@hua.gr");
     Paixtis4 p13=new Paixtis4("marina","mar","rpg","marina@hua.gr");
     Paixtis4 p14=new Paixtis4("stelios","stel","rpg","stelios@hua.gr");
     Paixtis4 p15=new Paixtis4("nikos","nik","rpg","nikos@hua.gr");
     Diaxeirhsths5 a1=new Diaxeirhsths5("makis","ki","skaki","456464574324");
     Diaxeirhsths5 a2=new Diaxeirhsths5("nikos","os","rpg","234567890");
     Diaxeirhsths5 a3=new Diaxeirhsths5("anastasia","kes","tavli","21034567893");
     Ergasiaa1.startPlay.getPaixtesList().add(p1);
     Ergasiaa1.startPlay.getPaixtesList().add(p2);
     Ergasiaa1.startPlay.getPaixtesList().add(p3);
     Ergasiaa1.startPlay.getPaixtesList().add(p4);
     Ergasiaa1.startPlay.getPaixtesList().add(p5);
     Ergasiaa1.startPlay.getPaixtesList().add(p6);
     Ergasiaa1.startPlay.getPaixtesList().add(p7);
     Ergasiaa1.startPlay.getPaixtesList().add(p8);
     Ergasiaa1.startPlay.getPaixtesList().add(p9);
     Ergasiaa1.startPlay.getPaixtesList().add(p10);
     Ergasiaa1.startPlay.getPaixtesList().add(p11);
     Ergasiaa1.startPlay.getPaixtesList().add(p12);
     Ergasiaa1.startPlay.getPaixtesList().add(p13);
     Ergasiaa1.startPlay.getPaixtesList().add(p14);
     Ergasiaa1.startPlay.getPaixtesList().add(p15);
     Ergasiaa1.startPlay.getAdminsList().add(a1);
     Ergasiaa1.startPlay.getAdminsList().add(a2);
     Ergasiaa1.startPlay.getAdminsList().add(a3);
    }
    
    
     public static void diaxeirisiPaixnidionMenou()
    {
      boolean run=true; //topikes metavlites tis methodou (sinartisis) diaxeirisiPaixnidionMenou,opote mporoun na exoun to idio onoma me tis metavlites tis main.
      int choice=0;
      String s="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      do {
      System.out.println("**********************************************************");  
      System.out.println("**Programma Diaxeirhshs Tournoua Hlektronikwn Paixnidiwn**");
      System.out.println("1.Prosthiki Paixnidiou");
      System.out.println("2.Tropopoiisi Paixnidiou");  
      System.out.println("3.Diagrafi Paixnidiou");  
      System.out.println("4.Epistrofi sto arxiko Menou");    
      System.out.println("Dwse Epilogi:1-4"); 
      System.out.println("**********************************************************");  
      try {
               s = br.readLine();//
               choice = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
          }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      switch(choice)
         {
             case 1:
             startPlay.addGame();  //kalo tin methodo addGame tou antikeimenou startPlay
             break;
             case 2:
             startPlay.tropopoihshGame();
             break;
             case 3:
             startPlay.removeGame();
             break;
             case 4:
             run=false;
             break;
             default:
             System.out.println(s);
             break;
         }
      } while (run);
    }
    
    public static void diaxeirisiSimmetoxownMenou()
    {
     boolean run=true; //topikes metavlites tis methodou (sinartisis) diaxeirisiPaixnidionMenou,opote mporoun na exoun to idio onoma me tis metavlites tis main.
      int choice=0;
      String s="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      do {
      System.out.println("**********************************************************");  
      System.out.println("**Programma Diaxeirhshs Tournoua Hlektronikwn Paixnidiwn**");
      System.out.println("1.Prosthiki Simmetexonta");
      System.out.println("2.Tropopoiisi Simmetexonta");  
      System.out.println("3.Diagrafi Simmetexonta");  
      System.out.println("4.Epistrofi sto arxiko Menou");    
      System.out.println("Dwse Epilogi:1-4"); 
      System.out.println("**********************************************************");  
      try {
               s = br.readLine();//
               choice = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
          }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      switch(choice)
         {
             case 1:
             startPlay.addSymmetoxonta();
             break;
             case 2:
             startPlay.tropopoihshSymmetoxwn();
             break;
             case 3:
               startPlay.removeSymmetoxwn();
             break;
             case 4:
             run=false;
             break;
             default:
             System.out.println(s);
             break;
         }
      } while (run);   
    }
    
    
    public static void diaxeirisiTournouaMenou()
    {
     boolean run=true; //topikes metavlites tis methodou (sinartisis) diaxeirisiPaixnidionMenou,opote mporoun na exoun to idio onoma me tis metavlites tis main.
      int choice=0;
      String s="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      do {
      System.out.println("**********************************************************");  
      System.out.println("**Programma Diaxeirhshs Tournoua Hlektronikwn Paixnidiwn**");
      System.out.println("1.Prosthiki Tournoua");
      System.out.println("2.Tropopoiisi Tournoua");  
      System.out.println("3.Diagrafi Tournoua");  
      System.out.println("4.Eisagwgh apotelesmatwn agwnwn Tournoua"); 
      System.out.println("5.Epistrofi sto arxiko Menou");    
      System.out.println("Dwse Epilogi:1-4"); 
      System.out.println("**********************************************************");  
      try {
               s = br.readLine();//
               choice = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
          }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      switch(choice)
         {
             case 1:
             startPlay.addTournoua();
             break;
             case 2:
             startPlay.tropopoihshTournoua();
             break;
             case 3:
             startPlay.removeTournoua();
             break;
             case 4:
             startPlay.updateMatches();
             break;
             case 5:
             run=false;
             break;
             default:
             System.out.println(s);
             break;
         }
      } while (run);   
    }
    
    public static void diaxeirisiEktiposeonMenou()
    {
     boolean run=true; //topikes metavlites tis methodou (sinartisis) diaxeirisiPaixnidionMenou,opote mporoun na exoun to idio onoma me tis metavlites tis main.
      int choice=0;
      String s="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      do {
      System.out.println("**********************************************************");  
      System.out.println("**Programma Diaxeirhshs Tournoua Hlektronikwn Paixnidiwn**");
      System.out.println("1.Ektypwseis Stoixeiwn Tournoua");
      System.out.println("2.Ektypwsh Stoixeiw Symmetoxwn");  
      System.out.println("3.Ektypwsh Stoixeiwn Paixnidiwn");  
      System.out.println("4.Epistrofi sto arxiko Menou");    
      System.out.println("Dwse Epilogi:1-4"); 
      System.out.println("**********************************************************");  
      try {
               s = br.readLine();//
               choice = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
          }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      switch(choice)
         {
             case 1:
             Ergasiaa1.EktiposeisTournoua();
             break;
             case 2:
             Ergasiaa1.EktiposeisSimmetoxwn();    
             break;
             case 3:
             Ergasiaa1.EktiposeisPaixnidion();
             break;
             case 4:
             run=false;
             break;
             default:
             System.out.println(s);
             break;
         }
      } while (run);      
    }
    
    
     public static void EktiposeisSimmetoxwn()
    {
     boolean run=true; //topikes metavlites tis methodou (sinartisis) diaxeirisiPaixnidionMenou,opote mporoun na exoun to idio onoma me tis metavlites tis main.
      int choice=0;
      String s="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      do {
      System.out.println("**********************************************************");  
      System.out.println("**Programma Diaxeirhshs Tournoua Hlektronikwn Paixnidiwn**");
      System.out.println("1.Ektypwsi Stoixeiwn Simmetexontwn");
      System.out.println("2.Ektypwsh Stoixeiwn Simmetexonta");  
      System.out.println("3.Epistrofi sto arxiko Menou");      
      System.out.println("Dwse Epilogi:1-3"); 
      System.out.println("**********************************************************");  
      try {
               s = br.readLine();//
               choice = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
          }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      switch(choice)
         {
             case 1:
             startPlay.PrintSimmetexontesData();
             break;
             case 2:
             startPlay.PrintSimmetexontaData();
             break;
             case 3:
             run=false;
             break;
             default:
             System.out.println(s);
             break;
         }
      } while (run);      
    }
     
     
   public static void EktiposeisPaixnidion()
    {
     boolean run=true; //topikes metavlites tis methodou (sinartisis) diaxeirisiPaixnidionMenou,opote mporoun na exoun to idio onoma me tis metavlites tis main.
      int choice=0;
      String s="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      do {
      System.out.println("**********************************************************");  
      System.out.println("**Programma Diaxeirhshs Tournoua Hlektronikwn Paixnidiwn**");
      System.out.println("1.Ektypwsh Stoixeiwn Paixnidiwn");
      System.out.println("2.Ektypwsh Stoixeiwn Paixnidiou");  
      System.out.println("3.Epistrofi sto arxiko Menou");      
      System.out.println("Dwse Epilogi:1-3"); 
      System.out.println("**********************************************************");  
      try {
               s = br.readLine();//
               choice = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
          }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      switch(choice)
         {
             case 1:
             startPlay.PrintAllGamesData();
             break;
             case 2:
             startPlay.PrintGameData();
             break;
             case 3:
             run=false;
             break;
             default:
             System.out.println(s);
             break;
         }
      } while (run);      
    }
   public static void EktiposeisTournoua()
    {
      boolean run=true; //topikes metavlites tis methodou (sinartisis) diaxeirisiPaixnidionMenou,opote mporoun na exoun to idio onoma me tis metavlites tis main.
      int choice=0;
      String s="";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      do {
      System.out.println("**********************************************************");  
      System.out.println("**Programma Diaxeirhshs Tournoua Hlektronikwn Paixnidiwn**");
      System.out.println("1.Ektypwsh olwn twn stoixeiwn olwn twn tournoua"); //printAllTournamentsData()
      System.out.println("2.Ektypwsh stoixeiwn enos Tournoua"); //printTournamentData()
      System.out.println("3.Ektypwsh olwn twn agwnwn-match olwn twn paixnidiwn(olwn twn tournoua)"); //tiponei olous tous agwnes gia ola ta paixnidia tou tournoua
      System.out.println("4.Ektypwsh olwn twn agwnwn-match gia sigkekrimmeno Paixnidi se sigkekrimmeno Tournoua"); //typwnei agwnes gia sigkekrimmeno paixnidi tou tournoua
      System.out.println("5.Ektypwseis apotelesmatwn paixnidiwn enos Tournoua"); //
      System.out.println("6.Epistrofi sto arxiko Menou");    
      System.out.println("Dwse Epilogi:1-5"); 
      System.out.println("**********************************************************");  
      try {
               s = br.readLine();//
               choice = Integer.parseInt(s); //Integer.parseInt dexetai san parametro ena string pou anaparista akeraio arithmo kai sou epistrefei integer
          }
         catch (Exception e) //to e einai antikeimeno tis taksis exception kai periexei tin perigrafi tou lathous pou egine otan pigan na treksoun oi entoles mesa stin try.
         {
          System.out.println(e.toString()); // H e.toString() mas epistrefei to string me to minima lathous
         }
      switch(choice)
         {
             case 1:
                startPlay.printAllTournamentsData();
             break;
             case 2:
               startPlay.printTournamentData();
             break;
             case 3:
             startPlay.printAllMatchesData();//??
             break;
             case 4:
             startPlay.printTournouaGameMatches();
             break;
             case 5:
             startPlay.printWinnersData();    
             break;
             case 6:
             run=false;
             break;
             default:
             System.out.println(s);
             break;
         }
      } while (run);      
    }
    
    
    
    
}
//SXOLIA 
//GIA NA TREXW TO PROGRAMMA MOU APO GRAMMH ENTOLWN:
//DE3I KLIK STON KAFE , ->CLEAN AND BUILT
//AYTO POU EVGALE STO TRY: ...
//TO KANW COPY PASTE STO MAYRO 
//

