package xintao.stsmod.util;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class CodeUtil
{
    public static final String Mod_ID = "xintaomod";
    public static final String Mod_Package = "xintao.stsmod";
    private static final String Mod_Resource_Path = "xintao/xintao_sts_mod_resource";
    public static final String Mod_Card_Package = Mod_Package + ".card";
    public static final String Mod_Relic_Package = Mod_Package + ".relic";
    public static final String Mod_Char_Package = Mod_Package + ".character";
    private static final String Mod_Img_Path = Mod_Resource_Path + "/img/";
    private static final String Mod_Lang_Path = Mod_Resource_Path + "/lang/";

    private CodeUtil() {}

    @NotNull
    @Contract(pure = true)
    public static String of(String id)
    {
        return Mod_ID + ":" + id;
    }

    @NotNull
    @Contract(pure = true)
    public static String imgPath(String path)
    {
        return Mod_Img_Path + path;
    }
    
    @NotNull
    @Contract(pure = true)
    public static String langPath(String path)
    {
        return Mod_Lang_Path + path;
    }
}
