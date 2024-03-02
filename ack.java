import android.graphics.Typeface;
import android.text.Spannable;

public final class ack extends qwq implements qvy {
   final Object a;
   final Object b;
   private final int c;

   public ack(Object var1, Object var2, int var3) {
      super(3);
      this.c = var3;
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2, Object var3) {
      switch(this.c) {
      case 0:
         bbb var18 = (bbb)var1;
         asm var8 = (asm)var2;
         ((Number)var3).intValue();
         var18.getClass();
         var8.u(-353972293);
         var2 = this.a;
         var1 = var2;
         if (var2 == null) {
            var1 = acr.a;
         }

         acj var14 = ((aci)var1).a((lmk)this.b, var8);
         var8.u(1157296644);
         boolean var7 = var8.B(var14);
         var1 = var8.f();
         if (var7 || var1 == asl.a) {
            var1 = new acm(var14);
            var8.w(var1);
         }

         var8.n();
         acm var19 = (acm)var1;
         var8.n();
         return var19;
      case 1:
         aae var11 = (aae)var1;
         asm var13 = (asm)var2;
         ((Number)var3).intValue();
         var11.getClass();
         var13.u(470495494);
         yi var12;
         if (var11.a(ya.a, ya.b)) {
            var12 = ((yg)this.a).b.a;
            if (var12 != null) {
               var1 = var12.a;
            } else {
               var1 = yd.a;
            }
         } else if (var11.a(ya.b, ya.c)) {
            var12 = ((yh)this.b).b.a;
            if (var12 != null) {
               var1 = var12.a;
            } else {
               var1 = yd.a;
            }
         } else {
            var1 = yd.a;
         }

         var13.n();
         return var1;
      default:
         bsn var21 = (bsn)var1;
         int var6 = ((Number)var2).intValue();
         int var5 = ((Number)var3).intValue();
         var21.getClass();
         Object var10 = this.a;
         Object var9 = this.b;
         buq var15 = var21.f;
         bvc var16 = var21.c;
         bvc var20 = var16;
         if (var16 == null) {
            var20 = bvc.l;
         }

         buy var17 = var21.d;
         int var4;
         if (var17 != null) {
            var4 = var17.a;
         } else {
            var4 = 0;
         }

         ((Spannable)var10).setSpan(new bty((Typeface)((qvz)var9).d(var15, var20, buy.a(var4), buz.a())), var6, var5, 33);
         return qsn.a;
      }
   }
}
