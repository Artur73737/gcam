import com.google.android.apps.camera.imax.cyclops.audio.CmJv.ytQQGGmniJK;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

public class rlx implements Serializable, Comparable {
   public static final rlx a = new rlx(new byte[0]);
   private static final long serialVersionUID = 1L;
   public final byte[] b;
   public transient int c;
   public transient String d;

   public rlx(byte[] var1) {
      var1.getClass();
      super();
      this.b = var1;
   }

   public static final rlx d(String var0) {
      rlx var1 = new rlx(qwp.Q(var0));
      var1.d = var0;
      return var1;
   }

   private final void readObject(ObjectInputStream var1) {
      int var3 = var1.readInt();
      var1.getClass();
      if (var3 >= 0) {
         byte[] var5 = new byte[var3];

         int var4;
         for(int var2 = 0; var2 < var3; var2 += var4) {
            var4 = var1.read(var5, var2, var3 - var2);
            if (var4 == -1) {
               throw new EOFException();
            }
         }

         rlx var7 = new rlx(var5);
         Field var8 = rlx.class.getDeclaredField("b");
         var8.setAccessible(true);
         var8.set(this, var7.b);
      } else {
         IllegalArgumentException var6 = new IllegalArgumentException(c.aE(var3, "byteCount < 0: "));
         throw var6;
      }
   }

   private final void writeObject(ObjectOutputStream var1) {
      var1.writeInt(this.b.length);
      var1.write(this.b);
   }

   public byte a(int var1) {
      return this.b[var1];
   }

   public int b() {
      return this.b.length;
   }

   public String c() {
      byte[] var7 = this.b;
      int var3 = var7.length;
      char[] var6 = new char[var3 + var3];
      int var2 = 0;

      for(int var1 = 0; var2 < var3; ++var2) {
         byte var4 = var7[var2];
         int var5 = var1 + 1;
         var6[var1] = rmi.a[var4 >> 4 & 15];
         var6[var5] = rmi.a[var4 & 15];
         var1 = var5 + 1;
      }

      return new String(var6);
   }

   public boolean e(int var1, byte[] var2, int var3, int var4) {
      var2.getClass();
      if (var1 >= 0) {
         byte[] var5 = this.b;
         if (var1 <= var5.length - var4 && var3 >= 0 && var3 <= var2.length - var4 && qwp.P(var5, var1, var2, var3, var4)) {
            return true;
         }
      }

      return false;
   }

   public boolean equals(Object var1) {
      boolean var4 = true;
      if (var1 != this) {
         if (var1 instanceof rlx) {
            rlx var5 = (rlx)var1;
            int var3 = var5.b();
            byte[] var6 = this.b;
            int var2 = var6.length;
            if (var3 == var2 && var5.e(0, var6, 0, var2)) {
               return true;
            }
         }

         var4 = false;
      }

      return var4;
   }

   public byte[] f() {
      return this.b;
   }

   public boolean g(rlx var1, int var2) {
      return var1.e(0, this.b, 0, var2);
   }

   public int hashCode() {
      int var1 = this.c;
      if (var1 != 0) {
         return var1;
      } else {
         var1 = Arrays.hashCode(this.b);
         this.c = var1;
         return var1;
      }
   }

