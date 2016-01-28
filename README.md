# zxing--optimize
optimize scan  efficiency 

适配屏幕
<pre>
1.  @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        LogUtils.logInfo("要显示的范围 " + width + " " + height);
        if (ViewfinderView.requestHeight == 0 || ViewfinderView.requestHeight != height) {
            ViewfinderView.requestHeight = height;
            initCamera(holder);
        }
    }
</pre>
<pre>
2. com.thorao.powzxing.zxing.camera.CameraConfigurationManager#initFromCameraParameters

screenResolution = new Point(display.getWidth(), ViewfinderView.requestHeight==0? display.getHeight():ViewfinderView.requestHeight);
</pre>
