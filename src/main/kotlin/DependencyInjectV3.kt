
/**
 * V3는 V2에 팩토리 함수를 더한 버전이다.
 *
 * 팩토리 함수를 더한 V3 는 합리적인 기본 값으로 RoutePlanner를 생성한다.
 * 이에 따라 개발자는 필요한 작업을 더욱 빠르게 할 수 있다.
 *
 * 기본 값 뿐만 아니라 자주 사용하는 값이라면 뭐든지 만들어 놓을 수 있다.
 *
 * 이 과정이 번거롭다면 대안으로 의존성 주입 프레임워크를 사용하면 된다.
 * Hilt, Dagger, Koin 등...
 */
class RoutePlannerV3(roadMapV2: RoadMapV2) {
    private val USE_ONLINE_MAP: Boolean = true
    private val INCLUDE_SEASONAL_ROADS: Boolean = false

    private var roadMap: RoadMapV2 = roadMapV2
}

abstract class RoadMapV3

class NorthAmericaRoadMapV3(useMap: Boolean, useSeasonRoad: Boolean) : RoadMapV2()

class EuropeRoadMapV3 : RoadMapV2()

fun exampleV3() {
    RoutePlannerV2(NorthAmericaRoadMapV2(useMap = false, useSeasonRoad = false))
    RoutePlannerV2(EuropeRoadMap())
}

fun createNorthAmericaRoadMapV3(): RoutePlannerV3 {
    return RoutePlannerV3(NorthAmericaRoadMapV3(useMap = true, useSeasonRoad = false))
}

fun createEuropeRoadMapV3(): RoutePlannerV3 {
    return RoutePlannerV3(EuropeRoadMapV3())
}
