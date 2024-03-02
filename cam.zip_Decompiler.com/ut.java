import java.util.Set;

public final class ut {
   public final sf a;
   public final Set b;
   public final vy c;
   private vd d;

   public ut(sf var1, Set var2, qzv var3, rdu var4) {
      var3.getClass();
      super();
      this.a = var1;
      this.b = var2;
      this.c = new vy(var3, new us(var4, this, 0));
      qwo.o(var3, (qui)null, 0, new ur(this, (que)null), 3);
   }

   public final Object a(que var1) {
      Object var2 = qwl.j(this.a.c, new se((que)null), var1);
      qul var3 = qul.a;
      Object var4 = var2;
      if (var2 != var3) {
         var4 = qsn.a;
      }

      return var4 == var3 ? var4 : qsn.a;
   }

   public final String b() {
      return this.a.a;
   }

   public final void c() {
      this.c.b();
      this.a.a();
   }

   public final Object d(vd var1) {
      vy var5 = this.c;
      Object var4 = var5.b;
      synchronized(var4){}

      Throwable var10000;
      boolean var10001;
      Throwable var99;
      bes var101;
      label883: {
         label887: {
            boolean var3;
            try {
               var3 = var5.e;
            } catch (Throwable var98) {
               var10000 = var98;
               var10001 = false;
               break label887;
            }

            if (var3) {
               var101 = null;
               break label883;
            }

            int var2;
            try {
               var2 = var5.c + 1;
               var5.c = var2;
            } catch (Throwable var97) {
               var10000 = var97;
               var10001 = false;
               break label887;
            }

            if (var2 == 1) {
               rbd var6;
               try {
                  var6 = var5.d;
               } catch (Throwable var96) {
                  var10000 = var96;
                  var10001 = false;
                  break label887;
               }

               if (var6 != null) {
                  try {
                     qxb.r(var6);
                  } catch (Throwable var95) {
                     var10000 = var95;
                     var10001 = false;
                     break label887;
                  }
               }

               try {
                  var5.d = null;
               } catch (Throwable var94) {
                  var10000 = var94;
                  var10001 = false;
                  break label887;
               }
            }

            var101 = new bes(var5);
            break label883;
         }

         var99 = var10000;
         throw var99;
      }

      vd var102 = this.d;
      this.d = var1;
      if (var102 != null) {
         lh.b(var102);
      }

      rga var8 = this.a.c;
      Object var103 = var1.c;
      synchronized(var103){}

      label889: {
         qsn var100;
         label899: {
            try {
               if (var1.d) {
                  break label899;
               }
            } catch (Throwable var93) {
               var10000 = var93;
               var10001 = false;
               break label889;
            }

            try {
               qzv var7 = var1.b;
               vc var104 = new vc(var8, var1, (que)null);
               var1.g = qwo.o(var7, (qui)null, 0, var104, 3);
               var1.i = var101;
            } catch (Throwable var92) {
               var10000 = var92;
               var10001 = false;
               break label889;
            }

            var100 = qsn.a;
            return var100 == qul.a ? var100 : qsn.a;
         }

         if (var101 != null) {
            try {
               var101.d();
            } catch (Throwable var91) {
               var10000 = var91;
               var10001 = false;
               break label889;
            }
         }

         label845:
         try {
            var100 = qsn.a;
            return var100 == qul.a ? var100 : qsn.a;
         } catch (Throwable var90) {
            var10000 = var90;
            var10001 = false;
            break label845;
         }
      }

      var99 = var10000;
      throw var99;
   }
}
