package moodAnalyser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class MoodAnalyserFactory {
    public static MoodAnalyser createMoodAnalyser(String name,String message) throws MoodAnalyserException {
        try {
            Class<?> c = Class.forName(name);
            Constructor<?> constructor = c.getConstructor(String.class);
            Object myObject = constructor.newInstance(message);
            return (MoodAnalyser) myObject;
        } catch (ClassNotFoundException exception) {
            throw new MoodAnalyserException("no such class found", MoodAnalyserException.ExceptionType.NO_SUCH_CLASS);
        } catch (NoSuchMethodException exception) {
            throw new MoodAnalyserException("no such method found", MoodAnalyserException.ExceptionType.NO_SUCH_METHOD);
        } catch (IllegalAccessException exception) {
            exception.printStackTrace();
        } catch (InvocationTargetException exception) {
            exception.printStackTrace();
        } catch (InstantiationException exception) {
            exception.printStackTrace();
        }
        return null;

    }


    public static MoodAnalyser createMoodAnalyser() throws MoodAnalyserException {

        try {
            Class<?> c = Class.forName("moodAnalyser.MoodAnalyser");
            Constructor<?> constructor = c.getConstructor(String.class);
            Object myObject = constructor.newInstance("");
            return (MoodAnalyser) myObject;
        } catch (ClassNotFoundException exception) {
            throw new MoodAnalyserException("no such class found", MoodAnalyserException.ExceptionType.NO_SUCH_CLASS);
        } catch (NoSuchMethodException exception) {
            throw new MoodAnalyserException("no such method found", MoodAnalyserException.ExceptionType.NO_SUCH_METHOD);
        } catch (IllegalAccessException exception) {
            exception.printStackTrace();
        } catch (InvocationTargetException exception) {
            exception.printStackTrace();
        } catch (InstantiationException exception) {
            exception.printStackTrace();
        }

        return null;
    }

    public static Object invocationMethod(Object moodAnalyserObject, String methodName) throws MoodAnalyserException {
        try {
            return moodAnalyserObject.getClass().getMethod(methodName).invoke(moodAnalyserObject);
        } catch (IllegalAccessException exception) {
            throw new MoodAnalyserException("no access error", MoodAnalyserException.ExceptionType.NO_SUCH_ACCESS);
        } catch (InvocationTargetException exception) {
            throw new MoodAnalyserException("invocation issue", MoodAnalyserException.ExceptionType.METHOD_INVOCATION_ISSUE);
        } catch (NoSuchMethodException exception) {
            throw new MoodAnalyserException("no such method found", MoodAnalyserException.ExceptionType.NO_SUCH_METHOD);
        }
    }
}
