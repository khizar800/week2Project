package GroupTerrain;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@Cucumber.Options(tags={"@SmokeTest"},dryRun= false,monochrome=true,format={"pretty", "html:target/cucumber"}) 

public class TerrainRun { }