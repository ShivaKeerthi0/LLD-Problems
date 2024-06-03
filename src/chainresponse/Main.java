package chainresponse;

public class Main {

    public  static  void  main(String args[]){

    Logger logger = LoggerFactory.getLogger();

    logger.log(Loglevel.ERROR, "This is a error message");
    logger.log(Loglevel.WARN, "This is a warning message");
    logger.log(Loglevel.DEBUG, "This is a debug message");
    logger.log(Loglevel.INFO, "This is a informational message");
    }
}
