import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;

public final class bua {
   private final HashMap a;
   private final LinkedHashSet b;
   private int c;
   private final int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private final bte i = bte.f();

   public bua(int var1) {
      this.d = var1;
      this.a = new HashMap(0, 0.75F);
      this.b = new LinkedHashSet();
   }

   public final int a() {
      bte var2 = this.i;
      synchronized(var2){}

      int var1;
      try {
         var1 = this.c;
      } finally {
         ;
      }

      return var1;
   }

   public final Object b(Object var1) {
      bte var2 = this.i;
      synchronized(var2){}

      Throwable var10000;
      label113: {
         boolean var10001;
         Object var3;
         try {
            var3 = this.a.get(var1);
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label113;
         }

         if (var3 != null) {
            label106: {
               try {
                  this.b.remove(var1);
                  this.b.add(var1);
                  ++this.g;
               } catch (Throwable var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label106;
               }

               return var3;
            }
         } else {
            label109: {
               try {
                  ++this.h;
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label109;
               }

               return null;
            }
         }
      }

      Throwable var16 = var10000;
      throw var16;
   }

   public final Object c(Object var1, Object var2) {
      if (var1 != null) {
         bte var5 = this.i;
         synchronized(var5){}

         Object var6;
         Throwable var10000;
         boolean var10001;
         Throwable var118;
         label1327: {
            label1333: {
               try {
                  ++this.e;
                  this.c = this.a() + 1;
                  var6 = this.a.put(var1, var2);
               } catch (Throwable var117) {
                  var10000 = var117;
                  var10001 = false;
                  break label1333;
               }

               if (var6 != null) {
                  try {
                     this.c = this.a() - 1;
                  } catch (Throwable var116) {
                     var10000 = var116;
                     var10001 = false;
                     break label1333;
                  }
               }

               try {
                  if (this.b.contains(var1)) {
                     this.b.remove(var1);
                  }
               } catch (Throwable var115) {
                  var10000 = var115;
                  var10001 = false;
                  break label1333;
               }

               label1316:
               try {
                  this.b.add(var1);
                  break label1327;
               } catch (Throwable var114) {
                  var10000 = var114;
                  var10001 = false;
                  break label1316;
               }
            }

            var118 = var10000;
            throw var118;
         }

         int var4 = this.d;

         while(true) {
            var5 = this.i;
            synchronized(var5){}

            label1306: {
               label1305: {
                  label1304: {
                     label1303: {
                        label1302: {
                           IllegalStateException var120;
                           label1335: {
                              try {
                                 if (this.a() < 0 || this.a.isEmpty() && this.a() != 0) {
                                    break label1335;
                                 }
                              } catch (Throwable var113) {
                                 var10000 = var113;
                                 var10001 = false;
                                 break label1303;
                              }

                              try {
                                 if (this.a.isEmpty() != this.b.isEmpty()) {
                                    break label1335;
                                 }

                                 if (this.a() <= var4) {
                                    break label1304;
                                 }

                                 if (this.a.isEmpty()) {
                                    break label1305;
                                 }

                                 Iterator var119 = this.b.iterator();
                                 if (!var119.hasNext()) {
                                    break label1302;
                                 }

                                 var1 = var119.next();
                                 var2 = this.a.get(var1);
                              } catch (Throwable var112) {
                                 var10000 = var112;
                                 var10001 = false;
                                 break label1303;
                              }

                              if (var2 != null) {
                                 try {
                                    HashMap var7 = this.a;
                                    qxb.f(var7);
                                    var7.remove(var1);
                                    this.b.remove(var1);
                                    int var3 = this.a();
                                    var1.getClass();
                                    this.c = var3 - 1;
                                    ++this.f;
                                    break label1306;
                                 } catch (Throwable var111) {
                                    var10000 = var111;
                                    var10001 = false;
                                    break label1303;
                                 }
                              } else {
                                 try {
                                    var120 = new IllegalStateException("inconsistent state");
                                    throw var120;
                                 } catch (Throwable var108) {
                                    var10000 = var108;
                                    var10001 = false;
                                    break label1303;
                                 }
                              }
                           }

                           try {
                              var120 = new IllegalStateException("map/keySet size inconsistency");
                              throw var120;
                           } catch (Throwable var110) {
                              var10000 = var110;
                              var10001 = false;
                              break label1303;
                           }
                        }

                        label1272:
                        try {
                           NoSuchElementException var121 = new NoSuchElementException("Collection is empty.");
                           throw var121;
                        } catch (Throwable var109) {
                           var10000 = var109;
                           var10001 = false;
                           break label1272;
                        }
                     }

                     var118 = var10000;
                     throw var118;
                  }

                  var1 = null;
                  var2 = null;
                  break label1306;
               }

               var1 = null;
               var2 = null;
            }

            if (var1 == null && var2 == null) {
               return var6;
            }

            var1.getClass();
            var2.getClass();
         }
      } else {
         throw null;
      }
   }

   public final Object d(Object var1) {
      bte var2 = this.i;
      synchronized(var2){}

      Throwable var10000;
      label75: {
         boolean var10001;
         Object var3;
         try {
            var3 = this.a.remove(var1);
            this.b.remove(var1);
         } catch (Throwable var9) {
            var10000 = var9;
            var10001 = false;
            break label75;
         }

         if (var3 == null) {
            return var3;
         }

         label66:
         try {
            this.c = this.a() - 1;
            return var3;
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label66;
         }
      }

      Throwable var10 = var10000;
      throw var10;
   }

   public final String toString() {
      bte var3 = this.i;
      synchronized(var3){}

      Throwable var10000;
      label128: {
         int var1;
         boolean var10001;
         int var2;
         try {
            var2 = this.g;
            var1 = this.h + var2;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label128;
         }

         if (var1 != 0) {
            try {
               var1 = var2 * 100 / var1;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label128;
            }
         } else {
            var1 = 0;
         }

         label115:
         try {
            StringBuilder var17 = new StringBuilder();
            var17.append("LruCache[maxSize=");
            var17.append(this.d);
            var17.append(",hits=");
            var17.append(this.g);
            var17.append(",misses=");
            var17.append(this.h);
            var17.append(",hitRate=");
            var17.append(var1);
            var17.append("%]");
            String var18 = var17.toString();
            return var18;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label115;
         }
      }

      Throwable var4 = var10000;
      throw var4;
   }
}
