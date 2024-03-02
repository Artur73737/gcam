import android.graphics.Paint.FontMetricsInt;
import android.os.LocaleList;
import android.text.StaticLayout.Builder;
import java.util.ArrayList;
import java.util.Locale;

public final class bte {
   public bte() {
   }

   public bte(byte[] var1) {
      cjx var2 = cjx.a;
   }

   public static final void a(Builder var0, boolean var1) {
      var0.getClass();
      var0.setUseLineSpacingFromFallbacks(var1);
   }

   public static final int b(FontMetricsInt var0) {
      return var0.descent - var0.ascent;
   }

   public static final bwe c() {
      hqs var5 = bwf.a;
      LocaleList var4 = LocaleList.getDefault();
      var4.getClass();
      Object var3 = var5.c;
      synchronized(var3){}

      Throwable var10000;
      label337: {
         Object var2;
         boolean var10001;
         try {
            var2 = var5.b;
         } catch (Throwable var38) {
            var10000 = var38;
            var10001 = false;
            break label337;
         }

         if (var2 != null) {
            Object var6;
            try {
               var6 = var5.a;
            } catch (Throwable var37) {
               var10000 = var37;
               var10001 = false;
               break label337;
            }

            if (var4 == var6) {
               return (bwe)var2;
            }
         }

         int var1;
         ArrayList var41;
         try {
            var1 = var4.size();
            var41 = new ArrayList(var1);
         } catch (Throwable var36) {
            var10000 = var36;
            var10001 = false;
            break label337;
         }

         for(int var0 = 0; var0 < var1; ++var0) {
            try {
               Locale var7 = var4.get(var0);
               var7.getClass();
               dmw var8 = new dmw(var7);
               bwd var39 = new bwd(var8);
               var41.add(var39);
            } catch (Throwable var35) {
               var10000 = var35;
               var10001 = false;
               break label337;
            }
         }

         label311:
         try {
            var2 = new bwe(var41);
            var5.a = var4;
            var5.b = var2;
            return (bwe)var2;
         } catch (Throwable var34) {
            var10000 = var34;
            var10001 = false;
            break label311;
         }
      }

      Throwable var40 = var10000;
      throw var40;
   }

   public static final boolean d(int var0) {
      return (var0 & 1) == 1;
   }

   public static final brw e(bsg var0, int var1, boolean var2, long var3) {
      return new brw((bwj)var0, var1, var2, var3);
   }

   public static final bte f() {
      return new bte();
   }
}
