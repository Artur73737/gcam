final class dgy extends Throwable {
   public dgy() {
      super("Failure occurred while trying to finish a future.");
   }

   public final Throwable fillInStackTrace() {
      synchronized(this){}
      return this;
   }
}
