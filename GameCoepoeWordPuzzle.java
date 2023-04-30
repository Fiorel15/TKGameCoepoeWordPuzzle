/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TKAplikasiGame;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GameCoepoeWordPuzzle {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        boolean running = true;
        
        System.out.println("==============================================");
        System.out.println("TK 3-Aplikasi Game Coepoe Word Puzzle-Kelompok 4");
        System.out.println("==============================================");
        System.out.println("Anggota Kelompok: ");
        System.out.println("1. BAYU TIRTA SUKMANA");
        System.out.println("2. CHATLEA CINTA PUTRI WIDYANTO");
        System.out.println("3. FIOREL AL ZAHRA");
        System.out.println("4. YUDHA DWIPRIATMA");
        System.out.println("==============================================");
        System.out.println("");
        
        System.out.println(""+ "Coepoe Word Puzzle"+"\n"+ 
                           "=================="+"\n"+"\n"+ 
                           "Rules :"+"\n"+
                           "1. Create a word using given characters, min 3 characters & max 6 characters."+"\n" +
                           "2. Each level, You have 10 chances to answer correctly." + "\n" +
                           "3. To get through to next level, you have to score 70 points each level."+"\n" +
                           "\nPress Enter to START!"
        );
        
        while (running) {
        input.nextLine();
        System.out.println("" + "Level 1"+"\n"+
                                "------ "+"\n"+
                                "         d         e         t         t         l         i"+"\n"
        );
        
        String [] level1={"","die","led","lei","let","lid","lie","lit","tie","deli","diet","\n",
                          "edit","idle","lied","tide","tied","tile","tilt","tilde","tiled","title", "tilted","titled"+"\n"+"\n"};
        
        int score1 = 0;
        int hitungan = 0;
        String tebakan = "";
        boolean autotebakan = false;
        
        while(!autotebakan && hitungan < 10){
            hitungan++;
            System.out.println(hitungan+"> Your Answer: ");
            
            tebakan = input.nextLine();
            if(hitungan <= 10){
                if(tebakan.length()>= 3 && tebakan.length() <= 6){
                    for(int i = 0; i <= level1.length - 1; i++){
                        boolean condition = level1[i].equals(tebakan);
                            if(condition == true){
                                score1 += 10;
                                System.out.println("#Rigth. Score : " + score1);
                            }
                    }
                } else{
                    hitungan--;
                }
            }else{
                autotebakan = true;
            }
        }
        
        System.out.println("Total Score: " + score1);
        winLose(score1); 
        System.out.println(""); 
        answerList(level1);
        
        System.out.println("" + "Level 2"+"\n"+
                                "------ "+"\n"+
                                "         s         e         c         a         e         n"+"\n"
        );
        
        String [] level2={"","ace","can","sac","sea","sec","see","aces","acne","cane","cans","\n",
            "case","ease","sane","scan","seen","acnes","canes","cease","cense","scene","encase","seance"+"\n"+"\n"
        };
        
        int score2 = 0;
        hitungan = 0;
        tebakan = "";
        autotebakan = false;
        
        while(!autotebakan && hitungan < 10){
            hitungan++;
            System.out.println(hitungan+"> Your Answer: ");
            
            tebakan = input.nextLine();
            if(hitungan <= 10){
                if(tebakan.length()>= 3 && tebakan.length() <= 6){
                    for(int i = 0; i <= level2.length - 1; i++){
                        boolean condition = level2[i].equals(tebakan);
                            if(condition == true){
                                score2 += 10;
                                System.out.println("#Rigth. Score : " + score2);
                            }
                    }
                } else{
                    hitungan--;
                }
            }else{
                autotebakan = true;
            }
        }
        
        System.out.println("Total Score: " + score2);
        winLose(score2); 
        System.out.println(""); 
        answerList(level2);
        
        System.out.println("" + "Level 3"+"\n"+
                                "------ "+"\n"+
                                "         h         k         r         n         e         o"+"\n"
        );
        
        String[]level3={"", "eon","hen","her","hoe","hon","ken","nor","one","ore","rho","\n",
                        "roe","hero","hoer","hone","honk","horn","kern","oner","heron","honer","\n", "honker" +"\n"
        };

            int score3 = 0;
            hitungan = 0;
            tebakan = "";
            autotebakan = false;

            while(!autotebakan && hitungan < 10){
                hitungan++;
                System.out.println(hitungan+"> Your Answer: ");

                tebakan = input.nextLine();
                if(hitungan <= 10){
                    if(tebakan.length()>= 3 && tebakan.length() <= 6){
                        for(int i = 0; i <= level3.length - 1; i++){
                            boolean condition = level3[i].equals(tebakan);
                                if(condition == true){
                                    score3 += 10;
                                    System.out.println("#Rigth. Score : " + score3);
                                }
                        }
                    } else{
                        hitungan--;
                    }
                }else{
                    autotebakan = true;
                }
            }

            System.out.println("Total Score: " + score3);
            winLose(score3); 
            System.out.println(""); 
            answerList(level3);

            int overall = score1+score2+score3;
            System.out.println(""+ "\nOverall Score : " + overall + "\n You Win!! \n Press ENTER to exit..");

            input.nextLine();
            
            try{
                System.in.read();
            }catch(IOException ioe) {
                System.exit(0); // Generally used to indicate successful termination.
            }
            System.exit(0);
            }
    }
        public static void winLose (int score){
            Scanner input = new Scanner(System.in);
            String loopingAnswer;
            boolean running = true;

            if(score >= 70){
                System.out.println("\n You had answered 10 times with " + score/10 + " right answers..");
            } else{
                System.out.println("\n You Lose! Try Again..\n Do you want to retry [y/t] ?");
            }
            loopingAnswer = input.nextLine();
            
            if (loopingAnswer.equalsIgnoreCase("t")) {
                running = false;
            }
        }

        public static void answerList(String list[]){
            System.out.println("Correct Answers:");
            String jawaban = Arrays.toString(list)
                    .replace(",","      ")
                    .replace("[", "\n")
                    .replace("]", "");

            System.out.println(jawaban);
        }
}      
