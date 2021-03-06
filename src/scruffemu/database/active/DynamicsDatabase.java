package scruffemu.database.active;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import scruffemu.database.Database;
import scruffemu.database.active.data.AnimationData;
import scruffemu.database.active.data.AreaData;
import scruffemu.database.active.data.BankData;
import scruffemu.database.active.data.ChallengeData;
import scruffemu.database.active.data.CollectorData;
import scruffemu.database.active.data.CraftData;
import scruffemu.database.active.data.DropData;
import scruffemu.database.active.data.DungeonData;
import scruffemu.database.active.data.EndFightActionData;
import scruffemu.database.active.data.ExperienceData;
import scruffemu.database.active.data.ExtraMonsterData;
import scruffemu.database.active.data.FullMorphData;
import scruffemu.database.active.data.GangsterData;
import scruffemu.database.active.data.GiftData;
import scruffemu.database.active.data.GuildMemberData;
import scruffemu.database.active.data.HdvData;
import scruffemu.database.active.data.HdvObjectData;
import scruffemu.database.active.data.HeroicMobsGroups;
import scruffemu.database.active.data.HouseData;
import scruffemu.database.active.data.InteractiveDoorData;
import scruffemu.database.active.data.InteractiveObjectData;
import scruffemu.database.active.data.JobData;
import scruffemu.database.active.data.LangItemData;
import scruffemu.database.active.data.MapData;
import scruffemu.database.active.data.MonsterData;
import scruffemu.database.active.data.MountParkData;
import scruffemu.database.active.data.NpcAnswerData;
import scruffemu.database.active.data.NpcData;
import scruffemu.database.active.data.NpcQuestionData;
import scruffemu.database.active.data.NpcTemplateData;
import scruffemu.database.active.data.ObjectActionData;
import scruffemu.database.active.data.ObjectSetData;
import scruffemu.database.active.data.ObjectTemplateData;
import scruffemu.database.active.data.PetTemplateData;
import scruffemu.database.active.data.PrismData;
import scruffemu.database.active.data.QuestData;
import scruffemu.database.active.data.QuestObjectiveData;
import scruffemu.database.active.data.QuestStepData;
import scruffemu.database.active.data.ScriptedCellData;
import scruffemu.database.active.data.SpellData;
import scruffemu.database.active.data.SubAreaData;
import scruffemu.database.active.data.TrunkData;
import scruffemu.database.active.data.TutorialData;
import scruffemu.database.active.data.ZaapData;
import scruffemu.database.active.data.ZaapiData;
import scruffemu.main.Config;
import scruffemu.main.Main;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.slf4j.LoggerFactory;

public class DynamicsDatabase
{
  private static Logger logger=(Logger)LoggerFactory.getLogger(DynamicsDatabase.class);
  //connection
  private HikariDataSource dataSource;
  //data
  private AreaData areaData;
  private GangsterData gangsterData;
  private BankData bankData;
  private TrunkData trunkData;
  private GuildMemberData guildMemberData;

  private HdvObjectData hdvObjectData;
  private HouseData houseData;
  private MountParkData mountParkData;
  private CollectorData collectorData;
  private PrismData prismData;
  private SubAreaData subAreaData;
  private AnimationData animationData;
  private ChallengeData challengeData;
  private CraftData craftData;
  private DungeonData dungeonData;
  private DropData dropData;
  private EndFightActionData endFightActionData;
  private ExperienceData experienceData;
  private ExtraMonsterData extraMonsterData;
  private FullMorphData fullMorphData;
  private GiftData giftData;
  private HdvData hdvData;
  private InteractiveDoorData interactiveDoorData;
  private InteractiveObjectData interactiveObjectData;
  private ObjectTemplateData objectTemplateData;
  private ObjectSetData objectSetData;
  private JobData jobData;
  private MapData mapData;
  private MonsterData monsterData;
  private NpcQuestionData npcQuestionData;
  private NpcAnswerData npcAnswerData;
  private NpcTemplateData npcTemplateData;
  private NpcData npcData;
  private ObjectActionData objectActionData;
  private PetTemplateData petTemplateData;
  private QuestData questData;
  private QuestStepData questStepData;
  private QuestObjectiveData questObjectiveData;
  private ScriptedCellData scriptedCellData;
  private SpellData spellData;
  private TutorialData tutorialData;
  private ZaapData zaapData;
  private ZaapiData zaapiData;
  private HeroicMobsGroups heroicMobsGroups;
  public LangItemData langItemData;

