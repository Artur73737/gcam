import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class bxl {
   public static final bxl a = new bxl();

   private bxl() {
   }

   public static final void a(String var0, String var1, asm var2, Object... var3) {
      var2.getClass();
      var3.getClass();

      StringBuilder var13;
      Exception var10000;
      label42: {
         int var4;
         Class var5;
         Method var6;
         boolean var10001;
         try {
            var5 = Class.forName(var0);
            var5.getClass();
            var4 = var3.length;
            var6 = c(var5, var1, Arrays.copyOf(var3, var4));
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
            break label42;
         }

         if (var6 == null) {
            try {
               var13 = new StringBuilder();
               var13.append("Composable ");
               var13.append(var0);
               var13.append('.');
               var13.append(var1);
               var13.append(" not found");
               NoSuchMethodException var12 = new NoSuchMethodException(var13.toString());
               throw var12;
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
            }
         } else {
            label43: {
               try {
                  var6.setAccessible(true);
                  if (Modifier.isStatic(var6.getModifiers())) {
                     d(var6, (Object)null, var2, Arrays.copyOf(var3, var4));
                     return;
                  }
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label43;
               }

               try {
                  d(var6, var5.getConstructor().newInstance(), var2, Arrays.copyOf(var3, var4));
                  return;
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
               }
            }
         }
      }

      Exception var11 = var10000;
      var13 = new StringBuilder();
      var13.append("Failed to invoke Composable Method '");
      var13.append(var0);
      var13.append('.');
      var13.append(var1);
      var13.append('\'');
      Log.w("PreviewLogger", var13.toString(), (Throwable)null);
      throw var11;
   }

   private static final int b(int var0, int var1) {
      if (var0 == 0) {
         return 1;
      } else {
         double var2 = (double)(var0 + var1);
         Double.isNaN(var2);
         return (int)Math.ceil(var2 / 10.0D);
      }
   }

   private static final Method c(Class var0, String var1, Object... var2) {
      Object var11 = null;
      byte var6 = 0;

      int var3;
      int var4;
      boolean var9;
      boolean var10001;
      Method var35;
      label215: {
         int var5;
         ArrayList var12;
         ArrayList var13;
         try {
            var5 = var2.length;
            var4 = b(var5, 0);
            var12 = new ArrayList(3);
            var13 = new ArrayList();
         } catch (ReflectiveOperationException var34) {
            var10001 = false;
            break label215;
         }

         var3 = 0;

         label205:
         while(true) {
            if (var3 >= var5) {
               Class var36;
               ArrayList var43;
               qtj var49;
               try {
                  qwo.a(var13.toArray(new Class[0]), var12);
                  var12.add(asm.class);
                  var36 = Integer.TYPE;
                  qxq var48 = qxb.p(0, var4);
                  var43 = new ArrayList(pwm.aL(var48));
                  var49 = var48.a();
               } catch (ReflectiveOperationException var30) {
                  var10001 = false;
                  break;
               }

               while(true) {
                  try {
                     if (!var49.a) {
                        break;
                     }

                     var49.a();
                     var43.add(var36);
                  } catch (ReflectiveOperationException var31) {
                     var10001 = false;
                     break label205;
                  }
               }

               int var7;
               Class[] var46;
               Method[] var50;
               try {
                  qwo.a(var43.toArray(new Class[0]), var12);
                  Class[] var37 = (Class[])var12.toArray(new Class[var12.size()]);
                  var46 = (Class[])Arrays.copyOf(var37, var37.length);
                  var50 = var0.getDeclaredMethods();
                  var50.getClass();
                  var7 = var50.length;
               } catch (ReflectiveOperationException var29) {
                  var10001 = false;
                  break;
               }

               var3 = 0;

               Method var38;
               label180:
               while(true) {
                  if (var3 < var7) {
                     Method var44 = var50[var3];

                     label175: {
                        label219: {
                           try {
                              if (!c.E(var1, var44.getName())) {
                                 String var14 = var44.getName();
                                 var14.getClass();
                                 StringBuilder var39 = new StringBuilder();
                                 var39.append(var1);
                                 var39.append('-');
                                 if (!qwp.B(var14, var39.toString())) {
                                    break label219;
                                 }
                              }
                           } catch (ReflectiveOperationException var28) {
                              var10001 = false;
                              break label205;
                           }

                           int var8;
                           ArrayList var15;
                           Class[] var51;
                           try {
                              var51 = var44.getParameterTypes();
                              var51.getClass();
                              var8 = var51.length;
                              if (var8 != var46.length) {
                                 break label219;
                              }

                              var15 = new ArrayList(var8);
                           } catch (ReflectiveOperationException var26) {
                              var10001 = false;
                              break label205;
                           }

                           var5 = 0;
                           var4 = 0;

                           label168:
                           while(true) {
                              if (var5 >= var8) {
                                 try {
                                    if (var15.isEmpty()) {
                                       break label175;
                                    }
                                 } catch (ReflectiveOperationException var25) {
                                    var10001 = false;
                                    break label205;
                                 }

                                 Iterator var52;
                                 try {
                                    var52 = var15.iterator();
                                 } catch (ReflectiveOperationException var23) {
                                    var10001 = false;
                                    break label205;
                                 }

                                 while(true) {
                                    var38 = var44;

                                    try {
                                       if (!var52.hasNext()) {
                                          break label180;
                                       }

                                       if (!(Boolean)var52.next()) {
                                          break label168;
                                       }
                                    } catch (ReflectiveOperationException var24) {
                                       var10001 = false;
                                       break label205;
                                    }
                                 }
                              }

                              var36 = var51[var5];
                              Class var16 = var46[var4];

                              label163: {
                                 label228: {
                                    label160:
                                    try {
                                       if (!var36.isPrimitive() && !var16.isPrimitive()) {
                                          break label160;
                                       }
                                       break label228;
                                    } catch (ReflectiveOperationException var27) {
                                       var10001 = false;
                                       break label205;
                                    }

                                    try {
                                       var9 = var36.isAssignableFrom(var16);
                                       break label163;
                                    } catch (ReflectiveOperationException var22) {
                                       var10001 = false;
                                       break label205;
                                    }
                                 }

                                 try {
                                    var9 = c.E(qwl.d(var36), qwl.d(var16));
                                 } catch (ReflectiveOperationException var21) {
                                    var10001 = false;
                                    break label205;
                                 }
                              }

                              try {
                                 var15.add(var9);
                              } catch (ReflectiveOperationException var20) {
                                 var10001 = false;
                                 break label205;
                              }

                              ++var5;
                              ++var4;
                           }
                        }

                        ++var3;
                        continue;
                     }

                     var38 = var44;
                     break;
                  }

                  var38 = null;
                  break;
               }

               if (var38 != null) {
                  var35 = var38;
                  return var35;
               }

               try {
                  NoSuchMethodException var41 = new NoSuchMethodException(var1.concat(" not found"));
                  throw var41;
               } catch (ReflectiveOperationException var19) {
                  var10001 = false;
                  break;
               }
            }

            Object var10 = var2[var3];
            Class var42;
            if (var10 != null) {
               try {
                  var42 = var10.getClass();
               } catch (ReflectiveOperationException var32) {
                  var10001 = false;
                  break;
               }
            } else {
               var42 = null;
            }

            if (var42 != null) {
               try {
                  var13.add(var42);
               } catch (ReflectiveOperationException var33) {
                  var10001 = false;
                  break;
               }
            }

            ++var3;
         }
      }

      label223: {
         Method[] var40;
         try {
            var40 = var0.getDeclaredMethods();
            var40.getClass();
            var4 = var40.length;
         } catch (ReflectiveOperationException var18) {
            var10001 = false;
            break label223;
         }

         for(var3 = var6; var3 < var4; ++var3) {
            var35 = var40[var3];

            try {
               if (c.E(var35.getName(), var1)) {
                  return var35;
               }

               String var47 = var35.getName();
               var47.getClass();
               StringBuilder var45 = new StringBuilder();
               var45.append(var1);
               var45.append('-');
               var9 = qwp.B(var47, var45.toString());
            } catch (ReflectiveOperationException var17) {
               var10001 = false;
               break;
            }

            if (var9) {
               return var35;
            }
         }
      }

      var35 = (Method)var11;
      return var35;
   }

   private static final void d(Method var0, Object var1, asm var2, Object... var3) {
      Class[] var11 = var0.getParameterTypes();
      var11.getClass();
      int var6 = var11.length;
      byte var7 = -1;
      --var6;
      int var8;
      if (var6 >= 0) {
         while(true) {
            var8 = var6 - 1;
            if (c.E(var11[var6], asm.class)) {
               break;
            }

            if (var8 < 0) {
               var6 = var7;
               break;
            }

            var6 = var8;
         }
      } else {
         var6 = var7;
      }

      byte var14;
      if (var1 != null) {
         var14 = 1;
      } else {
         var14 = 0;
      }

      var8 = var6 + 1;
      int var9 = b(var6, var14) + var8;
      int var10 = var0.getParameterTypes().length;
      int var15;
      if (var10 != var9) {
         double var4 = (double)var6;
         Double.isNaN(var4);
         var15 = (int)Math.ceil(var4 / 31.0D);
      } else {
         var15 = 0;
      }

      if (var15 + var9 != var10) {
         IllegalStateException var13 = new IllegalStateException("params don't add up to total params");
         throw var13;
      } else {
         Object[] var12 = new Object[var10];

         for(var15 = 0; var15 < var10; ++var15) {
            Object var16;
            if (var15 >= 0 && var15 < var6) {
               if (var15 <= pwm.aX(var3)) {
                  var16 = var3[var15];
               } else {
                  Class var17 = var0.getParameterTypes()[var15];
                  var17.getClass();
                  String var18 = var17.getName();
                  if (var18 != null) {
                     label93: {
                        switch(var18.hashCode()) {
                        case -1325958191:
                           if (var18.equals("double")) {
                              var16 = 0.0D;
                              break label93;
                           }
                           break;
                        case 104431:
                           if (var18.equals("int")) {
                              var16 = 0;
                              break label93;
                           }
                           break;
                        case 3039496:
                           if (var18.equals("byte")) {
                              var16 = 0;
                              break label93;
                           }
                           break;
                        case 3052374:
                           if (var18.equals("char")) {
                              var16 = '\u0000';
                              break label93;
                           }
                           break;
                        case 3327612:
                           if (var18.equals("long")) {
                              var16 = 0L;
                              break label93;
                           }
                           break;
                        case 64711720:
                           if (var18.equals("boolean")) {
                              var16 = false;
                              break label93;
                           }
                           break;
                        case 97526364:
                           if (var18.equals("float")) {
                              var16 = 0.0F;
                              break label93;
                           }
                           break;
                        case 109413500:
                           if (var18.equals("short")) {
                              var16 = Short.valueOf((short)0);
                              break label93;
                           }
                        }

                        var16 = null;
                     }
                  } else {
                     var16 = null;
                  }
               }
            } else if (var15 == var6) {
               var16 = var2;
            } else if (var8 <= var15 && var15 < var9) {
               var16 = 0;
            } else {
               if (var9 > var15 || var15 >= var10) {
                  throw new IllegalStateException("Unexpected index");
               }

               var16 = 2097151;
            }

            var12[var15] = var16;
         }

         var0.invoke(var1, Arrays.copyOf(var12, var10));
      }
   }
}
