final class bp implements qi {
   final Object a;
   private final int b;

   public bp(Object var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final Object a(Object var1) {
      switch(this.b) {
      case 0:
         return this.a;
      default:
         bv var2 = (bv)this.a;
         cd var3 = var2.A;
         pn var4;
         if (var3 instanceof po) {
            var4 = var3.c();
         } else {
            var4 = var2.requireActivity().h;
         }

         return var4;
      }
   }
}
