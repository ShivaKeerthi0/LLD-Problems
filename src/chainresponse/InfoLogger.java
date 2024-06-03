package chainresponse;

public class InfoLogger extends  Logger{

    public  InfoLogger(Logger nextLogger){
        super(nextLogger);
    }

    @Override
    public void log(Loglevel loglevel, String message) {
       if(loglevel.equals(Loglevel.INFO)){
           System.out.println("[INFO] : " + message);
       } else {
           super.log(loglevel, message);
       }
    }
}