   public String toString() {
      byte[] var10 = this.b;
      int var5 = var10.length;
      String var9;
      if (var5 == 0) {
         var9 = "[size=0]";
      } else {
         char[] var16 = rmi.a;
         int var3 = 0;
         int var4 = 0;
         int var2 = 0;

         int var1;
         label213:
         while(true) {
            var1 = var2;
            if (var3 >= var5) {
               break;
            }

            label231: {
               label208: {
                  byte var6 = var10[var3];
                  if (var6 >= 0) {
                     var1 = var4 + 1;
                     if (var4 == 64) {
                        var1 = var2;
                        break;
                     }

                     if (var6 != 10 && var6 != 13 && (var6 < 32 || var6 >= 127)) {
                        var1 = -1;
                        break;
                     }

                     ++var2;
                     var4 = var3 + 1;
                     var3 = var1;
                     var1 = var4;

                     while(true) {
                        if (var1 >= var5) {
                           break label208;
                        }

                        var6 = var10[var1];
                        if (var6 < 0) {
                           break label208;
                        }

                        var4 = var1 + 1;
                        var1 = var2;
                        if (var3 == 64) {
                           break label213;
                        }

                        if (var6 != 10 && var6 != 13 && (var6 < 32 || var6 >= 127)) {
                           break;
                        }

                        ++var2;
                        ++var3;
                        var1 = var4;
                     }
                  } else {
                     byte var11;
                     byte var12;
                     int var13;
                     if (var6 >> 5 != -2) {
                        byte var7;
                        if (var6 >> 4 == -2) {
                           int var14 = var3 + 2;
                           if (var5 <= var14) {
                              var1 = var2;
                              if (var4 == 64) {
                                 break;
                              }
                              break label231;
                           }

                           var11 = var10[var3 + 1];
                           if ((var11 & 192) == 128) {
                              var7 = var10[var14];
                              if ((var7 & 192) == 128) {
                                 var13 = var7 ^ -123008 ^ var11 << 6 ^ var6 << 12;
                                 if (var13 < 2048) {
                                    var1 = var2;
                                    if (var4 == 64) {
                                       break;
                                    }
                                 } else if (var13 >= 55296 && var13 < 57344) {
                                    var1 = var2;
                                    if (var4 == 64) {
                                       break;
                                    }
                                 } else {
                                    var1 = var2;
                                    if (var4 == 64) {
                                       break;
                                    }

                                    if (var13 != 65533) {
                                       if (var13 < 65536) {
                                          var12 = 1;
                                       } else {
                                          var12 = 2;
                                       }

                                       var2 += var12;
                                       var3 += 3;
                                       ++var4;
                                       continue;
                                    }
                                 }
                              } else {
                                 var1 = var2;
                                 if (var4 == 64) {
                                    break;
                                 }
                              }
                           } else {
                              var1 = var2;
                              if (var4 == 64) {
                                 break;
                              }
                           }
                        } else {
                           label226: {
                              if (var6 >> 3 == -2) {
                                 int var8 = var3 + 3;
                                 if (var5 <= var8) {
                                    var1 = var2;
                                    if (var4 == 64) {
                                       break;
                                    }
                                    break label226;
                                 }

                                 var11 = var10[var3 + 1];
                                 if ((var11 & 192) == 128) {
                                    var7 = var10[var3 + 2];
                                    if ((var7 & 192) == 128) {
                                       byte var15 = var10[var8];
                                       if ((var15 & 192) == 128) {
                                          var1 = var15 ^ 3678080 ^ var7 << 6 ^ var11 << 12 ^ var6 << 18;
                                          if (var1 > 1114111) {
                                             var1 = var2;
                                             if (var4 == 64) {
                                                break;
                                             }
                                          } else if (var1 >= 55296 && var1 < 57344) {
                                             var1 = var2;
                                             if (var4 == 64) {
                                                break;
                                             }
                                          } else {
                                             if (var1 >= 65536) {
                                                var1 = var2;
                                                if (var4 == 64) {
                                                   break;
                                                }

                                                var2 += 2;
                                                var3 += 4;
                                                ++var4;
                                                continue;
                                             }

                                             var1 = var2;
                                             if (var4 == 64) {
                                                break;
                                             }
                                          }
                                       } else {
                                          var1 = var2;
                                          if (var4 == 64) {
                                             break;
                                          }
                                       }
                                    } else {
                                       var1 = var2;
                                       if (var4 == 64) {
                                          break;
                                       }
                                    }
                                 } else {
                                    var1 = var2;
                                    if (var4 == 64) {
                                       break;
                                    }
                                 }
                              } else {
                                 var1 = var2;
                                 if (var4 == 64) {
                                    break;
                                 }
                              }

                              var1 = -1;
                              break;
                           }
                        }

                        var1 = -1;
                        break;
                     }

                     var1 = var3 + 1;
                     if (var5 > var1) {
                        var11 = var10[var1];
                        if ((var11 & 192) == 128) {
                           var13 = var6 << 6 ^ var11 ^ 3968;
                           if (var13 < 128) {
                              var1 = var2;
                              if (var4 == 64) {
                                 break;
                              }
                           } else {
                              var1 = var2;
                              if (var4 == 64) {
                                 break;
                              }

                              if (var13 >= 160 && var13 != 65533) {
                                 if (var13 < 65536) {
                                    var12 = 1;
                                 } else {
                                    var12 = 2;
                                 }

                                 var2 += var12;
                                 var3 += 2;
                                 ++var4;
                                 continue;
                              }
                           }
                        } else {
                           var1 = var2;
                           if (var4 == 64) {
                              break;
                           }
                        }
                        break label231;
                     }

                     var1 = var2;
                     if (var4 == 64) {
                        break;
                     }
                  }

                  var1 = -1;
                  break;
               }

               var4 = var3;
               var3 = var1;
               continue;
            }

            var1 = -1;
            break;
         }

         byte[] var17;
         if (var1 == -1) {
            var17 = this.b;
            var1 = var17.length;
            StringBuilder var18;
            if (var1 <= 64) {
               var9 = this.c();
               var18 = new StringBuilder();
               var18.append("[hex=");
               var18.append(var9);
               var18.append("]");
               var9 = var18.toString();
            } else {
               var17.getClass();
               var17 = Arrays.copyOfRange(var17, 0, 64);
               var17.getClass();
               var9 = (new rlx(var17)).c();
               var18 = new StringBuilder();
               var18.append("[size=");
               var18.append(var1);
               var18.append(ytQQGGmniJK.KrwWlhTgAo);
               var18.append(var9);
               var18.append("…]");
               var9 = var18.toString();
            }
         } else {
            String var19 = this.d;
            var9 = var19;
            if (var19 == null) {
               var17 = this.f();
               var17.getClass();
               var9 = new String(var17, qyk.a);
               this.d = var9;
            }

            var19 = var9.substring(0, var1);
            var19.getClass();
            var19 = qwp.y(qwp.y(qwp.y(var19, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (var1 < var9.length()) {
               var1 = this.b.length;
               StringBuilder var20 = new StringBuilder();
               var20.append("[size=");
               var20.append(var1);
               var20.append(" text=");
               var20.append(var19);
               var20.append("…]");
               var9 = var20.toString();
            } else {
               var9 = c.aA(var19, "[text=", "]");
            }
         }
      }

      return var9;
   }
}
