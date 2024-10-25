import java.util.Random;
import java.util.Scanner;
public class Game {
    private int inp,rn;
    private boolean st;
    public Game()
    {
        Random r=new Random();
        rn=r.nextInt(0,100);
        st=false;
    }
    public void takeUserInput(int n)
    {
        inp=n;
    }
    public boolean isCorrectnumber()
    {
        if(inp==rn)
        st=true;
        else if(inp>rn)
        {
            st=false;
            System.out.println("number is smaller");
        }
        else
        {
            st=false;
            System.out.println("number is greater");
        }
        return st;
    }
    int noOfGuesses(int a)
    {
        int x=a-1;
        return x;
    }
    public static void main(String[] args) {
        int y=10;
        
        Game g=new Game();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter your number");
            g.takeUserInput(sc.nextInt());
            if(g.isCorrectnumber())
            {
                System.out.println("you guessed the correct number");
                break;
            }
            y=g.noOfGuesses(y);
            if(y==0){
                System.out.println("game ends! u lose,u failed to guess");
                break;
            }
            System.out.println("you have "+y+" gueses left");
        }while(y>0);
        sc.close();
    }
}


   
