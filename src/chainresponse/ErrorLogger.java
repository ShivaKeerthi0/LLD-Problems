package chainresponse;

public class ErrorLogger extends  Logger{

    public  ErrorLogger(Logger nextLogger){
        super(nextLogger);
    }

    @Override
    public void log(Loglevel loglevel, String message) {
        if(loglevel.equals(Loglevel.ERROR)){
            System.out.println("[ERROR] : " + message);
        } else {
            super.log(loglevel, message);
        }
    }
}
