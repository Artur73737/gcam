package com.pairip.application;

import android.content.Context;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.pairip.SignatureCheck;

public class Application extends CameraApp {
   protected void attachBaseContext(Context var1) {
      SignatureCheck.verifyIntegrity(var1);
      this.attachBaseContext(var1);
   }
}
