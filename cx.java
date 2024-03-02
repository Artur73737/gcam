import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public final class cx {
   public static final de a = new dd();
   public static final de b;

   static {
      de var0;
      try {
         Class var2 = Class.forName("cti");
         var2.getClass();
         var0 = (de)var2.getDeclaredConstructor().newInstance();
      } catch (Exception var1) {
         var0 = null;
      }

      b = var0;
   }

   public static final void a(bv var0, bv var1, boolean var2, xh var3, boolean var4) {
      cbg var5;
      if (var2) {
         var5 = var1.x();
      } else {
         var5 = var0.x();
      }

      if (var5 != null) {
         ArrayList var6 = new ArrayList(var3.d);
         Iterator var7 = var3.entrySet().iterator();

         while(var7.hasNext()) {
            var6.add((View)((Entry)var7.next()).getValue());
         }

         ArrayList var8 = new ArrayList(var3.d);
         Iterator var9 = var3.entrySet().iterator();

         while(var9.hasNext()) {
            var8.add((String)((Entry)var9.next()).getKey());
         }

         if (var4) {
            throw null;
         } else {
            throw null;
         }
      }
   }

   public static final void b(List var0, int var1) {
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         ((View)var2.next()).setVisibility(var1);
      }

   }
}
