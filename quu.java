public abstract class quu extends quo {
   public quu(que var1) {
      super(var1);
      if (var1 != null && var1.n() != quj.a) {
         throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
      }
   }

   public final qui n() {
      return quj.a;
   }
}
