import java.util.Arrays;

public abstract class rgg {
   private int a;
   private rhk b;
   public rgi[] d;
   public int e;

   protected abstract rgi g();

   public final rfy gZ() {
      synchronized(this){}

      Throwable var10000;
      label75: {
         boolean var10001;
         rhk var2;
         try {
            var2 = this.b;
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label75;
         }

         rhk var1 = var2;
         if (var2 != null) {
            return var1;
         }

         label66:
         try {
            var1 = new rhk(this.e);
            this.b = var1;
            return var1;
         } catch (Throwable var7) {
            var10000 = var7;
            var10001 = false;
            break label66;
         }
      }

      Throwable var9 = var10000;
      throw var9;
   }

   protected abstract rgi[] j();

   protected final rgi k() {
      synchronized(this){}

      rgi var79;
      rhk var81;
      label654: {
         Throwable var10000;
         label658: {
            rgi[] var4;
            boolean var10001;
            try {
               var4 = this.d;
            } catch (Throwable var77) {
               var10000 = var77;
               var10001 = false;
               break label658;
            }

            int var1;
            int var2;
            rgi[] var3;
            if (var4 == null) {
               try {
                  var3 = this.j();
                  this.d = var3;
               } catch (Throwable var76) {
                  var10000 = var76;
                  var10001 = false;
                  break label658;
               }
            } else {
               try {
                  var1 = this.e;
                  var2 = var4.length;
               } catch (Throwable var75) {
                  var10000 = var75;
                  var10001 = false;
                  break label658;
               }

               var3 = var4;
               if (var1 >= var2) {
                  try {
                     Object[] var78 = Arrays.copyOf(var4, var2 + var2);
                     var78.getClass();
                     var3 = (rgi[])var78;
                     this.d = var3;
                  } catch (Throwable var74) {
                     var10000 = var74;
                     var10001 = false;
                     break label658;
                  }
               }
            }

            try {
               var2 = this.a;
            } catch (Throwable var73) {
               var10000 = var73;
               var10001 = false;
               break label658;
            }

            while(true) {
               rgi var5 = var3[var2];
               var79 = var5;
               if (var5 == null) {
                  try {
                     var79 = this.g();
                  } catch (Throwable var71) {
                     var10000 = var71;
                     var10001 = false;
                     break;
                  }

                  var3[var2] = var79;
               }

               ++var2;
               var1 = var2;

               label633: {
                  try {
                     if (var2 < var3.length) {
                        break label633;
                     }
                  } catch (Throwable var72) {
                     var10000 = var72;
                     var10001 = false;
                     break;
                  }

                  var1 = 0;
               }

               var2 = var1;

               try {
                  if (var79.a(this)) {
                     this.a = var1;
                     ++this.e;
                     var81 = this.b;
                     break label654;
                  }
               } catch (Throwable var70) {
                  var10000 = var70;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var80 = var10000;
         throw var80;
      }

      if (var81 != null) {
         var81.m(1);
      }

      return var79;
   }

   protected final void l(rgi var1) {
      var1.getClass();
      synchronized(this){}

      int var2;
      int var3;
      rhk var4;
      que[] var5;
      label177: {
         Throwable var10000;
         label181: {
            boolean var10001;
            try {
               var3 = this.e - 1;
               this.e = var3;
               var4 = this.b;
            } catch (Throwable var17) {
               var10000 = var17;
               var10001 = false;
               break label181;
            }

            var2 = 0;
            if (var3 == 0) {
               try {
                  this.a = 0;
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label181;
               }
            }

            label169:
            try {
               var5 = var1.b(this);
               break label177;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label169;
            }
         }

         Throwable var18 = var10000;
         throw var18;
      }

      for(var3 = var5.length; var2 < var3; ++var2) {
         que var19 = var5[var2];
         if (var19 != null) {
            var19.gP(qsn.a);
         }
      }

      if (var4 != null) {
         var4.m(-1);
      }
   }
}
