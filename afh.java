import android.view.View;
import android.view.ViewParent;
import java.util.Map;
import java.util.Set;

public final class afh extends qwq implements qvx {
   final Object a;
   final Object b;
   private final int c;

   public afh(Object var1, Object var2, int var3) {
      super(2);
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   public afh(Object var1, Object var2, int var3, byte[] var4) {
      super(2);
      this.c = var3;
      this.b = var1;
      this.a = var2;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2) {
      int var6 = this.c;
      boolean var7 = true;
      int var5 = 0;
      Integer var11 = 0;
      boolean var8;
      long var9;
      Object var12;
      asm var15;
      Object var36;
      switch(var6) {
      case 0:
         float var3 = ((Number)var1).floatValue();
         ((Number)var2).floatValue();
         qww var30 = (qww)this.a;
         float var4 = var30.a;
         var30.a = var4 + ((afj)this.b).a(var3 - var4);
         return qsn.a;
      case 1:
         bhw var29 = (bhw)var1;
         var9 = ((bci)var2).d;
         var29.getClass();
         bio.b((bin)this.b, var29);
         var29.b();
         ((qwy)this.a).a = var9;
         return qsn.a;
      case 2:
         var15 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var15.G()) {
            var15.q();
         } else {
            aji var24;
            label160: {
               var2 = ((qvi)((ve)this.a).c).a();
               var6 = ((akk)this.b).b;
               var24 = (aji)var2;
               if (var6 < var24.b()) {
                  var5 = var6;
                  if (c.E(var24.c(var6), ((akk)this.b).a)) {
                     break label160;
                  }
               }

               var36 = ((akk)this.b).a;
               var6 = var24.a(var36);
               var5 = var6;
               if (var6 != -1) {
                  ((akk)this.b).b = var6;
                  var5 = var6;
               }
            }

            if (var5 == -1) {
               var7 = false;
            }

            var12 = this.a;
            var36 = this.b;
            var15.I(var7);
            var8 = var15.C(var7);
            if (var7) {
               iy.c(var24, ((ve)var12).a, var5, ((akk)var36).a, var15, 0);
            } else {
               var15.k(var8);
            }

            var15.o();
            var2 = this.b;
            atj.c(((akk)var2).a, new aiz(var2, 3), var15);
         }

         return qsn.a;
      case 3:
         bkk var27 = (bkk)var1;
         var9 = ((bxq)var2).b;
         var27.getClass();
         akq var28 = new akq((ve)this.b, var27);
         return (bju)((qvx)this.a).a(var28, bxq.e(var9));
      case 4:
         var15 = (asm)var1;
         ((Number)var2).intValue();
         var15.u(-948105361);
         var12 = this.a;
         var2 = this.b;
         var2.getClass();
         var15.u(-300354947);
         ayu var34 = ayv.c.j();
         ouk[] var35 = (ouk[])var12;

         for(var6 = var35.length; var5 < var6; ++var5) {
            ouk var14 = var35[var5];
            var15.u(680845765);
            if (var14.a || !li.c((aue)var2, (asy)var14.b)) {
               Object var13 = var14.b;
               Object var38 = var14.c;
               var34.put(var13, ((asy)var13).a(var38, var15));
            }

            var15.n();
         }

         ayv var23 = var34.h();
         var15.n();
         var15.n();
         return var23;
      case 5:
         var15 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var15.G()) {
            var15.q();
         } else {
            ((qvz)this.a).d(((bgl)this.b).g.d, ((bgl)this.b).g.e, var15, var11);
         }

         return qsn.a;
      case 6:
         var15 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var15.G()) {
            var15.q();
         } else {
            gh.e((bgi)this.b, (Map)this.a, var15, 64, 0);
         }

         return qsn.a;
      case 7:
         var15 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var15.G()) {
            var15.q();
         } else {
            var7 = ((bjk)this.b).b();
            var2 = this.a;
            var15.I(var7);
            var8 = var15.C(var7);
            if (var7) {
               ((qvx)var2).a(var15, var11);
            } else {
               var15.k(var8);
            }

            var15.o();
         }

         return qsn.a;
      case 8:
         var15 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var15.G()) {
            var15.q();
         } else {
            bou.a(((bqu)this.b).a, (qvx)this.a, var15, 8);
         }

         return qsn.a;
      case 9:
         asm var33 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var33.G()) {
            var33.q();
         } else {
            var1 = ((bqu)this.b).a.getTag(2131427781);
            Set var19;
            if (qxb.d(var1)) {
               var19 = (Set)var1;
            } else {
               var19 = null;
            }

            Set var17 = var19;
            if (var19 == null) {
               ViewParent var18 = ((bqu)this.b).a.getParent();
               View var20;
               if (var18 instanceof View) {
                  var20 = (View)var18;
               } else {
                  var20 = null;
               }

               if (var20 != null) {
                  var1 = var20.getTag(2131427781);
               } else {
                  var1 = null;
               }

               if (qxb.d(var1)) {
                  var17 = (Set)var1;
               } else {
                  var17 = null;
               }
            }

            if (var17 != null) {
               var17.add(var33.d());
               var33.i();
            }

            bqu var21 = (bqu)this.b;
            atj.e(var21.a, new bqt(var21, (que)null), var33);
            ouk var22 = bap.a.b(var17);
            ayt var25 = sr.t(var33, -1193460702, new afh(this.b, this.a, 8, (byte[])null));
            li.g(new ouk[]{var22}, var25, var33, 56);
         }

         return qsn.a;
      case 10:
         var15 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var15.G()) {
            var15.q();
         } else {
            var2 = this.b;
            String var32 = (String)this.a;
            bxl.a((String)var2, var32, var15);
         }

         return qsn.a;
      case 11:
         var15 = (asm)var1;
         if ((((Number)var2).intValue() & 11) == 2 && var15.G()) {
            var15.q();
         } else {
            qvx var16 = bxm.a;
            kf.e(bxm.a, new us(this.b, this.a, 14, (byte[])null), (bbb)null, (lmk)null, (bdr)null, 0L, 0L, (kf)null, var15, 6);
         }

         return qsn.a;
      default:
         qsn var37 = (qsn)var1;
         qug var31 = (qug)var2;
         var37.getClass();
         var31.getClass();
         var36 = this.a;
         qwx var26 = (qwx)this.b;
         var5 = var26.a++;
         ((qui[])var36)[var5] = var31;
         return qsn.a;
      }
   }
}
