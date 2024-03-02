package android.support.v7.app;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.oliveoil.bufferflinger.aUnT.zBdGS;
import java.lang.reflect.Constructor;

public class AppCompatViewInflater {
   public static final int[] a = new int[]{16843375};
   public static final String[] b;
   private static final Class[] d = new Class[]{Context.class, AttributeSet.class};
   private static final .xo e;
   public final Object[] c = new Object[2];

   static {
      b = new String[]{"android.widget.", "android.view.", zBdGS.EXDUV};
      e = new .xo();
   }

   public .ih a(Context var1, AttributeSet var2) {
      return new .ih(var1, var2);
   }

   public AppCompatButton b(Context var1, AttributeSet var2) {
      return new AppCompatButton(var1, var2);
   }

   public .ij c(Context var1, AttributeSet var2) {
      return new .ij(var1, var2);
   }

   public .it d(Context var1, AttributeSet var2) {
      return new .it(var1, var2);
   }

   public .jq e(Context var1, AttributeSet var2) {
      return new .jq(var1, var2);
   }

   public final View f(Context var1, String var2, String var3) {
      .xo var5 = e;
      Constructor var4 = (Constructor)var5.get(var2);
      boolean var10001;
      Constructor var9;
      if (var4 == null) {
         if (var3 != null) {
            try {
               StringBuilder var11 = new StringBuilder();
               var11.append(var3);
               var11.append(var2);
               var3 = var11.toString();
            } catch (Exception var8) {
               var10001 = false;
               return null;
            }
         } else {
            var3 = var2;
         }

         try {
            var9 = Class.forName(var3, false, var1.getClassLoader()).asSubclass(View.class).getConstructor(d);
            var5.put(var2, var9);
         } catch (Exception var7) {
            var10001 = false;
            return null;
         }
      } else {
         var9 = var4;
      }

      try {
         var9.setAccessible(true);
         View var10 = (View)var9.newInstance(this.c);
         return var10;
      } catch (Exception var6) {
         var10001 = false;
         return null;
      }
   }
}
