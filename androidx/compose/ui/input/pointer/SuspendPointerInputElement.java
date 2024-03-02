package androidx.compose.ui.input.pointer;

public final class SuspendPointerInputElement extends .bmp {
   private final Object a;
   private final Object b;
   private final Object[] c;
   private final .qvx e;

   // $FF: synthetic method
   public SuspendPointerInputElement(Object var1, Object var2, .qvx var3, int var4) {
      if (1 == (var4 & 1)) {
         var1 = null;
      }

      this.a = var1;
      if ((var4 & 2) != 0) {
         var2 = null;
      }

      this.b = var2;
      this.c = null;
      this.e = var3;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof SuspendPointerInputElement)) {
         return false;
      } else {
         Object var2 = this.a;
         SuspendPointerInputElement var3 = (SuspendPointerInputElement)var1;
         if (!.c.E(var2, var3.a)) {
            return false;
         } else if (!.c.E(this.b, var3.b)) {
            return false;
         } else {
            Object[] var4 = var3.c;
            return true;
         }
      }
   }

   public final int hashCode() {
      Object var3 = this.a;
      int var2 = 0;
      int var1;
      if (var3 != null) {
         var1 = var3.hashCode();
      } else {
         var1 = 0;
      }

      var3 = this.b;
      if (var3 != null) {
         var2 = var3.hashCode();
      }

      return (var1 * 31 + var2) * 31;
   }
}
