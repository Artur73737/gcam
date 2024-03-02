import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraCharacteristics.Key;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import com.google.android.clockwork.common.wearable.wearmaterial.button.jKIE.tRYpVduhjf;
import com.google.android.material.search.Ztp.sYWXtqVx;
import com.google.googlex.gcam.base.HmAh.RbaSbznIXS;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class wa implements AutoCloseable {
   public final ws a;
   public final wk b;
   public final sx c;
   public final wu d;
   public final fwf e;
   private final int f;
   private final vv g;
   private final we h;
   private final wk i;
   private final jmt j;

   public wa(qr var1, sz var2, fwf var3, wk var4, wk var5, ws var6, jmt var7, wu var8, sx var9, ns var10, wn var11) {
      var2.getClass();
      var3.getClass();
      var4.getClass();
      var5.getClass();
      var6.getClass();
      var7.getClass();
      var8.getClass();
      var9.getClass();
      var10.getClass();
      var11.getClass();
      super();
      this.e = var3;
      this.i = var4;
      this.b = var5;
      this.a = var6;
      this.j = var7;
      this.d = var8;
      this.c = var9;
      this.f = wb.a.b();
      this.g = new vv();
      this.h = new we();
      String var26 = pwm.aN(var1.l, (CharSequence)null, (CharSequence)null, (CharSequence)null, (qvt)null, 63);
      Key var19 = CameraCharacteristics.LENS_FACING;
      var19.getClass();
      Integer var20 = (Integer)var2.b(var19);
      String var24 = "Unknown";
      String var22;
      if (var20 != null && var20 == 0) {
         var22 = "Front";
      } else if (var20 != null && var20 == 1) {
         var22 = "Back";
      } else if (var20 != null && var20 == 2) {
         var22 = "External";
      } else {
         var22 = "Unknown";
      }

      qt var34 = var1.f;
      if (c.E(var34, qt.b)) {
         var24 = "High Speed";
      } else if (c.E(var34, qt.a)) {
         var24 = "Normal";
      } else if (c.E(var34, qt.c)) {
         var24 = "Extension";
      }

      Key var36 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
      var36.getClass();
      int[] var15 = (int[])var2.b(var36);
      String var17;
      if (var15 != null && pwm.bd(var15, 11)) {
         var17 = "Logical";
      } else {
         var17 = "Physical";
      }

      StringBuilder var37 = new StringBuilder();
      StringBuilder var38 = new StringBuilder();
      var38.append(this);
      var38.append(" (Camera ");
      var38.append(var1.a);
      var38.append(")\n");
      var37.append(var38.toString());
      if (var26.length() > 0) {
         var38 = new StringBuilder();
         var38.append("  Shared:    ");
         var38.append(var26);
         var38.append('\n');
         var37.append(var38.toString());
      }

      StringBuilder var27 = new StringBuilder();
      var27.append("  Facing:    ");
      var27.append(var22);
      var27.append(" (");
      var27.append(var17);
      var27.append(")\n");
      var37.append(var27.toString());
      StringBuilder var21 = new StringBuilder();
      var21.append("  Mode:      ");
      var21.append(var24);
      var21.append('\n');
      var37.append(var21.toString());
      var37.append("Outputs:\n");
      Iterator var29 = var6.c.iterator();

      while(var29.hasNext()) {
         Iterator var30 = ((rc)var29.next()).b.iterator();

         for(int var12 = 0; var30.hasNext(); ++var12) {
            Object var23 = var30.next();
            if (var12 < 0) {
               pwm.ap();
            }

            wq var31 = (wq)var23;
            var37.append("  ");
            if (var12 == 0) {
               rc var28 = var31.f;
               rc var25 = var28;
               if (var28 == null) {
                  qwp.b("stream");
                  var25 = null;
               }

               var17 = ry.b(var25.a);
            } else {
               var17 = "";
            }

            var37.append(qwp.v(var17, 12));
            var37.append(qwp.v(rn.a(var31.a), 12));
            var17 = var31.b.toString();
            var17.getClass();
            var37.append(qwp.v(var17, 12));
            var37.append(qwp.v(rx.b(var31.c), 16));
            if (!c.E(var31.d, var1.a)) {
               var37.append(" [");
               var37.append(qu.a(var31.d));
               var37.append("]");
            }

            var37.append("\n");
         }
      }

      var37.append("Session Template: TEMPLATE_PREVIEW\n");
      nd.b(var37, "Session Parameters");
      var37.append("Default Template: TEMPLATE_PREVIEW\n");
      nd.b(var37, "Default Parameters");
      nd.b(var37, sYWXtqVx.cqhSV);
      if (c.E(var1.f, qt.b)) {
         if (!this.a.d.isEmpty()) {
            List var13;
            if (this.a.d.size() > 2) {
               var21 = new StringBuilder();
               var21.append("Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
               var13 = this.a.d;
               var21.append(var13);
               throw new IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ".concat(var13.toString()));
            } else {
               var13 = this.a.d;
               wq var32;
               if (!var13.isEmpty()) {
                  for(Iterator var14 = var13.iterator(); var14.hasNext(); var32 = (wq)var14.next()) {
                  }
               }

               var13 = this.a.d;
               wq var16;
               if (!var13.isEmpty()) {
                  for(Iterator var33 = var13.iterator(); var33.hasNext(); var16 = (wq)var33.next()) {
                  }
               }

               StringBuilder var18;
               List var35;
               if (this.a.d.size() == 2) {
                  var18 = new StringBuilder();
                  var18.append("Cannot create a HIGH_SPEED CameraGraph without setting the Preview Video stream. Configured outputs are ");
                  var35 = this.a.d;
                  var18.append(var35);
                  throw new IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph without setting the Preview Video stream. Configured outputs are ".concat(var35.toString()));
               } else {
                  var18 = new StringBuilder();
                  var18.append("Cannot create a HIGH_SPEED CameraGraph without having a Preview or Video stream. Configured outputs are ");
                  var35 = this.a.d;
                  var18.append(var35);
                  throw new IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph without having a Preview or Video stream. Configured outputs are ".concat(var35.toString()));
               }
            }
         } else {
            throw new IllegalArgumentException(tRYpVduhjf.xpSZCEHYfXyu);
         }
      }
   }

   public final Object a(que var1) {
      vz var30;
      label344: {
         if (var1 instanceof vz) {
            vz var5 = (vz)var1;
            int var2 = var5.c;
            if ((var2 & Integer.MIN_VALUE) != 0) {
               var5.c = var2 + Integer.MIN_VALUE;
               var30 = var5;
               break label344;
            }
         }

         var30 = new vz(this, var1);
      }

      Object var35 = var30.a;
      qul var6 = qul.a;
      wa var31;
      switch(var30.c) {
      case 0:
         pwm.bs(var35);
         StringBuilder var36 = new StringBuilder();
         var36.append(this);
         var36.append("#acquireSession");
         Trace.beginSection(this.toString().concat("#acquireSession"));
         vv var37 = this.g;
         var30.d = this;
         var30.c = 1;
         qza var7 = new qza(quy.h(var30), 1);
         var7.r();
         ArrayDeque var32 = var37.b;
         synchronized(var32){}

         label336: {
            Throwable var10000;
            label348: {
               boolean var10001;
               label334: {
                  label333: {
                     long var3;
                     try {
                        if (var37.c) {
                           break label333;
                        }

                        if (!var37.b.isEmpty()) {
                           break label334;
                        }

                        var3 = Math.min(var37.d, 1L);
                     } catch (Throwable var29) {
                        var10000 = var29;
                        var10001 = false;
                        break label348;
                     }

                     if (var3 >= 1L) {
                        try {
                           var37.d -= var3;
                           vu var8 = new vu(var37, var3);
                           var7.gP(var8);
                           break label336;
                        } catch (Throwable var27) {
                           var10000 = var27;
                           var10001 = false;
                           break label348;
                        }
                     }
                     break label334;
                  }

                  try {
                     throw vv.a;
                  } catch (Throwable var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label348;
                  }
               }

               try {
                  ArrayDeque var9 = var37.b;
                  bnc var41 = new bnc(var7);
                  var9.add(var41);
               } catch (Throwable var28) {
                  var10000 = var28;
                  var10001 = false;
                  break label348;
               }

               var7.s(new ou(var37, 6));
               break label336;
            }

            Throwable var40 = var10000;
            throw var40;
         }

         var35 = var7.c();
         if (var35 == var6) {
            return var6;
         }

         var31 = this;
         break;
      case 1:
         var31 = var30.d;
         pwm.bs(var35);
         break;
      default:
         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }

      vu var38 = (vu)var35;
      wk var39 = var31.i;
      we var33 = var31.h;
      wc var34 = new wc(var38, var39);
      Trace.endSection();
      return var34;
   }

   public final void b(int var1, Surface var2) {
      StringBuilder var4 = new StringBuilder();
      String var5 = ry.b(var1);
      var4.append(var5);
      var4.append("#setSurface");
      Trace.beginSection(var5.concat("#setSurface"));
      if (var2 != null && !var2.isValid()) {
         var4 = new StringBuilder();
         var4.append(this);
         var4.append("#setSurface: ");
         var4.append(var2);
         var4.append(" is invalid");
         Log.w("CXCP", var4.toString());
      }

      jmt var6 = this.j;
      Object var7 = var6.c;
      synchronized(var7){}

      label2750: {
         Throwable var10000;
         boolean var10001;
         AutoCloseable var252;
         Throwable var253;
         label2731: {
            AutoCloseable var255;
            label2730: {
               label2740: {
                  try {
                     if (var6.b) {
                        var4 = new StringBuilder();
                        var4.append("Attempted to set ");
                        var4.append(ry.b(var1));
                        var4.append(" to ");
                        var4.append(var2);
                        var4.append(" after close!");
                        Log.w("CXCP", var4.toString());
                        break label2750;
                     }
                  } catch (Throwable var251) {
                     var10000 = var251;
                     var10001 = false;
                     break label2740;
                  }

                  if (var2 != null) {
                     try {
                        var4 = new StringBuilder();
                        var4.append("Configured ");
                        var4.append(ry.b(var1));
                        var4.append(" to use ");
                        var4.append(var2);
                     } catch (Throwable var250) {
                        var10000 = var250;
                        var10001 = false;
                        break label2740;
                     }
                  } else {
                     try {
                        var4 = new StringBuilder();
                        var4.append("Removed surface for ");
                        var4.append(ry.b(var1));
                     } catch (Throwable var249) {
                        var10000 = var249;
                        var10001 = false;
                        break label2740;
                     }
                  }

                  var5 = null;
                  var255 = null;
                  if (var2 == null) {
                     label2741: {
                        try {
                           var2 = (Surface)((Map)var6.g).remove(ry.a(var1));
                        } catch (Throwable var246) {
                           var10000 = var246;
                           var10001 = false;
                           break label2741;
                        }

                        if (var2 == null) {
                           var252 = var5;
                           break label2731;
                        }

                        label2703:
                        try {
                           var252 = (AutoCloseable)var6.a.remove(var2);
                           break label2731;
                        } catch (Throwable var245) {
                           var10000 = var245;
                           var10001 = false;
                           break label2703;
                        }
                     }
                  } else {
                     label2742: {
                        Surface var256;
                        try {
                           var256 = (Surface)((Map)var6.g).get(ry.a(var1));
                           ry var8 = ry.a(var1);
                           ((Map)var6.g).put(var8, var2);
                        } catch (Throwable var248) {
                           var10000 = var248;
                           var10001 = false;
                           break label2742;
                        }

                        try {
                           if (c.E(var256, var2)) {
                              break label2730;
                           }

                           if (!var6.a.containsKey(var2)) {
                              Map var258 = var6.a;
                              qxb.f(var258);
                              var255 = (AutoCloseable)var258.remove(var256);
                              AutoCloseable var259 = ((rf)var6.d).a(var2);
                              var6.a.put(var2, var259);
                              break label2730;
                           }
                        } catch (Throwable var247) {
                           var10000 = var247;
                           var10001 = false;
                           break label2742;
                        }

                        label2649:
                        try {
                           String var257 = c.aF(var2, "Surface (", ") is already in use!");
                           IllegalStateException var254 = new IllegalStateException(var257);
                           throw var254;
                        } catch (Throwable var237) {
                           var10000 = var237;
                           var10001 = false;
                           break label2649;
                        }
                     }
                  }
               }

               var253 = var10000;
               throw var253;
            }

            var252 = var255;
         }

         Object var260 = var6.c;
         synchronized(var260){}

         Object var263;
         label2696: {
            label2744: {
               Iterator var264;
               try {
                  var263 = new LinkedHashMap();
                  var264 = ((ws)var6.f).b.iterator();
               } catch (Throwable var244) {
                  var10000 = var244;
                  var10001 = false;
                  break label2744;
               }

               label2691:
               while(true) {
                  wp var265;
                  Iterator var11;
                  try {
                     if (!var264.hasNext()) {
                        break label2696;
                     }

                     var265 = (wp)var264.next();
                     var11 = var265.f.iterator();
                  } catch (Throwable var243) {
                     var10000 = var243;
                     var10001 = false;
                     break;
                  }

                  while(true) {
                     while(true) {
                        Surface var9;
                        rc var10;
                        try {
                           if (!var11.hasNext()) {
                              continue label2691;
                           }

                           var10 = (rc)var11.next();
                           var9 = (Surface)((Map)var6.g).get(ry.a(var10.a));
                        } catch (Throwable var240) {
                           var10000 = var240;
                           var10001 = false;
                           break label2691;
                        }

                        if (var9 == null) {
                           try {
                              if (!var265.a()) {
                                 var263 = qtg.a;
                                 break label2696;
                              }
                           } catch (Throwable var242) {
                              var10000 = var242;
                              var10001 = false;
                              break label2691;
                           }
                        } else {
                           try {
                              ((Map)var263).put(ry.a(var10.a), var9);
                           } catch (Throwable var241) {
                              var10000 = var241;
                              var10001 = false;
                              break label2691;
                           }
                        }
                     }
                  }
               }
            }

            var253 = var10000;
            throw var253;
         }

         if (!((Map)var263).isEmpty()) {
            label2749: {
               Object var261 = var6.e;
               var260 = ((sx)var261).b;
               synchronized(var260){}

               label2748: {
                  boolean var3;
                  try {
                     var3 = c.E(((sx)var261).g, qk.a);
                  } catch (Throwable var239) {
                     var10000 = var239;
                     var10001 = false;
                     break label2748;
                  }

                  if (var3) {
                     break label2749;
                  }

                  tz var262;
                  try {
                     ((sx)var261).e = (Map)var263;
                     var262 = ((sx)var261).d;
                  } catch (Throwable var238) {
                     var10000 = var238;
                     var10001 = false;
                     break label2748;
                  }

                  if (var262 != null) {
                     var262.b((Map)var263);
                  }
                  break label2749;
               }

               var253 = var10000;
               throw var253;
            }
         }

         if (var252 != null) {
            var252.close();
         }
      }

      Trace.endSection();
   }

   public final void close() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this);
      var1.append("#close");
      Trace.beginSection(this.toString().concat("#close"));
      var1 = new StringBuilder();
      var1.append(RbaSbznIXS.vtIaipPaHHwzya);
      var1.append(this);
      this.g.close();
      this.i.b();
      fwf var2 = this.e;
      sx var4 = this.c;
      Object var35 = var2.e;
      synchronized(var35){}

      label296: {
         Throwable var10000;
         label300: {
            LinkedHashSet var3;
            boolean var10001;
            try {
               var4.a();
               if (!((Map)var2.c).containsKey(qj.a())) {
                  break label296;
               }

               var3 = (LinkedHashSet)((Map)var2.c).get(qj.a());
            } catch (Throwable var34) {
               var10000 = var34;
               var10001 = false;
               break label300;
            }

            if (var3 != null) {
               try {
                  var3.remove(var4);
               } catch (Throwable var33) {
                  var10000 = var33;
                  var10001 = false;
                  break label300;
               }
            }

            if (var3 == null) {
               break label296;
            }

            rbd var37;
            try {
               if (var3.size() != 0) {
                  break label296;
               }

               ((Map)var2.c).remove(qj.a());
               var37 = (rbd)((Map)var2.b).get(qj.a());
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label300;
            }

            if (var37 != null) {
               try {
                  qxb.r(var37);
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break label300;
               }
            }

            label280:
            try {
               ((Map)var2.b).remove(qj.a());
               break label296;
            } catch (Throwable var30) {
               var10000 = var30;
               var10001 = false;
               break label280;
            }
         }

         Throwable var36 = var10000;
         throw var36;
      }

      this.j.g();
      Trace.endSection();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("CameraGraph-");
      var1.append(this.f);
      return var1.toString();
   }
}
