import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class die {
   public static final Map a;

   static {
      HashMap var0 = new HashMap();
      a = var0;
      din var1 = new din();
      var1.q();
      var0.put("dc:contributor", var1);
      var0.put("dc:language", var1);
      var0.put("dc:publisher", var1);
      var0.put("dc:relation", var1);
      var0.put("dc:subject", var1);
      var0.put("dc:type", var1);
      var1 = new din();
      var1.q();
      var1.t();
      var0.put("dc:creator", var1);
      var0.put("dc:date", var1);
      var1 = new din();
      var1.q();
      var1.t();
      var1.s();
      var1.r();
      var0.put("dc:description", var1);
      var0.put("dc:rights", var1);
      var0.put("dc:title", var1);
   }

   public static void a(did var0, did var1, boolean var2) {
      if (var0.b.equals(var1.b) && var0.a() == var1.a()) {
         if (!var2 && (!var0.a.equals(var1.a) || !var0.g().equals(var1.g()) || var0.b() != var1.b())) {
            throw new dhl("Mismatch between alias and base nodes", 203);
         } else {
            Iterator var3 = var0.h();
            Iterator var4 = var1.h();

            while(var3.hasNext() && var4.hasNext()) {
               a((did)var3.next(), (did)var4.next(), false);
            }

            Iterator var6 = var0.i();
            Iterator var7 = var1.i();

            while(var6.hasNext() && var7.hasNext()) {
               a((did)var6.next(), (did)var7.next(), false);
            }

         }
      } else {
         dhl var5 = new dhl("Mismatch between alias and base nodes", 203);
         throw var5;
      }
   }

   public static void b(did var0) {
      if (var0 != null && var0.g().d()) {
         din var1 = var0.g();
         var1.t();
         var1.s();
         var1.r();
         Iterator var2 = var0.h();

         while(true) {
            while(var2.hasNext()) {
               var0 = (did)var2.next();
               if (var0.g().l()) {
                  var2.remove();
               } else if (!var0.g().c()) {
                  String var3 = var0.b;
                  if (var3 != null && var3.length() != 0) {
                     var0.m(new did("xml:lang", "x-repair", (din)null));
                  } else {
                     var2.remove();
                  }
               }
            }

            return;
         }
      }
   }

   public static void c(Iterator var0, did var1, did var2) {
      if (var2.g().i()) {
         if (var1.g().c()) {
            throw new dhl("Alias to x-default already has a language qualifier", 203);
         }

         var1.m(new did("xml:lang", "x-default", (din)null));
      }

      var0.remove();
      var1.a = "[]";
      var2.k(var1);
   }
}
