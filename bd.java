import android.transition.Transition;

final class bd extends bc {
   public final Object c;
   public final boolean d;
   public final Object e;

   public bd(dk var1, hei var2, boolean var3, boolean var4) {
      int var5;
      bv var7;
      Object var8;
      br var12;
      Object var13;
      label65: {
         label64: {
            var1.getClass();
            super(var1, var2);
            var5 = var1.f;
            var8 = null;
            Object var9;
            bv var14;
            if (var5 == 2) {
               if (!var3) {
                  var7 = var1.a;
                  break label64;
               }

               var7 = var1.a;
               var12 = var7.R;
               if (var12 == null) {
                  var13 = null;
                  break label65;
               }

               var9 = var12.l;
               var13 = var9;
               if (var9 != bv.e) {
                  break label65;
               }

               var14 = var7;
            } else {
               var7 = var1.a;
               var14 = var7;
               if (var3) {
                  var12 = var7.R;
                  if (var12 == null) {
                     var13 = null;
                     break label65;
                  }

                  var9 = var12.j;
                  var13 = var9;
                  if (var9 != bv.e) {
                     break label65;
                  }
                  break label64;
               }
            }

            var13 = var14.getExitTransition();
            break label65;
         }

         var13 = var7.getEnterTransition();
      }

      this.c = var13;
      boolean var6 = true;
      if (var5 == 2) {
         Boolean var15;
         if (var3) {
            var12 = var1.a.R;
            if (var12 != null) {
               var15 = var12.o;
               if (var15 != null) {
                  var6 = var15;
               }
            }
         } else {
            var12 = var1.a.R;
            if (var12 != null) {
               var15 = var12.p;
               if (var15 != null) {
                  var6 = var15;
               }
            }
         }
      }

      this.d = var6;
      var13 = var8;
      if (var4) {
         label47: {
            var7 = var1.a;
            if (var3) {
               br var10 = var7.R;
               if (var10 == null) {
                  var13 = var8;
                  break label47;
               }

               Object var11 = var10.n;
               var13 = var11;
               if (var11 != bv.e) {
                  break label47;
               }
            }

            var13 = var7.getSharedElementEnterTransition();
         }
      }

      this.e = var13;
   }

   private final de d(Object var1) {
      if (var1 == null) {
         return null;
      } else {
         de var2 = cx.a;
         if (!(var1 instanceof Transition)) {
            var2 = cx.b;
            if (var2 != null && var2.m(var1)) {
               return cx.b;
            } else {
               StringBuilder var3 = new StringBuilder();
               var3.append("Transition ");
               var3.append(var1);
               var3.append(" for fragment ");
               var3.append(super.a.a);
               var3.append(" is not a valid framework Transition or AndroidX Transition");
               throw new IllegalArgumentException(var3.toString());
            }
         } else {
            return cx.a;
         }
      }
   }

   public final de a() {
      de var2 = this.d(this.c);
      de var1 = this.d(this.e);
      if (var2 != null && var1 != null && var2 != var1) {
         StringBuilder var3 = new StringBuilder();
         var3.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
         var3.append(super.a.a);
         var3.append(" returned Transition ");
         var3.append(this.c);
         var3.append(" which uses a different Transition  type than its shared element transition ");
         var3.append(this.e);
         throw new IllegalArgumentException(var3.toString());
      } else {
         return var2 == null ? var1 : var2;
      }
   }
}
