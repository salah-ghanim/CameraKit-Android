package com.flurgle.camerakit;

import android.support.annotation.Nullable;

import android.media.MediaRecorder;

import java.io.File;

abstract class CameraImpl {

    protected final CameraListener mCameraListener;
    protected final PreviewImpl mPreview;

    CameraImpl(CameraListener callback, PreviewImpl preview) {
        mCameraListener = callback;
        mPreview = preview;
    }

    abstract void start();
    abstract void stop();

    abstract void setDisplayOrientation(int displayOrientation);

    abstract void setFacing(@Facing int facing);
    abstract void setFlash(@Flash int flash);
    abstract void setFocus(@Focus int focus);
    abstract void setMethod(@Method int method);
    abstract void setZoom(@Zoom int zoom);
    abstract void setVideoQuality(@VideoQuality int videoQuality);
    abstract void setVideoOutputFile(File outputFile);
    abstract void setAudioInputEnabled(boolean enabled);

    abstract void captureImage();
    abstract void startVideo();
    abstract void endVideo();

    abstract Size getCaptureResolution();
    abstract Size getPreviewResolution();
    abstract boolean isCameraOpened();
    abstract boolean isAudioInputEnabled();
    abstract void setVideoMaxDuration(int duration);
    abstract int getVideoMaxDuration();

    @Nullable
    abstract CameraProperties getCameraProperties();

}
