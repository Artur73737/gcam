package com.google.android.apps.camera.ui.hotshot.jni;

import android.graphics.RectF;

public abstract class ObjectInfo {
   public static ObjectInfo create(int var0, float var1, RectF var2, String var3, String var4) {
      return new .kfr(var0, var1, var2, var3, var4);
   }

   public abstract RectF bounds();

   public abstract Integer id();

   public abstract String label();

   public abstract String libraryDisplayName();

   public abstract Float score();
}
