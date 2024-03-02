package com.google.android.libraries.performance.primes.metrics.crash;

import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

public final class NativeCrashHandlerImpl {
   private static final .pds c = .pds.h("com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl");
   final CountDownLatch a = new CountDownLatch(1);
   final CountDownLatch b = new CountDownLatch(1);
   private boolean d;
   private final .otw e;

   public NativeCrashHandlerImpl(.otw var1) {
      this.e = var1;
   }

   private static native ByteBuffer awaitSignal();

   private static native boolean initializeSignalHandler();

   private static native void unblockSignalHandler();

   public final void a(.nnc var1) {
      synchronized(this){}

      Throwable var10000;
      label78: {
         boolean var10001;
         boolean var2;
         try {
            var2 = this.d;
         } catch (Throwable var10) {
            var10000 = var10;
            var10001 = false;
            break label78;
         }

         if (var2) {
            return;
         }

         try {
            this.d = true;
            .nnl var4 = new .nnl(this, var1);
            Thread var3 = new Thread(var4, "Primes-nativecrash-sidecar");
            var3.setDaemon(true);
            var3.setPriority(10);
            var3.start();
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label78;
         }

         return;
      }

      Throwable var11 = var10000;
      throw var11;
   }

   // $FF: synthetic method
   public final void b(.nnc param1) {
      // $FF: Couldn't be decompiled
   }
}
