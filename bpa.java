import android.view.Choreographer;

public final class bpa implements atr {
   public final Object a;
   private final int b;
   private final Object c;

   public bpa(Choreographer var1, boy var2, int var3) {
      this.b = var3;
      this.a = var1;
      this.c = var2;
   }

   public bpa(atr var1, int var2) {
      this.b = var2;
      this.c = var1;
      this.a = new atn();
   }

   public final Object a(qvt var1, que var2) {
      Object var15;
      qza var16;
      switch(this.b) {
      case 0:
         Object var4 = this.c;
         var16 = new qza(quy.h(var2), 1);
         var16.r();
         boz var5 = new boz(var16, var1);
         boy var14 = (boy)var4;
         if (c.E(var14.c, this.a)) {
            var15 = var14.e;
            synchronized(var15){}

            try {
               ((boy)var4).f.add(var5);
               if (!((boy)var4).h) {
                  ((boy)var4).h = true;
                  ((boy)var4).c.postFrameCallback(((boy)var4).i);
               }
            } finally {
               ;
            }

            var16.s(new bos(var4, var5, 2, (byte[])null));
         } else {
            ((Choreographer)this.a).postFrameCallback(var5);
            var16.s(new bos(this, var5, 3, (byte[])null));
         }

         var15 = var16.c();
         qul var17 = qul.a;
         return var15;
      default:
         auc var20;
         label205: {
            if (var2 instanceof auc) {
               var20 = (auc)var2;
               int var3 = var20.b;
               if ((var3 & Integer.MIN_VALUE) != 0) {
                  var20.b = var3 + Integer.MIN_VALUE;
                  break label205;
               }
            }

            var20 = new auc(this, var2);
         }

         Object var18 = var20.a;
         qul var6 = qul.a;
         bpa var19;
         switch(var20.b) {
         case 0:
            pwm.bs(var18);
            Object var22 = this.a;
            var20.e = this;
            var20.c = var1;
            var20.b = 1;
            atn var7 = (atn)var22;
            if (var7.a()) {
               var18 = qsn.a;
            } else {
               var16 = new qza(quy.h(var20), 1);
               var16.r();
               Object var23 = var7.a;
               synchronized(var23){}

               try {
                  ((atn)var22).b.add(var16);
               } finally {
                  ;
               }

               var16.s(new zy(var22, var16, 13));
               var22 = var16.c();
               var18 = var22;
               if (var22 != qul.a) {
                  var18 = qsn.a;
               }
            }

            if (var18 == var6) {
               return var6;
            }

            var19 = this;
            break;
         case 1:
            var1 = var20.c;
            bpa var21 = var20.e;
            pwm.bs(var18);
            var19 = var21;
            break;
         case 2:
            pwm.bs(var18);
            var15 = var18;
            return var15;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         var18 = var19.c;
         var20.e = null;
         var20.c = null;
         var20.b = 2;
         var18 = ((atr)var18).a(var1, var20);
         var15 = var18;
         if (var18 != var6) {
            return var15;
         } else {
            return var6;
         }
      }
   }

   public final Object fold(Object var1, qvx var2) {
      switch(this.b) {
      case 0:
         return quy.i(this, var1, var2);
      default:
         return quy.i(this, var1, var2);
      }
   }

   public final qug get(quh var1) {
      switch(this.b) {
      case 0:
         return nd.c(this, var1);
      default:
         return nd.c(this, var1);
      }
   }

   // $FF: synthetic method
   public final quh getKey() {
      switch(this.b) {
      case 0:
         return atr.d;
      default:
         return atr.d;
      }
   }

   public final qui minusKey(quh var1) {
      switch(this.b) {
      case 0:
         return nd.d(this, var1);
      default:
         return nd.d(this, var1);
      }
   }

   public final qui plus(qui var1) {
      switch(this.b) {
      case 0:
         return nd.e(this, var1);
      default:
         return nd.e(this, var1);
      }
   }
}
