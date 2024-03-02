import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class chc extends Callback {
   private final chb a;
   private List b;
   private ArrayList c;
   private final HashMap d = new HashMap();

   public chc(chb var1) {
      super(0);
      this.a = var1;
   }

   private final pde a(WindowInsetsAnimation var1) {
      pde var3 = (pde)this.d.get(var1);
      pde var2 = var3;
      if (var3 == null) {
         var2 = new pde(var1);
         this.d.put(var1, var2);
      }

      return var2;
   }

   public final void onEnd(WindowInsetsAnimation var1) {
      chb var2 = this.a;
      this.a(var1);
      var2.a.setTranslationY(0.0F);
      this.d.remove(var1);
   }

   public final void onPrepare(WindowInsetsAnimation var1) {
      chb var2 = this.a;
      this.a(var1);
      var2.a.getLocationOnScreen(var2.d);
      var2.b = var2.d[1];
   }

   public final WindowInsets onProgress(WindowInsets var1, List var2) {
      ArrayList var5 = this.c;
      if (var5 == null) {
         var5 = new ArrayList(var2.size());
         this.c = var5;
         this.b = Collections.unmodifiableList(var5);
      } else {
         var5.clear();
      }

      float var3;
      for(int var4 = var2.size() - 1; var4 >= 0; --var4) {
         WindowInsetsAnimation var6 = (WindowInsetsAnimation)var2.get(var4);
         pde var9 = this.a(var6);
         var3 = var6.getFraction();
         ((WindowInsetsAnimation)((dmx)var9.a).a).setFraction(var3);
         this.c.add(var9);
      }

      chb var8 = this.a;
      cho var7 = cho.m(var1);
      Iterator var10 = this.b.iterator();

      while(var10.hasNext()) {
         pde var11 = (pde)var10.next();
         if ((((WindowInsetsAnimation)((dmx)var11.a).a).getTypeMask() & 8) != 0) {
            var3 = (float)oia.b(var8.c, 0, ((WindowInsetsAnimation)((dmx)var11.a).a).getInterpolatedFraction());
            var8.a.setTranslationY(var3);
            break;
         }
      }

      return var7.e();
   }

   public final Bounds onStart(WindowInsetsAnimation var1, Bounds var2) {
      chb var4 = this.a;
      this.a(var1);
      cdi var5 = cdi.d(var2.getLowerBound());
      cdi var6 = cdi.d(var2.getUpperBound());
      var4.a.getLocationOnScreen(var4.d);
      int var3 = var4.d[1];
      var3 = var4.b - var3;
      var4.c = var3;
      var4.a.setTranslationY((float)var3);
      return new Bounds(var5.a(), var6.a());
   }
}
