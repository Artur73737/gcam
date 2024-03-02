import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View.OnCreateContextMenuListener;
import androidx.preference.Preference;

public final class cpq implements OnCreateContextMenuListener, OnMenuItemClickListener {
   private final Preference a;

   public cpq(Preference var1) {
      this.a = var1;
   }

   public final void onCreateContextMenu(ContextMenu var1, View var2, ContextMenuInfo var3) {
      CharSequence var4 = this.a.m();
      if (this.a.z && !TextUtils.isEmpty(var4)) {
         var1.setHeaderTitle(var4);
         var1.add(0, 0, 0, 2132017434).setOnMenuItemClickListener(this);
      }
   }

   public final boolean onMenuItemClick(MenuItem var1) {
      ((ClipboardManager)this.a.j.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", this.a.m()));
      return true;
   }
}
