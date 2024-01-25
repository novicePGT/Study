
/**
 * 하드코드화 된 종속성 설정
 *
 * 장점: 하드코드화하면 의존성을 쉽게 주입할 수 있음
 *      생성자는 매개변수를 사용하지 않아서 설정값을 제공하는 데 걱정할것이 없음
 * 단점: 다용도로 사용할 수 없음
 *      무조건 북아메리카 온라인 지도에 연결하려고 할 것
 *      계절도로는 항상 제외됨
 *
 * RoutePalnner 가 클라이언트
 * NorthAmericaRoadMap 이 서비스
 * 생성자로 의존성 주입
 */
class RoutePlanner {
    private val USE_ONLINE_MAP = true
    private val INCLUDE_SEASONAL_ROADS = false

    private lateinit var roadMap: RoadMap

    init {
        this.roadMap = NorthAmericaRoadMap(USE_ONLINE_MAP, INCLUDE_SEASONAL_ROADS)
    }
}

abstract class RoadMap

class NorthAmericaRoadMap(useMap: Boolean, useSeasonRoad: Boolean) : RoadMap() {
}