  public void initializeData()
  {
    this.areaData=new AreaData(dataSource);
    this.gangsterData=new GangsterData(this.dataSource);
    this.bankData=new BankData(this.dataSource);
    this.trunkData=new TrunkData(this.dataSource);
    this.guildMemberData=new GuildMemberData(this.dataSource);
    this.hdvObjectData=new HdvObjectData(this.dataSource);
    this.houseData=new HouseData(this.dataSource);
    this.mountParkData=new MountParkData(this.dataSource);
    this.collectorData=new CollectorData(this.dataSource);
    this.prismData=new PrismData(this.dataSource);
    this.subAreaData=new SubAreaData(this.dataSource);
    this.animationData=new AnimationData(this.dataSource);
    this.areaData=new AreaData(this.dataSource);
    this.challengeData=new ChallengeData(this.dataSource);
    this.trunkData=new TrunkData(this.dataSource);
    this.craftData=new CraftData(this.dataSource);
    this.dungeonData=new DungeonData(this.dataSource);
    this.dropData=new DropData(this.dataSource);
    this.endFightActionData=new EndFightActionData(this.dataSource);
    this.experienceData=new ExperienceData(this.dataSource);
    this.extraMonsterData=new ExtraMonsterData(this.dataSource);
    this.fullMorphData=new FullMorphData(this.dataSource);
    this.giftData=new GiftData(this.dataSource);
    this.hdvData=new HdvData(this.dataSource);
    this.houseData=new HouseData(this.dataSource);
    this.interactiveDoorData=new InteractiveDoorData(this.dataSource);
    this.interactiveObjectData=new InteractiveObjectData(this.dataSource);
    this.objectTemplateData=new ObjectTemplateData(this.dataSource);
    this.objectSetData=new ObjectSetData(this.dataSource);
    this.jobData=new JobData(this.dataSource);
    this.mapData=new MapData(this.dataSource);
    this.monsterData=new MonsterData(this.dataSource);
    this.mountParkData=new MountParkData(this.dataSource);
    this.npcQuestionData=new NpcQuestionData(this.dataSource);
    this.npcAnswerData=new NpcAnswerData(this.dataSource);
    this.npcTemplateData=new NpcTemplateData(this.dataSource);
    this.npcData=new NpcData(this.dataSource);
    this.objectActionData=new ObjectActionData(this.dataSource);
    this.petTemplateData=new PetTemplateData(this.dataSource);
    this.questData=new QuestData(this.dataSource);
    this.questStepData=new QuestStepData(this.dataSource);
    this.questObjectiveData=new QuestObjectiveData(this.dataSource);
    this.scriptedCellData=new ScriptedCellData(this.dataSource);
    this.subAreaData=new SubAreaData(this.dataSource);
    this.spellData=new SpellData(this.dataSource);
    this.tutorialData=new TutorialData(this.dataSource);
    this.zaapData=new ZaapData(this.dataSource);
    this.zaapiData=new ZaapiData(this.dataSource);
    this.heroicMobsGroups=new HeroicMobsGroups(dataSource);
    langItemData=new LangItemData(dataSource);
  }

  public boolean initializeConnection()
  {
    try
    {
      logger.setLevel(Level.ALL);
      logger.trace("Reading database config");

      HikariConfig config=new HikariConfig();
      config.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
      config.addDataSourceProperty("serverName",Config.getInstance().hostDB);
      config.addDataSourceProperty("port",Config.getInstance().portDB);
      config.addDataSourceProperty("databaseName",Config.getInstance().nameDB);
      config.addDataSourceProperty("user",Config.getInstance().userDB);
      config.addDataSourceProperty("password",Config.getInstance().passDB);
      config.setAutoCommit(true); // AutoCommit, c'est cool
      config.setMaximumPoolSize(10);
      config.setMinimumIdle(1);
      this.dataSource=new HikariDataSource(config);

      if(!Database.tryConnection(this.dataSource))
      {
        logger.error("Please check your username and password and database connection");
        Main.stop("try database connection failed");
        return false;
      }

      logger.info("Database connection established");
      this.initializeData();
      logger.info("Database data loaded");
    }
    catch(Exception e)
    {
      e.printStackTrace();
      return false;
    }
    return true;
  }

