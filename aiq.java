public final class aiq extends bba implements blv {
   public aip a;

   public aiq(aip var1) {
      this.a = var1;
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      if (Float.compare(this.a.a(var1.j()), 0.0F) >= 0 && Float.compare(this.a.a, 0.0F) >= 0 && Float.compare(this.a.b(var1.j()), 0.0F) >= 0 && Float.compare(this.a.b, 0.0F) >= 0) {
         int var5 = var1.eJ(this.a.a(var1.j())) + var1.eJ(this.a.b(var1.j()));
         int var6 = var1.eJ(this.a.a) + var1.eJ(this.a.b);
         bke var7 = var2.l(car.Z(var3, -var5, -var6));
         return ja.g(var1, car.W(var3, var7.a + var5), car.V(var3, var7.b + var6), new adb(var7, var1, this, 4, (byte[])null));
      } else {
         throw new IllegalArgumentException("Padding must be non-negative");
      }
   }
}
