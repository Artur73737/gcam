package com.google.vr.cardboard;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ExternalSurfaceManager {
   private static final String b = ExternalSurfaceManager.class.getSimpleName();
   public final .qnd a;
   private final Object c;
   private int d;
   private boolean e;
   private volatile .nsj f;

   public ExternalSurfaceManager(long var1) {
      .qnd var3 = new .qnd(var1);
      super();
      this.c = new Object();
      this.f = new .nsj((char[])null);
      this.d = 1;
      this.a = var3;
   }

   private final int a(int param1, int param2, .qnh param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   private final void b(.qni var1) {
      .nsj var2 = this.f;
      if (this.e && !((HashMap)var2.c).isEmpty()) {
         Iterator var3 = ((HashMap)var2.c).values().iterator();

         while(var3.hasNext()) {
            .qng var4 = (.qng)var3.next();
            var4.a();
            var1.a(var4);
         }
      }

      if (!((HashMap)var2.b).isEmpty()) {
         Iterator var5 = ((HashMap)var2.b).values().iterator();

         while(var5.hasNext()) {
            ((.qng)var5.next()).c(this.a);
         }
      }

   }

   public static native void nativeCallback(long var0);

   public static native void nativeUpdateSurface(long var0, int var2, int var3, long var4, float[] var6);

   public void consumerAttachToCurrentGLContext() {
      this.e = true;
      .nsj var1 = this.f;
      if (!((HashMap)var1.c).isEmpty()) {
         Iterator var2 = ((HashMap)var1.c).values().iterator();

         while(var2.hasNext()) {
            ((.qng)var2.next()).a();
         }
      }

   }

   public void consumerAttachToCurrentGLContext(Map var1) {
      this.e = true;
      .nsj var2 = this.f;
      if (!((HashMap)this.f.c).isEmpty()) {
         Iterator var4 = ((HashMap)this.f.c).keySet().iterator();

         while(var4.hasNext()) {
            Integer var3 = (Integer)var4.next();
            if (!var1.containsKey(var3)) {
               Log.e(b, String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", var3));
               return;
            }
         }
      }

      if (!var1.isEmpty()) {
         Iterator var6 = var1.entrySet().iterator();

         while(var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            Object var8 = var2.c;
            Object var5 = var7.getKey();
            if (((HashMap)var8).containsKey(var5)) {
               var5 = var2.c;
               var8 = var7.getKey();
               ((.qng)((HashMap)var5).get(var8)).b((Integer)var7.getValue());
            } else {
               Log.e(b, String.format("Surface %d doesn't exist, skip attaching to current GL context.", var7.getKey()));
            }
         }
      }

   }

   public void consumerDetachFromCurrentGLContext() {
      this.e = false;
      .nsj var1 = this.f;
      if (!((HashMap)var1.c).isEmpty()) {
         Iterator var2 = ((HashMap)var1.c).values().iterator();

         while(var2.hasNext()) {
            .qng var3 = (.qng)var2.next();
            if (var3.i) {
               .qnh var4 = var3.b;
               if (var4 != null) {
                  var4.a();
               }

               var3.g.detachFromGLContext();
               var3.i = false;
            }
         }
      }

   }

   public void consumerUpdateManagedSurfaces() {
      this.b(new .qnc(this, 1));
   }

   public void consumerUpdateManagedSurfacesSequentially() {
      this.b(new .qnc(this, 0));
   }

   public int createExternalSurface() {
      return this.a(-1, -1, (.qnh)null, false);
   }

   public int createExternalSurface(int var1, int var2, Runnable var3, Runnable var4, Handler var5) {
      if (var3 != null && var5 != null) {
         return this.a(var1, var2, new .qne(var3, var4, var5), false);
      } else {
         throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
      }
   }

   public int createExternalSurfaceWithNativeCallback(int var1, int var2, long var3, long var5, boolean var7) {
      return this.a(var1, var2, new .qnk(var3, var5), var7);
   }

   public Surface getSurface(int var1) {
      .nsj var2 = this.f;
      Object var4 = var2.c;
      Integer var3 = var1;
      if (((HashMap)var4).containsKey(var3)) {
         .qng var5 = (.qng)((HashMap)var2.c).get(var3);
         return !var5.i ? null : var5.h;
      } else {
         Log.e(b, .c.aK(var1, "Surface with ID ", " does not exist, returning null"));
         return null;
      }
   }

   public void releaseExternalSurface(int var1) {
      Object var2 = this.c;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label241: {
         .nsj var3;
         Integer var4;
         .qng var37;
         try {
            var3 = new .nsj(this.f);
            Object var5 = var3.c;
            var4 = var1;
            var37 = (.qng)((HashMap)var5).remove(var4);
         } catch (Throwable var35) {
            var10000 = var35;
            var10001 = false;
            break label241;
         }

         if (var37 != null) {
            try {
               ((HashMap)var3.b).put(var4, var37);
               this.f = var3;
            } catch (Throwable var34) {
               var10000 = var34;
               var10001 = false;
               break label241;
            }
         } else {
            try {
               Log.e(b, .c.aE(var1, "Not releasing nonexistent surface ID "));
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label241;
            }
         }

         label228:
         try {
            return;
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label228;
         }
      }

      while(true) {
         Throwable var36 = var10000;

         try {
            throw var36;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            continue;
         }
      }
   }

   public void shutdown() {
      Object var1 = this.c;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label430: {
         .nsj var2;
         label425: {
            Iterator var48;
            try {
               var2 = this.f;
               .nsj var3 = new .nsj((char[])null);
               this.f = var3;
               if (((HashMap)var2.c).isEmpty()) {
                  break label425;
               }

               var48 = ((HashMap)var2.c).entrySet().iterator();
            } catch (Throwable var45) {
               var10000 = var45;
               var10001 = false;
               break label430;
            }

            while(true) {
               try {
                  if (!var48.hasNext()) {
                     break;
                  }

                  ((.qng)((Entry)var48.next()).getValue()).c(this.a);
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label430;
               }
            }
         }

         label413: {
            Iterator var46;
            try {
               if (((HashMap)var2.b).isEmpty()) {
                  break label413;
               }

               var46 = ((HashMap)var2.b).entrySet().iterator();
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label430;
            }

            while(true) {
               try {
                  if (!var46.hasNext()) {
                     break;
                  }

                  ((.qng)((Entry)var46.next()).getValue()).c(this.a);
               } catch (Throwable var42) {
                  var10000 = var42;
                  var10001 = false;
                  break label430;
               }
            }
         }

         label402:
         try {
            return;
         } catch (Throwable var41) {
            var10000 = var41;
            var10001 = false;
            break label402;
         }
      }

      while(true) {
         Throwable var47 = var10000;

         try {
            throw var47;
         } catch (Throwable var40) {
            var10000 = var40;
            var10001 = false;
            continue;
         }
      }
   }
}
