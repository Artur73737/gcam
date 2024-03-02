import androidx.compose.foundation.gestures.DraggableElement;
import java.util.Collection;
import java.util.Map;

public final class apk extends qwq implements qvy {
   final Map a;
   final apu b;
   final aez c;
   final qvx d;
   final lmk e;

   public apk(Map var1, apu var2, aez var3, lmk var4, qvx var5) {
      super(3);
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.e = var4;
      this.d = var5;
   }

   // $FF: synthetic method
   public final Object a(Object var1, Object var2, Object var3) {
      bbb var11 = (bbb)var1;
      asm var6 = (asm)var2;
      ((Number)var3).intValue();
      var11.getClass();
      var6.u(43594985);
      if (this.a.isEmpty()) {
         throw new IllegalArgumentException("You must have at least one anchor.");
      } else {
         Collection var12 = this.a.values();
         var12.getClass();
         if (pwm.aD(pwm.aF(var12)).size() == this.a.size()) {
            bxr var13 = (bxr)var6.e(bpi.b);
            apu var14 = this.b;
            Map var16 = this.a;
            if (var14.g().isEmpty()) {
               Float var19 = la.d(var16, var14.c());
               if (var19 == null) {
                  throw new IllegalArgumentException("The initial value must have an associated anchor.");
               }

               var14.k.i(var19);
               var14.m.i(var19);
            }

            boolean var4;
            bay var7;
            aeq var8;
            aez var9;
            lmk var22;
            label23: {
               Map var15 = this.a;
               apu var21 = this.b;
               atj.d(var15, var21, new aph(var21, var15, var13, this.d, (que)null), var6);
               var7 = bbb.d;
               var4 = this.b.k();
               apu var10 = this.b;
               var8 = var10.j;
               var9 = this.c;
               var22 = this.e;
               var6.u(1157296644);
               boolean var5 = var6.B(var10);
               var2 = var6.f();
               if (!var5) {
                  var1 = var2;
                  if (var2 != asl.a) {
                     break label23;
                  }
               }

               var1 = new apj(var10, (que)null);
               var6.w(var1);
            }

            var6.n();
            qvy var17 = (qvy)var1;
            aed var18 = new aed((que)null);
            var7.getClass();
            var8.getClass();
            var17.getClass();
            DraggableElement var20 = new DraggableElement(var8, aal.e, var9, var22, new aee(var4), var18, new aef(var17, var9, (que)null));
            var6.n();
            return var20;
         } else {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
         }
      }
   }
}
