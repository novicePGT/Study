
/**
 * 종속성을 주입받는 형식
 * 생성자의 매개변수를 통해서 로드맵을 제공함으로써 RoadMap을 주입한다 ! 라고 할 수 있음
 *
 * 장점 : example과 같은 형식으로 루트플래너가 어떤 로드맵으로든 설정할 수 있다.( 유연성 )
 *       초반에 기반을 잘 다져두면 더욱 속도 있는 개발이 가능하다.
 *
 *
 * 단점 : RoutePlanner 클래스의 생성자의 매개변수가 복잡해진다.
 *       RoutePlanner 를 생성하기 전에 RoadMap 구현클래스의 인스턴스를 생성해야 한다.
 *
 */
class RoutePlannerV2(roadMapV2: RoadMapV2) {
    private val USE_ONLINE_MAP: Boolean = true
    private val INCLUDE_SEASONAL_ROADS: Boolean = false

    private var roadMap: RoadMapV2 = roadMapV2
}

abstract class RoadMapV2

class NorthAmericaRoadMapV2(useMap: Boolean, useSeasonRoad: Boolean) : RoadMapV2()

class EuropeRoadMap : RoadMapV2()

fun example() {
    RoutePlannerV2(NorthAmericaRoadMapV2(useMap = false, useSeasonRoad = false))
    RoutePlannerV2(EuropeRoadMap())
}