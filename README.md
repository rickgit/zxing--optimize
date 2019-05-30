# zxing--optimize
optimize scan  efficiency 

## 适配屏幕
<br/>
1.
<pre>
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        LogUtils.logInfo("要显示的范围 " + width + " " + height);
        if (ViewfinderView.requestHeight == 0 || ViewfinderView.requestHeight != height) {
            ViewfinderView.requestHeight = height;
            initCamera(holder);
        }
    }
</pre>

2.<br/>
<pre>
com.thorao.powzxing.zxing.camera.CameraConfigurationManager#initFromCameraParameters

screenResolution = new Point(display.getWidth(), ViewfinderView.requestHeight==0? display.getHeight():ViewfinderView.requestHeight);
</pre>


## 设置采样率
inSampleSize(采样率)

尝试多次不同的采样率来进行Decode，如 1,2,4,8,16,32
