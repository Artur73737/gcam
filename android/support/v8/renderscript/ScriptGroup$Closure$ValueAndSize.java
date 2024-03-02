package android.support.v8.renderscript;

final class ScriptGroup$Closure$ValueAndSize {
   public int size;
   public long value;

   public ScriptGroup$Closure$ValueAndSize(RenderScript var1, Object var2) {
      if (var2 instanceof Allocation) {
         this.value = ((Allocation)var2).getID(var1);
         this.size = -1;
      } else if (var2 instanceof Boolean) {
         long var3;
         if (!(Boolean)var2) {
            var3 = 0L;
         } else {
            var3 = 1L;
         }

         this.value = var3;
         this.size = 4;
      } else if (var2 instanceof Integer) {
         this.value = ((Integer)var2).longValue();
         this.size = 4;
      } else if (var2 instanceof Long) {
         this.value = (Long)var2;
         this.size = 8;
      } else if (var2 instanceof Float) {
         this.value = (long)Float.floatToRawIntBits((Float)var2);
         this.size = 4;
      } else {
         if (var2 instanceof Double) {
            this.value = Double.doubleToRawLongBits((Double)var2);
            this.size = 8;
         }

      }
   }
}
