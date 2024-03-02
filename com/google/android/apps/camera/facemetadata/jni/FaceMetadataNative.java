package com.google.android.apps.camera.facemetadata.jni;

import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import java.util.concurrent.atomic.AtomicBoolean;

public final class FaceMetadataNative {
   public static final AtomicBoolean a = new AtomicBoolean();

   private FaceMetadataNative() {
   }

   public static native long createHandle();

   public static native long[] generateFaceInfos(FaceToBeautify[] var0);

   public static native long[] generateFaceThumbnails(int var0, int var1, long[] var2, long var3);

   public static native int getThumbnailSize(long var0);

   public static native void releaseFaceInfos(long[] var0);

   public static native void releaseFaceThumbnails(long[] var0);

   public static native void releaseHandle(long var0);
}
