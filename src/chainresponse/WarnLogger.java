package chainresponse;

public class WarnLogger extends Logger{

    public  WarnLogger(Logger nextLogger){
        super(nextLogger);
    }

    @Override
    public void log(Loglevel loglevel, String message) {
        if(loglevel.equals(Loglevel.WARN)){
            System.out.println("[WARN] : " + message);
        } else {
            super.log(loglevel, message);
        }
    }
}
