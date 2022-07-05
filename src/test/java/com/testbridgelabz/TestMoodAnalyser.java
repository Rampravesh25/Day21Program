package com.testbridgelabz;

import com.mainbridgelabz.MoodAnalyser;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestMoodAnalyser {
    @Test
    public void givenSadMood_whenTested_shouldReturnSad() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Sad mood");
        assertEquals(result, "Sad");
    }

    @Test
    public void givenAnyMood_whenTested_shouldReturnHappy() {
        MoodAnalyser mood = new MoodAnalyser();
        String result = mood.analyseMood("I am in any mood");
        assertEquals(result, "Happy");
    }

    @Test
    public void givenCallingNoParamMethod_whenTested_shouldReturnSad() {
        MoodAnalyser mood = new MoodAnalyser("I am in Sad mood");
        String result = mood.analyseMood();
        assertEquals(result, "Sad");
    }

    @Test
    public void givenCallingNoParamMethod_whenTested_shouldReturnHappy() {
        MoodAnalyser mood = new MoodAnalyser("I am in Happy mood");
        String result = mood.analyseMood();
        assertEquals(result, "Happy");
    }
}
