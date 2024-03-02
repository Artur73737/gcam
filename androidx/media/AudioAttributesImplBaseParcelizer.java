package androidx.media;

public class AudioAttributesImplBaseParcelizer {
   public static AudioAttributesImplBase read(.cve var0) {
      AudioAttributesImplBase var1 = new AudioAttributesImplBase();
      var1.a = var0.a(var1.a, 1);
      var1.b = var0.a(var1.b, 2);
      var1.c = var0.a(var1.c, 3);
      var1.d = var0.a(var1.d, 4);
      return var1;
   }

   public static void write(AudioAttributesImplBase var0, .cve var1) {
      var1.h(var0.a, 1);
      var1.h(var0.b, 2);
      var1.h(var0.c, 3);
      var1.h(var0.d, 4);
   }
}
