public final class rjc extends rjd {
   public static final rjc a = new rjc();

   private rjc() {
      super(rjh.b, rjh.c, rjh.d);
   }

   public final void close() {
      throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
   }

   public final String toString() {
      return "Dispatchers.Default";
   }
}
