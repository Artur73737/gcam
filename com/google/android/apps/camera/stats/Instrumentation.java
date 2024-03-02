package com.google.android.apps.camera.stats;

import com.google.android.apps.camera.stats.timing.TimingSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Instrumentation {
   private static Instrumentation a = null;
   private final List b = new ArrayList();

   public static void d(Instrumentation var0) {
      synchronized(Instrumentation.class){}

      try {
         a = var0;
      } finally {
         ;
      }

   }

   public static Instrumentation instance() {
      synchronized(Instrumentation.class){}

      Instrumentation var0;
      try {
         var0 = a;
      } finally {
         ;
      }

      return var0;
   }

   public final TimingSession a(Class var1) {
      synchronized(this){}

      TimingSession var5;
      try {
         List var4 = this.b(var1);
         var5 = (TimingSession)var4.get(var4.size() - 1);
      } finally {
         ;
      }

      return var5;
   }

   public final List b(Class var1) {
      synchronized(this){}

      Throwable var10000;
      label149: {
         boolean var10001;
         ArrayList var2;
         Iterator var4;
         try {
            var2 = new ArrayList();
            var4 = this.b.iterator();
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label149;
         }

         while(true) {
            TimingSession var3;
            try {
               if (!var4.hasNext()) {
                  return var2;
               }

               var3 = (TimingSession)((WeakReference)var4.next()).get();
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break;
            }

            if (var3 != null) {
               try {
                  if (var3.getClass().equals(var1)) {
                     var2.add(var3);
                  }
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break;
               }
            }
         }
      }

      Throwable var17 = var10000;
      throw var17;
   }

   public final void c(WeakReference var1) {
      synchronized(this){}

      try {
         this.b.remove(var1.get());
      } finally {
         ;
      }

   }

   public final boolean e(Class var1) {
      synchronized(this){}

      boolean var2;
      try {
         var2 = this.b(var1).isEmpty();
      } finally {
         ;
      }

      return !var2;
   }

   public final void f(TimingSession var1) {
      synchronized(this){}

      try {
         List var3 = this.b;
         WeakReference var2 = new WeakReference(var1);
         var3.add(var2);
         .jlw var6 = new .jlw(this, var1, 7);
         var1.b(var6);
      } finally {
         ;
      }

   }
}
