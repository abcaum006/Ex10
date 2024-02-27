public class Main {
    public static void main(String[] args) {
        LogService logService = new LogService();

        // Example usage
        logService.logInfo("This is an information.");
        logService.logDebug("This is a debug information.");
        logService.logError("This is an error information.");
    }
}