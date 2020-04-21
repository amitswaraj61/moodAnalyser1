package moodAnalyser;

public class MoodAnalyser {
    private  String message;

    public MoodAnalyser(){

    }

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

    @Override
    public boolean equals(Object obj){
        return  (this!=obj);
    }

}


