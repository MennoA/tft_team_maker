import java.util.List;
import java.util.Map;
public class Champion {
   public static Unit AOSHIN = new Unit(
      "ao shin", 
      "orange", 
      8, 
      Map.of(Champion_trait.TEMPEST, 3, Champion_trait.DRAGON, 1));
   
   public static Unit AURELIONSOL = new Unit(
      "aurelion sol", 
      "orange", 
      8, 
      Map.of(Champion_trait.ASTRAL, 3, Champion_trait.DRAGON, 1, Champion_trait.EVOKER, 1));

   public static Unit SHYVANA = new Unit(
      "shyvana", 
      "orange", 
      8, 
      Map.of(Champion_trait.SHAPESHIFTER, 1, Champion_trait.DRAGON, 1, Champion_trait.RAGEWING, 3));

   public static Unit TERRA = new Unit(
      "terra", 
      "orange", 
      8, 
      Map.of(Champion_trait.DRAGON, 1, Champion_trait.MONOLITH, 3));

   public static Unit DAEJA = new Unit(
      "daeja", 
      "purple", 
      7, 
      Map.of(Champion_trait.MIRAGE, 3, Champion_trait.DRAGON, 1));

   public static Unit SWAIN = new Unit(
      "swain", 
      "purple", 
      7, 
      Map.of(Champion_trait.DRAGON, 1, Champion_trait.DARK_FLIGHT, 3));


   public static Unit IDAS = new Unit(
      "idas", 
      "purple", 
      7, 
      Map.of(Champion_trait.SHIMERSCALE, 3, Champion_trait.DRAGON, 1, Champion_trait.GUARDIAN, 1));

   public static Unit SOHM = new Unit(
      "sohm", 
      "purple", 
      7, 
      Map.of(Champion_trait.DRAGON, 1, Champion_trait.LAGOON, 3, Champion_trait.MAGE, 1));

   public static Unit SHIOHYU = new Unit(
      "shi oh yu", 
      "purple", 
      7, 
      Map.of(Champion_trait.DRAGON, 1, Champion_trait.JADE, 3, Champion_trait.MYSTIC, 1));

   public static Unit SYFEN = new Unit(
      "sy'fen", 
      "purple", 
      7, 
      Map.of(Champion_trait.DRAGON, 1, Champion_trait.BRUISER, 1, Champion_trait.WHISPERS, 3));


   public static Unit NOMSY_MAGE = new Unit(
      "nomsy_mage", 
      "blue", 
      6, 
      Map.of(Champion_trait.PRODIGY, 3 , Champion_trait.DRAGON, 1, Champion_trait.MAGE, 2));


   public static Unit NOMSY_CANNONIER = new Unit(
      "nomsy_cannonier", 
      "blue", 
      6, 
      Map.of(Champion_trait.PRODIGY, 3 , Champion_trait.DRAGON, 1, Champion_trait.CANNONIER, 2));

         
   public static Unit NOMSY_EVOKER = new Unit(
      "nomsy_evoker", 
      "blue", 
      6, 
      Map.of(Champion_trait.PRODIGY, 3 , Champion_trait.DRAGON, 1, Champion_trait.EVOKER, 2));


   public static Unit ZIPPY = new Unit(
      "zippy", 
      "blue", 
      6, 
      Map.of(Champion_trait.DRAGON, 1, Champion_trait.GUILD, 3));

   public static Unit BARD = new Unit(
      "bard", 
      "orange", 
      5, 
      Map.of(Champion_trait.BARD, 1, Champion_trait.GUILD, 1, Champion_trait.MYSTIC, 1));


   public static Unit SORAKA = new Unit(
      "soraka", 
      "orange", 
      5, 
      Map.of(Champion_trait.STARCALLER, 1, Champion_trait.JADE, 1));


   public static Unit YASUO = new Unit(
      "yasuo", 
      "orange", 
      5, 
      Map.of(Champion_trait.DRACOMANCER, 1, Champion_trait.WARRIOR, 1, Champion_trait.MIRAGE, 1));


   public static Unit ZOE = new Unit(
      "ZOE", 
      "orange", 
      5, 
      Map.of(Champion_trait.MAGE, 1, Champion_trait.SPELLTHIEF, 1, Champion_trait.SHIMERSCALE, 1));


   public static Unit GRAVES = new Unit(
      "graves", 
      "purple", 
      4, 
      Map.of(Champion_trait.TEMPEST, 1, Champion_trait.CANNONIER, 1));


   public static Unit HECARIM = new Unit(
      "hecarim", 
      "purple", 
      4, 
      Map.of(Champion_trait.CAVALIER, 1, Champion_trait.RAGEWING, 1));


   public static Unit JAYCE = new Unit(
      "jayce", 
      "purple", 
      4, 
      Map.of(Champion_trait.SHAPESHIFTER, 1, Champion_trait.GUILD, 1));


