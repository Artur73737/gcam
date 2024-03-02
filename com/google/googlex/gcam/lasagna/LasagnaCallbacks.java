package com.google.googlex.gcam.lasagna;

import com.google.googlex.gcam.ShotMetadata;

public interface LasagnaCallbacks {
   void a(int var1, int var2, String var3, .otw var4);

   void f(int var1, long var2, int var4, String var5, ShotMetadata var6);

   void onFinalStatusNative(int var1, int var2, String var3, byte[] var4);

   void onImageNative(int var1, long var2, int var4, String var5, long var6);

   void onProgress(int var1, float var2);

   void onPslRequest(int var1, boolean var2, float var3, float var4);
}
