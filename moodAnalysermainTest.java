package moodAnalyser;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class moodAnalysermainTest {
    @Test
    public void givenMood_WhenSad_ReturnsSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am in sad mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("SAD", mood);
    }

    @Test
    public void givenMood_WhenHappy_ReturnsHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am in happy mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_IsNull_ReturnsHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException exception) {
            assertEquals("invalid", exception.getMessage());
        }
    }
    @Test
    public void givenMessage_ContainsEmpty_ThrowsEmptyMood() throws MoodAnalyserException{
        MoodAnalyser moodAnalyser=new MoodAnalyser("");
        try{
            String mood=moodAnalyser.analyseMood();
        }
        catch(MoodAnalyserException exception)
        {
            assertEquals("a mood cant be empty", exception.getMessage());
        }
    }

    @Test
    public void givenMessage_ContainsNull_ThrowsNullMood() throws MoodAnalyserException{
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        try{
            String mood=moodAnalyser.analyseMood();
        }
        catch(MoodAnalyserException exception)
        {
            assertEquals("a mood cant be null", exception.getMessage());
        }
    }
    @Test
    public void givenMoodAnalyser_WhenProper_ThenReturnObject() throws MoodAnalyserException{
        try {
            Class<?> c = Class.forName("moodAnalyser.MoodAnalyser");
            Constructor<?> constructor = c.getConstructor(String.class);
            Object object = constructor.newInstance("i m in happy mood");
            MoodAnalyser moodAnalyser = (MoodAnalyser) object;
            String mood = moodAnalyser.analyseMood();
            assertEquals("HAPPY", mood);
        }
        catch(MoodAnalyserException exception)
        {
            exception.printStackTrace();
        }
        catch(ClassNotFoundException exception)
        {
            exception.printStackTrace();
        }
        catch(NoSuchMethodException exception)
        {
            exception.printStackTrace();
        }
        catch(IllegalAccessException exception)
        {
            exception.printStackTrace();
        }
        catch(InvocationTargetException exception)
        {
            exception.printStackTrace();
        }
        catch(InstantiationException exception)
        {
            exception.printStackTrace();
        }

    }
}













