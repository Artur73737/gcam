import java.io.PushbackReader;
import java.io.Reader;

public final class dhs extends PushbackReader {
   private int a = 0;
   private int b = 0;
   private int c = 0;

   public dhs(Reader var1) {
      super(var1, 8);
   }

   public final int read(char[] var1, int var2, int var3) {
      char[] var10 = new char[8];
      boolean var7 = true;
      int var8 = 0;
      int var6 = 0;
      int var9 = var2;

      while(var7 && var8 < var3) {
         if (super.read(var10, var6, 1) == 1) {
            var7 = true;
         } else {
            var7 = false;
         }

         if (!var7) {
            if (var6 > 0) {
               this.unread(var10, 0, var6);
               this.a = 5;
               var7 = true;
               var6 = 0;
            }
         } else {
            char var4;
            char var5;
            label115: {
               var5 = var10[var6];
               var2 = this.a;
               switch(var2) {
               case 0:
                  var4 = var5;
                  if (var5 == '&') {
                     this.a = 1;
                     var4 = '&';
                     var2 = 1;
                  }
                  break label115;
               case 1:
                  if (var5 == '#') {
                     var2 = 2;
                     this.a = 2;
                     var4 = var5;
                     break label115;
                  }
                  break;
               case 2:
                  if (var5 == 'x') {
                     this.b = 0;
                     this.c = 0;
                     this.a = 3;
                     var2 = 3;
                     var4 = var5;
                     break label115;
                  }

                  if (var5 >= '0' && var5 <= '9') {
                     this.b = Character.digit(var5, 10);
                     this.c = 1;
                     this.a = 4;
                     var2 = 4;
                     var4 = var5;
                     break label115;
                  }
                  break;
               case 3:
                  if (var5 >= '0' && var5 <= '9' || var5 >= 'a' && var5 <= 'f' || var5 >= 'A' && var5 <= 'F') {
                     this.b = this.b * 16 + Character.digit(var5, 16);
                     var2 = this.c + 1;
                     this.c = var2;
                     if (var2 <= 4) {
                        this.a = 3;
                        var2 = 3;
                        var4 = var5;
                     } else {
                        this.a = 5;
                        var2 = 5;
                        var4 = var5;
                     }
                  } else {
                     var4 = var5;
                     if (var5 == ';') {
                        if (dht.b((char)this.b)) {
                           this.a = 0;
                           var4 = (char)this.b;
                           var2 = 0;
                           break label115;
                        }

                        var4 = ';';
                     }

                     this.a = 5;
                     var2 = 5;
                  }
                  break label115;
               case 4:
                  if (var5 >= '0' && var5 <= '9') {
                     this.b = this.b * 10 + Character.digit(var5, 10);
                     var2 = this.c + 1;
                     this.c = var2;
                     if (var2 <= 5) {
                        this.a = 4;
                        var2 = 4;
                        var4 = var5;
                     } else {
                        this.a = 5;
                        var2 = 5;
                        var4 = var5;
                     }
                  } else {
                     var4 = var5;
                     if (var5 == ';') {
                        if (dht.b((char)this.b)) {
                           this.a = 0;
                           var4 = (char)this.b;
                           var2 = 0;
                           break label115;
                        }

                        var4 = ';';
                     }

                     this.a = 5;
                     var2 = 5;
                  }
                  break label115;
               default:
                  this.a = 0;
                  var2 = 0;
                  var4 = var5;
                  break label115;
               }

               this.a = 5;
               var2 = 5;
               var4 = var5;
            }

            if (var2 == 0) {
               var5 = var4;
               if (dht.b(var4)) {
                  var5 = ' ';
               }

               var1[var9] = var5;
               ++var8;
               ++var9;
               var6 = 0;
            } else if (var2 == 5) {
               this.unread(var10, 0, var6 + 1);
               var6 = 0;
            } else {
               ++var6;
            }
         }
      }

      return var8 <= 0 && !var7 ? -1 : var8;
   }
}