  public HikariDataSource getDataSource()
  {
    return dataSource;
  }

  public GangsterData getGangsterData()
  {
    return gangsterData;
  }

  public BankData getBankData()
  {
    return bankData;
  }

  public GuildMemberData getGuildMemberData()
  {
    return guildMemberData;
  }

  public HdvObjectData getHdvObjectData()
  {
    return hdvObjectData;
  }

  public CollectorData getCollectorData()
  {
    return collectorData;
  }

  public PrismData getPrismData()
  {
    return prismData;
  }

  public AreaData getAreaData()
  {
    return areaData;
  }

  public AnimationData getAnimationData()
  {
    return animationData;
  }

  public ChallengeData getChallengeData()
  {
    return challengeData;
  }

  public TrunkData getTrunkData()
  {
    return trunkData;
  }

  public CraftData getCraftData()
  {
    return craftData;
  }

  public DungeonData getDungeonData()
  {
    return dungeonData;
  }

  public DropData getDropData()
  {
    return dropData;
  }

  public EndFightActionData getEndFightActionData()
  {
    return endFightActionData;
  }

  public ExperienceData getExperienceData()
  {
    return experienceData;
  }

  public ExtraMonsterData getExtraMonsterData()
  {
    return extraMonsterData;
  }

  public FullMorphData getFullMorphData()
  {
    return fullMorphData;
  }

  public GiftData getGiftData()
  {
    return giftData;
  }

  public HdvData getHdvData()
  {
    return hdvData;
  }

  public HouseData getHouseData()
  {
    return houseData;
  }

  public InteractiveDoorData getInteractiveDoorData()
  {
    return interactiveDoorData;
  }

  public InteractiveObjectData getInteractiveObjectData()
  {
    return interactiveObjectData;
  }

  public ObjectTemplateData getObjectTemplateData()
  {
    return objectTemplateData;
  }

  public ObjectSetData getObjectSetData()
  {
    return objectSetData;
  }

  public JobData getJobData()
  {
    return jobData;
  }

  public MapData getMapData()
  {
    return mapData;
  }

  public MonsterData getMonsterData()
  {
    return monsterData;
  }

  public MountParkData getMountParkData()
  {
    return mountParkData;
  }

  public NpcQuestionData getNpcQuestionData()
  {
    return npcQuestionData;
  }

  public NpcAnswerData getNpcAnswerData()
  {
    return npcAnswerData;
  }

  public NpcTemplateData getNpcTemplateData()
  {
    return npcTemplateData;
  }

  public NpcData getNpcData()
  {
    return npcData;
  }

  public ObjectActionData getObjectActionData()
  {
    return objectActionData;
  }

  public PetTemplateData getPetTemplateData()
  {
    return petTemplateData;
  }

  public QuestData getQuestData()
  {
    return questData;
  }

  public QuestStepData getQuestStepData()
  {
    return questStepData;
  }

  public QuestObjectiveData getQuestObjectiveData()
  {
    return questObjectiveData;
  }

  public ScriptedCellData getScriptedCellData()
  {
    return scriptedCellData;
  }

  public SubAreaData getSubAreaData()
  {
    return subAreaData;
  }

  public SpellData getSpellData()
  {
    return spellData;
  }

  public TutorialData getTutorialData()
  {
    return tutorialData;
  }

  public ZaapData getZaapData()
  {
    return zaapData;
  }

  public ZaapiData getZaapiData()
  {
    return zaapiData;
  }

  public HeroicMobsGroups getHeroicMobsGroups()
  {
    return heroicMobsGroups;
  }
}
