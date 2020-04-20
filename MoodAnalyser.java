package moodAnalyser;

public class MoodAnalyser {
    private final String message;

    public MoodAnalyser(String message) {
        this.message = message;

    }

    public String analyseMood() throws MoodAnalyserException{
        try {
            if (message.length()==0){
                throw new MoodAnalyserException("a mood cant be empty",MoodAnalyserException.ExceptionType.EMPTY_EXCEPTION);
            }
            if(message.contains("sad"))
                return "SAD";
            return "HAPPY";
        }
        catch (NullPointerException e){
            throw new MoodAnalyserException("a mood cant be null",MoodAnalyserException.ExceptionType.NULL_EXCEPTION);
        }

    }
}


