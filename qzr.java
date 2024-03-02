public abstract class qzr extends qua implements quf {
   public static final qub l;

   static {
      l = new qub(quf.k, qzq.a);
   }

   public qzr() {
      super(quf.k);
   }

   public abstract void a(qui var1, Runnable var2);

   public final void d(que var1) {
      rhw var3 = (rhw)var1;
      qyq var2 = var3.e;

      while(var2.a == rhx.b) {
      }

      Object var4 = var3.e.a;
      qza var5;
      if (var4 instanceof qza) {
         var5 = (qza)var4;
      } else {
         var5 = null;
      }

      if (var5 != null) {
         var5.p();
      }

   }

   public void e(qui var1, Runnable var2) {
      this.a(var1, var2);
   }

   public boolean f(qui var1) {
      var1.getClass();
      return true;
   }

   public final que gC(que var1) {
      return new rhw(this, var1);
   }

   public final qug get(quh var1) {
      var1.getClass();
      if (var1 instanceof qub) {
         qub var2 = (qub)var1;
         if (var2.b(this.getKey())) {
            qug var3 = var2.a(this);
            if (var3 instanceof qug) {
               return var3;
            }
         }
      } else if (quf.k == var1) {
         return this;
      }

      return null;
   }

   public final qui minusKey(quh var1) {
      var1.getClass();
      if (var1 instanceof qub) {
         qub var2 = (qub)var1;
         if (var2.b(this.getKey()) && var2.a(this) != null) {
            return quj.a;
         }
      } else if (quf.k == var1) {
         return quj.a;
      }

      return this;
   }

   public String toString() {
      String var2 = qzy.a(this);
      String var1 = qzy.b(this);
      StringBuilder var3 = new StringBuilder();
      var3.append(var2);
      var3.append("@");
      var3.append(var1);
      return var3.toString();
   }
}
