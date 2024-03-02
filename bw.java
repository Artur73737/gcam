import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.WearPickerColumn;
import java.util.Iterator;

// $FF: synthetic class
public final class bw implements cew {
   public final Object a;
   private final int b;

   // $FF: synthetic method
   public bw(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   public final void accept(Object var1) {
      int var6 = this.b;
      int var5 = 0;
      Object var7;
      ntg var20;
      Configuration var22;
      cp var38;
      switch(var6) {
      case 0:
         var7 = this.a;
         Intent var23 = (Intent)var1;
         ((by)var7).e.aU();
         return;
      case 1:
         var7 = this.a;
         var22 = (Configuration)var1;
         ((by)var7).e.aU();
         return;
      case 2:
         var7 = this.a;
         var22 = (Configuration)var1;
         var38 = (cp)var7;
         if (var38.T()) {
            var38.o(var22, false);
         }

         return;
      case 3:
         var7 = this.a;
         Integer var21 = (Integer)var1;
         var38 = (cp)var7;
         if (var38.T() && var21 == 80) {
            var38.r(false);
         }

         return;
      case 4:
         var7 = this.a;
         var20 = (ntg)var1;
         var38 = (cp)var7;
         if (var38.T()) {
            var38.s(var20.a, false);
         }

         return;
      case 5:
         var7 = this.a;
         var20 = (ntg)var1;
         var38 = (cp)var7;
         if (var38.T()) {
            var38.x(var20.a, false);
         }

         return;
      case 6:
         ((rdo)this.a).u((cyw)var1);
         return;
      case 7:
         var7 = this.a;
         cxk var19 = (cxk)var1;
         gtj var37 = (gtj)var7;
         var37.e.eZ();
         if (!((cxk)var37.f.eZ()).equals(var19)) {
            var37.f.eZ();
            var37.f.a(var19);
         }

         var37.e.a(cxk.e.equals(var19));
         if (!cxk.b.equals(var19) && !cxk.c.equals(var19)) {
            var37.a.enableJupiterButton();
            return;
         }

         var37.a.disableJupiterButton();
         return;
      case 8:
         var7 = this.a;
         cyw var8 = (cyw)var1;
         oyu var12 = oyz.e();
         Iterator var27 = var8.a.iterator();

         cyp var9;
         while(var27.hasNext()) {
            var9 = (cyp)var27.next();
            if (var9 instanceof cyp) {
               var12.h(var9);
            }
         }

         kej var15;
         label101: {
            oyz var13 = var12.g();
            if (((pby)var13).c == 1) {
               var9 = (cyp)var13.get(0);
               cyn var14 = cyn.a;
               cyn var28 = var9.b;
               if (var14 == var28) {
                  var15 = kfq.d();
                  break label101;
               }

               if (cyn.b == var28 && cym.a == var9.a()) {
                  var15 = kfq.d();
                  break label101;
               }

               if (cyn.b == var9.b && cym.b == var9.a()) {
                  Rect var16 = var9.a.c();
                  var15 = new kej(kek.e, otw.j(var16));
                  break label101;
               }
            }

            var15 = kfq.c();
         }

         kem var29 = (kem)var7;
         kej var25 = var15;
         if (var29.b.isInMultiWindowMode()) {
            Activity var26 = var29.b;
            Rect var31 = ((cyz)cyy.a.eo(cza.a)).a(var26).a();
            var26 = var29.b;
            var6 = var31.height();
            float var4 = var26.getResources().getDisplayMetrics().density;
            double var2 = (double)((float)var6 / var4);
            Double.isNaN(var2);
            var25 = var15;
            if ((int)(var2 + 0.5D) >= 600) {
               var25 = kfq.d();
            }
         }

         Iterator var17 = var29.a.iterator();

         while(var17.hasNext()) {
            ((AmbientModeSupport$AmbientController)var17.next()).i(var25);
         }

         var29.d.a(var25);
         if (var29.e.a() != null) {
            var5 = var29.e.a().e;
         }

         jqs var18 = var29.f;
         pky var33 = kfq.f(var29.b.isInMultiWindowMode(), var5, var25.a);
         qfi var30 = plo.c.O();
         if (!var30.b.ad()) {
            var30.p();
         }

         plo var34 = (plo)var30.b;
         var33.getClass();
         var34.b = var33;
         var34.a |= 1;
         qfi var35 = pka.aw.O();
         pjz var10 = pjz.as;
         if (!var35.b.ad()) {
            var35.p();
         }

         pka var36 = (pka)var35.b;
         var36.d = var10.at;
         var36.a |= 1;
         plo var32 = (plo)var30.i();
         if (!var35.b.ad()) {
            var35.p();
         }

         var36 = (pka)var35.b;
         var32.getClass();
         var36.av = var32;
         var36.c |= 4194304;
         var18.F(var35);
         return;
      case 9:
         var7 = this.a;
         Canvas var11 = (Canvas)var1;
         ((CenteredRecyclerView)var7).aD(var11);
         return;
      default:
         var7 = this.a;
         lgd var24 = (lgd)var1;
         ((WearPickerColumn)var7).a(var24);
      }
   }
}
