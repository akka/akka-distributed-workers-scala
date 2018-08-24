name := "akka-distributed-workers"

version := "1.0"

scalaVersion := "2.12.6"
lazy val akkaVersion = "2.5.15"
lazy val cassandraPluginVersion = "0.85"

fork in Test := true

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster"                        % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools"                  % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence"                    % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence-cassandra"          % cassandraPluginVersion,
  // this allows us to start cassandra from the sample
  "com.typesafe.akka" %% "akka-persistence-cassandra-launcher" % cassandraPluginVersion,

  "com.typesafe.akka" %% "akka-slf4j"                          % akkaVersion,
  "ch.qos.logback"    %  "logback-classic"                     % "1.2.3",

  // test dependencies
  "com.typesafe.akka" %% "akka-testkit"                        % akkaVersion              % "test",
  "org.scalatest"     %% "scalatest"                           % "3.0.1"                  % "test",
  "commons-io"        %  "commons-io"                          % "2.4"                    % "test")