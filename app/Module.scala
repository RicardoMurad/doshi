import com.google.inject.AbstractModule
import java.time.Clock

class Module extends AbstractModule {

  override def configure() = {

    bind(classOf[Clock]).toInstance(Clock.systemDefaultZone)

  }

}