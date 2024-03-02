import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class tz implements ue {
   public final qzv a;
   public final Object b;
   public tl c;
   public int d;
   private final tt e;
   private final rf f;
   private final int g;
   private final qyq h;
   private final Map i;
   private vt j;
   private tu k;
   private Map l;
   private Map m;
   private boolean n;
   private Map o;
   private final Map p;
   private final wk q;
   private final ve r;

   public tz(wk var1, tt var2, ve var3, rf var4, qzv var5) {
      this.q = var1;
      this.e = var2;
      this.r = var3;
      this.f = var4;
      this.a = var5;
      this.g = ua.a.b();
      this.b = new Object();
      this.h = qwp.i(false);
      this.i = DesugarCollections.synchronizedMap(new HashMap());
      this.d = 1;
      this.p = new LinkedHashMap();
   }

   public final void a(tk param1) {
      // $FF: Couldn't be decompiled
   }

   public final void b(Map var1) {
      Object var6 = this.b;
      synchronized(var6){}

      Throwable var10000;
      label2033: {
         int var2;
         boolean var10001;
         try {
            var2 = this.d;
         } catch (Throwable var250) {
            var10000 = var250;
            var10001 = false;
            break label2033;
         }

         if (var2 == 4 || var2 == 5) {
            return;
         }

         Map var5;
         try {
            var5 = this.o;
         } catch (Throwable var249) {
            var10000 = var249;
            var10001 = false;
            break label2033;
         }

         Object var4 = var5;
         if (var5 == null) {
            try {
               var4 = qtg.a;
            } catch (Throwable var248) {
               var10000 = var248;
               var10001 = false;
               break label2033;
            }
         }

         Set var7;
         Set var8;
         Iterator var9;
         try {
            var7 = pwm.aG(((Map)var4).values());
            var8 = pwm.aG(var1.values());
            var9 = pwm.Y(var7, var8).iterator();
         } catch (Throwable var247) {
            var10000 = var247;
            var10001 = false;
            break label2033;
         }

         label2015:
         while(true) {
            boolean var3;
            try {
               var3 = var9.hasNext();
            } catch (Throwable var244) {
               var10000 = var244;
               var10001 = false;
               break;
            }

            var5 = null;
            if (!var3) {
               Iterator var258;
               try {
                  var258 = pwm.Y(var8, var7).iterator();
               } catch (Throwable var242) {
                  var10000 = var242;
                  var10001 = false;
                  break;
               }

               while(true) {
                  try {
                     if (!var258.hasNext()) {
                        break;
                     }

                     Surface var261 = (Surface)var258.next();
                     AutoCloseable var256 = this.f.a(var261);
                     this.p.put(var261, var256);
                  } catch (Throwable var243) {
                     var10000 = var243;
                     var10001 = false;
                     break label2015;
                  }
               }

               try {
                  this.o = var1;
                  var5 = this.l;
               } catch (Throwable var241) {
                  var10000 = var241;
                  var10001 = false;
                  break;
               }

               qzv var253;
               if (var5 != null) {
                  label2036: {
                     LinkedHashMap var259;
                     Iterator var252;
                     try {
                        if (this.m != null) {
                           break label2036;
                        }

                        var259 = new LinkedHashMap();
                        var252 = var1.entrySet().iterator();
                     } catch (Throwable var239) {
                        var10000 = var239;
                        var10001 = false;
                        break;
                     }

                     while(true) {
                        try {
                           if (!var252.hasNext()) {
                              break;
                           }

                           Entry var263 = (Entry)var252.next();
                           if (var5.containsKey(var263.getKey())) {
                              var259.put(var263.getKey(), var263.getValue());
                           }
                        } catch (Throwable var240) {
                           var10000 = var240;
                           var10001 = false;
                           break label2015;
                        }
                     }

                     try {
                        if (var259.size() == var5.size()) {
                           this.m = var259;
                           var253 = this.a;
                           tw var260 = new tw(this, (que)null);
                           qwo.o(var253, (qui)null, 0, var260, 3);
                        }
                     } catch (Throwable var238) {
                        var10000 = var238;
                        var10001 = false;
                        break;
                     }
                  }
               }

               try {
                  var253 = this.a;
                  tx var262 = new tx(this, (que)null);
                  qwo.o(var253, (qui)null, 0, var262, 3);
                  return;
               } catch (Throwable var237) {
                  var10000 = var237;
                  var10001 = false;
                  break;
               }
            }

            Surface var10;
            AutoCloseable var255;
            try {
               var10 = (Surface)var9.next();
               var255 = (AutoCloseable)this.p.remove(var10);
            } catch (Throwable var246) {
               var10000 = var246;
               var10001 = false;
               break;
            }

            if (var255 != null) {
               try {
                  var255.close();
               } catch (Throwable var245) {
                  var10000 = var245;
                  var10001 = false;
                  break;
               }
            } else {
               var255 = var5;
            }

            if (var255 == null) {
               try {
                  String var257 = c.aF(var10, "Surface ", " doesn't have a matching surface token!");
                  IllegalStateException var251 = new IllegalStateException(var257);
                  throw var251;
               } catch (Throwable var236) {
                  var10000 = var236;
                  var10001 = false;
                  break;
               }
            }
         }
      }

      Throwable var254 = var10000;
      throw var254;
   }

   public final void c() {
      Object var7 = this.b;
      synchronized(var7){}

      Throwable var6;
      Throwable var10000;
      boolean var10001;
      tu var167;
      label1780: {
         label1784: {
            int var1;
            try {
               var1 = this.d;
            } catch (Throwable var165) {
               var10000 = var165;
               var10001 = false;
               break label1784;
            }

            if (var1 == 4) {
               var167 = null;
               break label1780;
            }

            if (var1 == 5) {
               var167 = null;
               break label1780;
            }

            label1773:
            try {
               this.d = 4;
               var167 = this.k;
               this.k = null;
               break label1780;
            } catch (Throwable var164) {
               var10000 = var164;
               var10001 = false;
               break label1773;
            }
         }

         var6 = var10000;
         throw var6;
      }

      wl var169;
      if (var167 != null) {
         var169 = var167.b;
      } else {
         var169 = null;
      }

      if (var169 != null) {
         StringBuilder var168 = new StringBuilder();
         var168.append(this);
         var168.append(" Shutdown");
         var168 = new StringBuilder();
         var168.append(this);
         var168.append("#shutdown");
         Trace.beginSection(this.toString().concat("#shutdown"));
         var168 = new StringBuilder();
         wk var8 = this.q;
         var168.append(var8);
         var168.append("#onGraphStopped");
         Trace.beginSection(var8.toString().concat("#onGraphStopped"));
         wk var9 = this.q;
         var168 = new StringBuilder();
         var168.append(var9);
         var168.append(" onGraphStopped");
         var9.g.d(rj.a);
         Object var170 = var9.b;
         synchronized(var170){}

         label1764: {
            label1786: {
               boolean var5;
               try {
                  var5 = var9.f;
               } catch (Throwable var163) {
                  var10000 = var163;
                  var10001 = false;
                  break label1786;
               }

               if (var5) {
                  break label1764;
               }

               wl var171;
               try {
                  var171 = var9.e;
               } catch (Throwable var162) {
                  var10000 = var162;
                  var10001 = false;
                  break label1786;
               }

               if (var169 == var171) {
                  try {
                     var9.e = null;
                  } catch (Throwable var161) {
                     var10000 = var161;
                     var10001 = false;
                     break label1786;
                  }

                  var169 = var171;
               } else {
                  try {
                     var168 = new StringBuilder();
                     var168.append("Refusing to detach ");
                     var168.append(var169);
                     var168.append(". It is different from ");
                     var168.append(var9.e);
                     Log.w("CXCP", var168.toString());
                  } catch (Throwable var160) {
                     var10000 = var160;
                     var10001 = false;
                     break label1786;
                  }

                  var169 = null;
               }

               if (var169 != null) {
                  synchronized(var169){}

                  try {
                     var169.a();
                  } finally {
                     ;
                  }
               }
               break label1764;
            }

            var6 = var10000;
            throw var6;
         }

         Trace.endSection();
         Trace.endSection();
      }

      var7 = this.b;
      synchronized(var7){}

      long var3;
      boolean var166;
      label1743: {
         label1787: {
            int var2;
            try {
               var2 = this.d;
            } catch (Throwable var159) {
               var10000 = var159;
               var10001 = false;
               break label1787;
            }

            var166 = false;
            var3 = 0L;
            if (var2 != 5) {
               label1737: {
                  label1736: {
                     label1788: {
                        try {
                           if (this.c == null) {
                              break label1788;
                           }

                           if (!this.n) {
                              break label1736;
                           }
                        } catch (Throwable var158) {
                           var10000 = var158;
                           var10001 = false;
                           break label1787;
                        }

                        try {
                           if (c.n(0, 1)) {
                              break label1788;
                           }
                        } catch (Throwable var157) {
                           var10000 = var157;
                           var10001 = false;
                           break label1787;
                        }

                        try {
                           if (!c.n(0, 2)) {
                              break label1737;
                           }
                        } catch (Throwable var156) {
                           var10000 = var156;
                           var10001 = false;
                           break label1787;
                        }

                        var3 = 2000L;
                     }

                     var166 = true;
                     break label1737;
                  }

                  var166 = true;
               }
            }

            label1719:
            try {
               this.c = null;
               this.d = 5;
               break label1743;
            } catch (Throwable var155) {
               var10000 = var155;
               var10001 = false;
               break label1719;
            }
         }

         var6 = var10000;
         throw var6;
      }

      if (var166) {
         this.e(var3);
      }

   }

   public final void d(boolean var1) {
      Object var13 = this.b;
      synchronized(var13){}

      tu var10;
      Map var11;
      Map var12;
      try {
         var10 = this.k;
         var11 = this.l;
         var12 = this.m;
      } finally {
         ;
      }

      if (var10 != null && var11 != null && var12 != null) {
         StringBuilder var96 = new StringBuilder();
         var96.append(this);
         var96.append("#finalizeOutputConfigurations");
         Trace.beginSection(this.toString().concat("#finalizeOutputConfigurations"));
         long var8 = SystemClock.elapsedRealtimeNanos();
         Iterator var97 = var11.entrySet().iterator();

         while(var97.hasNext()) {
            Entry var14 = (Entry)var97.next();
            int var4 = ((ry)var14.getKey()).a;
            sm var15 = (sm)var14.getValue();
            Object var98 = var12.get(ry.a(var4));
            if (var98 == null) {
               throw new IllegalStateException("Required value was null.");
            }

            var15.b((Surface)var98);
         }

         LinkedHashSet var100 = new LinkedHashSet();
         var97 = var11.entrySet().iterator();

         while(var97.hasNext()) {
            var100.add((sm)((Entry)var97.next()).getValue());
         }

         List var99 = pwm.aD(var100);
         var10.a.h(var99);
         var13 = this.b;
         synchronized(var13){}

         Throwable var10000;
         boolean var10001;
         boolean var88;
         Throwable var89;
         StringBuilder var93;
         label1075: {
            label1074: {
               label1098: {
                  int var5;
                  try {
                     var5 = this.d;
                  } catch (Throwable var87) {
                     var10000 = var87;
                     var10001 = false;
                     break label1098;
                  }

                  var88 = false;
                  if (var5 != 3) {
                     break label1075;
                  }

                  long var6;
                  Iterator var91;
                  ArrayList var101;
                  try {
                     this.i.putAll(var12);
                     var6 = SystemClock.elapsedRealtimeNanos();
                     var93 = new StringBuilder();
                     var93.append("Finalized ");
                     var101 = new ArrayList(var11.size());
                     var91 = var11.entrySet().iterator();
                  } catch (Throwable var85) {
                     var10000 = var85;
                     var10001 = false;
                     break label1098;
                  }

                  while(true) {
                     try {
                        if (!var91.hasNext()) {
                           break;
                        }

                        var101.add(ry.a(((ry)((Entry)var91.next()).getKey()).a));
                     } catch (Throwable var86) {
                        var10000 = var86;
                        var10001 = false;
                        break label1098;
                     }
                  }

                  String var92;
                  try {
                     var93.append(var101);
                     var93.append(" for ");
                     var93.append(this);
                     var93.append(" in ");
                     var92 = c.aK(3, "%.", "f ms");
                  } catch (Throwable var84) {
                     var10000 = var84;
                     var10001 = false;
                     break label1098;
                  }

                  double var2 = (double)(var6 - var8);
                  Double.isNaN(var2);
                  var2 /= 1000000.0D;

                  label1055:
                  try {
                     var92 = String.format((Locale)null, var92, Arrays.copyOf(new Object[]{var2}, 1));
                     var92.getClass();
                     var93.append(var92);
                     break label1074;
                  } catch (Throwable var83) {
                     var10000 = var83;
                     var10001 = false;
                     break label1055;
                  }
               }

               var89 = var10000;
               throw var89;
            }

            var88 = true;
         }

         if (var88 && var1) {
            label1102: {
               wk var94 = this.q;
               wl var90 = var10.b;
               var93 = new StringBuilder();
               var93.append(var94);
               var93.append(" onGraphModified");
               Object var95 = var94.b;
               synchronized(var95){}

               label1100: {
                  try {
                     var1 = var94.f;
                  } catch (Throwable var82) {
                     var10000 = var82;
                     var10001 = false;
                     break label1100;
                  }

                  if (var1) {
                     break label1102;
                  }

                  wl var102;
                  try {
                     var102 = var94.e;
                  } catch (Throwable var81) {
                     var10000 = var81;
                     var10001 = false;
                     break label1100;
                  }

                  if (var90 == var102) {
                     var94.c();
                  }
                  break label1102;
               }

               var89 = var10000;
               throw var89;
            }
         }

         Trace.endSection();
      }
   }

   public final void e(long var1) {
      if (var1 != 0L) {
         qwo.o(this.a, (qui)null, 0, new ty(var1, this, (que)null), 3);
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("Finalizing ");
         var3.append(this);
         Object var7 = this.b;
         synchronized(var7){}

         List var4;
         try {
            var4 = pwm.aD(this.p.values());
            this.p.clear();
         } finally {
            ;
         }

         Iterator var8 = var4.iterator();

         while(var8.hasNext()) {
            ((AutoCloseable)var8.next()).close();
         }

      }
   }

   public final void f() {
      if (this.h.d(false, true)) {
         StringBuilder var1 = new StringBuilder();
         var1.append(this);
         var1.append(" Finalizing Session");
         var1 = new StringBuilder();
         var1.append(this);
         var1.append("#onSessionFinalized");
         Trace.beginSection(this.toString().concat("#onSessionFinalized"));
         this.c();
         this.e(0L);
         Trace.endSection();
      }

   }

   public final void g() {
      Object var4 = this.b;
      synchronized(var4){}

      Throwable var139;
      Throwable var10000;
      label1429: {
         int var1;
         boolean var10001;
         try {
            var1 = this.d;
         } catch (Throwable var138) {
            var10000 = var138;
            var10001 = false;
            break label1429;
         }

         if (var1 != 1) {
            return;
         }

         Map var2;
         tl var3;
         try {
            var2 = this.o;
            var3 = this.c;
         } catch (Throwable var137) {
            var10000 = var137;
            var10001 = false;
            break label1429;
         }

         if (var2 == null || var3 == null) {
            return;
         }

         try {
            this.d = 2;
            this.n = true;
            this.j = vt.a(SystemClock.elapsedRealtimeNanos());
         } catch (Throwable var136) {
            var10000 = var136;
            var10001 = false;
            break label1429;
         }

         StringBuilder var143 = new StringBuilder();
         var143.append("Creating CameraCaptureSession from ");
         var143.append(qu.b(var3.b()));
         var143.append(" using ");
         var143.append(this);
         var143.append(" with ");
         var143.append(var2);
         var143 = new StringBuilder();
         var143.append("CameraDevice-");
         var143.append(var3.b());
         var143.append("#createCaptureSession");
         String var145 = var143.toString();

         Map var146;
         try {
            Trace.beginSection(var145);
            var146 = this.e.a(var3, var2, this);
         } finally {
            Trace.endSection();
         }

         Object var142 = this.b;
         synchronized(var142){}

         label1430: {
            try {
               var1 = this.d;
            } catch (Throwable var135) {
               var10000 = var135;
               var10001 = false;
               break label1430;
            }

            StringBuilder var140;
            if (var1 != 4 && var1 != 5) {
               if (var1 == 2) {
                  label1390: {
                     label1434: {
                        Map var147;
                        try {
                           this.d = 3;
                           this.i.putAll(var2);
                           if (var146.isEmpty()) {
                              break label1434;
                           }

                           StringBuilder var5 = new StringBuilder();
                           var5.append("Created ");
                           var5.append(this);
                           var5.append(" with ");
                           var5.append(pwm.aD(var2.keySet()));
                           var5.append(". Waiting to finalize ");
                           var5.append(pwm.aD(var146.keySet()));
                           this.l = var146;
                           var147 = this.o;
                        } catch (Throwable var132) {
                           var10000 = var132;
                           var10001 = false;
                           break label1390;
                        }

                        LinkedHashMap var141;
                        if (var147 == null) {
                           var141 = null;
                        } else {
                           Iterator var149;
                           try {
                              var141 = new LinkedHashMap();
                              var149 = var147.entrySet().iterator();
                           } catch (Throwable var130) {
                              var10000 = var130;
                              var10001 = false;
                              break label1390;
                           }

                           label1382:
                           while(true) {
                              try {
                                 Entry var6;
                                 do {
                                    if (!var149.hasNext()) {
                                       break label1382;
                                    }

                                    var6 = (Entry)var149.next();
                                 } while(!var146.containsKey(var6.getKey()));

                                 var141.put(var6.getKey(), var6.getValue());
                              } catch (Throwable var131) {
                                 var10000 = var131;
                                 var10001 = false;
                                 break label1390;
                              }
                           }
                        }

                        if (var141 != null) {
                           try {
                              if (var141.size() == var146.size()) {
                                 this.m = var141;
                              }
                           } catch (Throwable var129) {
                              var10000 = var129;
                              var10001 = false;
                              break label1390;
                           }
                        }
                     }

                     this.a((tk)null);
                     return;
                  }
               } else {
                  label1392:
                  try {
                     var140 = new StringBuilder();
                     var140.append("Unexpected state: ");
                     var140.append(la.b(this.d));
                     String var144 = var140.toString();
                     IllegalStateException var148 = new IllegalStateException(var144);
                     throw var148;
                  } catch (Throwable var133) {
                     var10000 = var133;
                     var10001 = false;
                     break label1392;
                  }
               }
            } else {
               label1435: {
                  try {
                     var140 = new StringBuilder();
                     var140.append("Warning: ");
                     var140.append(this);
                     var140.append(" was ");
                     var140.append(la.b(this.d));
                     var140.append(" while configuration was in progress.");
                  } catch (Throwable var134) {
                     var10000 = var134;
                     var10001 = false;
                     break label1435;
                  }

                  return;
               }
            }
         }

         var139 = var10000;
         throw var139;
      }

      var139 = var10000;
      throw var139;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CaptureSessionState-");
      var1.append(this.g);
      return var1.toString();
   }
}
