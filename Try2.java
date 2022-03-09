import java.util.Scanner;
class Try2{
    char gameboard[][]=new char[3][3];;
    Try2(){
        for(int x=0 ; x<=2 ; x++){
            for(int y=0 ; y<=2 ; y++)
                gameboard[x][y]=' ';
        }
    }
    void display(){
        for(int z = 1 ; z<=13;z++)
            System.out.print("-");
        System.out.println();
        for(int x = 0; x<gameboard.length ;x++){
            String row ="|";
            for(int y = 0 ; y<gameboard[x].length;y++)
                row+=" "+gameboard[x][y]+" |";
                System.out.println(row);
            for(int z = 1 ; z<=row.length();z++)
                System.out.print("-");
            System.out.println();
        } 
    }
    boolean isWinning(){
        boolean win=false;
        char ch;
        for(int x = 0 ; x<gameboard.length ; x++){
            ch = gameboard[x][0];
            for(int y = 1 ; y<gameboard[x].length ; y++){
                if(gameboard[x][y]==ch)
                    win=true;
                else    
                    win=false;
            }
            if(win)
                return win;
            ch = gameboard[0][x];
            for(int y=1;y<gameboard.length;y++){
                if(gameboard[y][x]==ch)
                    win=true;
                else    
                    win=false;
            }
            if(win)
                return win;
        }
        ch = gameboard[0][0];
        for(int y = 1 ; y<=gameboard.length; y++){
            if(gameboard[y][y]==ch)
                win=true;
            else 
                win=false;    
        }
        if(win)
            return win;
        ch = gameboard[0][2];   
        for(int x = 1 ,  y=1;   x<3 ;x++, y--){
            if(gameboard[x][y]==ch)
                win=true;
            else
                win=false;
        }
        return win;
    }
    public static void main(String[] args){
        Try2 game = new Try2();
        game.display();
    }
}