   public static Unit NILAH = new Unit(
      "nilah", 
      "purple", 
      4, 
      Map.of(Champion_trait.ASSASSIN, 1, Champion_trait.LAGOON, 1));


   public static Unit PANTHEON = new Unit(
      "pantheon", 
      "purple", 
      4, 
      Map.of(Champion_trait.WARRIOR, 1, Champion_trait.WHISPERS, 1));


   public static Unit XAYAH = new Unit(
      "xayah", 
      "purple", 
      4, 
      Map.of(Champion_trait.RAGEWING, 1, Champion_trait.SWIFTSHOT, 1));


   public static Unit DIANA = new Unit(
      "diana", 
      "blue", 
      3, 
      Map.of(Champion_trait.ASSASSIN, 1, Champion_trait.SCALESCORN, 1));


   /*public static Unit HEIMERDINGER = new Unit(
      "heimerdinger", 
      "", 
      0, 
      Map.of(Champion_trait. , Champion_trait.));
   */

   public static Unit LEESIN = new Unit(
      "lee sin", 
      "blue", 
      3, 
      Map.of(Champion_trait.DRACOMANCER, 1, Champion_trait.TEMPEST, 1));


   /*public static Unit LULU = new Unit(
      "lulu", 
      "blue", 
      3, 
      Map.of(Champion_trait.EVOKER));*/


   public static Unit NUNU = new Unit(
      "nunu", 
      "blue", 
      3, 
      Map.of(Champion_trait.MIRAGE, 1, Champion_trait.CAVALIER, 1));


   public static Unit OLAF = new Unit(
      "olaf", 
      "blue", 
      3, 
      Map.of(Champion_trait.BRUISER, 1, Champion_trait.WARRIOR, 1, Champion_trait.SCALESCORN, 1));


   public static Unit RAKAN = new Unit(
      "rakan", 
      "blue", 
      3, 
      Map.of(Champion_trait.RAGEWING, 1, Champion_trait.GUARDIAN, 1, Champion_trait.MYSTIC, 1));


   public static Unit RENGAR = new Unit(
      "rengar", 
      "blue", 
      3, 
      Map.of(Champion_trait.ASSASSIN, 1,Champion_trait.DARK_FLIGHT, 1));


   public static Unit SERAPHINE = new Unit(
      "seraphine", 
      "blue", 
      3, 
      Map.of(Champion_trait.EVOKER, 1, Champion_trait.LAGOON, 1, Champion_trait.MYSTIC, 1));


   public static Unit SYLAS = new Unit(
      "sylas", 
      "blue", 
      3, 
      Map.of(Champion_trait.MAGE, 1, Champion_trait.WHISPERS, 1, Champion_trait.BRUISER, 1));


   /*public static Unit TRISTANA = new Unit(
      "tristana", 
      "blue", 
      3, 
      Map.of(Champion_trait.CANNONIER));*/


   public static Unit VARUS = new Unit(
      "varus", 
      "blue", 
      3, 
      Map.of(Champion_trait.SWIFTSHOT, 1, Champion_trait.ASTRAL, 1));


   public static Unit VOLIBEAR = new Unit(
      "volibear", 
      "blue", 
      3, 
      Map.of(Champion_trait.SHIMERSCALE, 1, Champion_trait.DRACOMANCER, 1));


   public static Unit ZERI = new Unit(
      "zeri", 
      "blue", 
      3, 
      Map.of(Champion_trait.LAGOON, 1, Champion_trait.CANNONIER, 1));

   public static Unit APHELIOS = new Unit(
      "aphelios", 
      "green", 
      2, 
      Map.of(Champion_trait.CANNONIER, 1, Champion_trait.DARK_FLIGHT, 1));


   public static Unit BRAUM = new Unit(
      "braum", 
      "green", 
      2, 
      Map.of(Champion_trait.SCALESCORN, 1, Champion_trait.GUARDIAN, 1));

      
   public static Unit GNAR = new Unit(
      "gnar", 
      "green", 
      2, 
      Map.of(Champion_trait.JADE, 1 , Champion_trait.SHAPESHIFTER, 1));


   public static Unit JAX = new Unit(
      "jax", 
      "green", 
      2, 
      Map.of(Champion_trait.SHIMERSCALE, 1, Champion_trait.JADE, 1, Champion_trait.BRUISER, 1));
   
   public static Unit KAISA = new Unit(
      "kai'sa", 
      "green", 
      2, 
      Map.of(Champion_trait.LAGOON, 1, Champion_trait.DRACOMANCER, 1));


   public static Unit LILLIA = new Unit(
      "lillia", 
      "green", 
      2, 
      Map.of(Champion_trait.CAVALIER, 1, Champion_trait.SCALESCORN, 1, Champion_trait.MAGE, 1));

   public static Unit LUX = new Unit(
      "lux", 
      "green", 
      2, 
      Map.of(Champion_trait.MAGE, 1, Champion_trait.ASTRAL, 1));


