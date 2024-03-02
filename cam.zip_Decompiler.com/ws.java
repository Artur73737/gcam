import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraCharacteristics.Key;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ws {
   public final Map a;
   public final List b;
   public final List c;
   public final List d;

   public ws(sz var1, qr var2) {
      var1.getClass();
      super();
      ArrayList var8 = new ArrayList();
      LinkedHashMap var10 = new LinkedHashMap();
      ArrayList var9 = new ArrayList();
      LinkedHashMap var7 = new LinkedHashMap();
      Key var6 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
      var6.getClass();
      Integer var19 = (Integer)var1.b(var6);
      boolean var3;
      if (!c.E(var2.f, qt.a) || var19 != null && var19 == 2) {
         var3 = false;
      } else if (var19 != null && var19 == 0) {
         var3 = false;
      } else if (var19 == null) {
         var3 = true;
      } else if (var19 != 4) {
         var3 = true;
      } else {
         var3 = false;
      }

      LinkedHashMap var11 = new LinkedHashMap();
      Iterator var15 = var2.b.iterator();

      int var4;
      label182:
      while(var15.hasNext()) {
         lmk var14 = (lmk)var15.next();
         Iterator var12 = ((List)var14.a).iterator();

         while(true) {
            rq var13;
            do {
               if (!var12.hasNext()) {
                  continue label182;
               }

               var13 = (rq)var12.next();
            } while(var10.containsKey(var13));

            int var5;
            String var16;
            Integer var17;
            Size var18;
            rr var23;
            label177: {
               var5 = wt.c.b();
               var18 = var13.b;
               var4 = var13.c;
               var16 = var2.a;
               var17 = (Integer)var11.get(var14);
               if (var3) {
                  rp var20;
                  if (var13 instanceof rp) {
                     var20 = (rp)var13;
                  } else {
                     var20 = null;
                  }

                  if (var20 != null) {
                     var23 = var20.a;
                     break label177;
                  }
               }

               var23 = null;
            }

            ro var33;
            if (var13 instanceof ro) {
               var33 = (ro)var13;
            } else {
               var33 = null;
            }

            if (var33 != null) {
               throw null;
            }

            wp var25 = new wp(var5, var18, var4, var16, var17, var23);
            var10.put(var13, var25);
            var8.add(var25);
         }
      }

      int var30 = var2.b.size();

      ArrayList var34;
      Iterator var36;
      for(var4 = 0; var4 < var30; ++var4) {
         lmk var26 = (lmk)var2.b.get(var4);
         Object var47 = var26.a;
         var34 = new ArrayList(pwm.aL((Iterable)var47));
         Iterator var48 = ((Iterable)var47).iterator();

         while(var48.hasNext()) {
            Object var50 = var10.get((rq)var48.next());
            var50.getClass();
            wp var51 = (wp)var50;
            var34.add(new wq(wt.b.b(), var51.a, var51.b, var51.c, var51.e));
         }

         rc var49 = new rc(wt.a.b(), var34);
         var7.put(var26, var49);
         var9.add(var49);

         for(var36 = var34.iterator(); var36.hasNext(); ((wq)var36.next()).f = var49) {
         }

         Iterator var27 = ((List)var26.a).iterator();

         while(var27.hasNext()) {
            Object var38 = var10.get((rq)var27.next());
            var38.getClass();
            ((wp)var38).f.add(var49);
         }
      }

      this.c = var9;
      ArrayList var28 = new ArrayList(pwm.aL(var9));
      Iterator var21 = var9.iterator();

      while(var21.hasNext()) {
         var28.add(ry.a(((rc)var21.next()).a));
      }

      pwm.aG(var28);
      this.a = var7;
      this.b = var8;
      List var22 = this.c;
      Object var31 = new ArrayList();
      var21 = var22.iterator();

      while(var21.hasNext()) {
         pwm.aJ((Collection)var31, ((rc)var21.next()).b);
      }

      var9 = new ArrayList();
      var34 = new ArrayList();
      Iterator var39 = ((Iterable)var31).iterator();

      wq var24;
      while(var39.hasNext()) {
         Object var35 = var39.next();
         var24 = (wq)var35;
         var34.add(var35);
      }

      qsg var41 = new qsg(var9, var34);
      var22 = (List)var41.a;
      List var43 = (List)var41.b;
      Iterator var37;
      if (!var22.isEmpty()) {
         var31 = pwm.aA(var22, var43);
      } else {
         var34 = new ArrayList();
         var9 = new ArrayList();
         var37 = ((Iterable)var31).iterator();

         while(var37.hasNext()) {
            Object var42 = var37.next();
            var24 = (wq)var42;
            if (pwm.aH(wt.d, var24.e)) {
               var34.add(var42);
            } else {
               var9.add(var42);
            }
         }

         var41 = new qsg(var34, var9);
         var22 = (List)var41.a;
         var43 = (List)var41.b;
         if (!var22.isEmpty()) {
            var31 = pwm.aA(pwm.aC(var22, new wr(1)), var43);
         } else {
            var34 = new ArrayList();
            var8 = new ArrayList();
            var37 = ((Iterable)var31).iterator();

            while(var37.hasNext()) {
               Object var29 = var37.next();
               wq var45 = (wq)var29;
               if (wt.e.contains(rx.a(var45.c))) {
                  var34.add(var29);
               } else {
                  var8.add(var29);
               }
            }

            var41 = new qsg(var34, var8);
            var22 = (List)var41.a;
            var43 = (List)var41.b;
            if (!var22.isEmpty()) {
               var31 = pwm.aA(pwm.aC(var22, new wr(0)), var43);
            }
         }
      }

      ArrayList var40 = new ArrayList();
      ArrayList var32 = new ArrayList();
      var36 = ((Iterable)var31).iterator();

      Object var46;
      while(var36.hasNext()) {
         var46 = var36.next();
         wq var44 = (wq)var46;
         var32.add(var46);
      }

      var41 = new qsg(var40, var32);
      var22 = (List)var41.a;
      var43 = (List)var41.b;
      if (!var22.isEmpty()) {
         var31 = pwm.aA(var43, var22);
      } else {
         var8 = new ArrayList();
         var34 = new ArrayList();
         var37 = ((Iterable)var31).iterator();

         while(var37.hasNext()) {
            var46 = var37.next();
            var24 = (wq)var46;
            var34.add(var46);
         }

         var41 = new qsg(var8, var34);
         var22 = (List)var41.a;
         var43 = (List)var41.b;
         if (!var22.isEmpty()) {
            var31 = pwm.aA(var43, var22);
         }
      }

      this.d = (List)var31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("StreamGraphImpl ");
      Map var2 = this.a;
      var1.append(var2);
      return "StreamGraphImpl ".concat(var2.toString());
   }
}
