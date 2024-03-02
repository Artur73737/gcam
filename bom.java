import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class bom {
   private static final bcj a = new bcj(0.0F, 0.0F, 10.0F, 10.0F);

   public static final View a(bpc var0, int var1) {
      Set var3 = var0.a.entrySet();
      var3.getClass();
      Iterator var2 = var3.iterator();

      Object var4;
      do {
         if (!var2.hasNext()) {
            var4 = null;
            break;
         }

         var4 = var2.next();
      } while(((bmd)((Entry)var4).getKey()).d != var1);

      Entry var5 = (Entry)var4;
      return var5 != null ? (byc)var5.getValue() : null;
   }

   public static final bpy b(List var0, int var1) {
      var0.getClass();
      int var3 = var0.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         if (((bpy)var0.get(var2)).a == var1) {
            return (bpy)var0.get(var2);
         }
      }

      return null;
   }

   public static final String c(bro var0) {
      List var1 = (List)la.l(var0.c, brp.a);
      return var1 != null ? (String)pwm.aw(var1) : null;
   }

   public static final void d(Region var0, bro var1, Map var2, bro var3, Region var4) {
      boolean var5;
      if (var3.b.d()) {
         if (!var3.b.ad()) {
            var5 = true;
         } else {
            var5 = false;
         }
      } else {
         var5 = true;
      }

      if ((!var0.isEmpty() || var3.e == var1.e) && (!var5 || var3.d)) {
         Object var13;
         if (var3.c.b) {
            bnj var14 = la.j(var3.b);
            var13 = var14;
            if (var14 == null) {
               var13 = var3.a;
            }
         } else {
            var13 = var3.a;
         }

         bba var21 = ((blg)var13).n();
         var13 = la.l(var3.c, brk.b);
         var21.getClass();
         bcj var22;
         if (!var21.p.y) {
            var22 = bcj.a;
         } else if (var13 == null) {
            var22 = iy.f(jj.i(var21, 8));
         } else {
            bmz var24 = jj.i(var21, 8);
            if (!var24.k()) {
               var22 = bcj.a;
            } else {
               bjf var15 = iy.g(var24);
               bch var23 = var24.Q();
               long var11 = var24.K(var24.M());
               var23.a = -bcl.c(var11);
               var23.b = -bcl.a(var11);
               var23.c = (float)var24.o() + bcl.c(var11);
               var23.d = (float)var24.n() + bcl.a(var11);

               while(true) {
                  if (var24 == var15) {
                     var22 = er.j(var23);
                     break;
                  }

                  var24.ae(var23, false, true);
                  if (var23.b()) {
                     var22 = bcj.a;
                     break;
                  }

                  var24 = var24.p;
                  var24.getClass();
               }
            }
         }

         int var7 = qxg.e(var22.b);
         int var8 = qxg.e(var22.c);
         int var10 = qxg.e(var22.d);
         int var9 = qxg.e(var22.e);
         var4.set(var7, var8, var10, var9);
         int var6 = var3.e;
         int var20 = var6;
         if (var6 == var1.e) {
            var20 = -1;
         }

         if (var4.op(var0, Op.INTERSECT)) {
            Rect var25 = var4.getBounds();
            var25.getClass();
            var2.put(var20, new bpe(var3, var25));
            List var19 = var3.h();

            for(var20 = var19.size() - 1; var20 >= 0; --var20) {
               d(var0, var1, var2, (bro)var19.get(var20), var4);
            }

            var0.op(var7, var8, var10, var9, Op.DIFFERENCE);
         } else if (!var3.d) {
            if (var20 == -1) {
               Rect var18 = var4.getBounds();
               var18.getClass();
               var2.put(-1, new bpe(var3, var18));
            }

         } else {
            bro var16 = var3.f();
            bcj var17;
            if (var16 != null && var16.b.d()) {
               var17 = var16.b();
            } else {
               var17 = a;
            }

            var2.put(var20, new bpe(var3, new Rect(qxg.e(var17.b), qxg.e(var17.c), qxg.e(var17.d), qxg.e(var17.e))));
         }
      }
   }

   public static final boolean e(bro var0) {
      return la.l(var0.e(), brp.i) == null;
   }

   public static final boolean f(bro var0) {
      return var0.e().d(brp.d);
   }

   public static final boolean g(bro var0) {
      bmz var1 = var0.d();
      return (var1 == null || !var1.ai()) && !var0.c.d(brp.m);
   }
}
