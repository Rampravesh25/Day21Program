package com.mainbridgelabz;

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {

    }

   public MoodAnalyser(String message) {
        this.message = message;
    }

   public String analyseMood() {
        return analyseMood(message);
    }

    public String analyseMood(String message) {
        String split[] = message.split(" ");

        String messageToReturn = "";

        for (String var : split) {
            if (var.equalsIgnoreCase("Sad")) {
                messageToReturn = var;
                break;
            } else if (var.equalsIgnoreCase("Happy")) {
                messageToReturn = var;
                break;
            }
        }

        if (messageToReturn.equals("")) {
            return "Happy";
        }

        return messageToReturn;
    }
}
