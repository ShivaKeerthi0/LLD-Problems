package snakenladder;

public class Snake extends Xfactor{


    public void configure(int start, int end) throws Exception{
        if(end > start){
            throw new Exception("Can't Crate a Snake using this points");
        }
        super.start = start;
        super.end = end;
    }


}


