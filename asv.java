import android.os.Trace;
import com.google.android.apps.camera.imax.cyclops.audio.CmJv.ytQQGGmniJK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class asv {
   public final List a;
   public List b;
   public List c;
   private final Set d;
   private final List e;
   private final List f;

   public asv(Set var1) {
      this.d = var1;
      this.e = new ArrayList();
      this.f = new ArrayList();
      this.a = new ArrayList();
   }

   public final void a() {
      if (!this.d.isEmpty()) {
         Trace.beginSection(ytQQGGmniJK.qSDzKul);

         label88: {
            Throwable var10000;
            label87: {
               Iterator var1;
               boolean var10001;
               try {
                  var1 = this.d.iterator();
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label87;
               }

               while(true) {
                  try {
                     if (!var1.hasNext()) {
                        break label88;
                     }

                     auq var2 = (auq)var1.next();
                     var1.remove();
                     var2.a();
                  } catch (Throwable var7) {
                     var10000 = var7;
                     var10001 = false;
                     break;
                  }
               }
            }

            Throwable var9 = var10000;
            Trace.endSection();
            throw var9;
         }

         Trace.endSection();
      }
   }

   public final void b() {
      List var3 = this.b;
      int var1;
      Throwable var77;
      Throwable var10000;
      boolean var10001;
      if (var3 != null && !var3.isEmpty()) {
         label1199: {
            Trace.beginSection("Compose:deactivations");

            label1176: {
               try {
                  var1 = var3.size() - 1;
               } catch (Throwable var76) {
                  var10000 = var76;
                  var10001 = false;
                  break label1176;
               }

               while(true) {
                  if (var1 < 0) {
                     Trace.endSection();
                     var3.clear();
                     break label1199;
                  }

                  try {
                     ((asi)var3.get(var1)).a();
                  } catch (Throwable var75) {
                     var10000 = var75;
                     var10001 = false;
                     break;
                  }

                  --var1;
               }
            }

            var77 = var10000;
            Trace.endSection();
            throw var77;
         }
      }

      if (!this.f.isEmpty()) {
         label1193: {
            Trace.beginSection("Compose:onForgotten");

            label1157: {
               try {
                  var1 = this.f.size() - 1;
               } catch (Throwable var74) {
                  var10000 = var74;
                  var10001 = false;
                  break label1157;
               }

               while(true) {
                  if (var1 < 0) {
                     Trace.endSection();
                     break label1193;
                  }

                  try {
                     auq var78 = (auq)this.f.get(var1);
                     if (!this.d.contains(var78)) {
                        var78.b();
                     }
                  } catch (Throwable var73) {
                     var10000 = var73;
                     var10001 = false;
                     break;
                  }

                  --var1;
               }
            }

            var77 = var10000;
            Trace.endSection();
            throw var77;
         }
      }

      if (!this.e.isEmpty()) {
         label1200: {
            Trace.beginSection("Compose:onRemembered");

            label1187: {
               int var2;
               try {
                  var3 = this.e;
                  var2 = var3.size();
               } catch (Throwable var72) {
                  var10000 = var72;
                  var10001 = false;
                  break label1187;
               }

               var1 = 0;

               while(true) {
                  if (var1 >= var2) {
                     Trace.endSection();
                     break label1200;
                  }

                  try {
                     auq var4 = (auq)var3.get(var1);
                     this.d.remove(var4);
                     var4.c();
                  } catch (Throwable var71) {
                     var10000 = var71;
                     var10001 = false;
                     break;
                  }

                  ++var1;
               }
            }

            var77 = var10000;
            Trace.endSection();
            throw var77;
         }
      }

      var3 = this.c;
      if (var3 != null && !var3.isEmpty()) {
         Trace.beginSection("Compose:releases");

         label1117: {
            try {
               var1 = var3.size() - 1;
            } catch (Throwable var70) {
               var10000 = var70;
               var10001 = false;
               break label1117;
            }

            while(true) {
               if (var1 < 0) {
                  Trace.endSection();
                  var3.clear();
                  return;
               }

               try {
                  ((asi)var3.get(var1)).b();
               } catch (Throwable var69) {
                  var10000 = var69;
                  var10001 = false;
                  break;
               }

               --var1;
            }
         }

         var77 = var10000;
         Trace.endSection();
         throw var77;
      }
   }

   public final void c(auq var1) {
      var1.getClass();
      int var2 = this.e.lastIndexOf(var1);
      if (var2 >= 0) {
         this.e.remove(var2);
         this.d.remove(var1);
      } else {
         this.f.add(var1);
      }
   }

   public final void d(auq var1) {
      var1.getClass();
      int var2 = this.f.lastIndexOf(var1);
      if (var2 >= 0) {
         this.f.remove(var2);
         this.d.remove(var1);
      } else {
         this.e.add(var1);
      }
   }
}
