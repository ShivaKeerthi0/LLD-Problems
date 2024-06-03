package chainresponse;

public class LoggerFactory {

    public static Logger getLogger(){
        Logger logger = new InfoLogger(new DebugLogger( new WarnLogger(new ErrorLogger(null))));
        return logger;
    }
}
