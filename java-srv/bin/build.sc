import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.postgresql:postgresql:42.2.18.jre7"
    // Dependices
  )
}
