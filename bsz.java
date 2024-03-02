import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

public final class bsz {
   public final Layout a;
   private final List b;
   private final List c;
   private final boolean[] d;
   private char[] e;

   public bsz(Layout var1) {
      this.a = var1;
      ArrayList var5 = new ArrayList();
      byte var4 = 0;
      int var3 = 0;

      int var2;
      do {
         CharSequence var6 = this.a.getText();
         var6.getClass();
         var2 = qwp.s(var6, '\n', var3, 4);
         if (var2 < 0) {
            var2 = this.a.getText().length();
         } else {
            ++var2;
         }

         var5.add(var2);
         var3 = var2;
      } while(var2 < this.a.getText().length());

      this.b = var5;
      var3 = var5.size();
      ArrayList var7 = new ArrayList(var3);

      for(var2 = var4; var2 < var3; ++var2) {
         var7.add((Object)null);
      }

      this.c = var7;
      this.d = new boolean[this.b.size()];
      this.b.size();
   }

   private final float e(int var1, boolean var2) {
      int var4 = this.a.getLineForOffset(var1);
      var1 = qxb.l(var1, this.a.getLineEnd(var4));
      float var3;
      if (var2) {
         var3 = this.a.getPrimaryHorizontal(var1);
      } else {
         var3 = this.a.getSecondaryHorizontal(var1);
      }

      return var3;
   }

