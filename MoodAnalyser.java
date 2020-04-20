package moodAnalyser;

public class MoodAnalyser {
    private final String message;

    public MoodAnalyser(String message) {
        this.message = message;

    }

    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        return "HAPPY";

    }
}


