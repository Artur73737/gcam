import android.view.View;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class arh extends qwq implements qvt {
   final Object a;
   private final int b;

   public arh(Object var1, int var2) {
      super(1);
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object eo(Object var1) {
      int var7 = this.b;
      int var6 = 0;
      double var2;
      Object var9;
      Throwable var10000;
      boolean var10001;
      ben var88;
      switch(var7) {
      case 0:
         brl var94 = (brl)var1;
         var94.getClass();
         brr.a(var94, (String)this.a);
         brr.c(var94, 5);
         return qsn.a;
      case 1:
         float var4 = ((Number)var1).floatValue();
         var4 += ((apu)this.a).m.f();
         apu var93 = (apu)this.a;
         float var5 = qxb.j(var4, var93.f, var93.g);
         if ((aoh)((apu)this.a).i.a() == null) {
            ((apu)this.a).k.i(var5 + 0.0F);
            ((apu)this.a).l.i(var4 - var5);
            ((apu)this.a).m.i(var4);
            return qsn.a;
         }

         throw null;
      case 2:
         Throwable var102 = (Throwable)var1;
         CancellationException var104 = qxb.u("Recomposer effect job completed", var102);
         Object var99 = this.a;
         var1 = ((auo)var99).c;
         synchronized(var1){}

         label1034: {
            rbd var108;
            try {
               var108 = ((auo)var99).d;
            } catch (Throwable var85) {
               var10000 = var85;
               var10001 = false;
               break label1034;
            }

            if (var108 != null) {
               try {
                  ((auo)var99).n.d(aui.b);
                  var108.s(var104);
                  ((auo)var99).m = null;
                  zy var106 = new zy(var99, var102, 14);
                  var108.q(var106);
               } catch (Throwable var83) {
                  var10000 = var83;
                  var10001 = false;
                  break label1034;
               }
            } else {
               try {
                  ((auo)var99).e = var104;
                  ((auo)var99).n.d(aui.a);
               } catch (Throwable var84) {
                  var10000 = var84;
                  var10001 = false;
                  break label1034;
               }
            }

            return qsn.a;
         }

         Throwable var109 = var10000;
         throw var109;
      case 3:
         var1.getClass();
         ((asw)this.a).h(var1);
         return qsn.a;
      case 4:
         var1.getClass();
         ((axb)this.a).add(var1);
         return qsn.a;
      case 5:
         return ((Collection)this.a).contains(var1);
      case 6:
         return ((Collection)this.a).contains(var1);
      case 7:
         var1.getClass();
         azc var107 = ((azb)this.a).c;
         boolean var8;
         if (var107 != null) {
            var8 = var107.f(var1);
         } else {
            var8 = true;
         }

         return var8;
      case 8:
         var1.getClass();
         var9 = this.a;

         for(var7 = ((List)var9).size(); var6 < var7; ++var6) {
            ((qvt)((List)var9).get(var6)).eo(var1);
         }

         return qsn.a;
      case 9:
         azo var105 = (azo)var1;
         var105.getClass();
         var1 = azp.b;
         synchronized(var1){}

         try {
            var6 = azp.d++;
         } finally {
            ;
         }

         return new azj(var6, var105, (qvt)this.a);
      case 10:
         azo var92 = (azo)var1;
         var92.getClass();
         azk var103 = (azk)((qvt)this.a).eo(var92);
         var1 = azp.b;
         synchronized(var1){}

         try {
            azp.c = azp.c.d(var103.u());
         } finally {
            ;
         }

         return var103;
      case 11:
         List var91 = (List)var1;
         var91.getClass();
         return var91.retainAll((Collection)this.a);
      case 12:
         var1.getClass();
         var9 = this.a;
         axf var11 = ((bad)var9).f;
         synchronized(var11){}

         label1027: {
            Object var12;
            bac var13;
            dhq var98;
            try {
               var13 = ((bad)var9).g;
               var13.getClass();
               var12 = var13.b;
               var12.getClass();
               var6 = var13.c;
               var98 = var13.k;
            } catch (Throwable var82) {
               var10000 = var82;
               var10001 = false;
               break label1027;
            }

            dhq var101 = var98;
            if (var98 == null) {
               try {
                  var101 = new dhq((char[])null, (byte[])null);
                  var13.k = var101;
                  var13.j.h(var12, var101);
               } catch (Throwable var81) {
                  var10000 = var81;
                  var10001 = false;
                  break label1027;
               }
            }

            label992:
            try {
               var13.c(var1, var6, var12, var101);
               return qsn.a;
            } catch (Throwable var80) {
               var10000 = var80;
               var10001 = false;
               break label992;
            }
         }

         Throwable var90 = var10000;
         throw var90;
      case 13:
         ((bkd)var1).getClass();
         bkd.e((bke)this.a, 0, 0);
         return qsn.a;
      case 14:
         bdo var89 = (bdo)var1;
         var89.getClass();
         bds var97 = (bds)this.a;
         var89.a = var97.a;
         var89.b = var97.b;
         var89.c = var97.c;
         var89.d = 0.0F;
         var89.g = var97.d;
         var89.h = var97.e;
         var89.i = var97.f;
         var89.i(var97.g);
         var97 = (bds)this.a;
         var89.k = var97.h;
         var89.e = var97.i;
         var89.f = var97.j;
         var89.l = 0;
         return qsn.a;
      case 15:
         var2 = ((Number)var1).doubleValue();
         var88 = (ben)this.a;
         return var88.n.a(qxb.g(var2, (double)var88.e, (double)var88.f));
      case 16:
         var2 = ((Number)var1).doubleValue();
         var2 = ((ben)this.a).k.a(var2);
         var88 = (ben)this.a;
         return qxb.g(var2, (double)var88.e, (double)var88.f);
      case 17:
         bev var87 = (bev)var1;
         var87.getClass();
         ((bgd)this.a).a.c(var87);
         return qsn.a;
      case 18:
         ((nd)var1).getClass();
         return new akj(this.a, 4);
      case 19:
         bho var86 = (bho)var1;
         var9 = this.a;
         if (var86 == null) {
            var6 = bho.b;
            var86 = bhn.a;
         }

         cje var96 = (cje)var9;
         var96.a = var86;
         bop var10 = bop.a;
         var1 = var96.b;
         var9 = var96.a;
         var10.a((View)var1, (bho)var9);
         return qsn.a;
      default:
         Throwable var100 = (Throwable)var1;
         bij var95 = (bij)this.a;
         qza var110 = var95.b;
         if (var110 != null) {
            var110.A(var100);
         }

         var95.b = null;
         return qsn.a;
      }
   }
}
