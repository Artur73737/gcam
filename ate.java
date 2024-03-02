public final class ate implements bai, avi {
   public final qvi a;
   public final avf b;
   public atc c;

   public ate(qvi var1, avf var2) {
      this.a = var1;
      this.b = var2;
      this.c = new atc();
   }

   public final Object a() {
      qvt var1 = azp.b().j();
      if (var1 != null) {
         var1.eo(this);
      }

      return this.b((atc)azp.e(this.c), azp.b(), true, this.a).d;
   }

   public final atc b(atc var1, azk var2, boolean var3, qvi var4) {
      boolean var11 = var1.e(var2);
      byte var8 = 0;
      byte var9 = 0;
      byte var10 = 0;
      byte var7 = 0;
      Throwable var128;
      Object[] var129;
      int var5;
      int var6;
      int var134;
      dhq var137;
      Object var140;
      Throwable var10000;
      boolean var10001;
      if (var11) {
         if (var3) {
            axf var132 = avg.c();
            int var135 = var132.b;
            if (var135 > 0) {
               Object[] var138 = var132.a;
               var5 = 0;

               do {
                  ((atf)var138[var5]).b();
                  var6 = var5 + 1;
                  var5 = var6;
               } while(var6 < var135);
            }

            label1810: {
               label1811: {
                  Integer var141;
                  try {
                     var137 = var1.f;
                     var141 = (Integer)avg.a.d();
                  } catch (Throwable var124) {
                     var10000 = var124;
                     var10001 = false;
                     break label1811;
                  }

                  if (var141 != null) {
                     try {
                        var5 = var141;
                     } catch (Throwable var123) {
                        var10000 = var123;
                        var10001 = false;
                        break label1811;
                     }
                  } else {
                     var5 = 0;
                  }

                  if (var137 != null) {
                     try {
                        var135 = var137.a;
                     } catch (Throwable var122) {
                        var10000 = var122;
                        var10001 = false;
                        break label1811;
                     }

                     for(var6 = 0; var6 < var135; ++var6) {
                        bai var143;
                        qvt var144;
                        try {
                           var140 = ((Object[])var137.b)[var6];
                           var140.getClass();
                           int var136 = ((Number)((Object[])var137.c)[var6]).intValue();
                           var143 = (bai)var140;
                           avg.a.e(var136 + var5);
                           var144 = var2.j();
                        } catch (Throwable var121) {
                           var10000 = var121;
                           var10001 = false;
                           break label1811;
                        }

                        if (var144 != null) {
                           try {
                              var144.eo(var143);
                           } catch (Throwable var120) {
                              var10000 = var120;
                              var10001 = false;
                              break label1811;
                           }
                        }
                     }
                  }

                  label1743:
                  try {
                     avg.a.e(var5);
                     break label1810;
                  } catch (Throwable var119) {
                     var10000 = var119;
                     var10001 = false;
                     break label1743;
                  }
               }

               var128 = var10000;
               var6 = var132.b;
               if (var6 > 0) {
                  var129 = var132.a;
                  var5 = var8;

                  while(true) {
                     ((atf)var129[var5]).a();
                     ++var5;
                     if (var5 < var6) {
                        continue;
                     }
                  }
               }

               throw var128;
            }

            var134 = var132.b;
            if (var134 > 0) {
               var129 = var132.a;
               var5 = var7;

               do {
                  ((atf)var129[var5]).a();
                  var6 = var5 + 1;
                  var5 = var6;
               } while(var6 < var134);
            }
         }

         return var1;
      } else {
         Integer var12 = (Integer)avg.a.d();
         if (var12 != null) {
            var5 = var12;
         } else {
            var5 = 0;
         }

         var137 = new dhq((byte[])null, (byte[])null);
         axf var14 = avg.c();
         var134 = var14.b;
         int var133;
         if (var134 > 0) {
            Object[] var13 = var14.a;
            var6 = 0;

            do {
               ((atf)var13[var6]).b();
               var133 = var6 + 1;
               var6 = var133;
            } while(var133 < var134);
         }

         boolean var57 = false;

         try {
            var57 = true;
            avg.a.e(var5 + 1);
            atd var139 = new atd(this, var137, var5, 0);
            var140 = dp.h(var139, var4);
            avg.a.e(var5);
            var57 = false;
         } finally {
            if (var57) {
               var6 = var14.b;
               if (var6 > 0) {
                  var129 = var14.a;
                  var5 = var10;

                  while(true) {
                     ((atf)var129[var5]).a();
                     ++var5;
                     if (var5 < var6) {
                        continue;
                     }
                  }
               }

            }
         }

         var134 = var14.b;
         if (var134 > 0) {
            Object[] var130 = var14.a;
            var6 = var9;

            do {
               ((atf)var130[var6]).a();
               var133 = var6 + 1;
               var6 = var133;
            } while(var133 < var134);
         }

         Object var131 = azp.b;
         synchronized(var131){}

         label1789: {
            label1788: {
               azk var142;
               label1787: {
                  Object var15;
                  avf var16;
                  try {
                     var142 = azp.b();
                     var15 = var1.d;
                     if (var15 == atc.a) {
                        break label1787;
                     }

                     var16 = this.b;
                  } catch (Throwable var127) {
                     var10000 = var127;
                     var10001 = false;
                     break label1788;
                  }

                  if (var16 != null) {
                     try {
                        if (var16.a(var140, var15)) {
                           var1.f = var137;
                           var1.e = var1.d(var142);
                           var1.b = var2.u();
                           var1.c = var2.h();
                           break label1789;
                        }
                     } catch (Throwable var126) {
                        var10000 = var126;
                        var10001 = false;
                        break label1788;
                     }
                  }
               }

               label1779:
               try {
                  var1 = (atc)azp.h(this.c, this, var142);
                  var1.f = var137;
                  var1.e = var1.d(var142);
                  var1.b = var2.u();
                  var1.c = var2.h();
                  var1.d = var140;
                  break label1789;
               } catch (Throwable var125) {
                  var10000 = var125;
                  var10001 = false;
                  break label1779;
               }
            }

            var128 = var10000;
            throw var128;
         }

         if (var5 == 0) {
            dp.g();
         }

         return var1;
      }
   }

   public final baj c() {
      return this.c;
   }

   // $FF: synthetic method
   public final baj d(baj var1, baj var2, baj var3) {
      return null;
   }

   public final void e(baj var1) {
      var1.getClass();
      this.c = (atc)var1;
   }

   public final atc f() {
      return this.b((atc)azp.e(this.c), azp.b(), false, this.a);
   }

   public final String toString() {
      atc var1 = (atc)azp.e(this.c);
      StringBuilder var2 = new StringBuilder();
      var2.append("DerivedState(value=");
      var1 = (atc)azp.e(this.c);
      String var3;
      if (var1.e(azp.b())) {
         var3 = String.valueOf(var1.d);
      } else {
         var3 = "<Not calculated>";
      }

      var2.append(var3);
      var2.append(")@");
      var2.append(this.hashCode());
      return var2.toString();
   }
}
