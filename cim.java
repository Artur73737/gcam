import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.widget.ListView;

public final class cim {
   public static void a(ListView var0, int var1) {
      var0.scrollListBy(var1);
   }

   static boolean b(ListView var0, int var1) {
      return var0.canScrollList(var1);
   }

   public static boolean c(Editable var0, KeyEvent var1, boolean var2) {
      if (KeyEvent.metaStateHasNoModifiers(var1.getMetaState())) {
         int var4 = Selection.getSelectionStart(var0);
         int var3 = Selection.getSelectionEnd(var0);
         if (e(var4, var3)) {
            return false;
         }

         cjy[] var9 = (cjy[])var0.getSpans(var4, var3, cjy.class);
         if (var9 != null) {
            int var5 = var9.length;
            if (var5 > 0) {
               var3 = 0;

               int var6;
               int var7;
               while(true) {
                  if (var3 >= var5) {
                     return false;
                  }

                  cjy var8 = var9[var3];
                  var7 = var0.getSpanStart(var8);
                  var6 = var0.getSpanEnd(var8);
                  if (var2) {
                     if (var7 == var4) {
                        break;
                     }
                  } else if (var6 == var4) {
                     break;
                  }

                  if (var4 > var7 && var4 < var6) {
                     break;
                  }

                  ++var3;
               }

               var0.delete(var7, var6);
               return true;
            }
         }
      }

      return false;
   }

   public static boolean d(InputConnection var0, Editable var1, int var2, int var3, boolean var4) {
      if (var1 == null) {
         return false;
      } else if (var2 >= 0 && var3 >= 0) {
         int var8 = Selection.getSelectionStart(var1);
         int var9 = Selection.getSelectionEnd(var1);
         if (e(var8, var9)) {
            return false;
         } else {
            int var6;
            if (!var4) {
               var2 = Math.max(var8 - var2, 0);
               var3 = Math.min(var9 + var3, var1.length());
            } else {
               char var5;
               boolean var7;
               label132: {
                  label131: {
                     var6 = Math.max(var2, 0);
                     var2 = var1.length();
                     if (var8 >= 0) {
                        if (var2 < var8) {
                           var2 = -1;
                           break label132;
                        }

                        if (var6 < 0) {
                           break label131;
                        }

                        var7 = false;

                        while(true) {
                           var2 = var8;
                           if (var6 == 0) {
                              break label132;
                           }

                           --var8;
                           if (var8 < 0) {
                              if (!var7) {
                                 var2 = 0;
                                 break label132;
                              }
                              break label131;
                           }

                           var5 = var1.charAt(var8);
                           if (var7) {
                              if (!Character.isHighSurrogate(var5)) {
                                 var2 = -1;
                                 break label132;
                              }

                              --var6;
                              var7 = false;
                           } else if (!Character.isSurrogate(var5)) {
                              --var6;
                           } else {
                              if (Character.isHighSurrogate(var5)) {
                                 break;
                              }

                              var7 = true;
                           }
                        }
                     }

                     var2 = -1;
                     break label132;
                  }

                  var2 = -1;
               }

               label108: {
                  label107: {
                     var6 = Math.max(var3, 0);
                     var8 = var1.length();
                     if (var9 >= 0) {
                        if (var8 < var9) {
                           var3 = -1;
                           break label108;
                        }

                        if (var6 < 0) {
                           break label107;
                        }

                        var7 = false;
                        var3 = var9;

                        while(true) {
                           if (var6 == 0) {
                              break label108;
                           }

                           if (var3 >= var8) {
                              var3 = var8;
                              if (!var7) {
                                 break label108;
                              }
                              break label107;
                           }

                           var5 = var1.charAt(var3);
                           if (var7) {
                              if (!Character.isLowSurrogate(var5)) {
                                 var3 = -1;
                                 break label108;
                              }

                              ++var3;
                              --var6;
                              var7 = false;
                           } else if (!Character.isSurrogate(var5)) {
                              ++var3;
                              --var6;
                           } else {
                              if (Character.isLowSurrogate(var5)) {
                                 break;
                              }

                              ++var3;
                              var7 = true;
                           }
                        }
                     }

                     var3 = -1;
                     break label108;
                  }

                  var3 = -1;
               }

               if (var2 == -1 || var3 == -1) {
                  return false;
               }
            }

            cjy[] var11 = (cjy[])var1.getSpans(var2, var3, cjy.class);
            if (var11 != null) {
               int var12 = var11.length;
               if (var12 > 0) {
                  for(var6 = 0; var6 < var12; ++var6) {
                     cjy var10 = var11[var6];
                     var9 = var1.getSpanStart(var10);
                     var8 = var1.getSpanEnd(var10);
                     var2 = Math.min(var9, var2);
                     var3 = Math.max(var8, var3);
                  }

                  var2 = Math.max(var2, 0);
                  var3 = Math.min(var3, var1.length());
                  var0.beginBatchEdit();
                  var1.delete(var2, var3);
                  var0.endBatchEdit();
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean e(int var0, int var1) {
      return var0 == -1 || var1 == -1 || var0 != var1;
   }
}
