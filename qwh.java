import java.io.Serializable;

public abstract class qwh implements Serializable, qxr {
   public static final Object d;
   private transient qxr a;
   private final Class b;
   private final boolean c;
   protected final Object e;
   public final String f;
   public final String g;

   static {
      d = qwg.a;
   }

   protected qwh(Object var1, Class var2, String var3, String var4, boolean var5) {
      this.e = var1;
      this.b = var2;
      this.f = var3;
      this.g = var4;
      this.c = var5;
   }

   public final qxr c() {
      qxr var1 = this.a;
      if (var1 == null) {
         this.g();
         this.a = this;
         return this;
      } else {
         return var1;
      }
   }

   public final qxt e() {
      Object var1;
      if (this.c) {
         var1 = new qws(this.b);
      } else {
         var1 = qxa.a(this.b);
      }

      return (qxt)var1;
   }

   public final Object f() {
      throw null;
   }

   protected abstract void g();
}
