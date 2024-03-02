import java.text.CharacterIterator;

public final class bsw implements CharacterIterator {
   private final CharSequence a;
   private final int b;
   private int c;

   public bsw(CharSequence var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.c = 0;
   }

   public final Object clone() {
      try {
         Object var1 = super.clone();
         var1.getClass();
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final char current() {
      int var1 = this.c;
      return var1 == this.b ? '\uffff' : this.a.charAt(var1);
   }

   public final char first() {
      this.c = 0;
      return this.current();
   }

   public final int getBeginIndex() {
      return 0;
   }

   public final int getEndIndex() {
      return this.b;
   }

   public final int getIndex() {
      return this.c;
   }

   public final char last() {
      int var2 = this.b;
      char var1;
      if (var2 == 0) {
         this.c = 0;
         var1 = '\uffff';
      } else {
         --var2;
         this.c = var2;
         var1 = this.a.charAt(var2);
      }

      return var1;
   }

   public final char next() {
      int var2 = this.c + 1;
      this.c = var2;
      int var3 = this.b;
      char var1;
      if (var2 >= var3) {
         this.c = var3;
         var1 = '\uffff';
      } else {
         var1 = this.a.charAt(var2);
      }

      return var1;
   }

   public final char previous() {
      int var1 = this.c;
      if (var1 <= 0) {
         return '\uffff';
      } else {
         --var1;
         this.c = var1;
         return this.a.charAt(var1);
      }
   }

   public final char setIndex(int var1) {
      if (var1 <= this.b && var1 >= 0) {
         this.c = var1;
         return this.current();
      } else {
         throw new IllegalArgumentException("invalid position");
      }
   }
}
