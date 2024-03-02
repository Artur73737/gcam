import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
public final class cof {
   private static final Object d = new Object();
   private static cof e;
   public final Context a;
   public final HashMap b = new HashMap();
   public final ArrayList c = new ArrayList();
   private final HashMap f = new HashMap();
   private final Handler g;

   private cof(Context var1) {
      this.a = var1;
      this.g = new cod(this, var1.getMainLooper());
   }

   public static cof a(Context var0) {
      Object var1 = d;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if (e == null) {
               cof var2 = new cof(var0.getApplicationContext());
               e = var2;
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            cof var16 = e;
            return var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var15 = var10000;

         try {
            throw var15;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            continue;
         }
      }
   }

   public final void b(BroadcastReceiver var1, IntentFilter var2) {
      HashMap var5 = this.b;
      synchronized(var5){}

      Throwable var10000;
      boolean var10001;
      label632: {
         ArrayList var4;
         coe var6;
         try {
            var6 = new coe(var2, var1);
            var4 = (ArrayList)this.b.get(var1);
         } catch (Throwable var78) {
            var10000 = var78;
            var10001 = false;
            break label632;
         }

         ArrayList var79;
         if (var4 == null) {
            try {
               var4 = new ArrayList(1);
               this.b.put(var1, var4);
            } catch (Throwable var77) {
               var10000 = var77;
               var10001 = false;
               break label632;
            }

            var79 = var4;
         } else {
            var79 = var4;
         }

         try {
            var79.add(var6);
         } catch (Throwable var76) {
            var10000 = var76;
            var10001 = false;
            break label632;
         }

         int var3 = 0;

         while(true) {
            String var81;
            try {
               if (var3 >= var2.countActions()) {
                  break;
               }

               var81 = var2.getAction(var3);
               var79 = (ArrayList)this.f.get(var81);
            } catch (Throwable var75) {
               var10000 = var75;
               var10001 = false;
               break label632;
            }

            if (var79 == null) {
               try {
                  var79 = new ArrayList(1);
                  this.f.put(var81, var79);
               } catch (Throwable var74) {
                  var10000 = var74;
                  var10001 = false;
                  break label632;
               }
            }

            try {
               var79.add(var6);
            } catch (Throwable var73) {
               var10000 = var73;
               var10001 = false;
               break label632;
            }

            ++var3;
         }

         label602:
         try {
            return;
         } catch (Throwable var72) {
            var10000 = var72;
            var10001 = false;
            break label602;
         }
      }

      while(true) {
         Throwable var80 = var10000;

         try {
            throw var80;
         } catch (Throwable var71) {
            var10000 = var71;
            var10001 = false;
            continue;
         }
      }
   }

   public final void c(BroadcastReceiver var1) {
      HashMap var5 = this.b;
      synchronized(var5){}

      Throwable var10000;
      boolean var10001;
      label988: {
         ArrayList var9;
         try {
            var9 = (ArrayList)this.b.remove(var1);
         } catch (Throwable var120) {
            var10000 = var120;
            var10001 = false;
            break label988;
         }

         if (var9 == null) {
            label951:
            try {
               return;
            } catch (Throwable var112) {
               var10000 = var112;
               var10001 = false;
               break label951;
            }
         } else {
            label984: {
               int var2;
               try {
                  var2 = var9.size() - 1;
               } catch (Throwable var117) {
                  var10000 = var117;
                  var10001 = false;
                  break label984;
               }

               label983:
               while(true) {
                  if (var2 < 0) {
                     try {
                        return;
                     } catch (Throwable var113) {
                        var10000 = var113;
                        var10001 = false;
                        break;
                     }
                  }

                  coe var7;
                  try {
                     var7 = (coe)var9.get(var2);
                     var7.d = true;
                  } catch (Throwable var116) {
                     var10000 = var116;
                     var10001 = false;
                     break;
                  }

                  int var3 = 0;

                  while(true) {
                     String var6;
                     ArrayList var10;
                     try {
                        if (var3 >= var7.a.countActions()) {
                           break;
                        }

                        var6 = var7.a.getAction(var3);
                        var10 = (ArrayList)this.f.get(var6);
                     } catch (Throwable var118) {
                        var10000 = var118;
                        var10001 = false;
                        break label983;
                     }

                     if (var10 != null) {
                        int var4;
                        try {
                           var4 = var10.size() - 1;
                        } catch (Throwable var115) {
                           var10000 = var115;
                           var10001 = false;
                           break label983;
                        }

                        while(true) {
                           if (var4 < 0) {
                              try {
                                 if (var10.size() <= 0) {
                                    this.f.remove(var6);
                                 }
                                 break;
                              } catch (Throwable var114) {
                                 var10000 = var114;
                                 var10001 = false;
                                 break label983;
                              }
                           }

                           try {
                              coe var8 = (coe)var10.get(var4);
                              if (var8.b == var1) {
                                 var8.d = true;
                                 var10.remove(var4);
                              }
                           } catch (Throwable var119) {
                              var10000 = var119;
                              var10001 = false;
                              break label983;
                           }

                           --var4;
                        }
                     }

                     ++var3;
                  }

                  --var2;
               }
            }
         }
      }

      while(true) {
         Throwable var121 = var10000;

         try {
            throw var121;
         } catch (Throwable var111) {
            var10000 = var111;
            var10001 = false;
            continue;
         }
      }
   }

