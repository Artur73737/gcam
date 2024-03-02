import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

final class apn implements ref {
   final Object a;
   final apu b;
   final zb c;

   public apn(Object var1, apu var2, zb var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final Object b(Map var1, que var2) {
      Object var29;
      label426: {
         if (var2 instanceof apm) {
            apm var5 = (apm)var2;
            int var4 = var5.c;
            if ((var4 & Integer.MIN_VALUE) != 0) {
               var5.c = var4 + Integer.MIN_VALUE;
               var29 = var5;
               break label426;
            }
         }

         var29 = new apm(this, var2);
      }

      float var3;
      Object var6;
      apn var28;
      Map var32;
      Object var36;
      label436: {
         var6 = ((apm)var29).a;
         qul var31 = qul.a;
         switch(((apm)var29).c) {
         case 0:
            pwm.bs(var6);

            Throwable var10000;
            label414: {
               Float var7;
               boolean var10001;
               try {
                  var7 = la.d(var1, this.a);
               } catch (Throwable var27) {
                  var10000 = var27;
                  var10001 = false;
                  break label414;
               }

               if (var7 != null) {
                  label432: {
                     try {
                        apu var35 = this.b;
                        var3 = var7;
                        zb var39 = this.c;
                        ((apm)var29).d = this;
                        ((apm)var29).e = var1;
                        ((apm)var29).c = 1;
                        var29 = var35.a(var3, var39, (que)var29);
                     } catch (Throwable var26) {
                        var10000 = var26;
                        var10001 = false;
                        break label432;
                     }

                     if (var29 == var31) {
                        return var31;
                     }
                     break;
                  }
               } else {
                  label402:
                  try {
                     IllegalArgumentException var33 = new IllegalArgumentException("The target value must have an associated anchor.");
                     throw var33;
                  } catch (Throwable var24) {
                     var10000 = var24;
                     var10001 = false;
                     break label402;
                  }
               }
            }

            var29 = var10000;
            var32 = var1;
            var28 = this;
            break label436;
         case 1:
            var32 = ((apm)var29).e;
            var28 = ((apm)var29).d;

            try {
               pwm.bs(var6);
               break;
            } finally {
               break label436;
            }
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         var3 = this.b.m.f();
         LinkedHashMap var30 = new LinkedHashMap();
         Iterator var34 = var1.entrySet().iterator();

         while(var34.hasNext()) {
            Entry var37 = (Entry)var34.next();
            if (Math.abs(((Number)var37.getKey()).floatValue() - var3) < 0.5F) {
               var30.put(var37.getKey(), var37.getValue());
            }
         }

         var36 = pwm.av(var30.values());
         var29 = var36;
         if (var36 == null) {
            var29 = this.b.c();
         }

         this.b.j(var29);
         return qsn.a;
      }

      var3 = var28.b.m.f();
      LinkedHashMap var38 = new LinkedHashMap();
      Iterator var41 = var32.entrySet().iterator();

      while(var41.hasNext()) {
         Entry var40 = (Entry)var41.next();
         if (Math.abs(((Number)var40.getKey()).floatValue() - var3) < 0.5F) {
            var38.put(var40.getKey(), var40.getValue());
         }
      }

      var6 = pwm.av(var38.values());
      var36 = var6;
      if (var6 == null) {
         var36 = var28.b.c();
      }

      var28.b.j(var36);
      throw var29;
   }
}
