package moodAnalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class MoodAnalyserFactory {
    public static MoodAnalyser createMoodAnalyser(String message)
    {
        try{
            Class<?> c = Class.forName("moodAnalyser.MoodAnalyser");
            Constructor<?> constructor = c.getConstructor(String.class);
            Object myObject = constructor.newInstance(message);
            return (MoodAnalyser) myObject;
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
        return null;

    }
}