   public final float a(int var1, boolean var2, boolean var3) {
      int var6 = var1;
      if (!var3) {
         return this.e(var1, var2);
      } else {
         Layout var17 = this.a;
         byte var8 = 0;
         boolean var15 = false;
         byte var9 = 0;
         int var5;
         int var7;
         int var10;
         if (var1 <= 0) {
            var5 = 0;
         } else if (var1 >= var17.getText().length()) {
            var5 = var17.getLineCount() - 1;
         } else {
            var5 = var17.getLineForOffset(var1);
            var7 = var17.getLineStart(var5);
            var10 = var17.getLineEnd(var5);
            if ((var7 == var1 || var10 == var1) && var7 == var1) {
               --var5;
            }
         }

         int var11 = this.a.getLineStart(var5);
         int var12 = this.a.getLineEnd(var5);
         if (var1 != var11 && var1 != var12) {
            return this.e(var1, var2);
         } else if (var1 != 0 && var1 != this.a.getText().length()) {
            var1 = pwm.aK(this.b, var1);
            if (var1 < 0) {
               var1 = -(var1 + 1);
            } else {
               ++var1;
            }

            var7 = var1;
            if (var1 > 0) {
               List var20 = this.b;
               var10 = var1 - 1;
               var7 = var1;
               if (var6 == ((Number)var20.get(var10)).intValue()) {
                  var7 = var10;
               }
            }

            var3 = this.d(var7);
            var12 = this.c(var12, var11);
            var10 = this.b(var7);
            int var13;
            Bidi var21;
            if (this.d[var7]) {
               var21 = (Bidi)this.c.get(var7);
            } else {
               if (var7 == 0) {
                  var1 = 0;
               } else {
                  var1 = ((Number)this.b.get(var7 - 1)).intValue();
               }

               int var14;
               char[] var18;
               label224: {
                  var14 = ((Number)this.b.get(var7)).intValue();
                  var13 = var14 - var1;
                  char[] var22 = this.e;
                  if (var22 != null) {
                     var18 = var22;
                     if (var22.length >= var13) {
                        break label224;
                     }
                  }

                  var18 = new char[var13];
               }

               TextUtils.getChars(this.a.getText(), var1, var14, var18, 0);
               if (Bidi.requiresBidi(var18, 0, var13)) {
                  var21 = new Bidi(var18, 0, (byte[])null, 0, var13, this.d(var7));
                  if (var21.getRunCount() == 1) {
                     var21 = null;
                  }
               } else {
                  var21 = null;
               }

               this.c.set(var7, var21);
               this.d[var7] = true;
               char[] var19 = var18;
               if (var21 != null) {
                  var19 = this.e;
                  if (var18 == var19) {
                     var19 = null;
                  }
               }

               this.e = var19;
            }

            if (var21 != null) {
               var21 = var21.createLineBidi(var11 - var10, var12 - var10);
            } else {
               var21 = null;
            }

            if (var21 != null && var21.getRunCount() != 1) {
               var10 = var21.getRunCount();
               bsy[] var23 = new bsy[var10];

               for(var1 = 0; var1 < var10; ++var1) {
                  var7 = var21.getRunStart(var1);
                  var13 = var21.getRunLimit(var1);
                  if (var21.getRunLevel(var1) % 2 == 1) {
                     var15 = true;
                  } else {
                     var15 = false;
                  }

                  var23[var1] = new bsy(var7 + var11, var13 + var11, var15);
               }

               var7 = var21.getRunCount();
               byte[] var24 = new byte[var7];

               for(var1 = 0; var1 < var7; ++var1) {
                  var24[var1] = (byte)var21.getRunLevel(var1);
               }

               Bidi.reorderVisually(var24, 0, var23, 0, var10);
               bsy var25;
               if (var6 == var11) {
                  var1 = 0;

                  while(true) {
                     if (var1 >= var10) {
                        var1 = -1;
                        break;
                     }

                     if (var23[var1].a == var6) {
                        break;
                     }

                     ++var1;
                  }

                  var25 = var23[var1];
                  if (var2 || var3 == var25.c) {
                     if (!var3) {
                        var3 = true;
                     } else {
                        var3 = false;
                     }
                  }

                  if (var1 == 0) {
                     if (var3) {
                        return this.a.getLineLeft(var5);
                     }

                     var1 = var9;
                  }

                  if (var1 == pwm.aX(var23) && !var3) {
                     return this.a.getLineRight(var5);
                  } else {
                     return var3 ? this.a.getPrimaryHorizontal(var23[var1 - 1].a) : this.a.getPrimaryHorizontal(var23[var1 + 1].a);
                  }
               } else {
                  var7 = var6;
                  if (var6 > var12) {
                     var7 = this.c(var6, var11);
                  }

                  var1 = 0;

                  while(true) {
                     if (var1 >= var10) {
                        var1 = -1;
                        break;
                     }

                     if (var23[var1].b == var7) {
                        break;
                     }

                     ++var1;
                  }

                  var25 = var23[var1];
                  if (!var2 && var3 != var25.c) {
                     if (!var3) {
                        var3 = true;
                     } else {
                        var3 = false;
                     }
                  }

                  if (var1 == 0) {
                     if (var3) {
                        return this.a.getLineLeft(var5);
                     }

                     var1 = var8;
                  }

                  if (var1 == pwm.aX(var23) && !var3) {
                     return this.a.getLineRight(var5);
                  } else {
                     return var3 ? this.a.getPrimaryHorizontal(var23[var1 - 1].b) : this.a.getPrimaryHorizontal(var23[var1 + 1].b);
                  }
               }
            } else {
               boolean var16 = this.a.isRtlCharAt(var11);
               if (!var2 && var3 != var16) {
                  var2 = var3;
               } else if (!var3) {
                  var2 = true;
               } else {
                  var2 = var15;
               }

               float var4;
               label266: {
                  if (var6 == var11) {
                     if (var2) {
                        break label266;
                     }
                  } else if (!var2) {
                     break label266;
                  }

                  var4 = this.a.getLineRight(var5);
                  return var4;
               }

               var4 = this.a.getLineLeft(var5);
               return var4;
            }
         } else {
            return this.e(var1, var2);
         }
      }
   }

   public final int b(int var1) {
      return var1 == 0 ? 0 : ((Number)this.b.get(var1 - 1)).intValue();
   }

   public final int c(int var1, int var2) {
      while(true) {
         int var4;
         label32: {
            if (var1 > var2) {
               CharSequence var6 = this.a.getText();
               var4 = var1 - 1;
               char var5 = var6.charAt(var4);
               if (var5 == ' ' || var5 == '\n' || var5 == 5760) {
                  break label32;
               }

               char var3 = var5;
               if (qwp.a(var5, 8192) >= 0) {
                  var3 = var5;
                  if (qwp.a(var5, 8202) <= 0) {
                     if (var5 != 8199) {
                        break label32;
                     }

                     var3 = 8199;
                  }
               }

               if (var3 == 8287 || var3 == 12288) {
                  break label32;
               }
            }

            return var1;
         }

         var1 = var4;
      }
   }

   public final boolean d(int var1) {
      var1 = this.a.getLineForOffset(this.b(var1));
      return this.a.getParagraphDirection(var1) == -1;
   }
}
