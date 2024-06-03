package snakenladder;

public class Ladder extends Xfactor{


    public void configure(int start, int end) throws Exception{
        if(start > end){
            throw new Exception("Can't Create a ladder using this points");
        }
        super.start = start;
        super.end = end;
    }


}


