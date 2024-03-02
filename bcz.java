import j$.util.function.DoubleUnaryOperator$_CC;
import java.util.function.DoubleUnaryOperator;

// $FF: synthetic class
public final class bcz implements DoubleUnaryOperator {
   public final qvt a;
   private final int b;

   // $FF: synthetic method
   public bcz(qvt var1, int var2) {
      this.b = var2;
      this.a = var1;
   }

   // $FF: synthetic method
   public final DoubleUnaryOperator andThen(DoubleUnaryOperator var1) {
      switch(this.b) {
      case 0:
         return DoubleUnaryOperator$_CC.$default$andThen(this, var1);
      default:
         return DoubleUnaryOperator$_CC.$default$andThen(this, var1);
      }
   }

   public final double applyAsDouble(double var1) {
      qvt var3;
      switch(this.b) {
      case 0:
         var3 = this.a;
         var3.getClass();
         return ((Number)var3.eo(var1)).doubleValue();
      default:
         var3 = this.a;
         var3.getClass();
         return ((Number)var3.eo(var1)).doubleValue();
      }
   }

   // $FF: synthetic method
   public final DoubleUnaryOperator compose(DoubleUnaryOperator var1) {
      switch(this.b) {
      case 0:
         return DoubleUnaryOperator$_CC.$default$compose(this, var1);
      default:
         return DoubleUnaryOperator$_CC.$default$compose(this, var1);
      }
   }
}
