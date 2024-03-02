import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

// $FF: synthetic class
public final class ay implements Runnable {
   public final Object a;
   public final Object b;
   private final int c;

   public ay(dmx var1, Typeface var2, int var3) {
      this.c = var3;
      this.b = var1;
      this.a = var2;
   }

   // $FF: synthetic method
   public ay(Object var1, Object var2, int var3) {
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   public ay(Object var1, Object var2, int var3, byte[] var4) {
      this.c = var3;
      this.b = var1;
      this.a = var2;
   }

   public ay(Object var1, Object var2, int var3, char[] var4) {
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   public final void run() {
      int var4 = this.c;
      byte var2 = 0;
      byte var3 = 0;
      int var1 = 0;
      Object var7;
      Object var8;
      int var26;
      int var27;
      mn var36;
      View var39;
      switch(var4) {
      case 0:
         var8 = this.a;
         var7 = this.b;
         var8.getClass();
         ((bc)var8).b();
         if (cp.S(2)) {
            StringBuilder var52 = new StringBuilder();
            var52.append("Transition for operation ");
            var52.append(var7);
            var52.append(" has completed");
         }

         return;
      case 1:
         var8 = this.b;
         Rect var50 = (Rect)this.a;
         de.s((View)var8, var50);
         return;
      case 2:
         var8 = this.b;
         var7 = this.a;
         var7.getClass();
         if (((List)var8).contains(var7)) {
            ((List)var8).remove(var7);
            dl.f((dk)var7);
         }

         return;
      case 3:
         var8 = this.b;
         var7 = this.a;
         if (((dl)var8).b.contains(var7)) {
            dk var48 = (dk)var7;
            var1 = var48.f;
            var39 = var48.a.O;
            var39.getClass();
            do.r(var1, var39);
         }

         return;
      case 4:
         var8 = this.b;
         var7 = this.a;
         dl var49 = (dl)var8;
         var49.b.remove(var7);
         var49.c.remove(var7);
         return;
      case 5:
         var7 = this.a;
         var8 = this.b;

         try {
            ((Runnable)var8).run();
         } finally {
            ((ek)var7).a();
         }

         return;
      case 6:
         var8 = this.b;
         var26 = ((List)var8).size();

         for(var1 = var3; var1 < var26; ++var1) {
            lex var35 = (lex)((List)var8).get(var1);
            Object var31 = this.a;
            var36 = var35.a;
            int var5 = var35.b;
            var4 = var35.c;
            int var6 = var35.d;
            var27 = var35.e;
            View var41 = var36.a;
            var5 = var6 - var5;
            var27 -= var4;
            if (var5 != 0) {
               var41.animate().translationX(0.0F);
            }

            if (var27 != 0) {
               var41.animate().translationY(0.0F);
            }

            ViewPropertyAnimator var37 = var41.animate();
            kc var47 = (kc)var31;
            var47.e.add(var36);
            var37.setDuration(((lu)var31).j).setListener(new jy(var47, var36, var5, var41, var27, var37)).start();
         }

         ((ArrayList)this.b).clear();
         ((kc)this.a).b.remove(this.b);
         return;
      case 7:
         Object var33 = this.b;
         var27 = ((List)var33).size();

         for(var1 = var2; var1 < var27; ++var1) {
            kb var29 = (kb)((List)var33).get(var1);
            Object var38 = this.a;
            var36 = var29.a;
            View var43 = null;
            if (var36 == null) {
               var39 = null;
            } else {
               var39 = var36.a;
            }

            mn var44 = var29.b;
            if (var44 != null) {
               var43 = var44.a;
            }

            ViewPropertyAnimator var46;
            if (var39 != null) {
               var46 = var39.animate().setDuration(((lu)var38).k);
               kc var13 = (kc)var38;
               var13.g.add(var29.a);
               var46.translationX((float)(var29.e - var29.c));
               var46.translationY((float)(var29.f - var29.d));
               var46.alpha(0.0F).setListener(new jz(var13, var29, var46, var39)).start();
            }

            if (var43 != null) {
               var46 = var43.animate();
               kc var45 = (kc)var38;
               var45.g.add(var29.b);
               var46.translationX(0.0F).translationY(0.0F).setDuration(((lu)var38).k).alpha(1.0F).setListener(new ka(var45, var29, var46, var43)).start();
            }
         }

         ((ArrayList)this.b).clear();
         ((kc)this.a).c.remove(this.b);
         return;
      case 8:
         var7 = this.b;

         for(var26 = ((List)var7).size(); var1 < var26; ++var1) {
            mn var42 = (mn)((List)var7).get(var1);
            Object var12 = this.a;
            View var9 = var42.a;
            ViewPropertyAnimator var11 = var9.animate();
            kc var10 = (kc)var12;
            var10.d.add(var42);
            var11.alpha(1.0F).setDuration(((lu)var12).h).setListener(new jx(var10, var42, var9, var11)).start();
         }

         ((ArrayList)this.b).clear();
         ((kc)this.a).a.remove(this.b);
         return;
      case 9:
         var7 = this.b;
         Typeface var40 = (Typeface)this.a;
         ((cdc)var7).b(var40);
         return;
      case 10:
         var8 = this.b;
         var7 = this.a;
         var8 = ((dmx)var8).a;
         if (var8 != null) {
            ((cdc)var8).b((Typeface)var7);
         }

         return;
      case 11:
         ((cew)this.a).accept(this.b);
         return;
      case 12:
         var8 = this.b;
         var7 = this.a;
         String var34 = "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(var8));
         Throwable var30 = (Throwable)var7;
         Log.e("FragmentStrictMode", var34, var30);
         throw var30;
      case 13:
         var8 = this.a;
         var7 = this.b;
         coc var32 = (coc)var8;
         if (var32.f()) {
            var32.c();
         } else {
            var32.b(var7);
         }

         var32.f = 3;
         return;
      case 14:
         var8 = this.b;
         var7 = this.a;

         try {
            ((Runnable)var8).run();
         } finally {
            ((dgl)var7).a();
         }

         return;
      case 15:
         var8 = this.a;
         var7 = this.b;
         cxo.$r8$lambda$WjtW78xCkGS4No8I4mnvJzPELrA((cxo)var8, (cxw)var7);
         return;
      case 16:
         var8 = this.b;
         var7 = this.a;
         ((czn)var8).b.accept(var7);
         return;
      case 17:
         var8 = this.a;
         deq var28 = (deq)this.b;
         ((dbe)var8).a(var28, false);
         return;
      case 18:
         var8 = this.a;
         var7 = this.b;
         if (((dbx)var8).g.isCancelled()) {
            ((psd)var7).cancel(true);
         }

         return;
      case 19:
         if (((dbx)this.a).g.isCancelled()) {
            return;
         } else {
            try {
               ((psd)this.b).get();
               dae.a();
               var7 = this.a;
               ((dbx)var7).g.f(((dbx)var7).d.a());
               return;
            } catch (Throwable var23) {
               ((dbx)this.a).g.e(var23);
               return;
            }
         }
      default:
         dae.a();
         var1 = dby.d;
         dfb var53 = (dfb)this.b;
         String var51 = var53.a;
         ((dby)this.a).a.c(var53);
      }
   }
}
