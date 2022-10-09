import java.util.List;

public class Champion {
   public List<Unit> champions = List.of(AOSHIN, AURELIONSOL, SHYVANA, TERRA, DAEJA, SWAIN, IDAS, SHIOHYU, SOHM, SYFEN, NOMSY, ZIPPY, BARD, SORAKA, YASUO, ZOE, GRAVES, HECARIM, JAYCE, NILAH, PANTHEON, XAYAH, DIANA, LEESIN, NUNU, OLAF, RAKAN, RENGAR, SERAPHINE, SYLAS, VARUS, VOLIBEAR, ZERI, APHELIOS, BRAUM, JAX, GNAR, KAISA, LILLIA, LUX, QIYANA, RELL, TWITCH, YONE, ZAC, ZYRA, EZREAL, KARMA, LEONA, MALPHITE, NASUS, NIDALEE, SEJUANI, SETH, SENNA, SKARNER, TALIYAH, WUKONG, VLADIMIR);


   public static Unit AOSHIN = new Unit(
      "ao shin", 
      "orange", 
      8, 
      List.of(Champion_trait.TEMPEST, Champion_trait.DRAGON));
   
   public static Unit AURELIONSOL = new Unit(
      "aurelion sol", 
      "orange", 
      8, 
      List.of(Champion_trait.ASTRAL , Champion_trait.DRAGON, Champion_trait.EVOKER));

   public static Unit SHYVANA = new Unit(
      "shyvana", 
      "orange", 
      8, 
      List.of(Champion_trait.SHAPESHIFTER , Champion_trait.DRAGON, Champion_trait.RAGEWING));

   public static Unit TERRA = new Unit(
      "terra", 
      "orange", 
      8, 
      List.of(Champion_trait.DRAGON , Champion_trait.MONOLITH));

   public static Unit DAEJA = new Unit(
      "daeja", 
      "purple", 
      7, 
      List.of(Champion_trait.MIRAGE , Champion_trait.DRAGON));

   public static Unit SWAIN = new Unit(
      "swain", 
      "purple", 
      7, 
      List.of(Champion_trait.DRAGON , Champion_trait.DARK_FLIGHT));


   public static Unit IDAS = new Unit(
      "idas", 
      "purple", 
      7, 
      List.of(Champion_trait.SHIMERSCALE , Champion_trait.DRAGON, Champion_trait.GUARDIAN));

   public static Unit SOHM = new Unit(
      "sohm", 
      "purple", 
      7, 
      List.of(Champion_trait.DRAGON , Champion_trait.LAGOON, Champion_trait.MAGE));

   public static Unit SHIOHYU = new Unit(
      "shi oh yu", 
      "purple", 
      7, 
      List.of(Champion_trait.DRAGON , Champion_trait.JADE, Champion_trait.MYSTIC));

   public static Unit SYFEN = new Unit(
      "sy'fen", 
      "purple", 
      7, 
      List.of(Champion_trait.DRAGON , Champion_trait.BRUISER, Champion_trait.WHISPERS));


   public static Unit NOMSY = new Unit(
      "nomsy", 
      "blue", 
      6, 
      List.of(Champion_trait.PRODIGY , Champion_trait.DRAGON, Champion_trait.MAGE));


   public static Unit ZIPPY = new Unit(
      "zippy", 
      "blue", 
      6, 
      List.of(Champion_trait.DRAGON , Champion_trait.GUILD));


   public static Unit BARD = new Unit(
      "bard", 
      "orange", 
      5, 
      List.of(Champion_trait.BARD , Champion_trait.GUILD, Champion_trait.MYSTIC));


   public static Unit SORAKA = new Unit(
      "soraka", 
      "orange", 
      5, 
      List.of(Champion_trait.STARCALLER , Champion_trait.JADE));


   public static Unit YASUO = new Unit(
      "yasuo", 
      "orange", 
      5, 
      List.of(Champion_trait.DRACOMANCER , Champion_trait.WARRIOR, Champion_trait.MIRAGE));


   public static Unit ZOE = new Unit(
      "ZOE", 
      "orange", 
      5, 
      List.of(Champion_trait.MAGE , Champion_trait.SPELLTHIEF, Champion_trait.SHIMERSCALE));


