import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

public final class crb {
   public final List a;
   public Executor b;
   public csd c;
   private final Context d;
   private final Class e;
   private final String f;
   private final List g;
   private final List h;
   private Executor i;
   private boolean j;
   private boolean k;
   private boolean l;
   private final Set m;
   private Set n;
   private final gfv o;

   public crb(Context var1, Class var2, String var3) {
      this.d = var1;
      this.e = var2;
      this.f = var3;
      this.a = new ArrayList();
      this.g = new ArrayList();
      this.h = new ArrayList();
      this.k = true;
      this.o = new gfv((byte[])null, (short[])null);
      this.m = new LinkedHashSet();
   }

   public final crc a() {
      Executor var6 = this.b;
      if (var6 == null && this.i == null) {
         var6 = px.a;
         this.i = var6;
         this.b = var6;
      } else if (var6 != null && this.i == null) {
         this.i = var6;
      } else if (var6 == null) {
         this.b = this.i;
      }

      Set var15 = this.n;
      int var1;
      if (var15 != null) {
         Iterator var16 = var15.iterator();

         while(var16.hasNext()) {
            var1 = ((Number)var16.next()).intValue();
            if (!(this.m.contains(var1) ^ true)) {
               throw new IllegalArgumentException(c.aE(var1, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "));
            }
         }
      }

      csd var7 = this.c;
      Object var17 = var7;
      if (var7 == null) {
         var17 = new csn();
      }

      Context var9 = this.d;
      String var8 = this.f;
      gfv var11 = this.o;
      List var10 = this.a;
      boolean var4 = this.j;
      Object var18 = var9.getSystemService("activity");
      ActivityManager var19;
      if (var18 instanceof ActivityManager) {
         var19 = (ActivityManager)var18;
      } else {
         var19 = null;
      }

      byte var13 = 2;
      if (var19 != null && !var19.isLowRamDevice()) {
         var13 = 3;
      }

      Executor var21 = this.b;
      if (var21 == null) {
         IllegalArgumentException var36 = new IllegalArgumentException("Required value was null.");
         throw var36;
      } else {
         Executor var12 = this.i;
         if (var12 == null) {
            throw new IllegalArgumentException("Required value was null.");
         } else {
            cqv var25 = new cqv(var9, var8, (csd)var17, var11, var10, var4, var13, var21, var12, this.k, this.l, this.m, this.g, this.h);
            crc var20 = (crc)cbj.g(this.e);
            var20.d = var20.b(var25);
            var15 = var20.g();
            BitSet var23 = new BitSet();
            Iterator var29 = var15.iterator();

            while(true) {
               var4 = var29.hasNext();
               byte var2 = -1;
               Class var22;
               StringBuilder var27;
               if (!var4) {
                  var1 = var25.l.size() - 1;
                  int var14;
                  if (var1 >= 0) {
                     while(true) {
                        var14 = var1 - 1;
                        if (!var23.get(var1)) {
                           throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }

                        if (var14 < 0) {
                           break;
                        }

                        var1 = var14;
                     }
                  }

                  Iterator var33 = var20.e(var20.h).iterator();

                  while(true) {
                     crl var30;
                     do {
                        boolean var5 = var33.hasNext();
                        var4 = false;
                        if (!var5) {
                           if ((cri)crc.v(cri.class, var20.c()) != null) {
                              throw null;
                           }

                           if ((cqp)crc.v(cqp.class, var20.c()) != null) {
                              throw null;
                           }

                           if (var25.m == 3) {
                              var4 = true;
                           }

                           csm var31 = (csm)var20.c();
                           if (var31.f.b()) {
                              cbv.n(var31.b(), var4);
                           }

                           var31.g = var4;
                           var20.g = var25.d;
                           var20.b = var25.f;
                           var20.c = new dgl(var25.g, 1, (byte[])null);
                           var20.f = var25.e;
                           Map var32 = var20.f();
                           var23 = new BitSet();
                           var29 = var32.entrySet().iterator();

                           while(var29.hasNext()) {
                              Entry var34 = (Entry)var29.next();
                              var22 = (Class)var34.getKey();
                              Iterator var38 = ((List)var34.getValue()).iterator();

                              while(var38.hasNext()) {
                                 Class var37;
                                 label205: {
                                    var37 = (Class)var38.next();
                                    var1 = var25.k.size() - 1;
                                    if (var1 >= 0) {
                                       while(true) {
                                          var14 = var1 - 1;
                                          if (var37.isAssignableFrom(var25.k.get(var1).getClass())) {
                                             var23.set(var1);
                                             break label205;
                                          }

                                          if (var14 < 0) {
                                             break;
                                          }

                                          var1 = var14;
                                       }
                                    }

                                    var1 = -1;
                                 }

                                 if (var1 < 0) {
                                    var27 = new StringBuilder();
                                    var27.append("A required type converter (");
                                    var27.append(var37);
                                    var27.append(") for ");
                                    var27.append(var22.getCanonicalName());
                                    var27.append(" is missing in the database configuration.");
                                    throw new IllegalArgumentException(var27.toString());
                                 }

                                 var20.k.put(var37, var25.k.get(var1));
                              }
                           }

                           var1 = var25.k.size() - 1;
                           if (var1 >= 0) {
                              while(true) {
                                 var14 = var1 - 1;
                                 if (!var23.get(var1)) {
                                    var18 = var25.k.get(var1);
                                    StringBuilder var35 = new StringBuilder();
                                    var35.append("Unexpected type converter ");
                                    var35.append(var18);
                                    var35.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    throw new IllegalArgumentException(var35.toString());
                                 }

                                 if (var14 < 0) {
                                    break;
                                 }

                                 var1 = var14;
                              }
                           }

                           return var20;
                        }

                        var30 = (crl)var33.next();
                        gfv var24 = var25.n;
                        var1 = var30.a;
                        var14 = var30.b;
                        var18 = var24.a;
                        Integer var26 = var1;
                        if (!((Map)var18).containsKey(var26)) {
                           break;
                        }

                        Map var28 = (Map)((Map)var18).get(var26);
                        var17 = var28;
                        if (var28 == null) {
                           var17 = qtg.a;
                        }
                     } while(((Map)var17).containsKey(var14));

                     var25.n.w(var30);
                  }
               }

               label206: {
                  var22 = (Class)var29.next();
                  var1 = var25.l.size() - 1;
                  if (var1 >= 0) {
                     while(true) {
                        int var3 = var1 - 1;
                        if (var22.isAssignableFrom(var25.l.get(var1).getClass())) {
                           var23.set(var1);
                           break label206;
                        }

                        if (var3 < 0) {
                           break;
                        }

                        var1 = var3;
                     }
                  }

                  var1 = var2;
               }

               if (var1 < 0) {
                  var27 = new StringBuilder();
                  var27.append("A required auto migration spec (");
                  var27.append(var22.getCanonicalName());
                  var27.append(") is missing in the database configuration.");
                  throw new IllegalArgumentException(var27.toString());
               }

               var20.h.put(var22, var25.l.get(var1));
            }
         }
      }
   }

   public final void b(crl... var1) {
      Set var3 = this.n;
      int var2 = 0;
      if (var3 == null) {
         this.n = new HashSet();
      }

      while(var2 <= 0) {
         crl var5 = var1[var2];
         Set var4 = this.n;
         var4.getClass();
         var4.add(var5.a);
         var4 = this.n;
         var4.getClass();
         var4.add(var5.b);
         ++var2;
      }

      this.o.w((crl[])Arrays.copyOf(var1, 1));
   }

   public final void c() {
      this.j = true;
   }

   public final void d() {
      this.k = false;
      this.l = true;
   }
}
