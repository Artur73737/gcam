package androidx.media3.muxer;

import java.nio.ByteBuffer;

public final class NativeAnnexBToAvccConverter implements .coq {
   private static final .cok a = new .cok(new String[]{"annexbtoavcc"});

   private static native void processNative(ByteBuffer var0, int var1);

   public final void a(ByteBuffer var1) {
      if (var1.hasRemaining()) {
         if (a.a()) {
            boolean var2;
            if (var1.position() == 0) {
               var2 = true;
            } else {
               var2 = false;
            }

            .cav.e(var2, "The input buffer should have position set to 0.");
            .cav.e(var1.isDirect(), "Conversion only works with direct ByteBuffers");
            processNative(var1, var1.limit());
         } else {
            throw new IllegalStateException("Failed to load native library");
         }
      }
   }
}
