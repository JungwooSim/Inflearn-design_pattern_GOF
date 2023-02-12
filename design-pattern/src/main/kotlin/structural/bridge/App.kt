package structural.bridge

fun main() {
  val kdaAri: Champion = Ari(KDA())
  kdaAri.skillQ()
  kdaAri.skillW()

  val poolPartyAri: Champion = Ari(PoolParty())
  poolPartyAri.skillQ()
  poolPartyAri.skillW()
}