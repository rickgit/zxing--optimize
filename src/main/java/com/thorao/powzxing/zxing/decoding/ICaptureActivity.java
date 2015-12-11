package com.thorao.powzxing.zxing.decoding;


import android.graphics.Bitmap;
import android.os.Handler;

import com.google.zxing.Result;
import com.thorao.powzxing.zxing.view.ViewfinderView;

public interface ICaptureActivity {
    public void drawViewfinder();
    public void handleDecode(Result result, Bitmap barcode);
    public ViewfinderView getViewfinderView();
    public Handler getHandler();
}
