public final class any {
   private final int a;

   // $FF: synthetic method
   public any(int var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      boolean var3 = var1 instanceof any;
      int var2 = this.a;
      return var3 && var2 == ((any)var1).a;
   }

   public final int hashCode() {
      return this.a;
   }

   public final String toString() {
      return !c.n(this.a, 0) ? "FabPosition.End" : "FabPosition.Center";
   }
}
