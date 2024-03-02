package com.google.android.apps.camera.bottombar;

public interface AnimatedImageButton {
   int getState();

   void setOnPreChangeListener(OnStateChangeListener var1);

   void setOnStateChangeListener(OnStateChangeListener var1);

   void setState(int var1, boolean var2);

   void setStateAnimated(int var1, boolean var2);
}
