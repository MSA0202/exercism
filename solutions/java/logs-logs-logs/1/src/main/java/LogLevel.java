public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int logLevelNumberEncoding;
    
    LogLevel(int logLevelNumberEncoding) {
        this.logLevelNumberEncoding = logLevelNumberEncoding;
    }

    public int getLogLevelNumberEncoding() {
        return this.logLevelNumberEncoding;
    }
}
