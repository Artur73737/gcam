public abstract class rgn extends rgl {
   protected final ree c;

   public rgn(ree var1, qui var2, int var3) {
      super(var2, var3);
      this.c = var1;
   }

   protected final Object b(rdo var1, que var2) {
      Object var3 = this.c(new rhi(var1), var2);
      return var3 == qul.a ? var3 : qsn.a;
   }

   protected abstract Object c(ref var1, que var2);

   public final Object gY(ref var1, que var2) {
      Object var6;
      Object var8;
      if (this.b == -3) {
         qui var3 = var2.n();
         qui var4 = var3.plus(this.a);
         if (c.E(var4, var3)) {
            var8 = this.c(var1, var2);
            if (var8 != qul.a) {
               return qsn.a;
            }

            return var8;
         }

         if (c.E(var4.get(quf.k), var3.get(quf.k))) {
            qui var5 = var2.n();
            Object var9;
            if (var1 instanceof rhi) {
               var9 = var1;
            } else {
               var9 = var1;
               if (!(var1 instanceof rhc)) {
                  var9 = new rhm(var1, var5);
               }
            }

            rgm var7 = new rgm(this, (que)null);
            var8 = qwo.A(var4, var9, ris.a(var4), var7, var2);
            qul var10 = qul.a;
            var6 = var8;
            if (var8 != var10) {
               var6 = qsn.a;
            }

            var8 = var6;
            if (var6 != var10) {
               return qsn.a;
            }

            return var8;
         }
      }

      var6 = rgl.e(this, var1, var2);
      var8 = var6;
      if (var6 != qul.a) {
         return qsn.a;
      } else {
         return var8;
      }
   }

   public final String toString() {
      ree var2 = this.c;
      String var3 = super.toString();
      StringBuilder var1 = new StringBuilder();
      var1.append(var2);
      var1.append(" -> ");
      var1.append(var3);
      return var1.toString();
   }
}
