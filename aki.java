public final class aki implements bks {
   public static final akg a = new akg();
   public final lmk b;
   public final lmk c;
   private final bxy e;
   private final aez f;

   public aki(lmk var1, lmk var2, bxy var3, aez var4) {
      var1.getClass();
      var2.getClass();
      var3.getClass();
      super();
      this.c = var1;
      this.b = var2;
      this.e = var3;
      this.f = var4;
   }

   // $FF: synthetic method
   public final Object a() {
      return this;
   }

   public final boolean b(akf var1, int var2) {
      if (!c.n(var2, 5) && !c.n(var2, 6)) {
         if (!c.n(var2, 3) && !c.n(var2, 4)) {
            if (!c.n(var2, 1) && !c.n(var2, 2)) {
               hf.c();
               throw new qsc();
            }
         } else if (this.f == aez.a) {
            return false;
         }
      } else if (this.f == aez.b) {
         return false;
      }

      if (this.c(var2)) {
         if (var1.b < this.c.aK() - 1) {
            return true;
         }
      } else if (var1.a > 0) {
         return true;
      }

      return false;
   }

   public final boolean c(int var1) {
      boolean var2 = true;
      if (!c.n(var1, 1)) {
         if (c.n(var1, 2)) {
            return var2;
         }

         if (!c.n(var1, 5)) {
            if (c.n(var1, 6)) {
               return true;
            }

            if (!c.n(var1, 3)) {
               if (!c.n(var1, 4)) {
                  hf.c();
                  throw new qsc();
               }

               switch(this.e.ordinal()) {
               case 0:
                  return true;
               case 1:
                  var2 = false;
                  return var2;
               default:
                  throw new qse();
               }
            }

            switch(this.e.ordinal()) {
            case 0:
               break;
            case 1:
               return true;
            default:
               throw new qse();
            }
         }
      }

      var2 = false;
      return var2;
   }

   public final lmk d() {
      return biw.a;
   }

   // $FF: synthetic method
   public final bbb g(bbb var1) {
      return bax.a(this, var1);
   }

   // $FF: synthetic method
   public final Object h(Object var1, qvx var2) {
      return dq.j(this, var1, var2);
   }

   // $FF: synthetic method
   public final boolean i(qvt var1) {
      return dq.k(this, var1);
   }
}
