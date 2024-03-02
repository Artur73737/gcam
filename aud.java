import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class aud {
   public final List a;
   public final int b;
   public int c;
   public final List d;
   public final HashMap e;
   public final qsd f;

   public aud(List var1, int var2) {
      this.a = var1;
      this.b = var2;
      if (var2 < 0) {
         IllegalArgumentException var7 = new IllegalArgumentException("Invalid start index");
         throw var7;
      } else {
         this.d = new ArrayList();
         HashMap var5 = new HashMap();
         int var4 = var1.size();
         var2 = 0;

         for(int var3 = 0; var2 < var4; ++var2) {
            ora var6 = (ora)this.a.get(var2);
            var5.put(var6.c, new lpz(var2, var3, var6.a));
            var3 += var6.a;
         }

         this.e = var5;
         this.f = pwm.bt(new amp(this, 9));
      }
   }

   public final boolean a(int var1, int var2) {
      lpz var4 = (lpz)this.e.get(var1);
      if (var4 == null) {
         return false;
      } else {
         var1 = var4.b;
         int var3 = var2 - var4.a;
         var4.a = var2;
         if (var3 != 0) {
            Collection var5 = this.e.values();
            var5.getClass();
            Iterator var7 = var5.iterator();

            while(var7.hasNext()) {
               lpz var6 = (lpz)var7.next();
               if (var6.b >= var1 && !c.E(var6, var4)) {
                  var2 = var6.b + var3;
                  if (var2 >= 0) {
                     var6.b = var2;
                  }
               }
            }
         }

         return true;
      }
   }

   public final int b(ora var1) {
      var1.getClass();
      lpz var2 = (lpz)this.e.get(var1.c);
      return var2 != null ? var2.b : -1;
   }

   public final int c(ora var1) {
      var1.getClass();
      lpz var3 = (lpz)this.e.get(var1.c);
      int var2;
      if (var3 != null) {
         var2 = var3.a;
      } else {
         var2 = var1.a;
      }

      return var2;
   }

   public final void d(ora var1, int var2) {
      this.e.put(var1.c, new lpz(-1, var2, 0));
   }

   public final void e(ora var1) {
      this.d.add(var1);
   }
}
