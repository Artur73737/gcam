import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public final class cny extends coc implements Runnable {
   public boolean a;
   final cnz b;

   public cny(cnz var1) {
      this.b = var1;
   }

   public final Object a() {
      cei var10000;
      label57: {
         int var2;
         TreeSet var8;
         ArrayList var10;
         boolean var10001;
         String[] var19;
         try {
            cnz var9 = this.b;
            var8 = new TreeSet();
            var19 = npl.b(var9.e.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
            var2 = var19.length;
            var10 = new ArrayList(var2);
         } catch (cei var16) {
            var10000 = var16;
            var10001 = false;
            break label57;
         }

         for(int var1 = 0; var1 < var2; ++var1) {
            String var11 = var19[var1];

            int var4;
            boolean var5;
            String[] var12;
            label46: {
               label45: {
                  try {
                     var4 = var11.indexOf(32);
                     var12 = var11.substring(0, var4).split(":");
                     if (var12.length != 2) {
                        break label45;
                     }
                  } catch (cei var15) {
                     var10000 = var15;
                     var10001 = false;
                     break label57;
                  }

                  if (var4 > 0) {
                     var5 = true;
                     break label46;
                  }
               }

               var5 = false;
            }

            try {
               onk.I(var5, "Invalid license meta-data line:\n".concat(String.valueOf(var11)));
               long var6 = Long.parseLong(var12[0]);
               int var3 = Integer.parseInt(var12[1]);
               String var22 = var11.substring(var4 + 1);
               nvd var21 = new nvd(var22, var6, var3);
               var10.add(var21);
            } catch (cei var14) {
               var10000 = var14;
               var10001 = false;
               break label57;
            }
         }

         try {
            Collections.sort(var10);
            var8.addAll(var10);
            ArrayList var20 = new ArrayList(var8);
            List var18 = Collections.unmodifiableList(var20);
            return var18;
         } catch (cei var13) {
            var10000 = var13;
            var10001 = false;
         }
      }

      cei var17 = var10000;
      if (this.f()) {
         return null;
      } else {
         throw var17;
      }
   }

   public final void b(Object var1) {
      cnz var2 = this.b;
      if (var2.a == this) {
         if (!var2.g) {
            SystemClock.uptimeMillis();
            var2.a = null;
            var2.b((List)var1);
         }
      } else {
         var2.c(this);
      }
   }

   public final void c() {
      this.b.c(this);
   }

   public final void run() {
      this.a = false;
      this.b.a();
   }
}
