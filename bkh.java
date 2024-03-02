import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class bkh extends qwq implements qvt {
   final Object a;
   private final int b;

   public bkh(Object var1, int var2) {
      super(1);
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      int var5 = this.b;
      qvi var10 = null;
      bvl var9 = null;
      boolean var6 = true;
      byte var4 = 1;
      double var2;
      brl var13;
      int var18;
      Object var24;
      switch(var5) {
      case 0:
         ((bkd)var1).getClass();
         bkd.f((bke)this.a, 0, 0);
         return qsn.a;
      case 1:
         Entry var29 = (Entry)var1;
         var29.getClass();
         var1 = var29.getKey();
         bjp var31 = (bjp)var29.getValue();
         var18 = ((bjq)this.a).l.a(var1);
         if (var18 >= 0 && var18 < ((bjq)this.a).e) {
            var6 = false;
         } else {
            var31.a();
         }

         return var6;
      case 2:
         ((bkd)var1).getClass();
         var1 = this.a;
         var5 = ((List)var1).size();

         for(var18 = 0; var18 < var5; ++var18) {
            bkd.f((bke)((List)var1).get(var18), 0, 0);
         }

         return qsn.a;
      case 3:
         ((nd)var1).getClass();
         return new akj(this.a, 5);
      case 4:
         bkw var26 = (bkw)var1;
         var26.getClass();
         if (var26.i()) {
            if (var26.a().b) {
               var26.f();
            }

            Map var27 = var26.a().h;
            var1 = this.a;
            Iterator var28 = var27.entrySet().iterator();

            bir var11;
            while(var28.hasNext()) {
               Entry var12 = (Entry)var28.next();
               var11 = (bir)var12.getKey();
               var18 = ((Number)var12.getValue()).intValue();
               bmz var32 = var26.d();
               ((bkv)var1).d(var11, var18, var32);
            }

            bmz var23 = var26.d().p;
            var23.getClass();

            while(!c.E(var23, ((bkv)this.a).a.d())) {
               Set var30 = ((bkv)this.a).c(var23).keySet();
               var24 = this.a;
               var28 = var30.iterator();

               while(var28.hasNext()) {
                  var11 = (bir)var28.next();
                  bkv var33 = (bkv)var24;
                  var33.d(var11, var33.a(var23, var11), var23);
               }

               var23 = var23.p;
               var23.getClass();
            }
         }

         return qsn.a;
      case 5:
         baz var22 = (baz)var1;
         var22.getClass();
         ((axf)this.a).p(var22);
         return true;
      case 6:
         qvi var21 = (qvi)var1;
         var21.getClass();
         ((boa)this.a).o(var21);
         return qsn.a;
      case 7:
         KeyEvent var25 = ((bgr)var1).a;
         long var7 = hf.i(var25);
         bbp var19;
         if (c.o(var7, bgq.g)) {
            if (var25.isShiftPressed()) {
               var4 = 2;
            }

            var19 = bbp.a(var4);
         } else {
            label112: {
               if (c.o(var7, bgq.e)) {
                  var4 = 4;
               } else if (c.o(var7, bgq.d)) {
                  var4 = 3;
               } else {
                  if (c.o(var7, bgq.b)) {
                     var19 = bbp.a(5);
                     break label112;
                  }

                  if (c.o(var7, bgq.c)) {
                     var19 = bbp.a(6);
                     break label112;
                  }

                  if (!c.o(var7, bgq.f) && !c.o(var7, bgq.h) && !c.o(var7, bgq.j)) {
                     if (!c.o(var7, bgq.a) && !c.o(var7, bgq.i)) {
                        var19 = var10;
                        break label112;
                     }

                     var4 = 8;
                  } else {
                     var4 = 7;
                  }
               }

               var19 = bbp.a(var4);
            }
         }

         Boolean var20;
         if (var19 != null && c.n(hf.h(var25), 2)) {
            var20 = ((boa)this.a).w.e(var19.a);
         } else {
            var20 = false;
         }

         return var20;
      case 8:
         var10 = (qvi)var1;
         var10.getClass();
         Handler var16 = ((boa)this.a).getHandler();
         Looper var17;
         if (var16 != null) {
            var17 = var16.getLooper();
         } else {
            var17 = var9;
         }

         if (var17 == Looper.myLooper()) {
            var10.a();
         } else {
            var16 = ((boa)this.a).getHandler();
            if (var16 != null) {
               var16.post(new nj(var10, 10));
            }
         }

         return qsn.a;
      case 9:
         bpy var15 = (bpy)var1;
         var15.getClass();
         ((bol)this.a).y(var15);
         return qsn.a;
      case 10:
         Configuration var14 = (Configuration)var1;
         var14.getClass();
         ((att)this.a).b(new Configuration(var14));
         return qsn.a;
      case 11:
         ((nd)var1).getClass();
         return new akj(this.a, 6);
      case 12:
         var1.getClass();
         ((rdb)this.a).u(qsn.a);
         return qsn.a;
      case 13:
         var13 = (brl)var1;
         var13.getClass();
         var24 = this.a;
         brp.r.a(var13, brr.a[11], var24);
         return qsn.a;
      case 14:
         var13 = (brl)var1;
         var13.getClass();
         brr.c(var13, ((bri)this.a).a);
         return qsn.a;
      case 15:
         var13 = (brl)var1;
         var13.getClass();
         brr.a(var13, (String)this.a);
         return qsn.a;
      case 16:
         var9 = (bvl)var1;
         var9.getClass();
         var1 = this.a;
         var9 = new bvl((buq)null, var9.b, var9.c);
         return ((fwf)var1).e(var9).a();
      case 17:
         ((bxr)var1).getClass();
         return bxw.c(car.K(qxg.e(((apu)this.a).k.h().floatValue()), 0));
      case 18:
         var18 = ((Number)var1).intValue();
         ((List)this.a).get(var18);
         return null;
      case 19:
         var2 = ((Number)var1).doubleValue();
         return ((oeq)this.a).a(var2);
      default:
         var2 = ((Number)var1).doubleValue();
         return ((oeq)this.a).a(var2);
      }
   }
}
