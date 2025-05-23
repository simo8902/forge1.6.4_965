package net.minecraft.client.mco;

import argo.jdom.JdomParser;
import argo.jdom.JsonRootNode;
import argo.saj.InvalidSyntaxException;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.ValueObject;

@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
@SideOnly(Side.CLIENT)
public class ValueObjectSubscription extends ValueObject {

   public long field_98171_a;
   public int field_98170_b;


   public static ValueObjectSubscription func_98169_a(String p_98169_0_) {
      ValueObjectSubscription var1 = new ValueObjectSubscription();

      try {
         JsonRootNode var2 = (new JdomParser()).parse(p_98169_0_);
         var1.field_98171_a = Long.parseLong(var2.getNumberValue(new Object[]{"startDate"}));
         var1.field_98170_b = Integer.parseInt(var2.getNumberValue(new Object[]{"daysLeft"}));
      } catch (InvalidSyntaxException var3) {
         ;
      } catch (IllegalArgumentException var4) {
         ;
      }

      return var1;
   }
}
