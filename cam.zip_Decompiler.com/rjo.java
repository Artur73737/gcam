public final class rjo {
   public final qyq a;

   public rjo() {
      this.a = qwp.i(rjp.e);
   }

   public final Object a(que var1) {
      qyq var4 = this.a;

      Object var2;
      StringBuilder var6;
      while(true) {
         var2 = var4.a;
         if (var2 instanceof rjk) {
            if (((rjk)var2).a != rjp.c) {
               break;
            }

            rjk var3 = rjp.d;
            if (this.a.d(var2, var3)) {
               return qsn.a;
            }
         } else {
            if (var2 instanceof rjm) {
               if (((rjm)var2).owner == null) {
                  var6 = new StringBuilder();
                  var6.append("Already locked by ");
                  var6.append((Object)null);
                  throw new IllegalStateException("Already locked by null");
               }
               break;
            }

            if (!(var2 instanceof rik)) {
               var6 = new StringBuilder();
               var6.append("Illegal state ");
               var6.append(var2);
               IllegalStateException var7 = new IllegalStateException("Illegal state ".concat(String.valueOf(var2)));
               throw var7;
            }

            ((rik)var2).c(this);
         }
      }

      qza var8 = qwp.K(quy.h(var1));
      rjl var9 = new rjl(this, var8);
      qyq var10 = this.a;

      while(true) {
         Object var13 = var10.a;
         if (var13 instanceof rjk) {
            Object var14 = ((rjk)var13).a;
            if (var14 != rjp.c) {
               this.a.d(var13, new rjm(var14));
            } else {
               rjk var15 = rjp.d;
               if (this.a.d(var13, var15)) {
                  var8.t(qsn.a, new qsp(this, 12));
                  break;
               }
            }
         } else if (!(var13 instanceof rjm)) {
            if (!(var13 instanceof rik)) {
               var6 = new StringBuilder();
               var6.append("Illegal state ");
               var6.append(var13);
               throw new IllegalStateException("Illegal state ".concat(String.valueOf(var13)));
            }

            ((rik)var13).c(this);
         } else {
            rjm var5 = (rjm)var13;
            if (var5.owner == null) {
               var6 = new StringBuilder();
               var6.append("Already locked by ");
               var6.append((Object)null);
               throw new IllegalStateException("Already locked by null");
            }

            while(!var5.k().p(var9, var5)) {
            }

            if (this.a.a == var13 || !var9.b()) {
               qwp.M(var8, var9);
               break;
            }

            var9 = new rjl(this, var8);
         }
      }

      var2 = var8.c();
      qul var11 = qul.a;
      Object var12 = var2;
      if (var2 != var11) {
         var12 = qsn.a;
      }

      return var12 == var11 ? var12 : qsn.a;
   }

   public final void b() {
      qyq var3 = this.a;

      Object var2;
      do {
         while(true) {
            var2 = var3.a;
            if (var2 instanceof rjk) {
               if (((rjk)var2).a == rjp.c) {
                  throw new IllegalStateException("Mutex is not locked");
               }
               break;
            }

            if (var2 instanceof rik) {
               ((rik)var2).c(this);
            } else {
               if (!(var2 instanceof rjm)) {
                  StringBuilder var8 = new StringBuilder();
                  var8.append("Illegal state ");
                  var8.append(var2);
                  IllegalStateException var9 = new IllegalStateException("Illegal state ".concat(String.valueOf(var2)));
                  throw var9;
               }

               rjm var4 = (rjm)var2;

               rig var5;
               while(true) {
                  Object var1 = var4.i();
                  var1.getClass();
                  var5 = (rig)var1;
                  if (var5 == var4) {
                     var5 = null;
                     break;
                  }

                  if (var5.gF()) {
                     break;
                  }

                  var5.n();
               }

               if (var5 == null) {
                  rjn var6 = new rjn(var4);
                  if (this.a.d(var2, var6) && var6.c(this) == null) {
                     return;
                  }
               } else {
                  rjl var7 = (rjl)var5;
                  if (var7.b() && var7.b.z(qsn.a, new qsp(var7.a, 11)) != null) {
                     var4.owner = rjp.b;
                     var7.b.B();
                     return;
                  }
               }
            }
         }
      } while(!this.a.d(var2, rjp.e));

   }

   public final String toString() {
      qyq var2 = this.a;

      while(true) {
         Object var1 = var2.a;
         if (var1 instanceof rjk) {
            Object var6 = ((rjk)var1).a;
            StringBuilder var4 = new StringBuilder();
            var4.append("Mutex[");
            var4.append(var6);
            var4.append("]");
            return var4.toString();
         }

         if (!(var1 instanceof rik)) {
            StringBuilder var5;
            if (var1 instanceof rjm) {
               var1 = ((rjm)var1).owner;
               var5 = new StringBuilder();
               var5.append("Mutex[");
               var5.append(var1);
               var5.append("]");
               return var5.toString();
            }

            var5 = new StringBuilder();
            var5.append("Illegal state ");
            var5.append(var1);
            IllegalStateException var3 = new IllegalStateException("Illegal state ".concat(String.valueOf(var1)));
            throw var3;
         }

         ((rik)var1).c(this);
      }
   }
}
