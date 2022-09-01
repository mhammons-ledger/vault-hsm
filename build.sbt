lazy val root = (projectMatrix in file("."))
  .enablePlugins(Fs2Grpc)
  .settings(
    scalapbCodeGeneratorOptions += CodeGeneratorOption.FlatPackage,

    Compile / PB.protoSources ++= Seq(
      file("ledger-vault-hsm-driver/src/main/protobuf")
    )
  ).jvmPlatform(scalaVersions=Seq("2.12.16", "2.13.8", "3.1.3"))
