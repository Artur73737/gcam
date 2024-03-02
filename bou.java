import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class bou {
   public static final auf a;
   public static final auf b;
   public static final auf c;
   public static final auf d;
   public static final auf e;
   private static final auf f;

   static {
      a = li.f(bor.a);
      b = li.e(bor.c);
      c = li.e(bor.d);
      d = li.e(bor.e);
      f = li.e(bor.f);
      e = li.e(bor.g);
   }

   public static final void a(boa var0, qvx var1, asm var2, int var3) {
      asm var7 = var2.b(1396852028);
      Context var8 = var0.getContext();
      var7.u(-492369756);
      asq var9 = (asq)var7;
      Object var6 = var9.O();
      Object var20 = var6;
      if (var6 == asl.a) {
         var20 = sg.d(new Configuration(var8.getResources().getConfiguration()));
         var9.Y(var20);
      }

      boolean var5;
      att var10;
      label82: {
         var9.S();
         var10 = (att)var20;
         var7.u(1157296644);
         var5 = var7.B(var10);
         var6 = var9.O();
         if (!var5) {
            var20 = var6;
            if (var6 != asl.a) {
               break label82;
            }
         }

         var20 = new bkh(var10, 10);
         var9.Y(var20);
      }

      var9.S();
      qvt var21 = (qvt)var20;
      var21.getClass();
      var0.h = var21;
      var7.u(-492369756);
      var6 = var9.O();
      var20 = var6;
      if (var6 == asl.a) {
         var8.getClass();
         var20 = new boe();
         var9.Y(var20);
      }

      var9.S();
      boe var11 = (boe)var20;
      bpe var12 = var0.v();
      if (var12 == null) {
         IllegalStateException var19 = new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
         throw var19;
      } else {
         var7.u(-492369756);
         var6 = var9.O();
         var20 = var6;
         if (var6 == asl.a) {
            Object var13 = var12.b;
            int var4 = bpl.a;
            ViewParent var22 = var0.getParent();
            var22.getClass();
            View var14 = (View)var22;
            var20 = var14.getTag(2131427568);
            String var23;
            if (var20 instanceof String) {
               var23 = (String)var20;
            } else {
               var23 = null;
            }

            String var24 = var23;
            if (var23 == null) {
               var24 = String.valueOf(var14.getId());
            }

            var24.getClass();
            StringBuilder var25 = new StringBuilder();
            var25.append(azc.class.getSimpleName());
            var25.append(':');
            var25.append(var24);
            var24 = var25.toString();
            crx var36 = ((cry)var13).getSavedStateRegistry();
            Bundle var40 = var36.a(var24);
            LinkedHashMap var26;
            if (var40 != null) {
               var26 = new LinkedHashMap();
               Set var15 = var40.keySet();
               var15.getClass();
               Iterator var43 = var15.iterator();

               while(var43.hasNext()) {
                  String var17 = (String)var43.next();
                  ArrayList var16 = var40.getParcelableArrayList(var17);
                  var16.getClass();
                  var17.getClass();
                  var26.put(var17, var16);
               }
            } else {
               var26 = null;
            }

            azc var28 = aze.a(var26, bmv.q);

            label62: {
               try {
                  cf var41 = new cf(var28, 4, (byte[])null);
                  var36.b(var24, var41);
               } catch (IllegalArgumentException var18) {
                  var5 = false;
                  break label62;
               }

               var5 = true;
            }

            var20 = new bpj(var28, new bpk(var5, var36, var24));
            var9.Y(var20);
         }

         var9.S();
         bpj var38 = (bpj)var20;
         atj.c(qsn.a, new bkh(var38, 11), var7);
         var8.getClass();
         Configuration var44 = c(var10);
         var7.u(-485908294);
         var7.u(-492369756);
         var6 = var9.O();
         var20 = var6;
         if (var6 == asl.a) {
            var20 = new eze((char[])null, (byte[])null, (byte[])null, (byte[])null);
            var9.Y(var20);
         }

         var9.S();
         eze var42 = (eze)var20;
         var7.u(-492369756);
         var6 = var9.O();
         var20 = var6;
         if (var6 == asl.a) {
            var20 = new Configuration();
            if (var44 != null) {
               ((Configuration)var20).setTo(var44);
            }

            var9.Y(var20);
         }

         var9.S();
         Configuration var29 = (Configuration)var20;
         var7.u(-492369756);
         var20 = var9.O();
         if (var20 == asl.a) {
            var20 = new bot(var29, var42);
            var9.Y(var20);
         }

         var9.S();
         atj.c(var42, new bos(var8, (bot)var20, 0), var7);
         var9.S();
         ouk var35 = a.b(c(var10));
         ouk var27 = b.b(var8);
         ouk var31 = d.b(var12.a);
         ouk var30 = f.b(var12.b);
         ouk var32 = aze.a.b(var38);
         ouk var34 = e.b(var0);
         ouk var39 = c.b(var42);
         ayt var33 = sr.t(var7, 1471621628, new alc(var0, var11, var1, var3, 8));
         li.g(new ouk[]{var35, var27, var31, var30, var32, var34, var39}, var33, var7, 56);
         aug var37 = var7.H();
         if (var37 != null) {
            var37.c = new aai(var0, var1, var3, 19, (byte[])null);
         }
      }
   }

   public static final void b(String var0) {
      throw new IllegalStateException(c.aA(var0, "CompositionLocal ", " not present"));
   }

   private static final Configuration c(att var0) {
      return (Configuration)var0.a();
   }
}
