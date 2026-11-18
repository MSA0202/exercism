public class LogLine {

    private String logLine;
    private LogLevel logLevel;
    
    public LogLine(String logLine) {
        
        this.logLine = logLine;
        
        String logLineLevelAbbrv = this.getLogLineLevelAbbrv();
        
        switch(logLineLevelAbbrv) {
            case "TRC":
                this.logLevel = LogLevel.TRACE;
                break;
            case "DBG":
                this.logLevel = LogLevel.DEBUG;
                break;
            case "INF":
                this.logLevel = LogLevel.INFO;
                break;
            case "WRN":
                this.logLevel = LogLevel.WARNING;
                break;
            case "ERR":
                this.logLevel = LogLevel.ERROR;
                break;
            case "FTL":
                this.logLevel = LogLevel.FATAL;
                break;
            default:
                this.logLevel = LogLevel.UNKNOWN;
                break;
        }
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public String getOutputForShortLog() {
        return this.getLogLevel().getLogLevelNumberEncoding() + ":" + this.getLogLineLevelMessage();
    }

    private String getLogLineLevelAbbrv()
    {
        return this.logLine.substring(this.logLine.indexOf("[")+1, this.logLine.indexOf("]"));
    }

    private String getLogLineLevelMessage()
    {
        return this.logLine.substring(this.logLine.indexOf(":")+2, this.logLine.length());
    }
}
