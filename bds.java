public final class bds extends bba implements blv {
   public float a;
   public float b;
   public float c;
   public float d;
   public float e;
   public long f;
   public bdr g;
   public boolean h;
   public long i;
   public long j;
   public final qvt k;

   public bds(float var1, float var2, float var3, float var4, float var5, long var6, bdr var8, boolean var9, long var10, long var12) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var8;
      this.h = var9;
      this.i = var10;
      this.j = var12;
      this.k = new arh(this, 14);
   }

   public final bju a(bjw var1, bjs var2, long var3) {
      bke var5 = var2.l(var3);
      return ja.g(var1, var5.a, var5.b, new bos(var5, this, 1, (byte[])null));
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SimpleGraphicsLayerModifier(scaleX=");
      var1.append(this.a);
      var1.append(", scaleY=");
      var1.append(this.b);
      var1.append(", alpha = ");
      var1.append(this.c);
      var1.append(", translationX=");
      var1.append(0.0F);
      var1.append(", translationY=");
      var1.append(0.0F);
      var1.append(", shadowElevation=");
      var1.append(0.0F);
      var1.append(", rotationX=");
      var1.append(0.0F);
      var1.append(", rotationY=");
      var1.append(0.0F);
      var1.append(", rotationZ=");
      var1.append(this.d);
      var1.append(", cameraDistance=");
      var1.append(this.e);
      var1.append(", transformOrigin=");
      var1.append(bdx.d(this.f));
      var1.append(", shape=");
      var1.append(this.g);
      var1.append(", clip=");
      var1.append(this.h);
      var1.append(", renderEffect=");
      var1.append((Object)null);
      var1.append(", ambientShadowColor=");
      var1.append(bcy.h(this.i));
      var1.append(", spotShadowColor=");
      var1.append(bcy.h(this.j));
      var1.append(", compositingStrategy=");
      var1.append("CompositingStrategy(value=0)");
      var1.append(')');
      return var1.toString();
   }

   public final boolean v() {
      return false;
   }
}
