@qus(
   b = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1",
   c = "Share.kt",
   d = "invokeSuspend",
   e = {214, 218, 219, 225}
)
public final class rfe extends quw implements qvx {
   int a;
   final rfq b;
   final ree c;
   final rfg d;
   final Object e;

   public rfe(rfq var1, ree var2, rfg var3, Object var4, que var5) {
      super(2, var5);
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
   }

   public final Object b(Object var1) {
      qul var6 = qul.a;
      switch(this.a) {
      case 0:
         pwm.bs(var1);
         rfq var8 = this.b;
         ree var14;
         if (var8 == rfp.a) {
            var14 = this.c;
            rfg var12 = this.d;
            this.a = 1;
            if (var14.gY(var12, this) == var6) {
               return var6;
            }

            return qsn.a;
         }

         if (var8 != rfp.b) {
            var14 = rel.a(var8.a(this.d.gZ()));
            rfd var11 = new rfd(this.c, this.d, this.e, (que)null);
            this.a = 4;
            var1 = rex.a(var14, new rew(var11, (que)null));
            boolean var4 = qzx.a;
            rgl var7 = (rgl)var1;
            qui var15 = var7.a;
            int var3 = var7.b;
            int var2;
            if (var3 == -3) {
               var2 = 0;
            } else if (var3 == -2) {
               var2 = 0;
            } else {
               var2 = var3;
               if (var3 < 0) {
                  var2 = Integer.MAX_VALUE;
               }
            }

            if (!c.E(var15, var15) || var2 != var7.b) {
               var1 = var7.d(var15, var2);
            }

            Object var16 = qwl.q((ree)var1, this);
            var1 = var16;
            if (var16 != qul.a) {
               var1 = qsn.a;
            }

            if (var1 == var6) {
               return var6;
            }

            return qsn.a;
         }

         rfy var5 = this.d.gZ();
         rfc var9 = new rfc((que)null);
         this.a = 2;
         if (qwl.j(var5, var9, this) == var6) {
            return var6;
         }
         break;
      case 1:
      case 3:
      default:
         pwm.bs(var1);
         return qsn.a;
      case 2:
         pwm.bs(var1);
      }

      ree var10 = this.c;
      rfg var13 = this.d;
      this.a = 3;
      if (var10.gY(var13, this) != var6) {
         return qsn.a;
      } else {
         return var6;
      }
   }

   public final que c(Object var1, que var2) {
      return new rfe(this.b, this.c, this.d, this.e, var2);
   }
}
