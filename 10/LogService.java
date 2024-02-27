public class LogService {
    private Logger consoleLogger;
    private Logger fileLogger;
    private Logger errorLogger;

    public LogService() {
        LoggerFactory loggerFactory = new LoggerFactory();
        consoleLogger = loggerFactory.getLogger("CONSOLE");
        fileLogger = loggerFactory.getLogger("FILE");
        errorLogger = loggerFactory.getLogger("ERROR");
    }

    public void logInfo(String message) {
        consoleLogger.log(message);
    }

    public void logDebug(String message) {
        consoleLogger.log(message);
        fileLogger.log(message);
    }

    public void logError(String message) {
        consoleLogger.log(message);
        fileLogger.log(message);
        errorLogger.log(message);
    }
}
