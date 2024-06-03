package chainresponse;

public abstract  class Logger {


    private  Logger nextLogger;



    public  Logger( Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void log(Loglevel loglevel , String message){
        if(nextLogger != null){
            nextLogger.log(loglevel, message);
        } else {
            System.out.println("message");
        }
    }
}
