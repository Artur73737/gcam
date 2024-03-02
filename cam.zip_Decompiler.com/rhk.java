final class rhk extends rfl implements rfy {
   public rhk(int var1) {
      super(1, Integer.MAX_VALUE, 2);
      this.c(var1);
   }

   public final void m(int var1) {
      synchronized(this){}

      try {
         this.c(((Number)this.f()).intValue() + var1);
      } finally {
         ;
      }

   }
}
