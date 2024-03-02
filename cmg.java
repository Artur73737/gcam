import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class cmg {
   public static final cmg a = new cmg();
   public static final Map b = new HashMap();
   private static final Map c = new HashMap();

   private cmg() {
   }

   public static final clq b(Constructor var0, Object var1) {
      try {
         Object var5 = var0.newInstance(var1);
         var5.getClass();
         clq var6 = (clq)var5;
         return var6;
      } catch (IllegalAccessException var2) {
         throw new RuntimeException(var2);
      } catch (InstantiationException var3) {
         throw new RuntimeException(var3);
      } catch (InvocationTargetException var4) {
         throw new RuntimeException(var4);
      }
   }

   private static final boolean c(Class var0) {
      return var0 != null && cmb.class.isAssignableFrom(var0);
   }

   public final int a(Class var1) {
      Integer var6 = (Integer)c.get(var1);
      if (var6 != null) {
         return var6;
      } else {
         String var28 = var1.getCanonicalName();
         byte var3 = 1;
         byte var2;
         if (var28 == null) {
            var2 = var3;
         } else {
            Class[] var8 = null;
            byte var4 = 0;

            Class var33;
            Constructor var34;
            label162: {
               Constructor var30;
               label161: {
                  label160: {
                     NoSuchMethodException var10000;
                     label171: {
                        String var9;
                        boolean var10001;
                        Package var29;
                        try {
                           var29 = var1.getPackage();
                           var9 = var1.getCanonicalName();
                        } catch (ClassNotFoundException var24) {
                           var10001 = false;
                           break label160;
                        } catch (NoSuchMethodException var25) {
                           var10000 = var25;
                           var10001 = false;
                           break label171;
                        }

                        if (var29 != null) {
                           try {
                              var28 = var29.getName();
                           } catch (ClassNotFoundException var22) {
                              var10001 = false;
                              break label160;
                           } catch (NoSuchMethodException var23) {
                              var10000 = var23;
                              var10001 = false;
                              break label171;
                           }
                        } else {
                           var28 = "";
                        }

                        try {
                           var28.getClass();
                        } catch (ClassNotFoundException var20) {
                           var10001 = false;
                           break label160;
                        } catch (NoSuchMethodException var21) {
                           var10000 = var21;
                           var10001 = false;
                           break label171;
                        }

                        String var7 = var9;

                        try {
                           if (var28.length() != 0) {
                              var9.getClass();
                              var7 = var9.substring(var28.length() + 1);
                              var7.getClass();
                           }
                        } catch (ClassNotFoundException var18) {
                           var10001 = false;
                           break label160;
                        } catch (NoSuchMethodException var19) {
                           var10000 = var19;
                           var10001 = false;
                           break label171;
                        }

                        label143: {
                           label142: {
                              try {
                                 var7.getClass();
                                 var7 = qwp.y(var7, ".", "_").concat("_LifecycleAdapter");
                                 if (var28.length() != 0) {
                                    break label142;
                                 }
                              } catch (ClassNotFoundException var16) {
                                 var10001 = false;
                                 break label160;
                              } catch (NoSuchMethodException var17) {
                                 var10000 = var17;
                                 var10001 = false;
                                 break label171;
                              }

                              var28 = var7;
                              break label143;
                           }

                           try {
                              StringBuilder var36 = new StringBuilder();
                              var36.append(var28);
                              var36.append('.');
                              var36.append(var7);
                              var28 = var36.toString();
                           } catch (ClassNotFoundException var14) {
                              var10001 = false;
                              break label160;
                           } catch (NoSuchMethodException var15) {
                              var10000 = var15;
                              var10001 = false;
                              break label171;
                           }
                        }

                        try {
                           var33 = Class.forName(var28);
                           var33.getClass();
                           var30 = var33.getDeclaredConstructor(var1);
                        } catch (ClassNotFoundException var12) {
                           var10001 = false;
                           break label160;
                        } catch (NoSuchMethodException var13) {
                           var10000 = var13;
                           var10001 = false;
                           break label171;
                        }

                        var34 = var30;

                        try {
                           if (var30.isAccessible()) {
                              break label162;
                           }

                           var30.setAccessible(true);
                           break label161;
                        } catch (ClassNotFoundException var10) {
                           var10001 = false;
                           break label160;
                        } catch (NoSuchMethodException var11) {
                           var10000 = var11;
                           var10001 = false;
                        }
                     }

                     NoSuchMethodException var26 = var10000;
                     throw new RuntimeException(var26);
                  }

                  var34 = null;
                  break label162;
               }

               var34 = var30;
            }

            if (var34 != null) {
               b.put(var1, pwm.ak(var34));
               var2 = 2;
            } else {
               label172: {
                  clk var39 = clk.a;
                  Boolean var31 = (Boolean)var39.b.get(var1);
                  int var27;
                  if (var31 != null) {
                     if (var31) {
                        var2 = var3;
                        break label172;
                     }
                  } else {
                     Method[] var32 = var39.c(var1);
                     int var5 = var32.length;

                     for(var27 = 0; var27 < var5; ++var27) {
                        if ((OnLifecycleEvent)var32[var27].getAnnotation(OnLifecycleEvent.class) != null) {
                           var39.a(var1, var32);
                           var2 = var3;
                           break label172;
                        }
                     }

                     var39.b.put(var1, false);
                  }

                  var33 = var1.getSuperclass();
                  ArrayList var35;
                  if (c(var33)) {
                     var33.getClass();
                     if (this.a(var33) == 1) {
                        var2 = var3;
                        break label172;
                     }

                     Object var40 = b.get(var33);
                     var40.getClass();
                     var35 = new ArrayList((Collection)var40);
                  } else {
                     var35 = var8;
                  }

                  var8 = var1.getInterfaces();
                  var8.getClass();
                  var27 = var4;

                  while(true) {
                     if (var27 >= var8.length) {
                        if (var35 != null) {
                           b.put(var1, var35);
                           var2 = 2;
                        } else {
                           var2 = var3;
                        }
                        break;
                     }

                     Class var37 = var8[var27];
                     ArrayList var41 = var35;
                     if (c(var37)) {
                        var37.getClass();
                        if (this.a(var37) == 1) {
                           var2 = var3;
                           break;
                        }

                        var41 = var35;
                        if (var35 == null) {
                           var41 = new ArrayList();
                        }

                        Object var38 = b.get(var37);
                        var38.getClass();
                        var41.addAll((Collection)var38);
                     }

                     ++var27;
                     var35 = var41;
                  }
               }
            }
         }

         c.put(var1, Integer.valueOf(var2));
         return var2;
      }
   }
}