   public static Unit GRAVES = new Unit(
      "graves", 
      "purple", 
      4, 
      List.of(Champion_trait.TEMPEST , Champion_trait.CANNONIER));


   public static Unit HECARIM = new Unit(
      "hecarim", 
      "purple", 
      4, 
      List.of(Champion_trait.CAVALIER , Champion_trait.RAGEWING));


   public static Unit JAYCE = new Unit(
      "jayce", 
      "purple", 
      4, 
      List.of(Champion_trait.SHAPESHIFTER , Champion_trait.GUILD));


   public static Unit NILAH = new Unit(
      "nilah", 
      "purple", 
      4, 
      List.of(Champion_trait.ASSASSIN , Champion_trait.LAGOON));


   public static Unit PANTHEON = new Unit(
      "pantheon", 
      "purple", 
      4, 
      List.of(Champion_trait.WARRIOR , Champion_trait.WHISPERS));


   public static Unit XAYAH = new Unit(
      "xayah", 
      "purple", 
      4, 
      List.of(Champion_trait.RAGEWING , Champion_trait.SWIFTSHOT));


   public static Unit DIANA = new Unit(
      "diana", 
      "blue", 
      3, 
      List.of(Champion_trait.ASSASSIN , Champion_trait.SCALESCORN));


   /*public static Unit HEIMERDINGER = new Unit(
      "heimerdinger", 
      "", 
      0, 
      List.of(Champion_trait. , Champion_trait.));
   */

   public static Unit LEESIN = new Unit(
      "lee sin", 
      "blue", 
      3, 
      List.of(Champion_trait.DRACOMANCER , Champion_trait.TEMPEST));


   public static Unit LULU = new Unit(
      "lulu", 
      "blue", 
      3, 
      List.of(Champion_trait.EVOKER));


   public static Unit NUNU = new Unit(
      "nunu", 
      "blue", 
      3, 
      List.of(Champion_trait.MIRAGE , Champion_trait.CAVALIER));


   public static Unit OLAF = new Unit(
      "olaf", 
      "blue", 
      3, 
      List.of(Champion_trait.BRUISER , Champion_trait.WARRIOR, Champion_trait.SCALESCORN));


   public static Unit RAKAN = new Unit(
      "rakan", 
      "blue", 
      3, 
      List.of(Champion_trait.RAGEWING , Champion_trait.GUARDIAN, Champion_trait.MYSTIC));


   public static Unit RENGAR = new Unit(
      "rengar", 
      "blue", 
      3, 
      List.of(Champion_trait.ASSASSIN , Champion_trait.DARK_FLIGHT));


   public static Unit SERAPHINE = new Unit(
      "seraphine", 
      "blue", 
      3, 
      List.of(Champion_trait.EVOKER , Champion_trait.LAGOON, Champion_trait.MYSTIC));


   public static Unit SYLAS = new Unit(
      "sylas", 
      "blue", 
      3, 
      List.of(Champion_trait.MAGE , Champion_trait.WHISPERS, Champion_trait.BRUISER));


   /*public static Unit TRISTANA = new Unit(
      "tristana", 
      "blue", 
      3, 
      List.of(Champion_trait.CANNONIER));*/


   public static Unit VARUS = new Unit(
      "varus", 
      "blue", 
      3, 
      List.of(Champion_trait.SWIFTSHOT , Champion_trait.ASTRAL));


   public static Unit VOLIBEAR = new Unit(
      "volibear", 
      "blue", 
      3, 
      List.of(Champion_trait.SHIMERSCALE , Champion_trait.DRACOMANCER));


   public static Unit ZERI = new Unit(
      "zeri", 
      "blue", 
      3, 
      List.of(Champion_trait.LAGOON , Champion_trait.CANNONIER));

   public static Unit APHELIOS = new Unit(
      "aphelios", 
      "green", 
      2, 
      List.of(Champion_trait.CANNONIER , Champion_trait.DARK_FLIGHT));


   public static Unit BRAUM = new Unit(
      "braum", 
      "green", 
      2, 
      List.of(Champion_trait.SCALESCORN , Champion_trait.GUARDIAN));

      
   public static Unit GNAR = new Unit(
      "gnar", 
      "green", 
      2, 
      List.of(Champion_trait.JADE , Champion_trait.SHAPESHIFTER));


