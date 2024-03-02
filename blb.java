public final class blb implements bbv {
   public static final blb a = new blb();
   public static Boolean b;

   private blb() {
   }

   public final void a(boolean var1) {
      b = var1;
   }

   public final boolean b() {
      Boolean var1 = b;
      if (var1 != null) {
         return var1;
      } else {
         throw new IllegalStateException("canFocus is read before it is written");
      }
   }
}
