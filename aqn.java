public final class aqn {
   public bci a;
   public final float b;
   public final boolean c;
   public Float d;
   public Float e;
   public bci f;
   public final yt g;
   public final yt h;
   public final yt i;
   public final att j;
   public final att k;
   private final qzg l;

   public aqn(bci var1, float var2, boolean var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.g = yu.a(0.0F);
      this.h = yu.a(0.0F);
      this.i = yu.a(0.0F);
      this.l = qwp.J();
      Boolean var4 = false;
      this.j = sg.d(var4);
      this.k = sg.d(var4);
   }

   public final Object a(que var1) {
      aqg var3;
      label52: {
         if (var1 instanceof aqg) {
            var3 = (aqg)var1;
            int var2 = var3.c;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var3.c = var2 + Integer.MIN_VALUE;
               break label52;
            }
         }

         var3 = new aqg(this, var1);
      }

      qul var5;
      aqn var6;
      Object var7;
      label43: {
         Object var4 = var3.a;
         var5 = qul.a;
         switch(var3.c) {
         case 0:
            pwm.bs(var4);
            var3.d = this;
            var3.c = 1;
            var4 = qzy.g(new aqk(this, (que)null), var3);
            var7 = var4;
            if (var4 != qul.a) {
               var7 = qsn.a;
            }

            if (var7 == var5) {
               return var5;
            }

            var6 = this;
            break;
         case 1:
            var6 = var3.d;
            pwm.bs(var4);
            break;
         case 2:
            var6 = var3.d;
            pwm.bs(var4);
            break label43;
         case 3:
            pwm.bs(var4);
            return qsn.a;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         var6.j.b(true);
         qzg var9 = var6.l;
         var3.d = var6;
         var3.c = 2;
         if (var9.k(var3) == var5) {
            return var5;
         }
      }

      var3.d = null;
      var3.c = 3;
      Object var8 = qzy.g(new aqm(var6, (que)null), var3);
      var7 = var8;
      if (var8 != qul.a) {
         var7 = qsn.a;
      }

      if (var7 == var5) {
         return var5;
      } else {
         return qsn.a;
      }
   }

   public final void b() {
      this.k.b(true);
      this.l.O(qsn.a);
   }
}
