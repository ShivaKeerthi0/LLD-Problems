package loggingsystem;

public class Main {

    public  static  void  main(String args[]){

        Logger logger = new ConsoleLogger();

        logger.info("inforamtional message");
        logger.debug("debug related message");
        logger.warn("warning message");
        logger.error("error message");
    }
}
