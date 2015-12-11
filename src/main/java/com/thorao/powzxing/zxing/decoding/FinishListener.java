/*
 * Copyright (C) 2010 ZXing authors
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

package com.thorao.powzxing.zxing.decoding;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

/**
 * Simple listener used to exit the app in a few cases.
 */
public final class FinishListener
        implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, Runnable {

    private final Activity activityToFinish;
    public static final String EXTRA_SCAN_TIME_OUT = "EXTRA_ZXING_SCAN_TIME_OUT";

    public FinishListener(Activity activityToFinish) {
        this.activityToFinish = activityToFinish;
    }

    public void onCancel(DialogInterface dialogInterface) {
        run();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        run();
    }

    public void run() {
        //FIXME zxing 超时不关闭activity
//    activityToFinish.finish();
         System.out.println("EXTRA_ZXING_SCAN_TIME_OUT");
        LocalBroadcastManager.getInstance(activityToFinish).sendBroadcast(new Intent("EXTRA_ZXING_SCAN_TIME_OUT"));
    }

}
