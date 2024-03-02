package com.google.android.apps.camera.hdrplus.fusion.api;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

public interface FusionProgressCallback {
   void a(long var1, int var3, int var4, boolean var5);

   void b(long var1, InterleavedImageU8 var3, ShotMetadata var4);

   void d(InterleavedImageU8 var1, ShotMetadata var2, String var3);

   void e(long var1, .kok var3, ShotMetadata var4);

   void onProgress(long var1, float var3);
}
