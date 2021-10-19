package sandbox;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RecipientsModel {
    private String name;
    private String email;
    @JsonProperty(value = "isPrimary")
    private boolean isPrimary;

}
