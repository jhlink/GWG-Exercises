package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

// COMP (1) Create a class called ReminderTasks
public class ReminderTasks {

    // COMP (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT
    public final static String ACTION_INCREMENT_WATER_COUNT = "INC_COUNT";


// COMP (6) Create a public static void method called executeTask
// COMP (7) Add a Context called context and String parameter called action to the parameter list
// COMP (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount
    public static void executeTask(Context context, String action) {
        switch (action) {
            case ACTION_INCREMENT_WATER_COUNT:
                incrementWaterCount(context);
                break;
        }
    }


// COMP (3) Create a private static void method called incrementWaterCount
// COMP (4) Add a Context called context to the argument list
// COMP (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update
// the water count
    private static void incrementWaterCount(Context context) {
        PreferenceUtilities.incrementWaterCount(context);
    }

}