   public static Unit QIYANA = new Unit(
      "qiyana", 
      "green", 
      2, 
      Map.of(Champion_trait.ASSASSIN, 1, Champion_trait.TEMPEST, 1));

   public static Unit RELL = new Unit(
      "rell", 
      "green", 
      2, 
      Map.of(Champion_trait.CAVALIER, 1, Champion_trait.DARK_FLIGHT, 1));


   public static Unit TWITCH = new Unit(
      "twitch", 
      "green", 
      2, 
      Map.of(Champion_trait.GUILD, 1 , Champion_trait.SWIFTSHOT, 1));

      
   public static Unit YONE = new Unit(
      "yone", 
      "green", 
      2, 
      Map.of(Champion_trait.WARRIOR, 1 , Champion_trait.MIRAGE, 1));


   public static Unit ZAC = new Unit(
      "zac", 
      "green", 
      2, 
      Map.of(Champion_trait.LAGOON, 1 , Champion_trait.GUARDIAN, 1));


   public static Unit ZYRA = new Unit(
      "zyra", 
      "green", 
      2, 
      Map.of(Champion_trait.WHISPERS, 1 , Champion_trait.EVOKER, 1));


   public static Unit EZREAL = new Unit(
      "ezreal", 
      "white", 
      1, 
      Map.of(Champion_trait.SWIFTSHOT, 1 , Champion_trait.TEMPEST, 1));

   public static Unit KARMA = new Unit(
      "karma", 
      "white", 
      1, 
      Map.of(Champion_trait.JADE, 1 , Champion_trait.DRACOMANCER, 1));


   public static Unit LEONA = new Unit(
      "leona", 
      "white", 
      1, 
      Map.of(Champion_trait.GUARDIAN, 1 , Champion_trait.MIRAGE, 1));

   public static Unit MALPHITE = new Unit(
      "malphite", 
      "white", 
      1, 
      Map.of(Champion_trait.BRUISER, 1 , Champion_trait.LAGOON, 1));


   public static Unit NASUS = new Unit(
      "nasus", 
      "white", 
      1, 
      Map.of(Champion_trait.SHIMERSCALE, 1 , Champion_trait.GUARDIAN, 1));

      
   public static Unit NIDALEE = new Unit(
      "nidalee", 
      "white", 
      1, 
      Map.of(Champion_trait.SHAPESHIFTER, 1 , Champion_trait.ASTRAL, 1));


   public static Unit SEJUANI = new Unit(
      "sejuani", 
      "white", 
      1, 
      Map.of(Champion_trait.CAVALIER, 1 , Champion_trait.GUILD, 1));
   
   public static Unit SENNA = new Unit(
      "senna", 
      "white", 
      1, 
      Map.of(Champion_trait.CANNONIER, 1 , Champion_trait.RAGEWING, 1));


   public static Unit SETH = new Unit(
      "seth", 
      "white", 
      1, 
      Map.of(Champion_trait.RAGEWING, 1 , Champion_trait.DRACOMANCER, 1));

   public static Unit SKARNER = new Unit(
      "skarner", 
      "white", 
      1, 
      Map.of(Champion_trait.ASTRAL, 1 , Champion_trait.BRUISER, 1));


   public static Unit TALIYAH = new Unit(
      "taliyah", 
      "white", 
      1, 
      Map.of(Champion_trait.LAGOON, 1 , Champion_trait.MAGE, 1));

   public static Unit VLADIMIR = new Unit(
      "vladimir", 
      "white", 
      1, 
      Map.of(Champion_trait.MAGE, 1 , Champion_trait.ASTRAL, 1));


   public static Unit WUKONG = new Unit(
      "wukong", 
      "white", 
      1, 
      Map.of(Champion_trait.JADE, 1 , Champion_trait.WARRIOR, 1));   

   public static List<Unit> champions = List.of(
         AOSHIN, AURELIONSOL, SHYVANA, TERRA, DAEJA, SWAIN, IDAS, SHIOHYU, SOHM, SYFEN, NOMSY_MAGE, NOMSY_CANNONIER, NOMSY_EVOKER, ZIPPY, BARD, SORAKA, YASUO, ZOE, GRAVES, HECARIM, JAYCE, NILAH, PANTHEON, XAYAH, DIANA, LEESIN, NUNU, OLAF, RAKAN, RENGAR, SERAPHINE, SYLAS, VARUS, VOLIBEAR, ZERI, APHELIOS, BRAUM, JAX, GNAR, KAISA, LILLIA, LUX, QIYANA, RELL, TWITCH, YONE, ZAC, ZYRA, EZREAL, KARMA, LEONA, MALPHITE, NASUS, NIDALEE, SEJUANI, SETH, SENNA, SKARNER, TALIYAH, WUKONG, VLADIMIR
      );
}
