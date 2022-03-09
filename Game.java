import java.util.Scanner;
class Game{
    static Scanner sc = new Scanner(System.in);
    static  int A[] = new int[3] , B[] = new int[3] , C[] = new int[3] , wins[] = new int[2];
    static String s[]=new String[9];
    static  int  gameNo , turnNo, player ; 
    static  boolean winning[] = new boolean[2];
    static String playerName[] = new String[2];
    static  boolean isFilled[] = new boolean[9];
    static String pm,ppm;
    
    public static void firstScreen(){
        System.out.println("**************************************************************************************************************");
        System.out.println("*                                  ___________           ___________                                         *");
        System.out.println("*                                       |          |    |                                                    *");
        System.out.println("*                                       |          |    |                                                    *");
        System.out.println("*                                       |          |    |                                                    *");
        System.out.println("*                                       |          |    |                                                    *");
        System.out.println("*                                       |          |    |                                                    *");
        System.out.println("*                                       |          |    |                                                    *");
        System.out.println("*                                       |          |    |___________                                         *");
        System.out.println("*                             ___________         _____        ___________                                   *");
        System.out.println("*                                  |             |     |      |                                              *");
        System.out.println("*                                  |            |       |     |                                              *");
        System.out.println("*                                  |           |         |    |                                              *");
        System.out.println("*                                  |          |___________|   |                                              *");
        System.out.println("*                                  |          |           |   |                                              *");
        System.out.println("*                                  |          |           |   |                                              *");
        System.out.println("*                                  |          |           |   |___________                                   *");
        System.out.println("*                             ___________      ___________     ___________                                   *");
        System.out.println("*                                  |          |           |   |                                              *");
        System.out.println("*                                  |          |           |   |                                              *");
        System.out.println("*                                  |          |           |   |                                              *");
        System.out.println("*                                  |          |           |   |-------                                       *");
        System.out.println("*                                  |          |           |   |                                              *");
        System.out.println("*                                  |          |           |   |                                              *");
        System.out.println("*                                  |          |___________|   |___________                                   *");
        System.out.println("**************************************************************************************************************");
    }
    public static void fill(){
        isFilled[0]=(A[0]==11)?false:true;
        isFilled[1]=(A[1]==12)?false:true;
        isFilled[2]=(A[2]==13)?false:true;        
        isFilled[3]=(B[0]==14)?false:true;
        isFilled[4]=(B[1]==15)?false:true;
        isFilled[5]=(B[2]==16)?false:true;
        isFilled[6]=(C[0]==17)?false:true;
        isFilled[7]=(C[1]==18)?false:true;
        isFilled[8]=(C[2]==19)?false:true;
    }
    static public boolean checkWin(){
        if((A[0]==B[0]&&A[0]==C[0])||(A[1]==B[1]&&A[1]==C[1])||(A[2]==B[2]&&A[2]==C[2])||
           (A[0]==A[1]&&A[0]==A[2])||(B[0]==B[1]&&B[0]==B[2])||(C[0]==C[1]&&C[0]==C[2])||   
           (A[0]==B[1]&&A[0]==C[2])||(C[0]==B[1]&&C[0]==A[2]))
        {
            return true;
        }
        else
            return false;
    }
    public static void init(){
        A[0]=11;
        A[1]=12;
        A[2]=13;
        B[0]=14;
        B[1]=15;
        B[2]=16;
        C[0]=17;
        C[1]=18;
        C[2]=19;
    }
    public static void bk(){
        for(long y =0 ; y <=100000000 ; y++);
    }
    public static void name(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of player:");
        playerName[0]=sc.next();
        System.out.println('\f');
        playerName[1]="Computer";
    }
    static public void display(){
        s[0]=(A[0]==11)?".":(A[0]==1)?"X":"O";
        s[1]=(B[0]==14)?".":(B[0]==1)?"X":"O";
        s[2]=(C[0]==17)?".":(C[0]==1)?"X":"O";
        s[3]=(A[1]==12)?".":(A[1]==1)?"X":"O";
        s[4]=(B[1]==15)?".":(B[1]==1)?"X":"O";
        s[5]=(C[1]==18)?".":(C[1]==1)?"X":"O";
        s[6]=(A[2]==13)?".":(A[2]==1)?"X":"O";
        s[7]=(B[2]==16)?".":(B[2]==1)?"X":"O";
        s[8]=(C[2]==19)?".":(C[2]==1)?"X":"O";
        
        System.out.println("**************Game : " + gameNo+"*********");
        System.out.println("     " + "  "+     "A      "+     "B     "+     "C  ");
        System.out.println("     " + "  "+     "    |  "+     "   |  "+     "   ");
        System.out.println("1    " + "  "+s[0]+ "   |  "+s[1]+ "  |  "+s[2]+"   ");
        System.out.println("     " + "_ "+     "_ _ |_ "+     "_ _|_ "+     "_ _");
        System.out.println("     " + "  "+     "    |  "+     "   |  "+     "   ");
        System.out.println("2    " + "  "+s[3]+ "   |  "+s[4]+ "  |  "+s[5]+"   ");
        System.out.println("     " + "_ "+     "_ _ |_ "+     "_ _|_ "+     "_ _");
        System.out.println("     " + "  "+     "    |  "+     "   |  "+     "   ");
        System.out.println("3    " + "  "+s[6]+ "   |  "+s[7]+ "  |  "+s[8]+"   ");
        System.out.println("     " + "  "+     "    |  "+     "   |  "+     "   ");
        System.out.println("\t\t\t\t\t"+turnNo);
        System.out.println("Player 1"+"\t\t\t\t"+"Player 2");
        System.out.println(playerName[0]+"\t\t\t\t"+playerName[1]);
        System.out.println(wins[0]+" wins\t\t\t\t"+wins[1]+" wins");
    }
    static String input(){
        String rt;
        do{
                         System.out.println(playerName[player-1] + "'s turn\n Enter the cell number in which you would like to place yur symbol : Eg.A1,B2,C3 etc.");
                         
                         rt=sc.next();
                         rt=rt.toUpperCase();
                         if((rt.equals("A1")==true&&A[0]==11)||(rt.equals("A2")==true&&A[1]==12)||(rt.equals("A3")==true&&A[2]==13)||(rt.equals("B1")==true&&B[0]==14)||(rt.equals("B2")==true&&B[1]==15)||(rt.equals("B3")==true&&B[2]==16)||(rt.equals("C1")==true&&C[0]==17||(rt.equals("C2")==true&&C[1]==18)||(rt.equals("C3")==true&&C[2]==19)))
                            break;
                         else
                            continue;
                    }while(true);
        return rt;            
    }
    static void tuitorial(){
        System.out.println("The target of each player is to connect three of his symbols either:\n1.Horizontally,\n2.Vertically or,\n3.Diagonally\nPress Enter to start") ;
        sc.nextLine();
        System.out.println('\f');
    }
}
