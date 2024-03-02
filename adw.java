import java.util.List;

@qus(
   b = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2",
   c = "DragGestureDetector.kt",
   d = "invokeSuspend",
   e = {819, 836}
)
final class adw extends quv implements qvx {
   Object a;
   int b;
   int c;
   final qwz d;
   final qwz e;
   private Object f;

   public adw(qwz var1, qwz var2, que var3) {
      super(var3);
      this.d = var1;
      this.e = var2;
   }

   public final Object b(Object var1) {
      qul var8 = qul.a;
      int var2;
      int var3;
      int var4;
      int var5;
      long var6;
      adw var9;
      Object var10;
      bij var11;
      bhl var12;
      List var13;
      qul var14;
      bij var16;
      List var17;
      qul var19;
      Object var20;
      qwz var21;
      bhl var22;
      List var23;
      qwz var25;
      bhw var27;
      switch(this.c) {
      case 0:
         pwm.bs(var1);
         bij var18 = (bij)this.f;
         var9 = this;
         var2 = 0;
         var14 = var8;
         var16 = var18;
         if (var2 != 0) {
            return qsn.a;
         }

         this.f = var18;
         this.a = null;
         this.b = 0;
         this.c = 1;
         var20 = var18.p(2, this);
         var19 = var8;
         if (var20 == var8) {
            return var19;
         }

         var12 = (bhl)var20;
         var17 = var12.a;
         var4 = var17.size();
         var3 = 0;
         break;
      case 1:
         var2 = this.b;
         var11 = (bij)this.f;
         pwm.bs(var1);
         var9 = this;
         var14 = var8;
         var16 = var11;
         var12 = (bhl)var1;
         var17 = var12.a;
         var4 = var17.size();
         var3 = 0;
         break;
      default:
         var3 = this.b;
         Object var24 = this.a;
         var11 = (bij)this.f;
         pwm.bs(var1);
         var9 = this;
         var14 = var8;
         var16 = var11;
         var17 = ((bhl)var1).a;
         var5 = var17.size();
         var4 = 0;

         while(true) {
            var2 = var3;
            if (var4 < var5) {
               if (!((bhw)var17.get(var4)).c()) {
                  ++var4;
                  continue;
               }

               var2 = 1;
            }

            var6 = ((bhw)this.d.a).a;
            var22 = (bhl)var24;
            if (aea.b(var22, var6)) {
               var23 = var22.a;
               var4 = var23.size();
               var3 = 0;

               while(true) {
                  if (var3 >= var4) {
                     var10 = null;
                     break;
                  }

                  var10 = var23.get(var3);
                  if (((bhw)var10).d) {
                     break;
                  }

                  ++var3;
               }

               var27 = (bhw)var10;
               if (var27 != null) {
                  var21 = this.d;
                  var21.a = var27;
                  this.e.a = var21.a;
               } else {
                  var2 = 1;
               }
               break;
            }

            var21 = this.e;
            var13 = var22.a;
            var25 = this.d;
            var4 = var13.size();
            var3 = 0;

            while(true) {
               if (var3 >= var4) {
                  var10 = null;
                  break;
               }

               var10 = var13.get(var3);
               if (c.o(((bhw)var10).a, ((bhw)var25.a).a)) {
                  break;
               }

               ++var3;
            }

            var21.a = var10;
            break;
         }

         if (var2 != 0) {
            return qsn.a;
         }

         this.f = var11;
         this.a = null;
         this.b = 0;
         this.c = 1;
         var20 = var11.p(2, this);
         var19 = var8;
         if (var20 == var8) {
            return var19;
         }

         var12 = (bhl)var20;
         var17 = var12.a;
         var4 = var17.size();
         var3 = 0;
      }

      while(true) {
         while(true) {
            if (var3 < var4) {
               if (iy.n((bhw)var17.get(var3))) {
                  ++var3;
                  continue;
               }

               var17 = var12.a;
               var4 = var17.size();
               var3 = 0;
            } else {
               var2 = 1;
               var17 = var12.a;
               var4 = var17.size();
               var3 = 0;
            }

            while(true) {
               if (var3 < var4) {
                  bhw var26 = (bhw)var17.get(var3);
                  byte var15;
                  if (!var26.c()) {
                     if (iy.p(var26, var16.j(), var16.i())) {
                        var15 = 1;
                        var9.f = var16;
                        var9.a = var12;
                        var9.b = var15;
                        var9.c = 2;
                        var20 = var16.p(3, var9);
                        var19 = var14;
                        if (var20 == var14) {
                           return var19;
                        }

                        var10 = var20;
                        var3 = var15;
                        break;
                     }

                     ++var3;
                     continue;
                  }

                  var15 = 1;
                  var9.f = var16;
                  var9.a = var12;
                  var9.b = var15;
                  var9.c = 2;
                  var20 = var16.p(3, var9);
                  var19 = var14;
                  if (var20 == var14) {
                     return var19;
                  }

                  var10 = var20;
                  var3 = var15;
                  break;
               }

               var9.f = var16;
               var9.a = var12;
               var9.b = var2;
               var9.c = 2;
               var20 = var16.p(3, var9);
               var19 = var14;
               if (var20 == var14) {
                  return var19;
               }

               var10 = var20;
               var3 = var2;
               break;
            }

            var17 = ((bhl)var10).a;
            var5 = var17.size();
            var4 = 0;

            while(true) {
               var2 = var3;
               if (var4 < var5) {
                  if (!((bhw)var17.get(var4)).c()) {
                     ++var4;
                     continue;
                  }

                  var2 = 1;
               }

               var6 = ((bhw)var9.d.a).a;
               var22 = (bhl)var12;
               if (aea.b(var22, var6)) {
                  var23 = var22.a;
                  var4 = var23.size();
                  var3 = 0;

                  while(true) {
                     if (var3 >= var4) {
                        var10 = null;
                        break;
                     }

                     var10 = var23.get(var3);
                     if (((bhw)var10).d) {
                        break;
                     }

                     ++var3;
                  }

                  var27 = (bhw)var10;
                  if (var27 != null) {
                     var21 = var9.d;
                     var21.a = var27;
                     var9.e.a = var21.a;
                  } else {
                     var2 = 1;
                  }
                  break;
               }

               var21 = var9.e;
               var13 = var22.a;
               var25 = var9.d;
               var4 = var13.size();
               var3 = 0;

               while(true) {
                  if (var3 >= var4) {
                     var10 = null;
                     break;
                  }

                  var10 = var13.get(var3);
                  if (c.o(((bhw)var10).a, ((bhw)var25.a).a)) {
                     break;
                  }

                  ++var3;
               }

               var21.a = var10;
               break;
            }

            if (var2 != 0) {
               return qsn.a;
            }

            var9.f = var16;
            var9.a = null;
            var9.b = 0;
            var9.c = 1;
            var20 = var16.p(2, var9);
            var19 = var14;
            if (var20 == var14) {
               return var19;
            }

            var12 = (bhl)var20;
            var17 = var12.a;
            var4 = var17.size();
            var3 = 0;
         }
      }
   }

   public final que c(Object var1, que var2) {
      adw var3 = new adw(this.d, this.e, var2);
      var3.f = var1;
      return var3;
   }
}
