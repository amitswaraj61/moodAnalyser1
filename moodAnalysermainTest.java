package moodAnalyser;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class moodAnalysermainTest {
    @Test
    public void givenMood_WhenSad_ReturnsSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am in sad mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("SAD", mood);
    }
    @Test
    public void givenMood_WhenHappy_ReturnsHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser("i am in happy mood");
        String mood=moodAnalyser.analyseMood();
        assertEquals("HAPPY",mood);
    }
    @Test
    public void givenMessage_IsNull_ReturnsHappy() {
        MoodAnalyser moodAnalyser =new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY",mood);
    }
}













