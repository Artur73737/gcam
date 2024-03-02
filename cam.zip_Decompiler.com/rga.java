public final class rga extends rgg implements ree, rfy, rfg {
   private final qyq a;
   private int b;

   public rga(Object var1) {
      this.a = qwp.i(var1);
   }

   private final boolean f(Object var1, Object var2) {
      synchronized(this){}

      Throwable var10000;
      Throwable var102;
      label1229: {
         Object var6;
         boolean var10001;
         try {
            var6 = this.a.a;
         } catch (Throwable var99) {
            var10000 = var99;
            var10001 = false;
            break label1229;
         }

         boolean var5;
         if (var1 != null) {
            try {
               var5 = c.E(var6, var1);
            } catch (Throwable var98) {
               var10000 = var98;
               var10001 = false;
               break label1229;
            }

            if (!var5) {
               return false;
            }
         }

         try {
            var5 = c.E(var6, var2);
         } catch (Throwable var97) {
            var10000 = var97;
            var10001 = false;
            break label1229;
         }

         if (var5) {
            return true;
         }

         int var3;
         try {
            this.a.c(var2);
            var3 = this.b;
         } catch (Throwable var96) {
            var10000 = var96;
            var10001 = false;
            break label1229;
         }

         if ((var3 & 1) == 0) {
            label1230: {
               ++var3;

               rgi[] var100;
               try {
                  this.b = var3;
                  var100 = super.d;
               } catch (Throwable var94) {
                  var10000 = var94;
                  var10001 = false;
                  break label1230;
               }

               while(true) {
                  rgc[] var101 = (rgc[])var100;
                  int var4;
                  if (var101 != null) {
                     for(var4 = 0; var4 < var101.length; ++var4) {
                        rgc var9 = var101[var4];
                        if (var9 != null) {
                           qyq var7 = var9.a;

                           while(true) {
                              Object var8 = var7.a;
                              if (var8 == null) {
                                 break;
                              }

                              riq var104 = rgb.b;
                              if (var8 == var104) {
                                 break;
                              }

                              riq var103 = rgb.a;
                              if (var8 == var103) {
                                 if (var9.a.d(var8, var104)) {
                                    break;
                                 }
                              } else if (var9.a.d(var8, var103)) {
                                 ((qza)var8).gP(qsn.a);
                                 break;
                              }
                           }
                        }
                     }
                  }

                  synchronized(this){}

                  label1194: {
                     try {
                        var4 = this.b;
                     } catch (Throwable var93) {
                        var10000 = var93;
                        var10001 = false;
                        break label1194;
                     }

                     if (var4 == var3) {
                        label1187:
                        try {
                           this.b = var3 + 1;
                           return true;
                        } catch (Throwable var91) {
                           var10000 = var91;
                           var10001 = false;
                           break label1187;
                        }
                     } else {
                        label1190: {
                           try {
                              var100 = super.d;
                           } catch (Throwable var92) {
                              var10000 = var92;
                              var10001 = false;
                              break label1190;
                           }

                           var3 = var4;
                           continue;
                        }
                     }
                  }

                  var102 = var10000;
                  throw var102;
               }
            }
         } else {
            label1208: {
               try {
                  this.b = var3 + 2;
               } catch (Throwable var95) {
                  var10000 = var95;
                  var10001 = false;
                  break label1208;
               }

               return true;
            }
         }
      }

      var102 = var10000;
      throw var102;
   }

   public final Object a(Object var1, que var2) {
      this.d(var1);
      return qsn.a;
   }

   public final Object b() {
      riq var2 = rhd.a;
      Object var1 = this.a.a;
      return var1 == var2 ? null : var1;
   }

   public final boolean c(Object var1) {
      throw null;
   }

   public final void d(Object var1) {
      Object var2 = var1;
      if (var1 == null) {
         var2 = rhd.a;
      }

      this.f((Object)null, var2);
   }

   public final boolean e(Object var1, Object var2) {
      Object var3 = var1;
      if (var1 == null) {
         var3 = rhd.a;
      }

      return this.f(var3, var2);
   }

   public final Object gY(ref param1, que param2) {
      // $FF: Couldn't be decompiled
   }
}
