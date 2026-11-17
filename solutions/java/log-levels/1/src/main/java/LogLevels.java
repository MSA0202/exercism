public class LogLevels {
    
    public static String message(String logLine) {
        String logLineMessageOnly = logLine.substring(logLine.indexOf(":")+1, logLine.length()).trim();
        return logLineMessageOnly;
    }

    public static String logLevel(String logLine) {
        String logLevel = logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]")).toLowerCase();
        return logLevel;
    }

    public static String reformat(String logLine) {
        String resultFormat = "%s (%s)";
        String result = String.format(resultFormat, message(logLine), logLevel(logLine));
        return result;
    }
}
