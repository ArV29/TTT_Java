class AI extends Game{
    public static String ai(){
        if(Game.turnNo == 1){
            int a = (int)(Math.random()*10);
            switch(a){
                case 0: case 1 : return "A1" ;
                case 2 : return "A2" ;
                case 3 : return "A3" ;
                case 4 : return "B1" ;
                case 5 : return "B2" ;
                case 6 : return "B3" ;
                case 7 : return "C1" ;
                case 8 : return "C2" ;
                case 9 : return "C3" ;
            }
        }
        else if(Game.turnNo == 2){
            if(Game.isFilled[4]==true){
                int a = (int)(Math.random()*10);
                switch (a){
                    case 0 : case 1 : return "A1"; 
                    case 2 : case 3 : return "A3";
                    case 4 : case 5 : case 6: return "C1";
                    case 7 : case 8 : case 9: return "C3";
                }
            }
            else 
                return "B2";
        }
        else if(Game.turnNo == 3){
            if(Game.pm.equals("B2")){
                if(Game.ppm.equals("A1") || Game.ppm.equals("C3")){
                    return((Math.random()*10)<5)?"A3":"C1";
                }
                if(Game.ppm.equals("A3") || Game.ppm.equals("C1")){
                    return((Math.random()*10)<5)?"A1":"C3";
                }
            }
            else if(isCorner(Game.pm)){
                if(Game.ppm.equals("B2")){
                    if(Game.pm.equals("A1"))
                        return"C2";
                    else if(Game.pm.equals("A3"))
                        return"B1";
                    else if(Game.pm.equals("C1"))
                        return"B3";
                    else 
                        return"A2";
                }
                else if(isCorner(Game.ppm)){
                    if(Game.ppm.equals("A1") || Game.ppm.equals("C3")){
                        return((Math.random()*10)<5)?"A3":"C1";
                    }
                    if(Game.ppm.equals("A3") || Game.ppm.equals("C1")){
                        return((Math.random()*10)<5)?"A1":"C3";
                    }
                }
                else{
                    if(Game.pm.equals("A1"))
                        return"A3";
                    else if(Game.pm.equals("A3"))
                        return"A1";
                    else if(Game.pm.equals("C1"))
                        return"C3";
                    else
                        return"C1";    
                }
            }
            else{
                if(Game.ppm.equals("A2") || Game.ppm.equals("C2")){
                        return((Math.random()*10)<5)?"B3":"B1";
                }
                if(Game.ppm.equals("B3") || Game.ppm.equals("B1")){
                        return((Math.random()*10)<5)?"C2":"A2";
                }
            }
        }
        else{
            if(Game.A[0]==Game.A[1]&&Game.A[0]==2){if(Game.isFilled[2]==false)return "A3";};
            if(Game.A[1]==Game.A[2]&&Game.A[1]==2){if(Game.isFilled[0]==false)return "A1";};
            if(Game.A[2]==Game.A[0]&&Game.A[2]==2){if(Game.isFilled[1]==false)return "A2";};
            
            if(Game.B[0]==Game.B[1]&&Game.B[0]==2){if(Game.isFilled[5]==false)return "B3";};
            if(Game.B[1]==Game.B[2]&&Game.B[1]==2){if(Game.isFilled[3]==false)return "B1";};
            if(Game.B[2]==Game.B[0]&&Game.B[2]==2){if(Game.isFilled[4]==false)return "B2";};
            
            if(Game.C[0]==Game.C[1]&&Game.C[0]==2){if(Game.isFilled[8]==false)return "C3";};
            if(Game.C[1]==Game.C[2]&&Game.C[1]==2){if(Game.isFilled[6]==false)return "C1";};
            if(Game.C[2]==Game.C[0]&&Game.C[2]==2){if(Game.isFilled[7]==false)return "C2";};
            
            if(Game.A[0]==Game.B[0]&&Game.A[0]==2){if(Game.isFilled[6]==false)return "C1";};
            if(Game.B[0]==Game.C[0]&&Game.B[0]==2){if(Game.isFilled[0]==false)return "A1";};
            if(Game.C[0]==Game.A[0]&&Game.C[0]==2){if(Game.isFilled[3]==false)return "B1";};
            
            if(Game.A[1]==Game.B[1]&&Game.A[1]==2){if(Game.isFilled[7]==false)return "C2";};
            if(Game.B[1]==Game.C[1]&&Game.B[1]==2){if(Game.isFilled[1]==false)return "A2";};
            if(Game.C[1]==Game.A[1]&&Game.C[1]==2){if(Game.isFilled[4]==false)return "B2";};
            
            if(Game.A[2]==Game.B[2]&&Game.A[2]==2){if(Game.isFilled[8]==false)return "C3";};
            if(Game.B[2]==Game.C[2]&&Game.B[2]==2){if(Game.isFilled[2]==false)return "A3";};
            if(Game.C[2]==Game.A[2]&&Game.C[2]==2){if(Game.isFilled[5]==false)return "B3";};
            
            if(Game.A[0]==Game.B[1]&&Game.A[0]==2){if(Game.isFilled[8]==false)return "C3";};
            if(Game.B[1]==Game.C[2]&&Game.B[1]==2){if(Game.isFilled[0]==false)return "A1";};
            if(Game.A[0]==Game.C[2]&&Game.A[0]==2){if(Game.isFilled[4]==false)return "B2";};
            
            if(Game.C[0]==Game.B[1]&&Game.C[0]==2){if(Game.isFilled[2]==false)return "A3";};
            if(Game.B[0]==Game.A[2]&&Game.B[1]==2){if(Game.isFilled[6]==false)return "C1";};
            if(Game.A[0]==Game.C[0]&&Game.A[2]==2){if(Game.isFilled[4]==false)return "B2";};
            if(Game.A[0]==Game.A[1]){if(Game.isFilled[2]==false)return "A3";};
            if(Game.A[1]==Game.A[2]){if(Game.isFilled[0]==false)return "A1";};
            if(Game.A[2]==Game.A[0]){if(Game.isFilled[1]==false)return "A2";};
            
            if(Game.B[0]==Game.B[1]){if(Game.isFilled[3]==false)return "B3";};
            if(Game.B[1]==Game.B[2]){if(Game.isFilled[3]==false)return "B1";};
            if(Game.B[2]==Game.B[0]){if(Game.isFilled[4]==false)return "B2";};
            
            if(Game.C[0]==Game.C[1]){if(Game.isFilled[8]==false)return "C3";};
            if(Game.C[1]==Game.C[2]){if(Game.isFilled[6]==false)return "C1";};
            if(Game.C[2]==Game.C[0]){if(Game.isFilled[7]==false)return "C2";};
            
            if(Game.A[0]==Game.B[0]){if(Game.isFilled[6]==false)return "C1";};
            if(Game.B[0]==Game.C[0]){if(Game.isFilled[0]==false)return "A1";};
            if(Game.C[0]==Game.A[0]){if(Game.isFilled[3]==false)return "B1";};
            
            if(Game.A[1]==Game.B[1]){if(Game.isFilled[7]==false)return "C2";};
            if(Game.B[1]==Game.C[1]){if(Game.isFilled[1]==false)return "A2";};
            if(Game.C[1]==Game.A[1]){if(Game.isFilled[4]==false)return "B2";};
            
            if(Game.A[2]==Game.B[2]){if(Game.isFilled[8]==false)return "C3";};
            if(Game.B[2]==Game.C[2]){if(Game.isFilled[2]==false)return "A3";};
            if(Game.C[2]==Game.A[2]){if(Game.isFilled[5]==false)return "B3";};
            
            if(Game.A[0]==Game.B[1]){if(Game.isFilled[8]==false)return "C3";};
            if(Game.B[1]==Game.C[2]){if(Game.isFilled[0]==false)return "A1";};
            if(Game.A[0]==Game.C[2]){if(Game.isFilled[4]==false)return "B2";};
            
            if(Game.C[0]==Game.B[1]){if(Game.isFilled[2]==false)return "A3";};
            if(Game.B[1]==Game.A[2]){if(Game.isFilled[6]==false)return "C1";};
            if(Game.A[2]==Game.C[0]){if(Game.isFilled[4]==false)return "B2";};
        }
        if(Game.turnNo==5){
            if(Game.isFilled[4]==false)
                return"B2";
        }
        while(true){
            int a = (int)(Math.random()*10);
            switch(a){
                case 0: case 1 : if(Game.isFilled[0]==false)return "A1" ;
                case 2 : if(Game.isFilled[1]==false)return "A2" ;
                case 3 : if(Game.isFilled[2]==false)return "A3" ;
                case 4 : if(Game.isFilled[3]==false)return "B1" ;
                case 5 : if(Game.isFilled[4]==false)return "B2" ;
                case 6 : if(Game.isFilled[5]==false)return "B3" ;
                case 7 : if(Game.isFilled[6]==false)return "C1" ;
                case 8 : if(Game.isFilled[7]==false)return "C2" ;
                case 9 : if(Game.isFilled[8]==false)return "C3" ;
            }
        }
     }
    static boolean isCorner(String s){
        if(s.equals("A1")||s.equals("A3")||s.equals("C1")||s.equals("C3"))
            return true;
        else
            return false;
    }
    static boolean isEdge(String s){
        if(s.equals("A2")||s.equals("B3")||s.equals("B1")||s.equals("C2"))
            return true;
        else
            return false;
    }
}