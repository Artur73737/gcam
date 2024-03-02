import java.util.List;

final class anq implements ref {
   final List a;
   final qwz b;
   final qwz c;
   final yt d;
   final qzv e;
   final qwz f;

   public anq(List var1, qwz var2, qwz var3, yt var4, qzv var5, qwz var6) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public final Object b(ahp var1, que var2) {
      ano var10;
      label77: {
         if (var2 instanceof ano) {
            ano var5 = (ano)var2;
            int var4 = var5.d;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var5.d = var4 + Integer.MIN_VALUE;
               var10 = var5;
               break label77;
            }
         }

         var10 = new ano(this, var2);
      }

      Object var7 = var10.b;
      qul var6 = qul.a;
      float var3;
      ahp var11;
      anq var12;
      switch(var10.d) {
      case 0:
         pwm.bs(var7);
         if (var1 instanceof ahm) {
            this.a.add(var1);
         } else if (var1 instanceof ahn) {
            this.a.remove(((ahn)var1).a);
         } else if (var1 instanceof ahj) {
            this.a.add(var1);
         } else if (var1 instanceof ahk) {
            this.a.remove(((ahk)var1).a);
         } else if (var1 instanceof ahr) {
            this.a.add(var1);
         } else if (var1 instanceof ahs) {
            this.a.remove(((ahs)var1).a);
         } else if (var1 instanceof ahq) {
            this.a.remove(((ahq)var1).a);
         }

         ahp var13 = (ahp)pwm.ay(this.a);
         if (var13 instanceof ahr) {
            var3 = 12.0F;
         } else if (!(var13 instanceof ahm) && !(var13 instanceof ahj)) {
            var3 = 6.0F;
         } else {
            var3 = 8.0F;
         }

         Object var8 = this.b.a;
         if (var8 != null && bxt.c(((bxt)var8).a, var3)) {
            return qsn.a;
         }

         this.b.a = bxt.a(var3);
         rbd var9 = (rbd)this.c.a;
         if (var9 != null) {
            var10.e = this;
            var10.f = var13;
            var10.a = var3;
            var10.d = 1;
            if (qzy.p(var9, var10) == var6) {
               return var6;
            }
         }

         var11 = var13;
         var12 = this;
         break;
      case 1:
         var3 = var10.a;
         var1 = var10.f;
         var12 = var10.e;
         pwm.bs(var7);
         var11 = var1;
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      if (!bxt.c(((bxt)var12.d.c()).a, var3)) {
         var12.c.a = qwo.o(var12.e, (qui)null, 0, new anp(var12.d, var3, var12.f, var11, (que)null), 3);
      }

      return qsn.a;
   }
}
