package chainresponse;

public class DebugLogger extends  Logger{

    public  DebugLogger(Logger nextLogger){
        super(nextLogger);
    }

    @Override
    public void log(Loglevel loglevel, String message) {
        if(loglevel.equals(Loglevel.DEBUG)){
            System.out.println("[DEBUG] : " + message);
        } else {
            super.log(loglevel, message);
        }
    }
}
