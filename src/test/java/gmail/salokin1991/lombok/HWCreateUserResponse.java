package gmail.salokin1991.lombok;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HWCreateUserResponse {

    private String id;
    private String name;
    private String job;
    private String createdAt;
    private String updatedAt;
    private String token;
}
