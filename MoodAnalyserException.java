package moodAnalyser;

public class MoodAnalyserException extends Exception {
public ExceptionType type;
public String message;
public enum ExceptionType {
    EMPTY_EXCEPTION, NULL_EXCEPTION,NO_SUCH_CLASS,NO_SUCH_METHOD,NO_SUCH_ACCESS,METHOD_INVOCATION_ISSUE
}
    public MoodAnalyserException(String message,ExceptionType type)
    {
        super(message);
        this.message=message;
        this.type=type;
    }
}



