package com.company;
import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Random;
import java.util.Scanner;
public class Magic8Ball {
//declaring variable to hold the question of the player
 public static String yourQuestion;

 public static String answer;
    public static void main(String[] args) {
	// write your code here

     magicWord(random());
      System.out.println("Do you have another question for the Magic 8-Ball?(y/n)");
      Scanner input= new Scanner(System.in);
      answer=input.nextLine();
      while(answer.equals("y")||answer.equals("Y")) {

       magicWord(random());
       System.out.println("Do you have another question for the Magic 8-Ball?(y/n)");
       Scanner input2= new Scanner(System.in);
       answer=input.nextLine();
      }
    }

    public static int random (){
     Random r= new Random();
     int y= 1+ r.nextInt(19);
     return y;
    }

    public static void magicWord(int x){

     Scanner input = new Scanner(System.in);

     String [] magicAns= new String[20];
     magicAns[0]="It is certain";
     magicAns[1]="It is decidedly so";
     magicAns[2]="Without a doubt";
     magicAns[3]="Yes definitely";
     magicAns[4]="You may rely on it";
     magicAns[5]="As I see it, yes";
     magicAns[6]="Most likely";
     magicAns[7]="Outlook good";
     magicAns[8]="yes";
     magicAns[9]="Signs point to yes";
     magicAns[10]="Reply hazy try again";
     magicAns[11]="Ask again later";
     magicAns[12]="Better not tell you now";
     magicAns[13]="Cannot predict now";
     magicAns[13]="Cannot predict now";
     magicAns[14]="Concentrate and ask again";
     magicAns[15]="Don't count on it";
     magicAns[16]="My reply is no";
     magicAns[17]="My sources say no";
     magicAns[18]="Outlook not so good";
     magicAns[19]="Very doubtful";
     System.out.print("YOU ASKED: ");
         yourQuestion=input.nextLine();
     System.out.println(" ");
     System.out.printf("MAGIC 8-BALL SAYS: %S%n",magicAns[x]);
     System.out.println(" ");



     }
    }

