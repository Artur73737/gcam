@qus(
   b = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1",
   c = "TapGestureDetector.kt",
   d = "invokeSuspend",
   e = {100, 114, 129, 141, 156, 178}
)
final class agy extends quv implements qvx {
   Object a;
   Object b;
   Object c;
   long d;
   int e;
   final qzv f;
   final qvy g;
   final qvt h;
   final afd i;
   private Object j;

   public agy(qzv var1, qvy var2, qvt var3, afd var4, que var5) {
      super(var5);
      this.f = var1;
      this.g = var2;
      this.h = var3;
      this.i = var4;
   }

   public final Object b(Object var1) {
      label155: {
         label124: {
            label141: {
               qul var8;
               qwz var16;
               bij var19;
               label119: {
                  long var2;
                  label135: {
                     Object var23;
                     Object var24;
                     label132: {
                        var8 = qul.a;
                        bhw var4;
                        qwz var5;
                        bhw var6;
                        Object var7;
                        bij var18;
                        bij var21;
                        Object var22;
                        switch(this.e) {
                        case 0:
                           pwm.bs(var1);
                           var18 = (bij)this.j;
                           this.j = var18;
                           this.e = 1;
                           var22 = ahb.d(var18, this, 3);
                           if (var22 == var8) {
                              return var8;
                           }
                           break;
                        case 1:
                           var21 = (bij)this.j;
                           pwm.bs(var1);
                           var22 = var1;
                           var18 = var21;
                           break;
                        case 2:
                           var2 = this.d;
                           var7 = this.c;
                           var5 = (qwz)this.b;
                           var4 = (bhw)this.a;
                           var19 = (bij)this.j;

                           try {
                              pwm.bs(var1);
                           } catch (bhm var15) {
                              var1 = var5;
                              break label135;
                           }

                           var24 = var1;
                           var1 = var5;
                           var23 = var7;
                           break label132;
                        case 3:
                           qwz var20 = (qwz)this.a;
                           var21 = (bij)this.j;
                           pwm.bs(var1);
                           var1 = var20;
                           break label141;
                        case 4:
                           var2 = this.d;
                           var5 = (qwz)this.a;
                           var19 = (bij)this.j;
                           pwm.bs(var1);
                           var6 = (bhw)var1;
                           if (var6 == null) {
                              this.h.eo(bci.i(((bhw)var5.a).c));
                              return qsn.a;
                           }

                           qwo.o(this.f, (qui)null, 0, new agt(this.i, (que)null), 3);
                           if (this.g != ahb.a) {
                              qwo.o(this.f, (qui)null, 0, new agu(this.g, this.i, var6, (que)null), 3);
                           }

                           try {
                              agx var17 = new agx(this.f, this.h, var5, this.i, (que)null);
                              this.j = var19;
                              this.a = var5;
                              this.b = var6;
                              this.e = 5;
                              var1 = var19.m(var2, var17, this);
                           } catch (bhm var9) {
                              var16 = var5;
                              break label119;
                           }

                           if (var1 == var8) {
                              return var8;
                           }

                           return qsn.a;
                        case 5:
                           var4 = (bhw)this.b;
                           var5 = (qwz)this.a;
                           var19 = (bij)this.j;

                           try {
                              pwm.bs(var1);
                              return qsn.a;
                           } catch (bhm var10) {
                              var16 = var5;
                              break label119;
                           }
                        default:
                           pwm.bs(var1);
                           break label155;
                        }

                        var6 = (bhw)var22;
                        var6.b();
                        qwo.o(this.f, (qui)null, 0, new agn(this.i, (que)null), 3);
                        if (this.g != ahb.a) {
                           qwo.o(this.f, (qui)null, 0, new ago(this.g, this.i, var6, (que)null), 3);
                        }

                        var23 = new qwz();
                        var2 = 4611686018427387903L;

                        try {
                           agp var25 = new agp((que)null);
                           this.j = var18;
                           this.a = var6;
                           this.b = var23;
                           this.c = var23;
                           this.d = 4611686018427387903L;
                           this.e = 2;
                           var7 = var18.m(4611686018427387903L, var25, this);
                        } catch (bhm var14) {
                           var2 = 4611686018427387903L;
                           var19 = var18;
                           var1 = var23;
                           break label135;
                        }

                        if (var7 == var8) {
                           return var8;
                        }

                        var19 = var18;
                        var1 = var23;
                        var24 = var7;
                     }

                     boolean var10001;
                     try {
                        ((qwz)var23).a = var24;
                        var23 = ((qwz)var1).a;
                     } catch (bhm var13) {
                        var10001 = false;
                        break label135;
                     }

                     qzv var26;
                     if (var23 == null) {
                        try {
                           var26 = this.f;
                           agq var27 = new agq(this.i, (que)null);
                           qwo.o(var26, (qui)null, 0, var27, 3);
                           break label124;
                        } catch (bhm var11) {
                           var10001 = false;
                        }
                     } else {
                        try {
                           ((bhw)var23).b();
                           var26 = this.f;
                           agr var28 = new agr(this.i, (que)null);
                           qwo.o(var26, (qui)null, 0, var28, 3);
                           break label124;
                        } catch (bhm var12) {
                           var10001 = false;
                        }
                     }
                  }

                  this.j = var19;
                  this.a = var1;
                  this.b = null;
                  this.c = null;
                  this.d = var2;
                  this.e = 3;
                  if (ahb.a(var19, this) == var8) {
                     return var8;
                  }
                  break label141;
               }

               this.h.eo(bci.i(((bhw)var16.a).c));
               this.j = null;
               this.a = null;
               this.b = null;
               this.e = 6;
               if (ahb.a(var19, this) == var8) {
                  return var8;
               }
               break label155;
            }

            qwo.o(this.f, (qui)null, 0, new ags(this.i, (que)null), 3);
         }

         var1 = ((qwz)var1).a;
         if (var1 != null) {
            this.h.eo(bci.i(((bhw)var1).c));
         }

         return qsn.a;
      }

      qwo.o(this.f, (qui)null, 0, new agm(this.i, (que)null), 3);
      return qsn.a;
   }

   public final que c(Object var1, que var2) {
      agy var3 = new agy(this.f, this.g, this.h, this.i, var2);
      var3.j = var1;
      return var3;
   }
}
