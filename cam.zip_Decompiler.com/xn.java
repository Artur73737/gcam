import android.graphics.PorterDuff.Mode;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public final class xn {
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private final pu g;
   private final lmk h;

   public xn() {
      this(6);
   }

   public xn(int var1) {
      this.a = var1;
      this.h = new lmk((byte[])null, (byte[])null, (short[])null);
      this.g = new pu();
   }

   public static int c(int var0, Mode var1) {
      return (var0 + 31) * 31 + var1.hashCode();
   }

   protected static final void d(Object var0, Object var1) {
      var0.getClass();
      var1.getClass();
   }

   private static final void e(Object var0, Object var1) {
      var0.getClass();
      var1.getClass();
   }

   public final Object a(Object var1) {
      pu var2 = this.g;
      synchronized(var2){}

      Throwable var10000;
      label113: {
         boolean var10001;
         try {
            var1 = ((LinkedHashMap)this.h.a).get(var1);
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label113;
         }

         if (var1 != null) {
            label106: {
               try {
                  ++this.e;
               } catch (Throwable var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label106;
               }

               return var1;
            }
         } else {
            label109: {
               try {
                  ++this.f;
               } catch (Throwable var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label109;
               }

               return null;
            }
         }
      }

      Throwable var15 = var10000;
      throw var15;
   }

   public final Object b(Object var1, Object var2) {
      var2.getClass();
      pu var5 = this.g;
      synchronized(var5){}

      int var3;
      Throwable var10000;
      boolean var10001;
      label701: {
         label705: {
            try {
               ++this.c;
               var3 = this.b;
               e(var1, var2);
               this.b = var3 + 1;
               var2 = this.h.aP(var1, var2);
            } catch (Throwable var63) {
               var10000 = var63;
               var10001 = false;
               break label705;
            }

            if (var2 == null) {
               break label701;
            }

            label696:
            try {
               var3 = this.b;
               e(var1, var2);
               this.b = var3 - 1;
               break label701;
            } catch (Throwable var62) {
               var10000 = var62;
               var10001 = false;
               break label696;
            }
         }

         Throwable var64 = var10000;
         throw var64;
      }

      if (var2 != null) {
         d(var1, var2);
      }

      int var4 = this.a;

      while(true) {
         pu var65 = this.g;
         synchronized(var65){}

         label714: {
            label687: {
               try {
                  if (this.b >= 0 && (!this.h.aQ() || this.b == 0)) {
                     break label687;
                  }
               } catch (Throwable var61) {
                  var10000 = var61;
                  var10001 = false;
                  break label714;
               }

               try {
                  IllegalStateException var66 = new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                  throw var66;
               } catch (Throwable var58) {
                  var10000 = var58;
                  var10001 = false;
                  break label714;
               }
            }

            try {
               if (this.b <= var4 || this.h.aQ()) {
                  return var2;
               }
            } catch (Throwable var60) {
               var10000 = var60;
               var10001 = false;
               break label714;
            }

            Entry var6;
            try {
               Set var68 = ((LinkedHashMap)this.h.a).entrySet();
               var68.getClass();
               var6 = (Entry)pwm.av(var68);
            } catch (Throwable var59) {
               var10000 = var59;
               var10001 = false;
               break label714;
            }

            if (var6 != null) {
               Object var69;
               Object var7;
               try {
                  var69 = var6.getKey();
                  var7 = var6.getValue();
                  lmk var70 = this.h;
                  var69.getClass();
                  ((LinkedHashMap)var70.a).remove(var69);
                  var3 = this.b;
                  e(var69, var7);
                  this.b = var3 - 1;
                  ++this.d;
               } catch (Throwable var57) {
                  var10000 = var57;
                  var10001 = false;
                  break label714;
               }

               d(var69, var7);
               continue;
            }

            return var2;
         }

         Throwable var67 = var10000;
         throw var67;
      }
   }

   public final String toString() {
      pu var3 = this.g;
      synchronized(var3){}

      Throwable var10000;
      label128: {
         int var1;
         boolean var10001;
         int var2;
         try {
            var2 = this.e;
            var1 = this.f + var2;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label128;
         }

         if (var1 != 0) {
            try {
               var1 = var2 * 100 / var1;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label128;
            }
         } else {
            var1 = 0;
         }

         label115:
         try {
            StringBuilder var17 = new StringBuilder();
            var17.append("LruCache[maxSize=");
            var17.append(this.a);
            var17.append(",hits=");
            var17.append(this.e);
            var17.append(",misses=");
            var17.append(this.f);
            var17.append(",hitRate=");
            var17.append(var1);
            var17.append("%]");
            String var18 = var17.toString();
            return var18;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label115;
         }
      }

      Throwable var4 = var10000;
      throw var4;
   }
}
