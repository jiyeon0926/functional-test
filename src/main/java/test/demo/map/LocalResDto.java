package test.demo.map;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LocalResDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("category_name")
    private String categoryName;

    @JsonProperty("place_name")
    private String placeName;

    @JsonProperty("address_name")
    private String addressName;

    @JsonProperty("road_address_name")
    private String roadAddressName;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("x")
    private String longitude; // 경도

    @JsonProperty("y")
    private String latitude; // 위도

    @JsonProperty("place_url")
    private String placeUrl;
}