   public final void d(Intent var1) {
      HashMap var9 = this.b;
      synchronized(var9){}

      Throwable var10000;
      boolean var10001;
      label2398: {
         boolean var3;
         String var7;
         String var8;
         Uri var10;
         String var11;
         Set var12;
         label2393: {
            label2392: {
               try {
                  var8 = var1.getAction();
                  var7 = var1.resolveTypeIfNeeded(this.a.getContentResolver());
                  var10 = var1.getData();
                  var11 = var1.getScheme();
                  var12 = var1.getCategories();
                  if ((var1.getFlags() & 8) != 0) {
                     break label2392;
                  }
               } catch (Throwable var286) {
                  var10000 = var286;
                  var10001 = false;
                  break label2398;
               }

               var3 = false;
               break label2393;
            }

            var3 = true;
         }

         StringBuilder var5;
         if (var3) {
            try {
               var5 = new StringBuilder();
               var5.append("Resolving type ");
               var5.append(var7);
               var5.append(" scheme ");
               var5.append(var11);
               var5.append(" of intent ");
               var5.append(var1);
            } catch (Throwable var285) {
               var10000 = var285;
               var10001 = false;
               break label2398;
            }
         }

         ArrayList var6;
         try {
            var6 = (ArrayList)this.f.get(var1.getAction());
         } catch (Throwable var284) {
            var10000 = var284;
            var10001 = false;
            break label2398;
         }

         if (var6 != null) {
            int var2;
            ArrayList var288;
            if (var3) {
               try {
                  var5 = new StringBuilder();
                  var5.append("Action list: ");
                  var5.append(var6);
               } catch (Throwable var281) {
                  var10000 = var281;
                  var10001 = false;
                  break label2398;
               }

               var288 = null;
               var2 = 0;
            } else {
               var288 = null;
               var2 = 0;
            }

            while(true) {
               coe var13;
               try {
                  if (var2 >= var6.size()) {
                     break;
                  }

                  var13 = (coe)var6.get(var2);
               } catch (Throwable var282) {
                  var10000 = var282;
                  var10001 = false;
                  break label2398;
               }

               if (var3) {
                  try {
                     StringBuilder var14 = new StringBuilder();
                     var14.append("Matching against filter ");
                     var14.append(var13.a);
                  } catch (Throwable var280) {
                     var10000 = var280;
                     var10001 = false;
                     break label2398;
                  }
               }

               label2401: {
                  try {
                     if (var13.c) {
                        break label2401;
                     }
                  } catch (Throwable var283) {
                     var10000 = var283;
                     var10001 = false;
                     break label2398;
                  }

                  int var4;
                  try {
                     IntentFilter var291 = var13.a;
                     var4 = var291.match(var8, var7, var11, var10, var12, "LocalBroadcastManager");
                  } catch (Throwable var279) {
                     var10000 = var279;
                     var10001 = false;
                     break label2398;
                  }

                  if (var4 >= 0) {
                     if (var3) {
                        try {
                           Integer.toHexString(var4);
                        } catch (Throwable var278) {
                           var10000 = var278;
                           var10001 = false;
                           break label2398;
                        }
                     }

                     if (var288 == null) {
                        try {
                           var288 = new ArrayList();
                        } catch (Throwable var277) {
                           var10000 = var277;
                           var10001 = false;
                           break label2398;
                        }
                     }

                     try {
                        var288.add(var13);
                        var13.c = true;
                     } catch (Throwable var276) {
                        var10000 = var276;
                        var10001 = false;
                        break label2398;
                     }
                  }
               }

               ++var2;
            }

            if (var288 != null) {
               var2 = 0;

               while(true) {
                  try {
                     if (var2 >= var288.size()) {
                        break;
                     }

                     ((coe)var288.get(var2)).c = false;
                  } catch (Throwable var274) {
                     var10000 = var274;
                     var10001 = false;
                     break label2398;
                  }

                  ++var2;
               }

               try {
                  ArrayList var290 = this.c;
                  ebt var289 = new ebt(var1, var288);
                  var290.add(var289);
                  if (!this.g.hasMessages(1)) {
                     this.g.sendEmptyMessage(1);
                  }
               } catch (Throwable var273) {
                  var10000 = var273;
                  var10001 = false;
                  break label2398;
               }

               try {
                  return;
               } catch (Throwable var272) {
                  var10000 = var272;
                  var10001 = false;
                  break label2398;
               }
            }
         }

         label2345:
         try {
            return;
         } catch (Throwable var275) {
            var10000 = var275;
            var10001 = false;
            break label2345;
         }
      }

      while(true) {
         Throwable var287 = var10000;

         try {
            throw var287;
         } catch (Throwable var271) {
            var10000 = var271;
            var10001 = false;
            continue;
         }
      }
   }
}
