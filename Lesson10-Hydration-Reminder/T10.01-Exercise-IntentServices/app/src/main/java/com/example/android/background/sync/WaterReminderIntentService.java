/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.example.android.background.sync.ReminderTasks;

// COMP (9) Create WaterReminderIntentService and extend it from IntentService
public class WaterReminderIntentService extends IntentService {

//  COMP (10) Create a default constructor that calls super with the name of this class
    public WaterReminderIntentService() {
        super(WaterReminderIntentService.class.getName());
    }

//  COMP (11) Override onHandleIntent
//      COMP (12) Get the action from the Intent that started this Service
//      COMP (13) Call ReminderTasks.executeTaskForTag and pass in the action to be performed
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String actionInception = intent.getAction();
        ReminderTasks.executeTask(this, actionInception);
    }

}

