name := "elastic-data-repository"

version := "0.1"

scalaVersion := "2.10.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"

resolvers += "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies += "com.google.guava" % "guava" % "14.0.1"

libraryDependencies += "org.hsqldb" % "hsqldb" % "2.2.9"

libraryDependencies += "com.typesafe.slick" %% "slick" % "1.0.1"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.1.4"

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.10.1" % "test"

libraryDependencies += "org.specs2" %% "specs2" % "1.14" % "test"

libraryDependencies += "org.scalaz" % "scalaz-core_2.10" % "7.0.0"

libraryDependencies += "org.scalaz" % "scalaz-typelevel_2.10" % "7.0.0"

libraryDependencies += "org.scalaz" % "scalaz-xml_2.10" % "7.0.0"

libraryDependencies += "org.scalaz" % "scalaz-effect_2.10" % "7.0.0"

libraryDependencies += "org.scalaz" % "scalaz-iteratee_2.10" % "7.0.0"

libraryDependencies += "org.scalaz" % "scalaz-concurrent_2.10" % "7.0.0"

libraryDependencies += "org.scalaz" % "scalaz-iterv_2.10" % "7.0.0"