   public static Unit JAX = new Unit(
      "jax", 
      "green", 
      2, 
      List.of(Champion_trait.SHIMERSCALE , Champion_trait.JADE, Champion_trait.BRUISER));
   
   public static Unit KAISA = new Unit(
      "kai'sa", 
      "green", 
      2, 
      List.of(Champion_trait.LAGOON , Champion_trait.DRACOMANCER));


   public static Unit LILLIA = new Unit(
      "lillia", 
      "green", 
      2, 
      List.of(Champion_trait.CAVALIER , Champion_trait.SCALESCORN, Champion_trait.MAGE));

   public static Unit LUX = new Unit(
      "lux", 
      "green", 
      2, 
      List.of(Champion_trait.MAGE , Champion_trait.ASTRAL));


   public static Unit QIYANA = new Unit(
      "qiyana", 
      "green", 
      2, 
      List.of(Champion_trait.ASSASSIN , Champion_trait.TEMPEST));

   public static Unit RELL = new Unit(
      "rell", 
      "green", 
      2, 
      List.of(Champion_trait.CAVALIER , Champion_trait.DARK_FLIGHT));


   public static Unit TWITCH = new Unit(
      "twitch", 
      "green", 
      2, 
      List.of(Champion_trait.GUILD , Champion_trait.SWIFTSHOT));

      
   public static Unit YONE = new Unit(
      "yone", 
      "green", 
      2, 
      List.of(Champion_trait.WARRIOR , Champion_trait.MIRAGE));


   public static Unit ZAC = new Unit(
      "zac", 
      "green", 
      2, 
      List.of(Champion_trait.LAGOON , Champion_trait.GUARDIAN));


   public static Unit ZYRA = new Unit(
      "zyra", 
      "green", 
      2, 
      List.of(Champion_trait.WHISPERS , Champion_trait.EVOKER));


   public static Unit EZREAL = new Unit(
      "ezreal", 
      "white", 
      1, 
      List.of(Champion_trait.SWIFTSHOT , Champion_trait.TEMPEST));

   public static Unit KARMA = new Unit(
      "karma", 
      "white", 
      1, 
      List.of(Champion_trait.JADE , Champion_trait.DRACOMANCER));


   public static Unit LEONA = new Unit(
      "leona", 
      "white", 
      1, 
      List.of(Champion_trait.GUARDIAN , Champion_trait.MIRAGE));

   public static Unit MALPHITE = new Unit(
      "malphite", 
      "white", 
      1, 
      List.of(Champion_trait.BRUISER , Champion_trait.LAGOON));


   public static Unit NASUS = new Unit(
      "nasus", 
      "white", 
      1, 
      List.of(Champion_trait.SHIMERSCALE , Champion_trait.GUARDIAN));

      
   public static Unit NIDALEE = new Unit(
      "nidalee", 
      "white", 
      1, 
      List.of(Champion_trait.SHAPESHIFTER , Champion_trait.ASTRAL));


   public static Unit SEJUANI = new Unit(
      "sejuani", 
      "white", 
      1, 
      List.of(Champion_trait.CAVALIER , Champion_trait.GUILD));
   
   public static Unit SENNA = new Unit(
      "senna", 
      "white", 
      1, 
      List.of(Champion_trait.CANNONIER , Champion_trait.RAGEWING));


   public static Unit SETH = new Unit(
      "seth", 
      "white", 
      1, 
      List.of(Champion_trait.RAGEWING , Champion_trait.DRACOMANCER));

   public static Unit SKARNER = new Unit(
      "skarner", 
      "white", 
      1, 
      List.of(Champion_trait.ASTRAL , Champion_trait.BRUISER));


   public static Unit TALIYAH = new Unit(
      "taliyah", 
      "white", 
      1, 
      List.of(Champion_trait.LAGOON , Champion_trait.MAGE));

   public static Unit VLADIMIR = new Unit(
      "vladimir", 
      "white", 
      1, 
      List.of(Champion_trait.MAGE , Champion_trait.ASTRAL));


   public static Unit WUKONG = new Unit(
      "wukong", 
      "white", 
      1, 
      List.of(Champion_trait.JADE , Champion_trait.WARRIOR));   
}
