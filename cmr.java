@qus(
   b = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1",
   c = "RepeatOnLifecycle.kt",
   d = "invokeSuspend",
   e = {166}
)
final class cmr extends quw implements qvx {
   Object a;
   Object b;
   int c;
   final clx d;
   final clw e;
   final qzv f;
   final qvx g;

   public cmr(clx var1, clw var2, qzv var3, qvx var4, que var5) {
      super(2, var5);
      this.d = var1;
      this.e = var2;
      this.f = var3;
      this.g = var4;
   }

   public final Object b(Object var1) {
      Object var3;
      Object var60;
      label661: {
         qul var4 = qul.a;
         qwz var2;
         switch(this.c) {
         case 0:
            pwm.bs(var1);
            if (this.d.b == clw.a) {
               return qsn.a;
            }

            var2 = new qwz();
            var3 = new qwz();

            label653: {
               Throwable var10000;
               label652: {
                  qza var5;
                  clx var6;
                  qvx var7;
                  qzv var8;
                  clw var9;
                  boolean var10001;
                  clv var56;
                  label651: {
                     label650: {
                        label649: {
                           label648: {
                              try {
                                 var9 = this.e;
                                 var6 = this.d;
                                 var8 = this.f;
                                 var7 = this.g;
                                 this.a = var2;
                                 this.b = var3;
                                 this.c = 1;
                                 var5 = new qza(quy.h(this), 1);
                                 var5.r();
                                 clu var55 = clv.Companion;
                                 var9.getClass();
                                 switch(var9.ordinal()) {
                                 case 2:
                                    break label650;
                                 case 3:
                                    break label649;
                                 case 4:
                                    break label648;
                                 }
                              } catch (Throwable var54) {
                                 var10000 = var54;
                                 var10001 = false;
                                 break label652;
                              }

                              var56 = null;
                              break label651;
                           }

                           try {
                              var56 = clv.ON_RESUME;
                              break label651;
                           } catch (Throwable var53) {
                              var10000 = var53;
                              var10001 = false;
                              break label652;
                           }
                        }

                        try {
                           var56 = clv.ON_START;
                           break label651;
                        } catch (Throwable var52) {
                           var10000 = var52;
                           var10001 = false;
                           break label652;
                        }
                     }

                     try {
                        var56 = clv.ON_CREATE;
                     } catch (Throwable var51) {
                        var10000 = var51;
                        var10001 = false;
                        break label652;
                     }
                  }

                  label628:
                  try {
                     clv var10 = clu.a(var9);
                     rjo var11 = rjp.a();
                     cmq var63 = new cmq(var56, var2, var8, var10, var5, var11, var7);
                     ((qwz)var3).a = var63;
                     var1 = ((qwz)var3).a;
                     var1.getClass();
                     var6.a((cma)var1);
                     var1 = var5.c();
                     break label653;
                  } catch (Throwable var50) {
                     var10000 = var50;
                     var10001 = false;
                     break label628;
                  }
               }

               var1 = var10000;
               var60 = var2;
               break label661;
            }

            if (var1 == var4) {
               return var4;
            }
            break;
         default:
            Object var57 = this.b;
            var3 = this.a;
            boolean var18 = false;

            try {
               var18 = true;
               pwm.bs(var1);
               var18 = false;
            } finally {
               if (var18) {
                  var60 = var3;
                  var3 = var57;
                  break label661;
               }
            }

         }

         rbd var61 = (rbd)((qwz)var2).a;
         if (var61 != null) {
            qxb.r(var61);
         }

         cma var62 = (cma)((qwz)var3).a;
         if (var62 != null) {
            this.d.c(var62);
         }

         return qsn.a;
      }

      rbd var58 = (rbd)((qwz)var60).a;
      if (var58 != null) {
         qxb.r(var58);
      }

      cma var59 = (cma)((qwz)var3).a;
      if (var59 != null) {
         this.d.c(var59);
      }

      throw var1;
   }

   public final que c(Object var1, que var2) {
      return new cmr(this.d, this.e, this.f, this.g, var2);
   }
}
