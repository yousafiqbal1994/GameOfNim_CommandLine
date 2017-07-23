package GOM;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Piles
{
  public static void main(String[] args)
  {
    Scanner keyboard1 = new Scanner(System.in);
    System.out.print("Hello....Welcome to the game of NIM\nIf you want to two player game press 2 and if you want to play with PC press 1 ");
    System.out.print("\n");
    System.out.print("Your Choice 1 or 2 ? : ");
    
    int decide = keyboard1.nextInt();
    if (decide == 2)
    {
      Scanner keyboard = new Scanner(System.in);
      int pileA = 3;
      int pileB = 4;
      int pileC = 5;
      int turn = 0;
      boolean again = false;
      
      int Acounter = 1;int Bcounter = 1;int Ccounter = 1;
      System.out.print("Player one Enter Your name: ");
      String player1 = keyboard.nextLine();
      
      System.out.print("Player two Enter Your name: ");
      String player2 = keyboard.nextLine();
      System.out.print("\n");
      
      System.out.print("Pile a: " + pileA + "\n" + "Pile b: " + pileB + "\n" + "Pile c: " + pileC);
      System.out.print("\n");
      System.out.print("\n");
      while ((Acounter > 0) || (Bcounter > 0) || (Ccounter > 0))
      {
        turn++;
        if (again)
        {
          turn++;
          again = false;
        }
        if (turn % 2 == 0) {
          System.out.print(player2 + " Choose a Pile: ");
        } else {
          System.out.print(player1 + " Choose a Pile: ");
        }
        char a = keyboard.next().charAt(0);
        if ((a == 'a') || (a == 'A'))
        {
          System.out.print("\n");
          System.out.print("How many You want to remove from  Pile A: ");
          
          int a1 = keyboard.nextInt();
          if (pileA == 0)
          {
            System.out.print("Pile is Empty\n");
            again = true;
          }
          else
          {
            if ((a1 > 0) && (a1 <= 3))
            {
              Acounter = pileA - a1;
              pileA = Acounter;
            }
            else
            {
              System.out.print("\n");
              System.out.print("Pile Pick must me in between 1-3 ");
              System.out.print("\n");
              again = true;
            }
            if (pileA < 0) {
              pileA = 0;
            }
            System.out.print("\n");
            System.out.print("Pile a:" + pileA + "\n" + "Pile b:" + pileB + "\n" + "Pile c:" + pileC + "\n");
          }
        }
        else if ((a == 'b') || (a == 'B'))
        {
          System.out.print("\n");
          System.out.print("How many You want to remove from  Pile B: ");
          int a2 = keyboard.nextInt();
          if (pileB == 0)
          {
            System.out.print("Pile is Empty\n");
            again = true;
          }
          else
          {
            if ((a2 > 0) && (a2 <= 3))
            {
              Bcounter = pileB - a2;
              pileB = Bcounter;
            }
            else
            {
              System.out.print("\n");
              System.out.print("Pile Pick must me in between 1-3 ");
              System.out.print("\n");
              again = true;
            }
            if (pileB < 0) {
              pileB = 0;
            }
            System.out.print("\n");
            System.out.print("Pile a:" + pileA + "\n" + "Pile b:" + pileB + "\n" + "Pile c:" + pileC + "\n");
          }
        }
        else if ((a == 'c') || (a == 'C'))
        {
          System.out.print("\n");
          System.out.print("How many You want to remove from  Pile C: ");
          System.out.print("\n");
          int a3 = keyboard.nextInt();
          if (pileC == 0)
          {
            System.out.print("Pile is Empty\n");
            again = true;
          }
          else
          {
            if ((a3 > 0) && (a3 <= 3))
            {
              Ccounter = pileC - a3;
              pileC = Ccounter;
            }
            else
            {
              System.out.print("\n");
              System.out.print("Pile Pick must me in between 1-3 ");
              System.out.print("\n");
              again = true;
            }
            if (pileC < 0) {
              pileC = 0;
            }
            System.out.print("Pile a:" + pileA + "\n" + "Pile b:" + pileB + "\n" + "Pile c:" + pileC + "\n");
            System.out.print("\n");
          }
        }
      }
      if (turn % 2 == 0) {
        System.out.print("Yahoo... " + player1 + " Wins");
      } else {
        System.out.print("Yahoo... " + player2 + " Wins");
      }
    }
    if (decide == 1)
    {
      Scanner keyboard = new Scanner(System.in);
      
      int pileA = 3;
      int pileB = 4;
      int pileC = 5;
      int turn = 0;
      String active = "";
      
      boolean again = false;
      
      int Acounter = 1;int Bcounter = 1;int Ccounter = 1;
      System.out.print("Enter Your name: ");
      String player1 = keyboard.nextLine();
      String computer = "Computer";
      System.out.print("Opponent Player: " + computer);
      System.out.print("\n");
      System.out.print("Pile a: " + pileA + "\n" + "Pile b: " + pileB + "\n" + "Pile c: " + pileC);
      System.out.print("\n");
      System.out.print("\n");
      while ((Acounter > 0) || (Bcounter > 0) || (Ccounter > 0))
      {
        turn++;
        if (again)
        {
          turn++;
          again = false;
        }
        if (turn % 2 == 0)
        {
          System.out.print(computer + " Choose a Pile: ");
          active = "computer";
        }
        else
        {
          System.out.print(player1 + " Choose a Pile: ");
          active = "player";
        }
        if (active == "player")
        {
          char a = keyboard.next().charAt(0);
          if ((a == 'a') || (a == 'A'))
          {
            System.out.print("\n");
            System.out.print("How many You want to remove from  Pile A: ");
            
            int a1 = keyboard.nextInt();
            if (pileA == 0)
            {
              System.out.print("Pile is Empty\n");
              again = true;
              continue;
            }
            if ((a1 > 0) && (a1 <= 3))
            {
              Acounter = pileA - a1;
              pileA = Acounter;
            }
            else
            {
              System.out.print("\n");
              System.out.print("Pile Pick must me in between 1-3 ");
              System.out.print("\n");
              again = true;
            }
            if (pileA < 0) {
              pileA = 0;
            }
            System.out.print("\n");
            System.out.print("Pile a:" + pileA + "\n" + "Pile b:" + pileB + "\n" + "Pile c:" + pileC + "\n");
          }
          if ((a == 'b') || (a == 'B'))
          {
            System.out.print("\n");
            System.out.print("How many You want to remove from  Pile B: ");
            int a2 = keyboard.nextInt();
            if (pileB == 0)
            {
              System.out.print("Pile is Empty\n");
              again = true;
              continue;
            }
            if ((a2 > 0) && (a2 <= 3))
            {
              Bcounter = pileB - a2;
              pileB = Bcounter;
            }
            else
            {
              System.out.print("\n");
              System.out.print("Pile Pick must me in between 1-3 ");
              System.out.print("\n");
              again = true;
            }
            if (pileB < 0) {
              pileB = 0;
            }
            System.out.print("\n");
            System.out.print("Pile a:" + pileA + "\n" + "Pile b:" + pileB + "\n" + "Pile c:" + pileC + "\n");
          }
          if ((a == 'c') || (a == 'C'))
          {
            System.out.print("\n");
            System.out.print("How many You want to remove from  Pile C: ");
            System.out.print("\n");
            int a3 = keyboard.nextInt();
            if (pileC == 0)
            {
              System.out.print("Pile is Empty\n");
              again = true;
              continue;
            }
            if ((a3 > 0) && (a3 <= 3))
            {
              Ccounter = pileC - a3;
              pileC = Ccounter;
            }
            else
            {
              System.out.print("\n");
              System.out.print("Pile Pick must me in between 1-3 ");
              System.out.print("\n");
              again = true;
            }
            if (pileC < 0) {
              pileC = 0;
            }
            System.out.print("Pile a:" + pileA + "\n" + "Pile b:" + pileB + "\n" + "Pile c:" + pileC + "\n");
            System.out.print("\n");
          }
        }
        if (active == "computer")
        {
          String alphabet = "AaBbCc";
          int N = "AaBbCc".length();
          
          Random rand = new Random();
          char pick = "AaBbCc".charAt(rand.nextInt(N));
          System.out.print(pick);
          System.out.print("\n");
          if ((pick == 'a') || (pick == 'A'))
          {
            System.out.print("\n");
            System.out.print("How many You want to remove from  Pile A: ");
            
            int number1 = rand.nextInt(4) + 1;
            System.out.print(number1);
            System.out.print("\n");
            if (pileA == 0)
            {
              System.out.print("Pile is Empty\n");
              again = true;
            }
            else
            {
              if ((number1 > 0) && (number1 <= 3))
              {
                Acounter = pileA - number1;
                pileA = Acounter;
              }
              else
              {
                System.out.print("\n");
                System.out.print("Pile Pick must me in between 1-3 ");
                System.out.print("\n");
                again = true;
              }
              if (pileA < 0) {
                pileA = 0;
              }
              System.out.print("\n");
              System.out.print("Pile a:" + pileA + "\n" + "Pile b:" + pileB + "\n" + "Pile c:" + pileC + "\n");
            }
          }
          else if ((pick == 'b') || (pick == 'B'))
          {
            System.out.print("\n");
            System.out.print("How many You want to remove from  Pile B: ");
            
            int number2 = rand.nextInt(4) + 1;
            System.out.print(number2);
            System.out.print("\n");
            if (pileB == 0)
            {
              System.out.print("Pile is Empty\n");
              again = true;
            }
            else
            {
              if ((number2 > 0) && (number2 <= 3))
              {
                Bcounter = pileB - number2;
                pileB = Bcounter;
              }
              else
              {
                System.out.print("\n");
                System.out.print("Pile Pick must me in between 1-3 ");
                System.out.print("\n");
                again = true;
              }
              if (pileB < 0) {
                pileB = 0;
              }
              System.out.print("\n");
              System.out.print("Pile a:" + pileA + "\n" + "Pile b:" + pileB + "\n" + "Pile c:" + pileC + "\n");
            }
          }
          else if ((pick == 'c') || (pick == 'C'))
          {
            System.out.print("\n");
            System.out.print("How many You want to remove from  Pile C: ");
            
            int number3 = rand.nextInt(4) + 1;
            System.out.print(number3);
            System.out.print("\n");
            if (pileC == 0)
            {
              System.out.print("Pile is Empty\n");
              again = true;
            }
            else
            {
              if ((number3 > 0) && (number3 <= 3))
              {
                Ccounter = pileC - number3;
                pileC = Ccounter;
              }
              else
              {
                System.out.print("\n");
                System.out.print("Pile Pick must me in between 1-3 ");
                System.out.print("\n");
                again = true;
              }
              if (pileC < 0) {
                pileC = 0;
              }
              System.out.print("Pile a:" + pileA + "\n" + "Pile b:" + pileB + "\n" + "Pile c:" + pileC + "\n");
              System.out.print("\n");
            }
          }
        }
      }
      if (turn % 2 == 0) {
        System.out.print("Yahoo... " + player1 + " Wins");
      } else {
        System.out.print("Yahoo... " + computer + " Wins");
      }
    }
  }
}

