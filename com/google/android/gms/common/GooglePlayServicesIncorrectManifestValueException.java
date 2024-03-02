package com.google.android.gms.common;

public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
   public GooglePlayServicesIncorrectManifestValueException(int var1) {
      super(.c.aI(var1, .ljw.c, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", " but found ", ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
   }
}
