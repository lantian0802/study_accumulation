import akka.actor.{ActorSystem, Props, UntypedActor}

object Driver extends App {
    val system = ActorSystem("actorengine")
    val helloWorld = system.actorOf(Props[HelloWorld],name="HelloWorld")
    val greeter = system.actorOf(Props[Greeter],name="greeter")

    greeter ! Greeter.GREET
}

class HelloWorld extends UntypedActor{

  override def onReceive(message: Any): Unit = {
      if(message == Greeter.DONE) {
          getContext().stop(getSelf())
      } else unhandled(message)
  }
}

class Greeter extends UntypedActor {

  override def onReceive(message: Any): Unit = {
      if(message == Greeter.GREET) {
        println("Hello world!")
        sender ! Greeter.DONE
      } else unhandled(message)
  }
}

object Greeter {
  val GREET = 1;
  val DONE = 2;
}