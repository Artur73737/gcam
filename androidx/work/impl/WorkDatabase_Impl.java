package androidx.work.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl extends WorkDatabase {
   private volatile .dfc l;
   private volatile .dec m;
   private volatile .dfv n;
   private volatile .del o;
   private volatile .der p;
   private volatile .deu q;
   private volatile .deg r;

   public final .deu A() {
      if (this.q != null) {
         return this.q;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.q == null) {
                  .dey var1 = new .dey(this);
                  this.q = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .deu var15 = this.q;
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

   public final .dfc B() {
      if (this.l != null) {
         return this.l;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.l == null) {
                  .dfu var1 = new .dfu(this);
                  this.l = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .dfc var15 = this.l;
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

   public final .dfv C() {
      if (this.n != null) {
         return this.n;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.n == null) {
                  .dfy var1 = new .dfy(this);
                  this.n = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .dfv var15 = this.n;
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
      return new .cra(this, new HashMap(0), new HashMap(0), new String[]{"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference"});
   }

   protected final .cse b(.cqv var1) {
      .csb var2 = new .csb(var1, new .dbs(this), "ff623b5805f7c7c572be3a6645e301d5", "ff5bc7e1b7e1da6007bd41e3ca407959");
      .csc var3 = .cbv.l(var1.a, var1.b, var2, false, false);
      return var1.c.a(var3);
   }

   public final List e(Map var1) {
      return Arrays.asList(new .dbn(), new .dbo(), new .dbp(), new .dbq(), new .dbr());
   }

   protected final Map f() {
      HashMap var1 = new HashMap();
      var1.put(.dfc.class, Collections.emptyList());
      var1.put(.dec.class, Collections.emptyList());
      var1.put(.dfv.class, Collections.emptyList());
      var1.put(.del.class, Collections.emptyList());
      var1.put(.der.class, Collections.emptyList());
      var1.put(.deu.class, Collections.emptyList());
      var1.put(.deg.class, Collections.emptyList());
      var1.put(.dej.class, Collections.emptyList());
      return var1;
   }

   public final Set g() {
      return new HashSet();
   }

   public final .dec w() {
      if (this.m != null) {
         return this.m;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.m == null) {
                  .dee var1 = new .dee(this);
                  this.m = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .dec var15 = this.m;
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

   public final .deg x() {
      if (this.r != null) {
         return this.r;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.r == null) {
                  .dei var1 = new .dei(this);
                  this.r = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .deg var15 = this.r;
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

   public final .del y() {
      if (this.o != null) {
         return this.o;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.o == null) {
                  .dep var1 = new .dep(this);
                  this.o = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .del var15 = this.o;
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

   public final .der z() {
      if (this.p != null) {
         return this.p;
      } else {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (this.p == null) {
                  .det var1 = new .det(this);
                  this.p = var1;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               .der var15 = this.p;
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
