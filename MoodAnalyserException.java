package moodAnalyser;

public class MoodAnalyserException extends Exception {
public ExceptionType type;
public String message;
public enum ExceptionType {
    EMPTY_EXCEPTION, NULL_EXCEPTION
}
    public MoodAnalyserException(String message,ExceptionType type)
    {
        super(message);
        this.message=message;
        this.type=type;
    }
}



