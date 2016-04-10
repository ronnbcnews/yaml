/**
 * Created by rcalderon on 4/9/16.
 */
import org.yaml.snakeyaml.Yaml
import java.util.logging.Level
import java.util.logging.Logger

def CONFIG_FILE = "tes.yaml"
  Map<?, ?> config = [ 'language':'CHANGEME']
  Yaml yaml = new Yaml()
  Logger logger = Logger.getLogger(getClass().getName())
    try {
      config = (Map<?, ?>) yaml.load((new FileReader(new File(CONFIG_FILE))))
    } catch(FileNotFoundException e) {
      logger.log(Level.SEVERE, "Unable to load configuration.", e)
      System.exit(0)
    }

    System.out.println(config.language)