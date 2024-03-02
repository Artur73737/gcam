package com.google.android.libraries.vision.visionkit.f250.internal.airlock.room;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class F250RoomDatabase_Impl extends F250RoomDatabase {
   private volatile .nzx l;
   private volatile .oah m;
   private volatile .oam n;
   private volatile .oaq o;
   private volatile .obu p;
   private volatile .oby q;
   private volatile .occ r;
   private volatile .ocq s;

   public final .obu A() {
      if (this.p != null) {
         return this.p;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            .obu var1;
            try {
               if (this.p == null) {
                  var1 = new .obu(this);
                  this.p = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               var1 = this.p;
               return var1;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label133;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public final .oby B() {
      if (this.q != null) {
         return this.q;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            .oby var1;
            try {
               if (this.q == null) {
                  var1 = new .oby();
                  this.q = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               var1 = this.q;
               return var1;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label133;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public final .occ C() {
      if (this.r != null) {
         return this.r;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.r == null) {
                  .ocj var1 = new .ocj(this);
                  this.r = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .occ var15 = this.r;
               return var15;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label133;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public final .ocq D() {
      if (this.s != null) {
         return this.s;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.s == null) {
                  .ode var1 = new .ode(this);
                  this.s = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .ocq var15 = this.s;
               return var15;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label133;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }
   }

   protected final .cra a() {
      HashMap var1 = new HashMap(1);
      var1.put("ResourceFts", "ResourceEntity");
      return new .cra(this, var1, new HashMap(0), new String[]{"ResourceEntity", "ResourceFts", "AnnotachmentEntity", "F250LogEntity"});
   }

   protected final .cse b(.cqv var1) {
      .csb var2 = new .csb(var1, new .obs(this), "12dd2799a8f9d4b7738f03f617a61c16", "310938173a165a0105beebc721adaaaa");
      .csc var3 = .cbv.l(var1.a, var1.b, var2, false, false);
      return var1.c.a(var3);
   }

   public final List e(Map var1) {
      return new ArrayList();
   }

   protected final Map f() {
      HashMap var1 = new HashMap();
      var1.put(.nzx.class, Collections.emptyList());
      var1.put(.oah.class, Collections.emptyList());
      var1.put(.oam.class, Collections.emptyList());
      var1.put(.oaq.class, Collections.emptyList());
      var1.put(.obu.class, Collections.emptyList());
      var1.put(.oby.class, Collections.emptyList());
      var1.put(.occ.class, Collections.emptyList());
      var1.put(.ocq.class, Collections.emptyList());
      var1.put(.obz.class, Collections.emptyList());
      return var1;
   }

   public final Set g() {
      return new HashSet();
   }

   public final .nzx w() {
      if (this.l != null) {
         return this.l;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.l == null) {
                  .oaf var1 = new .oaf(this);
                  this.l = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .nzx var15 = this.l;
               return var15;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label133;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public final .oah x() {
      if (this.m != null) {
         return this.m;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.m == null) {
                  .oak var1 = new .oak(this);
                  this.m = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .oah var15 = this.m;
               return var15;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label133;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public final .oam y() {
      if (this.n != null) {
         return this.n;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.n == null) {
                  .oao var1 = new .oao(this);
                  this.n = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .oam var15 = this.n;
               return var15;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label133;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public final .oaq z() {
      if (this.o != null) {
         return this.o;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.o == null) {
                  .oat var1 = new .oat(this);
                  this.o = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .oaq var15 = this.o;
               return var15;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label133;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }
   }
}
