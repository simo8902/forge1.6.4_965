package net.minecraft.client.mco;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
public class ExceptionMcoService extends Exception {

   public final int field_96392_a;
   public final String field_96391_b;
   public final int field_130097_c;


   public ExceptionMcoService(int p_i1145_1_, String p_i1145_2_, int p_i1145_3_) {
      super(p_i1145_2_);
      this.field_96392_a = p_i1145_1_;
      this.field_96391_b = p_i1145_2_;
      this.field_130097_c = p_i1145_3_;
   }

   public String toString() {
      return this.field_130097_c != -1?"Realms ( ErrorCode: " + this.field_130097_c + " )":"Realms: " + this.field_96391_b;
   }
}
