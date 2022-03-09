import java.util.Scanner;
public class Main extends Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        init();
        firstScreen();
        System.out.println("Enter to start");
        sc.nextLine();
        System.out.println('\f');
        System.out.println("To start a new game enter 1 \nTo view tuitorial enter 2\nTo exit enter 0");
        c=sc.nextInt();
        String str ;
        System.out.println('\f');
        if(c==2){
            Game.tuitorial();
            c=1;
            sc.nextLine();
        }
        if(c==1){
            player = 1;
            name();
            do{
                    System.out.println("To start a new round enter 1");
                    System.out.println("To exit and view the final scores enter any other number ");
                    c=sc.nextInt();              
                    if(c!=1){    
                        break;
                    }
                    gameNo++;
                    turnNo=0;
                    if(gameNo%2==0)
                        player = 2;
                        else
                        player = 1 ;
                    System.out.println("Player " + player + " starts");
                    bk();
                    while(turnNo<=9 || (winning[0]==false&&winning[1]==false)){
                        fill();
                        System.out.println('\f');
                        display();
                        turnNo++;
                        if(player==1){ 
                            str=input();
                            ppm=str;
                        }
                        else{
                             str=AI.ai();
                             pm=str;
                        }
                        A[0]=(str.equals("A1"))?player:A[0];
                        A[1]=(str.equals("A2"))?player:A[1];
                        A[2]=(str.equals("A3"))?player:A[2];
                        B[0]=(str.equals("B1"))?player:B[0];
                        B[1]=(str.equals("B2"))?player:B[1];
                        B[2]=(str.equals("B3"))?player:B[2];
                        C[0]=(str.equals("C1"))?player:C[0];
                        C[1]=(str.equals("C2"))?player:C[1];
                        C[2]=(str.equals("C3"))?player:C[2];
                        System.out.println('\f');
                        display();
                        if(turnNo>=5 && checkWin()==true){
                            System.out.println(playerName[player-1] + " wins!");
                            wins[player-1]++;
                            init();
                            break;
                        }
                        if(turnNo==9){
                            init();
                            System.out.println("Tie!");
                            break;
                        }
                        player=(player==1)?2:1;
                    }
                    bk();
            }while(c==1);
            if(wins[0]>wins[1])
                System.out.println("\n"+playerName[0]+" WINS!");
                else if(wins[0]<wins[1])
                System.out.println("\n"+playerName[1]+" WINS!");
                else
                System.out.println("\nIt's a tie");
        }
     }
}